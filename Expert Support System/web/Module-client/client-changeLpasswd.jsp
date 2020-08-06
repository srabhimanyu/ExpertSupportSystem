<%@taglib prefix="s" uri="/struts-tags"%>
<s:head />

<s:form action="changeloginpass" >
    <s:div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Change Login Id Password</b></s:div>        
            <s:div><br></s:div>
            <s:div><font color="Red">${requestScope.errorMsg}</font></s:div>
                <s:div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>Login Id : ${sessionScope.loginId}</i></s:div>
            
            <s:div><s:password name="oldpassword" label="Old Password"  /></s:div>
            <s:div><s:password name="newpassword" label="New Password"/></s:div>
            <s:div><s:password name="confirmpassword" label="Confirm Password"/></s:div>
                
            <s:div><s:submit name="submit" value="Change Password" align="center" />
                   <s:submit name="submit" value="Return To Home Page" align="center" /></s:div>
</s:form>