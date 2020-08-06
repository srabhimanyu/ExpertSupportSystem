<%@taglib  prefix="s" uri="/struts-tags" %>
<h3>Ticket Fixed Successfully</h3>
<s:form action="LoginToNotifyViaEmail">
<s:head /> 
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
    <th scope="row">Solution : </th>
    <td>${sessionScope.solution}</td>
  </tr>
  
    <tr>
    <th scope="row">Status : </th>
    <td>${sessionScope.status}</td>
  </tr>

  </table>
    <s:submit value="Notify Client Via Email" />
</s:form>