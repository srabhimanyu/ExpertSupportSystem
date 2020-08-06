package com.application;

import com.ess.AnswerDetails;
import com.ess.ClientDetails;
import com.ess.HibernateUtil;
import com.ess.LoginDetails;
import com.ess.SolveTicket;
import com.ess.TicketDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class ticketAnswerAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String rd;

    private String solution;

    @Override
    public String execute() throws Exception {
        Session s=HibernateUtil.getSession();
        
        Integer ticketId=(Integer)session.get("ticketId");
        TicketDetails td=(TicketDetails)s.get(TicketDetails.class,ticketId);
        ClientDetails cd=(ClientDetails)s.get(ClientDetails.class, (Integer)session.get("clientId"));
        LoginDetails ld=(LoginDetails)s.get(LoginDetails.class, (Integer)session.get("loginId"));
        
        AnswerDetails ad=new AnswerDetails(ticketId, ld, cd, td.getCategory(), (String)session.get("user"), td.getIssue(), solution);
        ad.setTicketId(ticketId);
        SolveTicket st=new SolveTicket(ticketId, cd, td.getIssue(), td.getPriority(), (String)session.get("user"), td.getCategory());
        st.setTicketId(ticketId);
        td.setStatus("Fixed");
        
        session.put("solution", solution);
        session.put("status", td.getStatus());
        
        s.save(ad);
        s.save(st);
        s.save(td);
        s.beginTransaction().commit();
        s.close();
        return SUCCESS;
    }

    
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
    
    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
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

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }
    
    
}
