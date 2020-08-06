<%@taglib prefix="s" uri="/struts-tags" %>
<%--<s:head />
<link href="<s:url value="style1.css" />" rel="stylesheet" type="text/css"/>

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
 --%>
<table width="350" align="center" cellpadding="0" cellspacing="0" bgcolor="#EAEAEA" class="table_login" style="width:350px">

    <caption style="height:10px"></caption>
    <tr>
        <th height="28" colspan="2" class="login">Login Here</th>
    </tr>
    <tr>
        <td width="506" height="22" align="left" valign="top" style="padding-left: 12px"><s:form action="LoginAction" method="POST">
                <br />
                <span class="ml4">

                </span><br />
                <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#333333">
                    <tr>
                        <td width="39%" height="30" align="right" class="ml4"><strong> Login ID : </strong></td>
                        <td width="61%" style="padding-left:5px"><s:textfield name="userid" /></td>
                    </tr>
                    <tr>
                        <td height="30" align="right" class="ml4"><strong>Password : </strong></td>
                        <td style="padding-left:5px"><s:password name="pass" /></td>
                    </tr>
                    <tr>
                        <td height="30" align="right" class="ml4"><strong>Enter Captcha Here : </strong></td>
                        <td style="padding-left:5px"><s:password name="j_captcha_response" size="20" maxlength="10"/></td>
                    </tr>
                    <tr>
                        <td height="41" align="right" class="ml4">&nbsp;</td>
                        <td style="padding-left:5px"><label>
                                <img src="Captcha.jpg" border="0">
                            </label></td>
                    </tr>
                    <tr>
                        <td height="41" align="right" class="ml4">&nbsp;</td>
                        <td style="padding-left:5px"><label>
                                <input name="button1" type="submit" class="button" value="  Log In" />
                                <input name="button2" type="reset" class="button"  value="  Reset  " />

                            </label></td>
                    </tr>
                    <tr>
                        <td height="41" align="center" class="ml4"><a href="#">Forgot Password?</a></td>
                        <td style="padding-left:5px"><s:actionerror /></td>
                    </tr>
                </table>
                <br />
            </s:form></td>
    </tr>
</table>
