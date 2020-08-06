package com.ess;
// Generated Jul 30, 2014 10:31:46 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientDetails generated by hbm2java
 */
@Entity
@Table(name="client_details"
    ,catalog="expert_support_system"
)
public class ClientDetails  implements java.io.Serializable {


     private Integer clientId;
     private LoginDetails loginDetails;
     private String firstName;
     private String lastName;
     private String passwd;
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
     private Set<CancelTicket> cancelTickets = new HashSet<CancelTicket>(0);
     private Set<AnswerDetails> answerDetailses = new HashSet<AnswerDetails>(0);
     private Set<SolveTicket> solveTickets = new HashSet<SolveTicket>(0);

    public ClientDetails() {
    }

	
    public ClientDetails(LoginDetails loginDetails, String firstName, String lastName, String passwd, String address, String city, String state, String country, String secQues, String secAns, Date date) {
        this.loginDetails = loginDetails;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwd = passwd;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.secQues = secQues;
        this.secAns = secAns;
        this.date = date;
    }
    public ClientDetails(LoginDetails loginDetails, String firstName, String lastName, String passwd, String address, String city, String state, String country, String secQues, String secAns, Long phNumber, String EMail, Integer fax, BigDecimal fee, Date date, Integer validity, Set<CancelTicket> cancelTickets, Set<AnswerDetails> answerDetailses, Set<SolveTicket> solveTickets) {
       this.loginDetails = loginDetails;
       this.firstName = firstName;
       this.lastName = lastName;
       this.passwd = passwd;
       this.address = address;
       this.city = city;
       this.state = state;
       this.country = country;
       this.secQues = secQues;
       this.secAns = secAns;
       this.phNumber = phNumber;
       this.EMail = EMail;
       this.fax = fax;
       this.fee = fee;
       this.date = date;
       this.validity = validity;
       this.cancelTickets = cancelTickets;
       this.answerDetailses = answerDetailses;
       this.solveTickets = solveTickets;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Client_Id", unique=true, nullable=false)
    public Integer getClientId() {
        return this.clientId;
    }
    
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Login_Id", nullable=false)
    public LoginDetails getLoginDetails() {
        return this.loginDetails;
    }
    
    public void setLoginDetails(LoginDetails loginDetails) {
        this.loginDetails = loginDetails;
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

    
    @Column(name="Passwd", nullable=false, length=30)
    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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

    
    @Column(name="E-Mail", length=40)
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

    
    @Column(name="Fee", precision=10)
    public BigDecimal getFee() {
        return this.fee;
    }
    
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="Validity")
    public Integer getValidity() {
        return this.validity;
    }
    
    public void setValidity(Integer validity) {
        this.validity = validity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientDetails")
    public Set<CancelTicket> getCancelTickets() {
        return this.cancelTickets;
    }
    
    public void setCancelTickets(Set<CancelTicket> cancelTickets) {
        this.cancelTickets = cancelTickets;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientDetails")
    public Set<AnswerDetails> getAnswerDetailses() {
        return this.answerDetailses;
    }
    
    public void setAnswerDetailses(Set<AnswerDetails> answerDetailses) {
        this.answerDetailses = answerDetailses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientDetails")
    public Set<SolveTicket> getSolveTickets() {
        return this.solveTickets;
    }
    
    public void setSolveTickets(Set<SolveTicket> solveTickets) {
        this.solveTickets = solveTickets;
    }




}

