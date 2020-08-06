<%@taglib prefix="s" uri="/struts-tags" %>
<%--<s:head /> --%>
<link href="<s:url value="style11.css" />" rel="stylesheet" type="text/css"/>

<s:form action="LoginAction" method="POST">
<table border="0">
    <tr>
        <td><s:textfield name="userid" label="Login ID" /></td>
        <td><s:password name="pass" label="Password" /></td>
        <td><div align="right"><img src="Captcha.jpg" border="0"></div></td>
        <td><s:textfield label="Enter Captcha Here" name="j_captcha_response" size="20" maxlength="10"/></td>
        <td><s:submit value="Login" /></td>
        <td><s:actionerror /></td>
</table>
</s:form>
 