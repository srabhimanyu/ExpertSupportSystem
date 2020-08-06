<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="com.ess.HibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.ess.AdminDetails"%>
<h3>Update Your Profile </h3>
<%@taglib prefix="s" uri="/struts-tags"%>
<%-- 
    Session s=HibernateUtil.getSession();
    Integer loginId=new Integer(request.getParameter("loginId"));
    String passwd=request.getParameter("passwd");
    AdminDetails ad=(AdminDetails)s.get(AdminDetails.class, loginId);


--%>
<s:head/>

<s:form action="updateadminSuccess">
    <s:textfield name="grp" label="Group" value='%{#session.grp}' />
    <s:textfield name="workingHours" label="Working Hours" value='%{#session.workingHours}' />
    <s:textfield name="noOfTickets" label="No Of Tickets" value='%{#session.noOfTickets}' />
    <s:textfield name="solverName" label="Solver Name" value='%{#session.solverName}' />
    <s:textfield name="category" label="Category" value='%{#session.category}' />
    <s:textfield name="issue" label="Issue" value='%{#session.issue}' />
    <s:textfield name="clientName" label="Client Name" value='%{#session.clientName}' />
    <s:password name="passwd" label="Password" value='%{#session.passwd}' />
    <s:password name="cpasswd" label="Confirm Password" value='%{#session.passwd}' />
    <s:submit value="Update" />
</s:form>
