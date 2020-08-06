<%@taglib prefix="s" uri="/struts-tags" %>
<h3>Client Authentication Panel</h3>
<s:head />
<s:form action="clientaccess" >
    <s:textfield name="clientId" label="Client ID "/>
    <s:password name="passwd" label="Client ID Password " />
    
    <s:submit value="Authenticate" />
        <s:div><font color="Red">${requestScope.msg}</font></s:div>
</s:form>
