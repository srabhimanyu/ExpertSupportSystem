<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<s:head/>
<% int c=0; %>
<table>
    <thead>
        <tr style="color:Black;background-color:grey;font-size:14pt;">

            <th style="font-weight:bold;text-align:center;">Category</th>
            <th style="font-weight:bold;text-align:center;">Issue</th>
            <th style="font-weight:bold;text-align:center;">solution</th>
        </tr>
    </thead>
    <tbody>
        <s:iterator value="answerDetails">
           <% if (c%2==0) { %> 
            
           <tr style="color:Black;background-color:White;font-family:Trebuchet MS,Arial,Helvetica,Sans-Serif;font-size:12pt;text-align:left;">
               <td style="text-align:center;">${category}</td>
               <td style="text-align:center;">${issue}</td>
               <td style="text-align:center;">${solution}</td>
            </tr>
            
            <% } 
           else { %> 
            
            <tr style="color:Black;background-color:#EFEFEF;font-family:Trebuchet MS,Arial,Helvetica,Sans-Serif;font-size:12pt;text-align:left;">
               <td style="text-align:center;">${category}</td>
               <td style="text-align:center;">${issue}</td>
               <td style="text-align:center;">${solution}</td>
            </tr>
            
            <% } c++; %>
        </s:iterator>
    </tbody>
</table>
