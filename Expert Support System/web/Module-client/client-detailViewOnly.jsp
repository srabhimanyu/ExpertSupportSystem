<%@taglib  prefix="s" uri="/struts-tags" %>
<s:head /> 


    <table border="0">
        <tr>
            <th scope="row">First Name </th>
            <td>${sessionScope.firstName}</td>
        </tr>
        <tr>
            <th scope="row">Last Name </th>
            <td>${sessionScope.lastName}</td>
        </tr>
        <tr>
            <th scope="row">Address </th>
            <td>${sessionScope.address}</td>
        </tr>
        <tr>
            <th scope="row">City </th>
            <td>${sessionScope.city}</td>
        </tr>
       <tr>
            <th scope="row">State </th>
            <td>${sessionScope.state}</td>
        </tr>        
       <tr>
            <th scope="row">Country </th>
            <td>${sessionScope.country}</td>
        </tr>
       <tr>
            <th scope="row">Phone Number </th>
            <td>${sessionScope.phNumber}</td>
        </tr>
       <tr>
            <th scope="row">E-Mail Id </th>
            <td>${sessionScope.EMail}</td>
        </tr>
        
               <tr>
            <th scope="row">Fax </th>
            <td>${sessionScope.fax}</td>
        </tr>
    </table>
