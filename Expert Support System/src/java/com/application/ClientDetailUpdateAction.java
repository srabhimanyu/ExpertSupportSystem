package com.application;

import com.ess.ClientDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class ClientDetailUpdateAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String country;
    private Long phNumber;
    private String EMail;
    private Integer fax;

    @Override
    public String execute() throws Exception {

        Integer clientId = (Integer) session.get("clientId");
        Session s = com.ess.HibernateUtil.getSession();
        ClientDetails cd = (ClientDetails) s.get(ClientDetails.class, clientId);

        if (cd != null) {

            cd.setFirstName(firstName);
            cd.setLastName(lastName);
            cd.setAddress(address);
            cd.setCity(city);
            cd.setState(state);
            cd.setCountry(country);
            cd.setPhNumber(phNumber);
            cd.setEMail(EMail);
            cd.setFax(fax);

            s.saveOrUpdate(cd);
            s.beginTransaction().commit();
            s.close();
            
            return SUCCESS;
            
        } else {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(Long phNumber) {
        this.phNumber = phNumber;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }
}
