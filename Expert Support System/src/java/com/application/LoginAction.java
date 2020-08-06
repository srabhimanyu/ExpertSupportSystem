package com.application;

import com.ess.HibernateUtil;
import com.ess.LoginDetails;
import com.ess.SessionDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer userid;
    private String pass;

    @Override
    public String execute() {
        Boolean isResponseCorrect = Boolean.FALSE;
        String parm = request.getParameter("j_captcha_response");
        String captcha = (String) session.get(com.application.CaptchaServlet.CAPTCHA_KEY);
        if(captcha.equals(parm)){
            
        Session s = HibernateUtil.getSession();
        LoginDetails ld = (LoginDetails) s.get(LoginDetails.class, userid);
        SessionDetails sd;

        if (ld != null) {

            if (ld.getPasswd().equals(pass)) {

                sd = (SessionDetails) s.get(SessionDetails.class, ld.getLoginId());
                sd.setLoginTime(new Date());
                s.saveOrUpdate(sd);
                s.beginTransaction().commit();
                s.close();

                if (ld.getGrp().equals("Administrator")) {

                    session.put("loginId", ld.getLoginId());
                    session.put("user", ld.getUserName());
                    session.put("type", ld.getGrp());

                    return "successAdmin";

                } else if (ld.getGrp().equals("Representative")) {

                    session.put("loginId", ld.getLoginId());
                    session.put("user", ld.getUserName());
                    session.put("type", ld.getGrp());
                    return "successRep";
                } else if (ld.getGrp().equals("Client")) {
                    session.put("loginId", ld.getLoginId());
                    session.put("user", ld.getUserName());
                    session.put("type", ld.getGrp());
                    return "successClient";
                } else {
                    return "error";
                }
            } else {
                addActionError("Invalid Password");
                return "error";
            }
        } else {
            addActionError("Invalid User");
            return "error";
        }
        
        }
        else {
            addActionError("Invalid Captcha ! Try again . ");
            return "error";
        }
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setServletRequest(HttpServletRequest hsr) {

        request = hsr;
    }

    @Override
    public void validate() {
        if (userid.equals("")) {
            addFieldError("userid", "Enter User Name");
        }
        if (pass.equals("")) {
            addFieldError("pass", "Enter Password");
        }

    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

//    public String logout(){
//        session.remove("loginId");
//        session.remove("user");
//        session.remove("type");
//        session.invalidate();
//        return SUCCESS;
//    }
}
