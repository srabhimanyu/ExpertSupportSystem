<%@taglib prefix="s"  uri="/struts-tags"%>
<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<s:head />
<d:head />
<h3>Client Sign-Up Form</h3>
<s:form action="clientSignUpAction">
        Your new Generated Login ID:<a>${sessionScope.loginId}</a>
    <br><br>
    <s:hidden name="loginId" value='%{#session.loginId}'  />
    <s:hidden name="firstName" value='%{#session.fname}'  />
    <s:hidden name="lastName" value='%{#session.lname}'  />
    <s:textfield name="address" label="Address " />
    <s:textfield name="city" label="City " />
    <s:textfield name="state" label="State " />
    <s:textfield name="country" label="Country " />
    <s:textfield name="secQues" label="Security Question " />
    <s:textfield name="secAns" label="Security Answer " />
    <s:textfield name="phNumber" label="Phone Number (10 digits) " />
    <s:textfield name="EMail" label="E-mail (Gmail Id only) " />
    <s:textfield name="fax" label="Fax Number " />
    <s:textfield name="fee" label="Fee " />
    <d:datetimepicker name="date" label="Date " />
    <s:textfield name="validity" label="Validity" />
    <s:password name="passwd" label="Password" />
    <s:password name="cpasswd" label="Confirm Password" />
    <s:submit value="Sign Up" />
    
</s:form>