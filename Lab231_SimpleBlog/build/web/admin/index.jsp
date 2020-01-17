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
        <link rel="icon" href="${pageContext.request.contextPath}/img/favicon.png" type="image/png" />

        <!-- CSS -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/media.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.theme.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.transitions.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.bxslider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/elegant-icons.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/magnific-popup.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider-set.css">
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/header.jsp"/>
        <div id="back-top">
            <a href="#" class="scroll">
                <i class="arrow_carrot-up"></i>
            </a>
        </div>
        <div class="container text-center padding-vertical-50">
            <h2 class="double-line"><span>Blog process</span></h2>
            <div class="container padding-bottom-100">
                <div class="row">
                    <div class="col-md-12">
                        <div class="tabs">
                            <ul class="tab-links text-center" id="tab-header">
                                <li class="active" id="contents">
                                    <a href="#tab1">
                                        <span>By Content</span>
                                    </a>
                                </li>
                                <li class="" id="article-name">
                                    <a href="#tab2">
                                        <span>By Article Name</span>
                                    </a>
                                </li>

                            </ul>
                            <!-- /tab-links -->

                            <div class="tab-content">
                                <div id="tab1" class="tab active">
                                    <div class="tab-description">
                                        <div class="row justify-content-md-center padding-top-25">
                                            <div class="sidebar-search padding-bottom-10">
                                                <div class="row justify-content-md-center">
                                                    <div class="col-md-6 form-group">
                                                        <input type="text" name="txtContentSearch" class="form-control" placeholder="Search by content...">
                                                    </div>
                                                    <div class="col-md-4 form-group">
                                                        <select name="p_show" id="p_show" class="form-control">

                                                        </select>
                                                    </div>
                                                    <div class="col-md-4 form-group">
                                                        <input type="button" class=" btn btn-block" name="search_by_ctn" value="Search"/>
                                                    </div>
                                                </div>
                                                <!-- /product-search -->
                                            </div>
                                        </div>
                                        <!--filter-->

                                        <div class="row justify-content-md-center">
                                            <div class="product-filter">
                                                <div class="container">
                                                    <div class="col-md-12">
                                                        <div class="filter-content padding-horizontal-25">
                                                            <span>Showing 1-20 of XX results</span>
                                                            <ol>
                                                                <li>
                                                                    <div class="form-group">
                                                                        <select id="order-by-date" class="form-control">
                                                                            <option value=""  selected="true">Ascending</option>
                                                                            <option value="" >Descending</option>
                                                                        </select>
                                                                        <!-- /form-control -->
                                                                    </div>
                                                                    <!-- /form-group -->
                                                                </li>
                                                            </ol>
                                                        </div>
                                                        <!-- /filter-content -->
                                                    </div>


                                                    <!-- /column -->
                                                </div>
                                                <!-- /container -->
                                            </div>
                                        </div>
                                        <div class="row justify-content-md-center">
                                            <input type="button" name="btn_actived" value="Active Selected" class="btn btn-dark padding-vertical-10 margin-right-20"/>
                                            <input type="button" name="btn_deleted" value="Delete Selected" class="btn btn-danger padding-vertical-10"/>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="blog-list">
                                                    <div class="container padding-vertical-10 col-md-12 col-lg-12">
                                                        <table border="1" class="table tab-content">
                                                            <thead>
                                                                <tr class="row">
                                                                    <th class="col-md-8 col-sm-8 padding-bottom-30" ><h2>Article</h2></th>
                                                            <th class="col-md-2 col-sm-2 padding-bottom-30"><h2>Status</h2></th>
                                                            <th class="col-md-2 col-sm-2 padding-bottom-30"><h2>Selected</h2></th>
                                                            </tr>
                                                            </thead>
                                                            <tbody id="content-here">
                                                                <!--                                                                <tr class="row">
                                                                                                                                    <td class="col-md-8 col-sm-8 padding-bottom-30">
                                                                                                                                        <div class=" blog-short-description ">
                                                                                                                                             /post-title 
                                                                
                                                                                                                                            <div class="post-title padding-vertical-10" style="font-weight: bold;">
                                                                                                                                                <h3><a href="#" >asd title here</a>
                                                                                                                                                </h3>
                                                                                                                                            </div>
                                                                                                                                            <div class="post-info padding-top-5">
                                                                                                                                                <p><span>Author </span>: <a href="#" >asdasd author here</a>
                                                                                                                                                </p>
                                                                                                                                            </div>
                                                                                                                                             /post-info 
                                                                                                                                            <div class="post-paragraph padding-top-25 padding-bottom-40">
                                                                                                                                                <textarea class="form-control" rows="4" id="short-description" style="border: none;overflow: hidden;"> short description here</textarea>
                                                                                                                                            </div>
                                                                
                                                                                                                                             /post-paragraph 
                                                                                                                                        </div>
                                                                
                                                                                                                                         /blog-short-description 
                                                                                                                                    </td>
                                                                                                                                    <td class="col-md-2 col-sm-2 padding-bottom-30">
                                                                                                                                        <div >
                                                                                                                                            <h3 class="label label-info"> new status here</h3>
                                                                                                                                        </div>
                                                                                                                                    </td>
                                                                                                                                    <td class="col-md-2 col-sm-2 padding-bottom-30">
                                                                                                                                        <div >
                                                                                                                                            <input type="checkbox" class="checkbox" />
                                                                                                                                        </div>
                                                                                                                                    </td>
                                                                                                                                </tr>-->



                                                            </tbody>
                                                        </table>


                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                        <!--product list-->


                                        <div class="row justify-content-md-center">
                                            <div class="pagination padding-top-50">
                                                <ul id="pageIndex">
                                                   
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /tab-description -->
                                </div>
                                <!-- /tab -->

                                <div id="tab2" class="tab">
                                    <div class="tab-description">
                                    </div>
                                    <!-- /tab-description -->
                                </div>
                                <!-- /tab -->


                                <!-- /tab -->
                            </div>
                            <!-- /tab-content -->
                        </div>
                        <!-- /tabs -->
                    </div>
                    <!-- /column -->
                </div>
                <!-- /row -->
            </div>
            <!--search-->
        </div>
        <script src="${pageContext.request.contextPath}/js/lib/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/lib/jquery.waypoints.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/lib/moderniz.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/owl.carousel.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/jquery.bxslider.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/jquery.magnific-popup.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/jquery.flexslider-min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vendors/smoothscroll.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery_01.js" type="text/javascript"></script>
        <script type="text/javascript">
            var tbody_html = '<tr class="row">' +
                    '<td class="col-md-8 col-sm-8 padding-bottom-30">' +
                    '<div class=" blog-short-description ">' +
                    '<div class="post-title padding-vertical-10" style="font-weight: bold;">' +
                    '<h3><a href="#" >asd title here</a> </h3>' +
                    '</div>' +
                    '<div class="post-info padding-top-5">' +
                    '<p><span>Author </span>: <a href="#" >asdasd author here</a></p>' +
                    '</div>' +
                    '<div class="post-paragraph padding-top-25 padding-bottom-40">' +
                    '<textarea class="form-control" rows="4" id="short-description" style="border: none;overflow: hidden;"> short description here</textarea>' +
                    '</div>' +
                    '</div>' +
                    '</td>' +
                    '<td class="col-md-2 col-sm-2 padding-bottom-30">' +
                    '<div ><h3 class="label label-info"> new status here</h3></div>' +
                    '</td>' +
                    '<td class="col-md-2 col-sm-2 padding-bottom-30"><div ><input type="checkbox" class="checkbox" /></div> </td>' +
                    '</tr>';
            var inputId = [];
            var listStatus = [];
            var size;
            $(document).ready(function () {
                getInfor();
                getArticleList(2);

            });

            $('input[name=btn_actived]').click(function () {
                $.ajax({
                    type: 'GET',
                    data: {select: inputId, action: "ActiveArticlesAdmin"},
                    headers: {
                        Accept: "application/json; charset=utf-8",
                        "Content-Type": "application/json; charset=utf-8"
                    },
                    success: function (data, textStatus, jqXHR) {

                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        alert("Some thing wrong, try again");
                    }
                });

            });
            function getSelected() {
                $('input[name=check_id]:checked').each(function () {
                    console.log($(this).attr('value'));
                    inputId.push($(this).attr('value'));
                });
            }
            function getInfor() {
                document.getElementById("p_show").innerHTML = '<option selected="true"> All </option>';
                $.ajax({
                    type: 'GET',
                    url: "${pageContext.request.contextPath}/MainController?action=GetInforBlog",
                    headers: {
                        Accept: "application/json; charset=utf-8",
                        "Content-Type": "application/json; charset=utf-8"
                    },
                    success: function (data, textStatus, jqXHR) {
                        var obj = JSON.parse(data);
                        listStatus = obj.listStatus;
                        $.each(listStatus, function (i, item) {
                            document.getElementById("p_show").innerHTML += '<option> ' + item + '</option>';
                        });
                        size = obj.size;
                        setPageIndex(size);

                    }
                });
            }
            function getArticleList(pageI) {
                $.ajax({
                    type: 'GET',
                    url: "${pageContext.request.contextPath}/MainController",
                    data: {action: "GetArticleAdmin", pageIndex: pageI},
                    headers: {
                        Accept: "application/json; charset=utf-8",
                        "Content-Type": "application/json; charset=utf-8"
                    },
                    success: function (data, textStatus, jqXHR) {
                        document.getElementById("content-here").innerHTML = "";
                        var list = JSON.parse(JSON.stringify(data));
                        var listObj = JSON.parse(list);
                        $.each(listObj, function (i, item) {
                            tbody_html = '<tr class="row">' +
                                    '<td class="col-md-8 col-sm-8">' +
                                    '<div class=" blog-short-description ">' +
                                    '<div class="post-title padding-vertical-10" style="font-weight: bold;">' +
                                    '<h3><a href="#" >' + item.title + '</a> </h3>' +
                                    '</div>' +
                                    '<div class="post-info padding-top-5">' +
                                    '<p><span>Author </span>: <a href="#" >' + item.author + '</a></p>' +
                                    '</div>' +
                                    '<div class="post-paragraph padding-top-25 padding-bottom-40">' +
                                    '<textarea class="form-control" rows="4" id="short-description" style="border: none;overflow: hidden;" disabled="disabled"> ' + item.shortDescription + '</textarea>' +
                                    '</div>' +
                                    '</div>' +
                                    '</td>' +
                                    '<td class="col-md-2 col-sm-2">' +
                                    '<div ><h3 class="label label-info"> ' + item.status + '</h3></div>' +
                                    '</td>' +
                                    '<td class="col-md-2 col-sm-2"><div ><input type="checkbox" name="check_id" value="' + item.id + '" class="checkbox" /></div> </td>' +
                                    '</tr>';
                            document.getElementById("content-here").innerHTML += tbody_html;
                        });

                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        alert("Some thing wrong, try again");

                    }
                });
            }
            function setPageIndex(pageIndex) {
                    
            }
        </script>
    </body>
</html>
