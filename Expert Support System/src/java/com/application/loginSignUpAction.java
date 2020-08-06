package com.application;

import com.ess.HibernateUtil;
import com.ess.LoginDetails;
import com.ess.SessionDetails;
import static com.opensymphony.xwork2.Action.NONE;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class loginSignUpAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer loginId;
    private String fname;
    private String lname;
    private String passwd;
    private String cpasswd;
    private String userName;
    private String grp;

    @Override
    public String execute() throws Exception {

        if (passwd.equals(cpasswd)) {

            Session s = HibernateUtil.getSession();
            LoginDetails ld = new LoginDetails(passwd, fname + " " + lname, grp);
            s.save(ld);
            SessionDetails sd = new SessionDetails(ld.getLoginId(), null, NONE, 0, NONE, NONE, null, null);
            s.save(sd);
            s.beginTransaction().commit();
            session.put("loginId", ld.getLoginId());
            session.put("fname", fname);
            session.put("lname", lname);
            s.close();

            if (grp.equals("Representative")) {

                return "SignUpRepresentative";

            } else if (grp.equals("Client")) {

                return "SignUpClient";

            } else {
                return ERROR;
            }
        } else {
            return ERROR;
        }

    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public SessionMap<String, Object> getSession() {
        return session;
    }

    public void setSession(SessionMap<String, Object> session) {
        this.session = session;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getCpasswd() {
        return cpasswd;
    }

    public void setCpasswd(String cpasswd) {
        this.cpasswd = cpasswd;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
