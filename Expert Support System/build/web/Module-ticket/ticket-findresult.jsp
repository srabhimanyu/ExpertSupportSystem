<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<% int c=0; %>
<s:head/>
<s:form action="answerTicketNow">
<table >
    <thead>
        <tr style="color:Black;background-color:grey;font-size:14pt;">
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=ticketId">Ticket Id</s:a></th>
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=category">Category</s:a></th>
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=priority">Priority</s:a></th>
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=issue">Issue</s:a></th>
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=status">Status</s:a></th>
            <th style="font-weight:bold;text-align:center;"><s:a action="viewTickets?var=loginDetails.loginId">Login ID</s:a></th>
            <th style="font-weight:bold;text-align:center;">Select</th>
        </tr>
    </thead>
    <tbody>
        <s:iterator value="ticketDetails">
            
            <c:if test="${status eq 'Open'}">
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
            </c:if>
        </s:iterator>
    </tbody>
</table>

            <br>
            <input type="submit" value="Answer" />
            
</s:form>