
package com.application;

import com.ess.HibernateUtil;
import com.ess.RepresentativeDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class RepresentativeAccessAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String rep_loginId;
    private String rep_passwd;

    @Override
    public String execute() throws Exception {
        
        Session s=HibernateUtil.getSession();
        
        RepresentativeDetails rd=(RepresentativeDetails)s.get(RepresentativeDetails.class ,new Integer(rep_loginId));
        
        if(rd!=null){
            
            if (rd.getPasswrd().equals(rep_passwd)) {
                
                    session.put("rep_email", "ErRuchirGupta@gmail.com");
                    String Subject="Your Ticket Id is: "+ (Integer)session.get("ticketId");
                    String body="Your Ticket Id is: "+ (Integer)session.get("ticketId")
                            +"\n Issue : "+(String)session.get("issue")
                            +"\n Solution : "+(String)session.get("solution");
                    session.put("subject", Subject);
                    session.put("body", body);
                    
            
                    return SUCCESS;
            }
            else {
                request.setAttribute("msg", "Invalid Password");
                return "error";
            }
        }
        else {
            request.setAttribute("msg", "Invalid User");
            return "error";
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

    public String getRep_loginId() {
        return rep_loginId;
    }

    public void setRep_loginId(String rep_loginId) {
        this.rep_loginId = rep_loginId;
    }

    public String getRep_passwd() {
        return rep_passwd;
    }

    public void setRep_passwd(String rep_passwd) {
        this.rep_passwd = rep_passwd;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }
    
    
}
