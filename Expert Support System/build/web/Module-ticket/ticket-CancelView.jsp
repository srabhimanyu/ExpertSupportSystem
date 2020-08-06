
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<% int c=0; %>
<s:form action="viewTicketsToCancel" method="POST">
    <s:hidden name="searchBy" value="status" />
            <s:select 
		headerKey="Open" headerValue="Open"
		list="#{'Fixed':'Fixed', 'Closed':'Closed'}" 
		name="searchKey" 
                value="Open" label="Ticket Status" />
            <s:submit value="Search" />
</s:form>
    <s:form action="CancelDeleteTicket">            
            <table>
    <thead>
        <tr style="color:Black;background-color:grey;font-size:14pt;">
            <th style="font-weight:bold;text-align:center;">Ticket Id</th>
            <th style="font-weight:bold;text-align:center;">Category</th>
            <th style="font-weight:bold;text-align:center;">Priority</th>
            <th style="font-weight:bold;text-align:center;">Issue</th>
            <th style="font-weight:bold;text-align:center;">Status</th>
            <th style="font-weight:bold;text-align:center;">Login ID</th>
            <th style="font-weight:bold;text-align:center;">Select</th>
        </tr>
    </thead>
    

    <tbody>
        <s:iterator value="ticketDetails">
           <% if (c%2==0) { %> 
            <tr style="color:Black;background-color:White;font-family:Trebuchet MS,Arial,Helvetica,Sans-Serif;font-size:12pt;text-align:left;">
                <td style="text-align:center;">${ticketId}</td>
                <td style="text-align:center;">${category}</td>
                <td style="text-align:center;">${priority}</td>
                <td style="text-align:center;">${issue}</td>
                <td style="text-align:center;">${status}</td>
                <td style="text-align:center;">${loginDetails.loginId}</td>
                <td style="text-align:center;"><input type="radio" name="rd" value="${ticketId}" /></td>
            </tr>
             <% } 
            else { %> 
            <tr style="color:Black;background-color:#EFEFEF;font-family:Trebuchet MS,Arial,Helvetica,Sans-Serif;font-size:12pt;text-align:left;">
                <td style="text-align:center;">${ticketId}</td>
                <td style="text-align:center;">${category}</td>
                <td style="text-align:center;">${priority}</td>
                <td style="text-align:center;">${issue}</td>
                <td style="text-align:center;">${status}</td>
                <td style="text-align:center;">${loginDetails.loginId}</td>
                <td style="text-align:center;"><input type="radio" name="rd" value="${ticketId}" /></td>
            </tr>  
            <% } 
            c++;
            %>
        </s:iterator>
    </tbody>
    
</table>

            <input  name="cancel" type="submit" value=" Cancel / Delete " />
 
 </s:form>
