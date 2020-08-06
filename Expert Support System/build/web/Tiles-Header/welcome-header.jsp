<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <script type="text/javascript">
        var myVar = setInterval(function(){ myTimer() }, 1000);
        var jsVar=  <%=java.util.Calendar.getInstance().getTimeInMillis()%>;
        var timeZoneOffset=<%=java.util.TimeZone.getDefault().getOffset(System.currentTimeMillis())%>;

        jsVar=jsVar+timeZoneOffset;
        function myTimer() {
        jsVar=jsVar+1000;
        var d = new Date(jsVar);
        var t=d.toUTCString().replace(" GMT","");
    document.getElementById("timelable").innerHTML = t;
}

        </script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Expert Support System</title>
<style type="text/css">
<!--
.style1 {
	font-size: xx-large;
	color: #FFFFFF;
	font-weight: bold;
}
.style2 {
	color: #FFFFFF;
	font-size: large;
	font-style: italic;
}
-->
</style>
</head>

<body bottommargin="0" leftmargin="0" rightmargin="0" topmargin="0">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#006699">
  <!--DWLayoutTable-->
  <tr>
    <td height="21" colspan="5" valign="top" bgcolor="#000000"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td width="43" height="32">&nbsp;</td>
    <td width="555">&nbsp;</td>
    <td width="310">&nbsp;</td>
    <td width="430">&nbsp;</td>
    <td width="56">&nbsp;</td>
  </tr>
  <tr>
    <td height="50"></td>
    <td valign="top"><div align="center" class="style1">Expert Support System </div></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  
  
  
  
  
  
  
  <tr>
    <td height="23"></td>
    <td></td>
    <td valign="top"><div align="center" class="style2">Online Customer Care Help-Center |</div></td>
    <td><b>Current Server Time is :&nbsp;<font color="white"><label id="timelable"></label></font></b></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="26"></td>
    <td></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
