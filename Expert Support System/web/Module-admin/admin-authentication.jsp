<%@taglib prefix="s" uri="/struts-tags" %>
<h3>Admin Authentication Panel</h3>
<s:head />
<s:form action="adminaccess" >
    <s:textfield name="loginId" label="Admin Login ID: "/>
    <s:password name="passwd" label="Admin Password: " />
    
    <s:submit value="Authenticate" />
</s:form>
