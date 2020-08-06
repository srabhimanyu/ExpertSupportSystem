<%@taglib  prefix="s" uri="/struts-tags" %>
<s:head />
<h3>Login Id Sign-Up Form</h3>
<body>
    <script type="text/javascript">
        function CheckPasswordStrength(password) {
            //var password_strength = document.getElementById("password_strength");

            //TextBox left blank.
            if (password.length == 0) {
                document.getElementById("password_strength").value="";
                return;
            }

            //Regular Expressions.
            var regex = new Array();
            regex.push("[A-Z]"); //Uppercase Alphabet.
            regex.push("[a-z]"); //Lowercase Alphabet.
            regex.push("[0-9]"); //Digit.
            regex.push("[$@$!%*#?&]"); //Special Character.

            var passed = 0;

            //Validate for each Regular Expression.
            for (var i = 0; i < regex.length; i++) {
                if (new RegExp(regex[i]).test(password)) {
                    passed++;
                }
            }

            //Validate for length of Password.
            if (passed > 2 && password.length > 8) {
                passed++;
            }

            //Display status.
            var color = "";
            var strength = "";
            switch (passed) {
                case 0:
                case 1:
                    strength = "Weak";
                    color = "red";
                    break;
                case 2:
                    strength = "Good";
                    color = "darkorange";
                    break;
                case 3:
                case 4:
                    strength = "Strong";
                    color = "green";
                    break;
                case 5:
                    strength = "Very Strong";
                    color = "darkgreen";
                    break;
            }
            document.getElementById("password_strength").value=strength;
            document.getElementById("password_strength").style.color=color;
        }
    </script>

<s:form action="loginSignUp">
<s:textfield name="fname" label="First Name" />
<s:textfield name="lname" label="Last Name" />
            <s:select 
		headerKey="-1" headerValue="Select Your User Type"
		list="#{'Representative':'Representative', 'Client':'Client'}" 
		name="grp" 
		value="-1" />
            <s:password id="txtPassword" onkeyup="CheckPasswordStrength(this.value)" name="passwd" label="Login ID Password" />
            <s:textfield disabled="true" id="password_strength" /> <%--<span id="password_strength"/></s:a>--%>
            <s:password name="cpasswd" label="Confirm Login ID Password" />
            <s:submit value="Next" />
            
</s:form>
    </body>