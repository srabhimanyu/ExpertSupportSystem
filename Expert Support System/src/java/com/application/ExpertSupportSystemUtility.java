package com.application;

import com.ess.AnswerDetails;
import com.ess.HibernateUtil;
import com.ess.SolveTicket;
import com.ess.TicketDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ExpertSupportSystemUtility extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;
    private List<TicketDetails> ticketDetails;
    private List<AnswerDetails> answerDetails;
    private List<SolveTicket> solveTicket;

    @Override
    public String execute() throws Exception {

        Session s = HibernateUtil.getSession();
        //if(!(request.getParameter("searchKey").equals(""))) { 
       /* if (request.getParameter("searchBy").equals("ticketId") || request.getParameter("searchBy").equals("loginDetails.loginId")) {
            ticketDetails = s.createCriteria(TicketDetails.class).add(Restrictions.like(request.getParameter("searchBy"), new Integer(request.getParameter("searchKey")))).list();
        } else {
            ticketDetails = s.createCriteria(TicketDetails.class).add(Restrictions.like(request.getParameter("searchBy"), request.getParameter("searchKey"))).list();
        }
        //}
//        else {*/
            ticketDetails = s.createCriteria(TicketDetails.class).addOrder(Order.asc(request.getParameter("searchBy"))).list();
//        }

        return SUCCESS;
    }

    public String getAllSolvedTickets() {
        Session s = HibernateUtil.getSession();
        solveTicket = s.createCriteria(SolveTicket.class).list();
        return "success";
    }

    public String getAllAnswerBooks() {
        Session s = HibernateUtil.getSession();
        answerDetails = s.createCriteria(AnswerDetails.class).list();
        return "success";
    }

    public String getAllTickets() {
        Session s = HibernateUtil.getSession();
        
        if(request.getParameter("var")!=null)
        ticketDetails = s.createCriteria(TicketDetails.class).addOrder(Order.asc(request.getParameter("var"))).list();
        else
        ticketDetails = s.createCriteria(TicketDetails.class).addOrder(Order.asc("ticketId")).list();
        
        return "success";
    }

    public List<SolveTicket> getSolveTicket() {
        return solveTicket;
    }

    public void setSolveTicket(List<SolveTicket> solveTicket) {
        this.solveTicket = solveTicket;
    }

    public List<AnswerDetails> getAnswerDetails() {
        return answerDetails;
    }

    public void setAnswerDetails(List<AnswerDetails> answerDetails) {
        this.answerDetails = answerDetails;
    }

    public List<TicketDetails> getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(List<TicketDetails> ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
