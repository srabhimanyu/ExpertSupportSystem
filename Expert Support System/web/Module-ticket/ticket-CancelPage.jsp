<%@taglib  prefix="s" uri="/struts-tags" %>
<s:head /> 
<s:form action="cancelTicketComplete">

    <s:hidden name="ticketId" value='%{#session.ticketId}' />
    <s:hidden name="clientId" value='%{#session.clientId}' />
    <s:hidden name="category" value='%{#session.category}' />
    <s:hidden name="issue" value='%{#session.issue}' />
    <s:hidden name="priority" value='%{#session.priority}' />
    <s:hidden name="solverName" value='%{#session.solverName}' />
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
            <th scope="row">Client ID : </th>
            <td>${sessionScope.clientId}</td>
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
            <th scope="row">Priority : </th>
            <td>${sessionScope.priority}</td>
        </tr>
       <tr>
            <th scope="row">Solver Name : </th>
            <td>${sessionScope.solverName}</td>
        </tr>        
       <tr><td><s:textarea name="reason" label="Reason (max 50 characters)" onkeyup="textCounter(this,'counter',50);" id="message" /></td></tr>
        
        <tr><td><s:textfield disabled="true" maxLength="3" size="3" value="50" id="counter"/></td></tr>
        <s:submit value="Delete Ticket" />
    </table>
        </body>


</s:form>