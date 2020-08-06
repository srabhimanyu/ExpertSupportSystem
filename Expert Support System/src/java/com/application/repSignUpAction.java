/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application;

import com.ess.RepresentativeDetails;
import com.ess.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.util.Date;
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
public class repSignUpAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;

    private String grp;
    private String passwrd;
    private String cpasswrd;
    private String firstName;
    private String lastName;
    private String qualification;
    private String specialization;
    private String address;
    private String city;
    private String state;
    private String country;
    private String secQues;
    private String secAns;
    private Long phNumber;
    private String EMail;
    private int fax;
    private BigDecimal salary;
    private Date dateOfJoining;
    private int validity;

    @Override
    public String execute() throws Exception {

        if (passwrd.equals(cpasswrd)) {

            Session s = HibernateUtil.getSession();

            RepresentativeDetails rd = new RepresentativeDetails();
            rd.setGrp("Representative");
            rd.setPasswrd(passwrd);
            rd.setFirstName(firstName);
            rd.setLastName(lastName);
            rd.setQualification(qualification);
            rd.setSpecialization(specialization);
            rd.setAddress(address);
            rd.setCity(city);;
            rd.setState(state);
            rd.setCountry(country);
            rd.setSecQues(secQues);
            rd.setSecAns(secAns);
            rd.setPhNumber(phNumber);
            rd.setEMail(EMail);
            rd.setFax(fax);
            rd.setSalary(salary);
            rd.setDateOfJoining(dateOfJoining);
            rd.setValidity(validity);
            s.save(rd);
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

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getCpasswrd() {
        return cpasswrd;
    }

    public void setCpasswrd(String cpasswrd) {
        this.cpasswrd = cpasswrd;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
