<%@taglib  prefix="s" uri="/struts-tags" %>
<s:head /> 
<s:form action="ticketAnswered">

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
    <table border="0">
        <tr>
            <th scope="row">Ticket ID : </th>
            <td>${sessionScope.ticketId}</td>
        </tr>
        <tr>
            <th scope="row">Category : </th>
            <td>${sessionScope.category}</td>
        </tr>
        <tr>
            <th scope="row">Issue : </th>
            <td>${sessionScope.issue}</td>
        </tr>
        <tr>
            <th scope="row">Client Login ID : </th>
            <td>${sessionScope.c_loginId}</td>
        </tr>
       <tr>
            <th scope="row">Client ID : </th>
            <td>${sessionScope.clientId}</td>
        </tr>        
        
        <tr><td><s:textarea name="solution" label="Solution (max 200 characters)" onkeyup="textCounter(this,'counter',200);" id="message" /></td></tr>
        
        <tr><td><s:textfield disabled="true" maxLength="3" size="3" value="200" id="counter"/></td></tr>
        <s:submit value="Fix Ticket" />
    </table>

</body>

</s:form>