<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:head />
<s:form action="checkTnCdone">

    <s:div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Terms & Conditions</b></s:div>
    
    <s:checkbox name="c1" label="I have not shared my Login-Id/Client-Id password with anyone." 
               value="false" fieldValue="true" />
    
    <s:checkbox name="c2" label="I am responsible for the content typed in query." 
                         value="false" fieldValue="true"   />
    
    <s:checkbox name="c3" label="I understand that necessary disciplinary action can be initiated
                                against me in case of use of derogatory words or false statements 
                                against any Administrator/Representative/User/Client/Company/Higher Authority
                                or providing feedback/information which is subsequently found false 
                                or proved wrong." value="false" fieldValue="true" />
    

    <s:div><br></s:div>
    <s:div><font color="Red">${requestScope.errorMsg}</font></s:div>
    <s:submit align="left" value="I Agree" />
    </s:form>



 