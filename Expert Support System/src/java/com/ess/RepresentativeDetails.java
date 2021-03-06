package com.ess;
// Generated Jul 30, 2014 10:31:46 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RepresentativeDetails generated by hbm2java
 */
@Entity
@Table(name="representative_details"
    ,catalog="expert_support_system"
)
public class RepresentativeDetails  implements java.io.Serializable {


     private Integer loginId;
     private String grp;
     private String passwrd;
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
     private Integer fax;
     private BigDecimal salary;
     private Date dateOfJoining;
     private Integer validity;

    public RepresentativeDetails() {
    }

	
    public RepresentativeDetails(String grp, String passwrd, String firstName, String lastName, String qualification, String specialization, String address, String city, String state, String country, String secQues, String secAns, String EMail, Date dateOfJoining) {
        this.grp = grp;
        this.passwrd = passwrd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
        this.specialization = specialization;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.secQues = secQues;
        this.secAns = secAns;
        this.EMail = EMail;
        this.dateOfJoining = dateOfJoining;
    }
    public RepresentativeDetails(String grp, String passwrd, String firstName, String lastName, String qualification, String specialization, String address, String city, String state, String country, String secQues, String secAns, Long phNumber, String EMail, Integer fax, BigDecimal salary, Date dateOfJoining, Integer validity) {
       this.grp = grp;
       this.passwrd = passwrd;
       this.firstName = firstName;
       this.lastName = lastName;
       this.qualification = qualification;
       this.specialization = specialization;
       this.address = address;
       this.city = city;
       this.state = state;
       this.country = country;
       this.secQues = secQues;
       this.secAns = secAns;
       this.phNumber = phNumber;
       this.EMail = EMail;
       this.fax = fax;
       this.salary = salary;
       this.dateOfJoining = dateOfJoining;
       this.validity = validity;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Login_Id", unique=true, nullable=false)
    public Integer getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    
    @Column(name="Grp", nullable=false, length=30)
    public String getGrp() {
        return this.grp;
    }
    
    public void setGrp(String grp) {
        this.grp = grp;
    }

    
    @Column(name="Passwrd", nullable=false, length=30)
    public String getPasswrd() {
        return this.passwrd;
    }
    
    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    
    @Column(name="First_Name", nullable=false, length=30)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="Last_Name", nullable=false, length=30)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="Qualification", nullable=false, length=30)
    public String getQualification() {
        return this.qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    
    @Column(name="Specialization", nullable=false, length=30)
    public String getSpecialization() {
        return this.specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
    @Column(name="Address", nullable=false, length=50)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="City", nullable=false, length=20)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="State", nullable=false, length=20)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="Country", nullable=false, length=30)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="Sec_Ques", nullable=false, length=50)
    public String getSecQues() {
        return this.secQues;
    }
    
    public void setSecQues(String secQues) {
        this.secQues = secQues;
    }

    
    @Column(name="Sec_Ans", nullable=false, length=50)
    public String getSecAns() {
        return this.secAns;
    }
    
    public void setSecAns(String secAns) {
        this.secAns = secAns;
    }

    
    @Column(name="Ph_Number")
    public Long getPhNumber() {
        return this.phNumber;
    }
    
    public void setPhNumber(Long phNumber) {
        this.phNumber = phNumber;
    }

    
    @Column(name="E-Mail", nullable=false, length=40)
    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    
    @Column(name="Fax")
    public Integer getFax() {
        return this.fax;
    }
    
    public void setFax(Integer fax) {
        this.fax = fax;
    }

    
    @Column(name="Salary", precision=10)
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_of_Joining", nullable=false, length=10)
    public Date getDateOfJoining() {
        return this.dateOfJoining;
    }
    
    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    
    @Column(name="Validity")
    public Integer getValidity() {
        return this.validity;
    }
    
    public void setValidity(Integer validity) {
        this.validity = validity;
    }




}


