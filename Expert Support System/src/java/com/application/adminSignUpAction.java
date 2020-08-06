package com.application;

import com.ess.LoginDetails;
import com.ess.AdminDetails;
import com.ess.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class adminSignUpAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String firstName;
    private String lastName;
    private String passwd;
    private String cpasswd;
    private Integer workingHours;
    private Integer noOfTickets;
    private String solverName;
    private String category;
    private String issue;
    private String clientName;

    public String execute() throws Exception {

        if (passwd.equals(cpasswd)) {

            Session s = HibernateUtil.getSession();

            LoginDetails ld = new LoginDetails();
            ld.setUserName(firstName + " " + lastName);
            ld.setGrp("Administrator");
            ld.setPasswd(passwd);
            s.save(ld);
            AdminDetails ad = new AdminDetails();
            ad.setGrp("Administrator");
            ad.setPasswd(passwd);
            ad.setCategory(category);
            ad.setWorkingHours(workingHours);
            ad.setNoOfTickets(noOfTickets);
            ad.setSolverName(solverName);
            ad.setIssue(issue);
            ad.setClientName(clientName);
            s.save(ad);
            s.beginTransaction().commit();
            s.close();
            return "success";
        } else {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCpasswd() {
        return cpasswd;
    }

    public void setCpasswd(String cpasswd) {
        this.cpasswd = cpasswd;
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
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
