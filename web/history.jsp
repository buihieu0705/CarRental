<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Array"%>
<%@page import="model.Order"%>
<%@page import="model.Order"%>
<%@page import="dal.OrderDAO"%>
<%@page import="model.Account"%>
<%@page import="model.Car"%>
<%@page import="java.util.List"%>
<%@page import="dal.CarDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en-US" data-menu="leftalign">
    <head>
        <meta charset="UTF-8" />
        <meta name="pagesport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <title>Car Rental System</title>
        <link rel="icon" type="image/jpg" href="https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Font_Awesome_5_regular_smile-wink.svg/768px-Font_Awesome_5_regular_smile-wink.svg.png">
        <link rel='stylesheet' href='css/style.css' type='text/css' media='all' />
        <link rel='stylesheet' href='css/leftalignmenu.css' type='text/css' media='all' />
        <link rel='stylesheet' href='css/kirki.css' type='text/css' media='all' />
        <script src="https://kit.fontawesome.com/ec811f6ffe.js" crossorigin="anonymous"></script>
    </head>

    <body>
    <c:if test="${sessionScope.user == null}">
        <% request.setAttribute("error", "UNAUTHORIZED!");%>
        <% request.setAttribute("mess", "Sign in to account");%>
        <% request.setAttribute("href", "login.jsp");%>
        <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
    </c:if>
    <div id="wrapper" class="hasbg transparent">
        <div id="wrapper" class="hasbg transparent">
            <div class="header_style_wrapper" id="menu">
                <div class="above_top_bar" id="top_bar">
                    <div class="page_content_wrapper">
                        <div class="social_wrapper" style="height: 45.29px;" >
                            <ul style="margin: 0;">
                                <li><a target="_blank" href="https://www.facebook.com/"><i class="fab fa-facebook"></i></a></li>
                                <li><a target="_blank" href="http://twitter.com/"><i class="fab fa-twitter"></i></a></li>
                                <li><a target="_blank" href="http://instagram.com/"><i class="fab fa-instagram"></i></a></li>
                            </ul>
                        </div>
                        <div class="top_contact_info">
                            <div><span><i class="fas fa-map-marker-alt"></i></span>FPT University</div>
                            <div><a href="tel:012.345.6789"><span ><i class="fas fa-mobile-alt"></i></span>012.345.6789</a></div>
                            <div><span><i class="far fa-clock"></i></span>Mon-Fri 09.00 - 17.00</div>
                        </div>
                        <br class="clear"/>
                    </div>
                </div>
                <div class="top_bar hasbg" id="menu_bar">
                    <div class="standard_wrapper">
                        <div>
                            <a href="home.jsp">
                                <img class = "logo" src="image/logo.png" alt="Logo">
                            </a>
                            <div id="menu_wrapper">
                                <div class="menu-main-menu-container" >
                                    <ul class="nav" >
                                        <li><a href="home.jsp" style="padding-top: 15px;">Home</a></li>
                                        <li><a href="search?brand=&type=&sort_by=asc" style="padding-top: 15px;">Cars&ensp;</a></li>
                                        <c:if test="${sessionScope.user == null}">
                                            <li><a href="login.jsp" style="padding-top: 15px;">Log in</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.user != null}">
                                            <li><a href="author?action=addCar" style="padding-top: 15px;">Register car</a></li>
                                            <li><a href="author?action=manageCar" style="padding-top: 15px;">Manage car</a></li>
                                            <li><a href="#"style="padding-top: 15px;">Trips&ensp;<i class="fas fa-angle-down"></i></a>
                                                <ul>
                                                    <li><a href="booked.jsp" >Booked</a></li>
                                                    <li><a href="history.jsp" >History</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#" style="padding-top: 15px;"><i class="far fa-user-circle fa-2x"></i></i></a>
                                                <ul>
                                                    <li><a href="profile.jsp" > Profile</a></li>
                                                    <li><a href="logout" >Log out</a></li>
                                                </ul> 
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
            <script>
                var menu = document.getElementById('menu');
                var topbar = document.getElementById('top_bar');
                var menubar = document.getElementById('menu_bar');
                var origOffsetY = menu.offsetHeight;

                function onScroll(e) {
                    if (window.scrollY >= origOffsetY) {
                        topbar.style.display = "none";
                        menubar.style.backgroundColor = "#000";
                    } else {
                        topbar.style.display = "block";
                        menubar.style.backgroundColor = "rgba(0, 0, 0, 5)";
                    }
                }
                document.addEventListener('scroll', onScroll);
            </script>
            <div id="page_content_wrapper" class="hasbg withtopbar blog_wrapper" >
                <br><br><br><br>
                <div id="blog_grid_wrapper" >
                    <c:if test="${sessionScope.user != null}">
                        <%OrderDAO db = new OrderDAO();%>
                        <%Account account = (Account) session.getAttribute("user");%>
                        <c:if test="${sessionScope.user.type==1}">
                            <%request.setAttribute("listOrder", db.getOrderByUsernameForRenter(account.getUsername()));%>
                        </c:if>
                        <c:if test="${sessionScope.user.type==2}">
                            <%request.setAttribute("listOrder", db.getOrderByUsernameForJobber(account.getUsername()));%>
                        </c:if>
                        <c:if test="${sessionScope.user.type==3}">
                            <%request.setAttribute("listOrder", db.getOrder());%>
                        </c:if>
                        <c:set var="i" value="0" />
                        <c:forEach items="${requestScope.listOrder}" var="o">
                            <c:if test="${fn:containsIgnoreCase(o.status, 'rejectHidden')  || fn:containsIgnoreCase(o.status, 'completedHidden')|| fn:containsIgnoreCase(o.status, 'cancel')}">
                                <c:set var="i" value="1"/>
                                <c:set var="href" value="author?action=viewDetail&orderId=${o.id}"/>
                                <c:if test="${sessionScope.user.type == 3}">
                                    <c:set var="href" value="orderForAdmin?action=edit&orderId=${o.id}&page=history"/>
                                </c:if>
                                <div id="post-18" class="post-18 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized tag-accident tag-car-rental tag-tips">
                                    <div class="post_wrapper grid_layout" style="padding: 0;">
                                        <div class="post_img small static" style="float: left; width:300px;height: 247px; margin: 10px 0 0 10px;">
                                            <a href="${href}">
                                                <img src="image/${o.car.image}" style="width:290px !important; height: 242px !important;"/>
                                            </a>
                                        </div>
                                        <a href="${href}">
                                            <div class="post_header_wrapper"  style="float: right; text-align: left; width: 625px;">
                                                <div class="post_header grid" style="margin-bottom: 0">
                                                    <div class="post_detail single_post">
                                                        <span class="post_info_date">
                                                            <h4>${o.pickupDate} ${o.dropoffDate}</h4>
                                                        </span>
                                                    </div>
                                                    <h2 style="margin: 0;">${o.car.brand} ${o.car.model}</h2>
                                                    <c:if test="${fn:containsIgnoreCase(o.status, 'rejectHidden')}">
                                                        <h3 style="color: red">Rejected</h3>
                                                    </c:if>
                                                    <c:if test="${fn:containsIgnoreCase(o.status, 'completedHidden')}">
                                                        <h3 style="color: red">Completed</h3>
                                                    </c:if>
                                                    <c:if test="${fn:containsIgnoreCase(o.status, 'Cancel')}">
                                                        <h3 style="color: red">${o.status}</h3>
                                                    </c:if>
                                                    <c:if test="${sessionScope.user.type == 3}">
                                                        <button class="button" style="width: 270px; margin-bottom: 5px; "><a href="orderForAdmin?action=edit&orderId=${o.id}&page=history" style="color: #fff;">Edit</a></button>
                                                        <button class="button" style="width: 270px; margin-bottom: 5px; "><a href="orderForAdmin?action=delete&orderId=${o.id}&page=history" style="color: #fff;">Delete</a></button>
                                                    </c:if>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </div>

                            </c:if>
                        </c:forEach>
                        <c:if test="${i==0}">
                            <% request.setAttribute("error", "Not found history!");%>
                            <%request.setAttribute("mess", "Go to home");%>
                            <%request.setAttribute("href", "home.jsp");%>
                            <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
                        </c:if>
                    </c:if>
                </div>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>