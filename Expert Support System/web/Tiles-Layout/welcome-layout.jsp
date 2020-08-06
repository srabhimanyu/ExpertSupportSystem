<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="98" colspan="5" valign="top"><tiles:insertAttribute name="header" /></td>
  </tr>
  <tr>
    <td width="18" height="14"></td>
    <td width="186"></td>
    <td width="5"></td>
    <td width="873"></td>
    <td width="13"></td>
  </tr>
  <tr>
    <td height="249">&nbsp;</td>
    <td valign="top"><tiles:insertAttribute name="menu" /></td>
    <td>&nbsp;</td>
    <td valign="top"><tiles:insertAttribute name="body" /></td>
  <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="22">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="23" colspan="5" valign="top"><tiles:insertAttribute name="footer" /></td>
  </tr>
</table>
</body>
