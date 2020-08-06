<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <style type="text/css">
            <!--
            /* CSS Tabs */
            #button {
                width: 12em;
                border-right: 1px solid #000;
                padding: 0 0 1em 0;
                margin-bottom: 1em;
                font-family: Tahoma, Arial, sans-serif;
                /*'Trebuchet MS', 'Lucida Grande', Verdana, Arial, sans-serif;*/
                font-size : 10px;
                background-color: #90bade;
                color: #333;
            }

            #button ul {
                list-style: none;
                margin: 0;
                padding: 0;
                border: none;
            }

            #button li {
                border-bottom: 1px solid #90bade;
                margin: 0;
                list-style: none;
                list-style-image: none;
            }

            #button li a {
                display: block;
                padding: 5px 5px 5px 0.5em;
                border-left: 10px solid #1958b7;
                border-right: 10px solid #508fc4;
                background-color: #2175bc;
                color: #fff;
                text-decoration: none;
                width: 100%;
            }

            html>body #button li a {
                width: auto;
            }

            #button li a:hover {
                border-left: 10px solid #1c64d1;
                border-right: 10px solid #5ba3e0;
                background-color: #2586d7;
                color: #fff;
            }

            #button li #active {
                border-left: 10px solid #1c64d1;
                border-right: 10px solid #5ba3e0;
                background-color: #2586d7;
                color: #fff;
            }
            -->
        </style>
    </head>

    <body>


        <div id="button">
            <ul>
                <!-- CSS Tabs -->
                <li><s:a action="adminHome">Admin Home</s:a></li>
                <li><s:a action="addAdmin">Add Admin</s:a></li>
                <li><a href="Products.html">Auto Responder</a></li>
                <li><a href="Services.html">Ticket Search</a></li>
                <li><a href="Support.html">Ticket Addition Requests</a></li>
                <li><a href="Order.html">Ticket Deletion</a></li>
                <li><a href="News.html">Ticket Updation</a></li>
                <li><a href="About.html">Representatives Work Time</a></li>
                <li><a href="Home.html">Client Functionality</a></li>
                <li><a href="Home.html">My Profile</a></li>
                <li><s:a action="updateadmin">Update My Profile</s:a></li>
                <li><s:a action="logout">Logout</s:a></li>
            </ul>
        </div>
    </body>
</html>