package com.application;

import com.ess.AdminDetails;
import com.ess.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class AdminAccessAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer loginId;
    private String passwd;
     private String grp;
     private Integer workingHours;
     private Integer noOfTickets;
     private String solverName;
     private String category;
     private String issue;
     private String clientName;

    @Override
    public String execute() throws Exception {
        
        Session s = HibernateUtil.getSession();
        AdminDetails ad = (AdminDetails) s.get(AdminDetails.class, loginId);
//        AdminDetails ad1=(AdminDetails) ActionContext.getContext().getSession().
        if (ad != null) {

            if (ad.getPasswd().equals(passwd)) {
                
                session.put("grp", ad.getGrp());
                session.put("workingHours", ad.getWorkingHours());
                session.put("noOfTickets", ad.getNoOfTickets());
                session.put("solverName", ad.getSolverName());
                session.put("category", ad.getCategory());
                session.put("issue", ad.getIssue());
                session.put("clientName", ad.getClientName());
                session.put("passwd", ad.getPasswd());                
                return "success";
            } else {
                request.setAttribute("msg", "Invalid Password");
                return "error";
            }
        } else {
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

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    public Integer getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
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

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    
    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }

    
}
