<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>


<script>
            function onChange(byvalue) {
               window.location = "${pageContext.request.contextPath}/findTickets?searchBy="+byvalue;
                    //document.getElementById("message").innerHTML = "index2.jsp";
            }
        </script>


            <%--<s:textfield name="searchKey" label="Search tickets" />--%>
            <s:select 
		headerKey="-1" headerValue="Select Search Category"
		list="#{'ticketId':'Ticket Id', 'category':'Category', 'priority':'Priority', 'issue':'Issue', 'loginDetails.loginId':'Login ID' , 'viewall':'View all'}" 
		name="searchBy" 
                value="-1" onchange="onChange(this.value)" />
