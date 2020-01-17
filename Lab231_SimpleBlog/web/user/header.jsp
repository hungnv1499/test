
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--header-->
<header style="padding-bottom: 100px;">
    <nav class="main-nav menu-dark menu-transparent nav-transparent active">
        <div class="col-md-12">
            <div class="navbar">
                <div class="brand-logo">
                    <a href="#" class="navbar-brand">
                        <img src="img/logo.png" alt="" />
                    </a>
                </div>
                <!-- brand-logo -->

                <div class="navbar-header">
                    <div class="inner-nav right-nav">
                        <ul class="rightnav-links">

                            <c:if test="${sessionScope.USER ne null}" var="checkUser">
                                <li>
                                    <a href="#" class="dropdown-toggle" >Welcome, ${sessionScope.USERNAME}</a>
                                </li>
                                <c:url var="logoutLink" value="${pageContext.request.contextPath}/MainController">
                                    <c:param name="action" value="Logout"/>
                                </c:url>
                                <li>
                                    <a href="${logoutLink}">Logout</a>
                                </li>
                            </c:if>
                            <c:if test="${!checkUser}">
                                <li>
                                    <a href="${pageContext.request.contextPath}/registration.jsp">
                                        Registry
                                    </a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/login.jsp">
                                        Login
                                    </a>
                                </li>

                            </c:if>



                        </ul>
                    </div>
                    <!-- /right-nav -->
                </div>
                <!-- navbar-header -->

                <div class="custom-collapse navbar-collapse collapse inner-nav margin-left-100">
                    <ul class="nav navbar-nav nav-links">
                        
                        <li class="dropdown classic-dropdown"><a href="createArticle.jsp" class="dropdown-toggle" >POST<i class="fa fa-angle-down"></i></a>
                            
                        </li>
                        <!-- /dropdown -->
                        <li class="dropdown classic-dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Products <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li class="submenu dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">Product Columns</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="product-2-columns.html">Products 2 Columns</a>
                                        </li>
                                        <li><a href="product-3-columns.html">Products 3 Columns</a>
                                        </li>
                                    </ul>
                                    <!-- /dropdown-menu -->
                                </li>
                                <!-- /submenu -->
                                <li><a href="product-fullwidth.html">Products Fullwidth</a>
                                </li>
                                <li><a href="product-list.html">Products List</a>
                                </li>
                            </ul>
                            <!-- /dropdown-menu -->
                        </li>
                        <!-- /dropdown -->

                        <li class="dropdown classic-dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li class="submenu dropdown">
                                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">Product Details</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="product-detail-01.html">Product Details 01</a>
                                        </li>
                                        <li><a href="product-detail-02.html">Product Details 02</a>
                                        </li>
                                    </ul>
                                    <!-- /dropdown-menu -->
                                </li>
                                <!-- /submenu -->

                                <li><a href="contact.html">contact</a>
                                </li>
                                <li><a href="404.html">404 Error page</a>
                                </li>

                            </ul>
                            <!-- /dropdown-menu -->
                        </li>
                        <!-- /dropdown -->

                        <li class="dropdown classic-dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Blog <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="blog-2-columns.html">Blog 2 columns</a>
                                </li>
                                <li><a href="blog-3-columns.html">Blog 3 columns</a>
                                </li>
                                <li><a href="blog-post.html">Blog post</a>
                                </li>
                            </ul>
                            <!-- /dropdown-menu -->
                        </li>
                        <!-- /dropdown -->

                        <li class="dropdown mega-menu"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Elements <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu width-45 mega-dropdown">
                                <li class="mega-menu-content">
                                    <div class="col-md-4 col-sm-4">
                                        <ul>
                                            <li><a href="elements-accordion.html"><i class="fa fa-list"></i>Accordion</a>
                                            </li>
                                            <li><a href="elements-slider.html"><i class="fa fa-sliders"></i>Slider</a>
                                            </li>
                                            <li><a href="elements-columns.html"><i class="fa fa-columns"></i>Columns</a>
                                            </li>
                                            <li><a href="elements-bloglatest.html"><i class="fa fa-pencil"></i>Blog Latest</a>
                                            </li>
                                            <li><a href="elements-gallery.html"><i class="fa fa-picture-o"></i>Gallery</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <!-- /column -->

                                    <div class="col-md-4 col-sm-4">
                                        <ul>
                                            <li><a href="elements-forms.html"><i class="fa fa-comments"></i>forms</a>
                                            </li>
                                            <li><a href="elements-elegant-icon-list.html"><i class="fa fa-pied-piper"></i>Elegant icons</a>
                                            </li>
                                            <li><a href="elements-fontawesome-icon-list.html"><i class="fa fa-leaf"></i>FontAwesome icons</a>
                                            </li>
                                            <li><a href="elements-alerts.html"><i class="fa fa-book"></i>Alerts</a>
                                            </li>
                                            <li><a href="elements-footer.html"><i class="fa fa-italic"></i>footer</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <!-- /column -->

                                    <div class="col-md-4 col-sm-4">
                                        <ul>
                                            <li><a href="elements-infography.html"><i class="fa fa-bars"></i>Infography</a>
                                            </li>
                                            <li><a href="elements-buttons.html"><i class="fa fa-plus-circle"></i>Button</a>
                                            </li>
                                            <li><a href="elements-tab.html"><i class="fa fa-table"></i>Tabs</a>
                                            </li>
                                            <li><a href="elements-testimonials.html"><i class="fa fa-tasks"></i>Testimonials</a>
                                            </li>
                                            <li><a href="elements-typography.html"><i class="fa fa-paint-brush"></i>typography</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <!-- /column -->
                                </li>
                                <!-- /mega-menu-content -->
                            </ul>
                            <!-- /dropdown-menu -->
                        </li>
                        <!-- /dropdown -->
                    </ul>
                    <!-- /nav -->
                </div>
                <!-- /collapse -->
            </div>
            <!-- /navbar -->


        </div>
        <!-- /container -->
    </nav>
    <!-- /nav -->
</header>
<!--end header-->
