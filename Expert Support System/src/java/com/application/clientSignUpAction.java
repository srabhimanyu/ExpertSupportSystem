package com.application;

import com.ess.ClientDetails;
import com.ess.LoginDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class clientSignUpAction  extends ActionSupport implements ServletRequestAware, SessionAware{


    HttpServletRequest request;
    SessionMap<String, Object> session;
    private Integer loginId;
     private LoginDetails loginDetails;
     private String firstName;
     private String lastName;
     private String passwd;
     private String cpasswd;
     private String address;
     private String city;
     private String state;
     private String country;
     private String secQues;
     private String secAns;
     private Long phNumber;
     private String EMail;
     private Integer fax;
     private BigDecimal fee;
     private Date date;
     private Integer validity;
     
    @Override
    public String execute() throws Exception {
        
        if(passwd.equals(cpasswd)){

        Session s = com.ess.HibernateUtil.getSession();
        

         
        ClientDetails cd=new ClientDetails((LoginDetails)s.get(LoginDetails.class, loginId),
                                            firstName, lastName,
                                            passwd, address, city,
                                            state, country, secQues,
                                            secAns, phNumber, EMail,
                                            fax, fee, date, validity,
                                            null, null, null);
        s.save(cd);
        s.beginTransaction().commit();
        s.close();
        return "success";
        }
        else{
            return "error";
        }
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public LoginDetails getLoginDetails() {
        return loginDetails;
    }

    public void setLoginDetails(LoginDetails loginDetails) {
        this.loginDetails = loginDetails;
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

    public String getSecQues() {
        return secQues;
    }

    public void setSecQues(String secQues) {
        this.secQues = secQues;
    }

    public String getSecAns() {
        return secAns;
    }

    public void setSecAns(String secAns) {
        this.secAns = secAns;
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

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }

     
}
