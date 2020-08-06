<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="com.ess.HibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.ess.AdminDetails"%>
<h3>Update Your Client Profile </h3>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:head/>

<s:form action="updateclientdetails">
   
    <s:textfield name="firstName" label="First Name" value='%{#session.firstName}' />
    <s:textfield name="lastName" label="Last Name" value='%{#session.lastName}' />
    <s:textfield name="address" label="Address" value='%{#session.address}' />
    <s:textfield name="city" label="City" value='%{#session.city}' />
    <s:textfield name="state" label="State" value='%{#session.state}' />
    <s:textfield name="country" label="Country" value='%{#session.country}' />
    <s:textfield name="phNumber" label="Phone Number" value='%{#session.phNumber}' />
    <s:textfield name="EMail" label="E-Mail Id (Gmail Only)" value='%{#session.EMail}' />
    <s:textfield name="fax" label="Fax" value='%{#session.fax}' />
    <s:submit value="Update Details" />
</s:form>
