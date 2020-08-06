
package com.application;

import com.ess.CancelTicket;
import com.ess.ClientDetails;
import com.ess.TicketDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class ticketCancelAction  extends ActionSupport implements ServletRequestAware, SessionAware {
    
        HttpServletRequest request;
    SessionMap<String, Object> session;
     private int ticketId;
     private int clientId;
     private String issue;
     private String priority;
     private String solverName;
     private String category;
     private String reason;
    
        @Override
    public String execute() throws Exception {

        Session s = com.ess.HibernateUtil.getSession();
        
            CancelTicket ct=new CancelTicket(ticketId, (ClientDetails)s.get(ClientDetails.class, clientId),
                    issue, priority, solverName, category, reason, new Date());
            
            s.save(ct);
            s.delete((TicketDetails)s.get(TicketDetails.class, ticketId));
            s.beginTransaction().commit();
            return SUCCESS;
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

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSolverName() {
        return solverName;
    }

    public void setSolverName(String solverName) {
        this.solverName = solverName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap)map;
    }
  
    
}
    
