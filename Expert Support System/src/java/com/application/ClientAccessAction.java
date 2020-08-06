package com.application;

import com.ess.ClientDetails;
import com.ess.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class ClientAccessAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer clientId;
    private String passwd;
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

        Session s = HibernateUtil.getSession();
        ClientDetails cd = (ClientDetails) s.get(ClientDetails.class, clientId);
        Integer  loginId1=cd.getLoginDetails().getLoginId();
        Integer  loginId2=(Integer)session.get("loginId");

        if ( cd != null && loginId1.compareTo(loginId2)==0 ) {

            if (cd.getPasswd().equals(passwd)) {

                if (((String) session.get("var")).equals("mydetails")) {
                    session.put("firstName", cd.getFirstName());
                    session.put("lastName", cd.getLastName());
                    session.put("address", cd.getAddress());
                    session.put("city", cd.getCity());
                    session.put("state", cd.getState());
                    session.put("country", cd.getCountry());
                    session.put("phNumber", cd.getPhNumber());
                    session.put("EMail", cd.getEMail());
                    session.put("fax", cd.getFax());
                    session.remove("var");
                    return "viewDetails";

                } else if (((String) session.get("var")).equals("updatemydetails")) {
                    session.put("clientId", clientId);
                    session.put("firstName", cd.getFirstName());
                    session.put("lastName", cd.getLastName());
                    session.put("address", cd.getAddress());
                    session.put("city", cd.getCity());
                    session.put("state", cd.getState());
                    session.put("country", cd.getCountry());
                    session.put("phNumber", cd.getPhNumber());
                    session.put("EMail", cd.getEMail());
                    session.put("fax", cd.getFax());
                    session.remove("var");
                    return "updateDetails";

                } else if (((String) session.get("var")).equals("changelpass")) {
                    session.put("clientId", clientId);
                    session.remove("var");
                    return "changelpass";

                } else if (((String) session.get("var")).equals("changecpass")) {
                    session.put("clientId", clientId);
                    session.remove("var");
                    return "changecpass";

                } else {
                    session.remove("var");
                    return "error";
                }

            } else {
                request.setAttribute("msg", "Invalid Password");
                session.remove("var");
                return "error";
            }
        } else {
            request.setAttribute("msg", "Invalid User");
            session.remove("var");
            return "error";
        }
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
