<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Email Form</title>
</head>
<body>
   <em>The form below uses Google's SMTP server. 
   So you need to enter a gmail username and password
   </em>
   <s:form action="send_emailer" method="post">
   
       <s:textfield name="from" label="From (Gmail Id only) " value='%{#session.rep_email}' />
       <s:password name="password" label="Enter Your Email Id Password "  />
   
       <s:textfield name="to" label="To " value='%{#session.clientEmailId}' />
       <s:textfield name="subject" label="Subject " value='%{#session.subject}' />
       <s:textarea name="body" label="Body " value='%{#session.body}' />       
       <s:submit value="Send Email" />
   </s:form>
</body>
</html>