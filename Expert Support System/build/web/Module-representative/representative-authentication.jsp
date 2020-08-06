<%@taglib prefix="s" uri="/struts-tags" %>
<h3>Representative Authentication Panel</h3>
<s:head />
<s:form action="representativeaccess" >
    <s:textfield name="rep_loginId" label="Representative Login ID: "/>
    <s:password name="rep_passwd" label="Representative Password: " />
    
    <s:submit value="Authenticate" />
</s:form>
