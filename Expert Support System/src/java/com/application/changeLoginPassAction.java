
package com.application;

import com.ess.ClientDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class changeLoginPassAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String oldpassword;
    private String newpassword;
    private String confirmpassword;
    private String submit;
    
    
    @Override
    public String execute() throws Exception {

        Integer clientId=(Integer)session.get("clientId");
        
        if(submit.equals("Change Password")){

        Session s = com.ess.HibernateUtil.getSession();
        ClientDetails cd = (ClientDetails) s.get(ClientDetails.class, clientId);
                if(cd.getLoginDetails().getPasswd().equals(oldpassword)) {
                    
                    if( newpassword.equals("") || newpassword==null ){
                        request.setAttribute("errorMsg", "*Password Field/(s) Can't be Empty");
                        return ERROR;                        
                    }
                    else if(newpassword.equals(confirmpassword)) {
                        cd.getLoginDetails().setPasswd(newpassword);
                        s.saveOrUpdate(cd.getLoginDetails());
                        s.saveOrUpdate(cd);
                        s.beginTransaction().commit();
                        s.close();
                        return SUCCESS;
                    }
                    else {
                        request.setAttribute("errorMsg", "*New Password Doesn't Match With Confirm Password");
                        return ERROR;
                    }
                }
                else {
                        request.setAttribute("errorMsg", "*Old Password Incorrect Or Field Is Empty");
                        return ERROR;
                }
        }
        else if(submit.equals("Return To Home Page")){
            
            return "GoToHomePage";
        }
        else{
            request.setAttribute("errorMsg", "*Sorry Something went Wrong Try Again Later");
            return ERROR;
        }
        
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

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
    
    
        public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }
    
}
