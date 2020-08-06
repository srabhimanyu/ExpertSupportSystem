<%@taglib prefix="s" uri="/struts-tags"%>
<s:head />
<body>
<script>function textCounter(field,field2,maxlimit)
{
 var countfield = document.getElementById(field2);
 if ( field.value.length > maxlimit ) {
  field.value = field.value.substring( 0, maxlimit );
  return false;
 } else {
  countfield.value = maxlimit - field.value.length;
 }
}
    </script>
</body>
<s:form action="client-sendGenerateTicketReq">
    
    <%--Login Id : <s:property value='%{#session.loginId}'/><s:textfield name="loginId" label="Login Id (Your Current Login ID)" value='%{#session.loginId}' />--%>
    <s:hidden name="loginId" value='%{#session.loginId}' />
    <s:select label="Category" 
		headerKey="-1" headerValue="Select Category"
		list="#{'Technical':'Technical', 'Services':'Services', 'Site':'Site', 'Personal':'Personal'}" 
		name="category" 
		value="-1" />
    <%--    <s:textfield name="category" label="Category" /> --%>
    <s:select label="Priority" 
		headerKey="-1" headerValue="Select Priority"
		list="#{'Low':'Low', 'Medium':'Medium', 'High':'High'}" 
		name="priority" 
		value="-1" />
    <s:textfield name="issue"   label="Issue (max 30 characters)" />
    <s:submit value="Request Ticket" />
</s:form>
