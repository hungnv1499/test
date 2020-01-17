<%-- 
    Document   : registration
    Created on : Jan 14, 2020, 12:56:42 AM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" href="img/favicon.png" type="image/png" />

        <!-- CSS -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/media.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" href="css/owl.transitions.css">
        <link rel="stylesheet" href="css/jquery.bxslider.css">
        <link rel="stylesheet" href="css/elegant-icons.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/flexslider.css">
        <link rel="stylesheet" href="css/flexslider-set.css">
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container text-center padding-vertical-100">
            <h2 class="double-line"><span>Registry</span></h2>
            <div class="row justify-content-md-center"  >
                <div class="col-md-6 col-sm-6" >
                    <form action="MainController" method="POST" class="contact-form padding-top-50 margin-bottom-15">
                        <div class="row">
                            <div class="col-md-4 col-sm-4">
                                <div class="form-group text-left">
                                    <label for="email">Email: </label>
                                </div>
                                <!-- /form-group -->
                            </div>
                            <div class="col-md-8 col-sm-8">
                                <div class="form-group text-right">
                                    <input type="text" name="txtEmail" id="email" class="form-control" value="${param.txtEmail}">
                                </div>
                                <!-- /form-group -->
                            </div>
                        </div>
                        <div class="row">
                            <font color="red">${requestScope.INVALID.emailError}<font>
                        </div>
                        <div class="row">
                            <div class="col-md-4 col-sm-4">
                                <div class="form-group text-left">
                                    <label for="fullname">Name: </label>
                                </div>
                                <!-- /form-group -->
                            </div>
                            <div class="col-md-8 col-sm-8">
                                <div class="form-group text-right">
                                    <input type="text" name="txtFullname" id="fullname" class="form-control" value="${param.txtFullname}">
                                </div>
                                <!-- /form-group -->
                            </div>
                        </div>
                      
                        <div class="row">
                            <div class="col-md-4 col-sm-4">
                                <div class="form-group text-left">
                                    <label for="password">Password: </label>
                                </div>
                                <!-- /form-group -->
                            </div>
                            <div class="col-md-8 col-sm-8">
                                <div class="form-group text-right">
                                    <input type="password" name="txtPassword" id="password" class="form-control" >
                                </div>
                                <!-- /form-group -->
                            </div>
                        </div>
                        <div class="row">
                            <font color="red">${requestScope.INVALID.passwordError}<font>
                        </div>
                        <div class="row">
                            <div class="col-md-4 col-sm-4">
                                <div class="form-group text-left">
                                    <label for="confirm">Confirm pass: </label>
                                </div>
                                <!-- /form-group -->
                            </div>
                            <div class="col-md-8 col-sm-8">
                                <div class="form-group text-right">
                                    <input type="password" name="txtConfirm" id="confirm" class="form-control">
                                </div>
                                <!-- /form-group -->
                            </div>
                        </div>
                        <div class="row">
                            <font color="red">${requestScope.INVALID.confirmError}<font>
                        </div>
                        <div class="row">
                            <input type="submit" name="action" value="SignIn"  class="btn btn-login"/>
                        </div>

                        


                    </form>

                </div>

            </div>
        </div>
        <script src="js/lib/jquery.min.js"></script>
        <script src="js/vendors/bootstrap.min.js"></script>
        <script src="js/lib/jquery.waypoints.min.js"></script>
        <script src="js/lib/moderniz.min.js"></script>
        <script src="js/scripts.js"></script>
        <script src="js/vendors/owl.carousel.min.js"></script>
        <script src="js/vendors/jquery.bxslider.min.js"></script>
        <script src="js/vendors/jquery.magnific-popup.min.js"></script>
        <script src="js/vendors/jquery.flexslider-min.js"></script>
        <script src="js/vendors/flexslider-init.js"></script>
        <script src="js/vendors/smoothscroll.js"></script>
    </body>
</html>
