package com.application;

import com.ess.ClientDetails;
import com.ess.TicketDetails;
import com.ess.HibernateUtil;
import com.ess.LoginDetails;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ticketDetailAccess extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String rd;

    @Override
    public String execute() throws Exception {
        
        Session s=HibernateUtil.getSession();

        TicketDetails td=(TicketDetails)s.get(TicketDetails.class, new Integer(rd));
        
        LoginDetails ld=(LoginDetails)s.get(LoginDetails.class, td.getLoginDetails().getLoginId());
        List<ClientDetails> cd = s.createCriteria(ClientDetails.class).add(Restrictions.like("loginDetails.loginId", td.getLoginDetails().getLoginId())).list();
        
        
        session.put("ticketId", new Integer(rd));
        session.put("c_loginId", ld.getLoginId());
        for(ClientDetails c : cd ){
        session.put("clientId",c.getClientId());
        session.put("clientEmailId", c.getEMail());
        }
        session.put("category", td.getCategory());
        session.put("issue", td.getIssue());

        return SUCCESS;
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
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
