package com.ess;
// Generated Jul 30, 2014 10:31:46 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoginDetails generated by hbm2java
 */
@Entity
@Table(name="login_details"
    ,catalog="expert_support_system"
)
public class LoginDetails  implements java.io.Serializable {


     private Integer loginId;
     private String passwd;
     private String userName;
     private String grp;
     private Set<TicketDetails> ticketDetailses = new HashSet<TicketDetails>(0);
     private Set<GroupDetails> groupDetailses = new HashSet<GroupDetails>(0);
     private Set<ClientDetails> clientDetailses = new HashSet<ClientDetails>(0);
     private Set<AnswerDetails> answerDetailses = new HashSet<AnswerDetails>(0);

    public LoginDetails() {
    }

	
    public LoginDetails(String passwd, String userName, String grp) {
        this.passwd = passwd;
        this.userName = userName;
        this.grp = grp;
    }
    public LoginDetails(String passwd, String userName, String grp, Set<TicketDetails> ticketDetailses, Set<GroupDetails> groupDetailses, Set<ClientDetails> clientDetailses, Set<AnswerDetails> answerDetailses) {
       this.passwd = passwd;
       this.userName = userName;
       this.grp = grp;
       this.ticketDetailses = ticketDetailses;
       this.groupDetailses = groupDetailses;
       this.clientDetailses = clientDetailses;
       this.answerDetailses = answerDetailses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Login_Id", unique=true, nullable=false)
    public Integer getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    
    @Column(name="Passwd", nullable=false, length=30)
    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    
    @Column(name="User_Name", nullable=false, length=30)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="Grp", nullable=false, length=20)
    public String getGrp() {
        return this.grp;
    }
    
    public void setGrp(String grp) {
        this.grp = grp;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loginDetails")
    public Set<TicketDetails> getTicketDetailses() {
        return this.ticketDetailses;
    }
    
    public void setTicketDetailses(Set<TicketDetails> ticketDetailses) {
        this.ticketDetailses = ticketDetailses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loginDetails")
    public Set<GroupDetails> getGroupDetailses() {
        return this.groupDetailses;
    }
    
    public void setGroupDetailses(Set<GroupDetails> groupDetailses) {
        this.groupDetailses = groupDetailses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loginDetails")
    public Set<ClientDetails> getClientDetailses() {
        return this.clientDetailses;
    }
    
    public void setClientDetailses(Set<ClientDetails> clientDetailses) {
        this.clientDetailses = clientDetailses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loginDetails")
    public Set<AnswerDetails> getAnswerDetailses() {
        return this.answerDetailses;
    }
    
    public void setAnswerDetailses(Set<AnswerDetails> answerDetailses) {
        this.answerDetailses = answerDetailses;
    }




}


