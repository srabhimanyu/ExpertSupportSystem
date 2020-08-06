<%@taglib prefix="s"  uri="/struts-tags"%>
<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<s:head />
<d:head />
<h3>Representative Sign-Up Form</h3>
<s:form action="repSignUpAction">
    Your new Generated Login ID:<a>${sessionScope.loginId}</a>
    <br><br>
    <s:hidden name="loginId" value='%{#session.loginId}'  />
    <s:hidden name="firstName" value='%{#session.fname}'  />
    <s:hidden name="lastName" value='%{#session.lname}'  />
    <s:textfield name="qualification" label="Qualification " />
    <s:textfield name="specialization" label="Specialization " />
    <s:textfield name="address" label="Address " />
    <s:textfield name="city" label="City " />
    <s:textfield name="state" label="State " />
    <s:textfield name="country" label="Country " />
    <s:textfield name="secQues" label="Security Question " />
    <s:textfield name="secAns" label="Security Answer " />
    <s:textfield name="phNumber" label="Phone Number (10 digits) " />
    <s:textfield name="EMail" label="E-mail (Gmail Id Only) " />
    <s:textfield name="fax" label="Fax Number " />
    <s:textfield name="salary" label="Salary " />
    <d:datetimepicker name="dateOfJoining" label="Date of Joining" />
    <s:textfield name="validity" label="Validity" />
    <s:password name="passwrd" label="Representative Id Password" />
    <s:password name="cpasswrd" label="Confirm Representative Id Password" />
    <s:submit value="Sign Up" />

</s:form>