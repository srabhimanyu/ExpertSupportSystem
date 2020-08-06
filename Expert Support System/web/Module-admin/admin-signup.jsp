<%@taglib prefix="s"  uri="/struts-tags"%>
<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<s:head />
<d:head />
<s:form action="adminSignUpAction">
    <s:textfield name="firstName" label="First Name: " />
    <s:textfield name="lastName" label="Last Name: " />
    <s:textfield name="workingHours" label="Working Hours: " />
    <s:textfield name="noOfTickets" label="No Of Tickets: " />
    <s:textfield name="solverName" label="Solver Name: " />
    <s:textfield name="category" label="Category: " />
    <s:textfield name="issue" label="issue: " />
    <s:textfield name="clientName" label="Client Name: " />
    <s:password name="passwd" label="Password" />
    <s:password name="cpasswd" label="Confirm Password" />
    <s:submit value="Submit" />
    
</s:form>