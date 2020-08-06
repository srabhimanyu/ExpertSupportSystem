//
package com.application;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class AdminDetailUpdate  extends ActionSupport implements ServletRequestAware, SessionAware {

    public void setServletRequest(HttpServletRequest hsr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSession(Map<String, Object> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    
//    HttpServletRequest request;
//    SessionMap<String, Object> session;
//    private Integer loginId;
//    private String passwd;
//    private String grp;
//    private Integer workingHours;
//    private Integer noOfTickets;
//    private String solverName;
//    private String category;
//    private String issue;
//    private String clientName;
//    
}
