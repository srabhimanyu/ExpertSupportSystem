
package com.application;

import com.ess.HibernateUtil;
import com.ess.LoginDetails;
import com.ess.TicketDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

/**
 *
 * @author ER Ruchir Gupta
 */
public class GenerateTicketReqAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer ticketId;
    private Integer loginId;
    private String category;
    private String priority;
    private String issue;
    private String status;

    @Override
    public String execute() throws Exception {

        if (!(category.equals("")) || !(priority.equals("")) || !(issue.equals(""))) {

            Session s = HibernateUtil.getSession();

            TicketDetails td = new TicketDetails();
            td.setCategory(category);
            td.setPriority(priority);
            td.setIssue(issue);
            td.setStatus("Open");
            LoginDetails ld = (LoginDetails) s.get(LoginDetails.class, loginId);
            td.setLoginDetails(ld);
            s.save(td);
            s.beginTransaction().commit();
            session.put("ticketId", td.getTicketId());
        s.close();
            return "success";
        } else {
            return "error";
        }
    }

//${sessionScope.type}
    
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }
}
