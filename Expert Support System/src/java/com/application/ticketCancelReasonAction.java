package com.application;

import com.ess.SolveTicket;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class ticketCancelReasonAction  extends ActionSupport implements ServletRequestAware, SessionAware{
    
    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String rd;
    
            @Override
    public String execute() throws Exception {

        Session s = com.ess.HibernateUtil.getSession();
        
            SolveTicket st=(SolveTicket)s.get(SolveTicket.class, new Integer(rd));
    
            session.put("ticketId", st.getTicketId());
            session.put("clientId",st.getClientDetails().getClientId());
            session.put("issue",st.getIssue());
            session.put("priority",st.getPriority());
            session.put("solverName",st.getSolverName());
            session.put("category",st.getCategory());
            s.close();
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

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }
    
    


    
}
