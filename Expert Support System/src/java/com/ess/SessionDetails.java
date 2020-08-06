package com.ess;
// Generated Jul 30, 2014 10:31:46 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SessionDetails generated by hbm2java
 */
@Entity
@Table(name="session_details"
    ,catalog="expert_support_system"
)
public class SessionDetails  implements java.io.Serializable {


     private int loginId;
     private TicketDetails ticketDetails;
     private String clientName;
     private int noOfTickets;
     private String issue;
     private String category;
     private Date loginTime;
     private Date logoffTime;

    public SessionDetails() {
    }

    public SessionDetails(int loginId, TicketDetails ticketDetails, String clientName, int noOfTickets, String issue, String category, Date loginTime, Date logoffTime) {
       this.loginId = loginId;
       this.ticketDetails = ticketDetails;
       this.clientName = clientName;
       this.noOfTickets = noOfTickets;
       this.issue = issue;
       this.category = category;
       this.loginTime = loginTime;
       this.logoffTime = logoffTime;
    }
   
     @Id 

    
    @Column(name="Login_Id", unique=true, nullable=false)
    public int getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Ticket_Id" )
    public TicketDetails getTicketDetails() {
        return this.ticketDetails;
    }
    
    public void setTicketDetails(TicketDetails ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    
    @Column(name="Client_Name", nullable=false, length=30)
    public String getClientName() {
        return this.clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    
    @Column(name="No_of_Tickets", nullable=false)
    public int getNoOfTickets() {
        return this.noOfTickets;
    }
    
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    
    @Column(name="Issue", nullable=false, length=30)
    public String getIssue() {
        return this.issue;
    }
    
    public void setIssue(String issue) {
        this.issue = issue;
    }

    
    @Column(name="Category", nullable=false, length=30)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Login_Time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Logoff_Time", length=19)
    public Date getLogoffTime() {
        return this.logoffTime;
    }
    
    public void setLogoffTime(Date logoffTime) {
        this.logoffTime = logoffTime;
    }




}

