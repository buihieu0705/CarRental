<%@page import="dal.AccountDAO"%>
<%@page import="model.Account"%>
<%@page import="model.Order"%>
<%@page import="dal.OrderDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        <%OrderDAO odb = new OrderDAO();%>
        <%AccountDAO adb = new AccountDAO();%>
    </head>

    <body>
    <c:if test="${sessionScope.user == null}">
        <% request.setAttribute("error", "UNAUTHORIZED!");%>
        <% request.setAttribute("mess", "Sign in to renter account");%>
        <% request.setAttribute("href", "login.jsp");%>
        <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
    </c:if>
    <c:if test="${requestScope.order == null}">
        <% request.setAttribute("error", "Not found infomation <br> about the order!");%>
        <% request.setAttribute("mess", "Go to home");%>
        <% request.setAttribute("href", "home.jsp");%>
        <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
    </c:if> 
    <div id="wrapper" class="hasbg transparent">
        <%@include file="nav.jsp" %>
        <c:if test="${requestScope.order != null}">
            <% Order or = (Order) request.getAttribute("order"); %>
            <div id="page_caption" class="hasbg" style="background-image:url(image/${requestScope.order.car.image});">
                <div class="single_car_header_content">
                    <div class="standard_wrapper">
                        <div class="single_car_header_price">
                            <span class="single_car_currency">$</span><span class="single_car_price">${requestScope.order.amount}</span>
                            <span class="single_car_price_per_unit">
                                <span id="single_car_unit">Per Day</span>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div id="page_content_wrapper" class="hasbg withtopbar ">
                <div class="inner">
                    <div class="sidebar_content">
                        <h1>${requestScope.order.car.brand} ${requestScope.order.car.model}</h1>
                        <div class="single_car_attribute_wrapper">
                            <div class="one_fourth">
                                <div class="car_attribute_icon"><i class="fas fa-user"></i></div>
                                <div class="car_attribute_content">&nbsp;${requestScope.order.car.seat}&nbsp;Passengers </div>
                            </div>
                            <div class="one_fourth ">
                                <div class="car_attribute_icon"><i class="fas fa-car-side"></i></div>
                                <div class="car_attribute_content">&nbsp;${requestScope.order.car.door}&nbsp; Doors </div>
                            </div>
                            <div class="one_fourth">
                                <div class="car_attribute_icon"><i class="fab fa-steam"></i></div>
                                <div class="car_attribute_content">&nbsp;${requestScope.order.car.type}</div>
                            </div>
                            <div class="one_fourth last">
                                <div class="car_attribute_icon"><i class="fas fa-cogs"></i></div>
                                <div class="car_attribute_content">&nbsp;${requestScope.order.car.tranmission}</div>
                            </div>
                        </div>
                        <div>
                            <%request.setAttribute("owner", adb.getAcountById(or.getCar().getOwner())); %>
                            <h4>Owner</h4>
                            <label> Full Name <br/>
                                <input type="text" size="40" class="wpcf7-text" readonly
                                       value="${requestScope.owner.fullname}" />
                            </label>
                            <label> Phone <br/>
                                <input type="text" size="40" class="wpcf7-text" readonly
                                       value="${requestScope.owner.phone}" />
                            </label>
                            <label> Email <br/>
                                <input type="text" size="40" class="wpcf7-text" readonly
                                       value="${requestScope.owner.email}" />
                            </label>
                        </div>
                        <br class="clear" />
                        <div>
                            <c:set var="description" value="${fn:split(requestScope.order.car.description, '/')}" />
                            <h4>Overview</h4>
                            <p>${description[0]}</p>
                            <h4>Engine, Transmission, and Performance</h4>
                            <p>${description[1]}</p>
                        </div>
                        <c:if test="${sessionScope.user != null}">
                            <c:if test="${sessionScope.user.type == 2}">
                                <div class="post_button_wrapper">
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'request')}">
                                        <%request.setAttribute("isValidOrder", odb.validOrder(or.getCar().getId(), or.getPickupDate(), or.getDropoffDate()));%>
                                        <c:if test="${requestScope.isValidOrder}">
                                            <button class="button" style="width: 270px;"><a href="author?action=acceptOrder&orderId=${requestScope.order.id}" style="color: #fff;">Accept</a></button>
                                            <button class="button" style="width: 270px;"><a href="author?action=rejectOrder&orderId=${requestScope.order.id}" style="color: #fff;">Reject</a></button>
                                        </c:if>
                                        <c:if test="${!requestScope.isValidOrder}">
                                            <h5  style="color: red; margin:0;">The car has been rented</h5>     
                                            <button class="button" style="width: 270px;"><a href="author?action=rejectOrder&orderId=${requestScope.order.id}" style="color: #fff;">Reject</a></button>
                                        </c:if>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'accept')}">
                                        <button class="button" style="width: 270px;"><a href="author?action=deliverCar&orderId=${requestScope.order.id}" style="color: #fff;">Car has been delivered</a></button>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'completed')}">
                                        <button class="button" style="width: 270px;"><a href="author?action=confirmCompletedHidden&orderId=${requestScope.order.id}" style="color: #fff;">The car has been paid</a></button>
                                    </c:if>
                                    <c:if test="${!fn:containsIgnoreCase(requestScope.order.status, 'completed')&& !fn:containsIgnoreCase(requestScope.order.status, 'accept')&& !fn:containsIgnoreCase(requestScope.order.status, 'request')}">
                                        <h3 style="color: red">${requestScope.order.status}</h3>
                                    </c:if>
                                </div>
                            </c:if>
                            <c:if test="${sessionScope.user.type == 1}">
                                <div class="post_button_wrapper">
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'rejectHidden')}">
                                        <h3 style="color: red">Rejected</h3>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'completedHidden')}">
                                        <h3 style="color: red">Completed</h3>
                                    </c:if>
                                    <c:if test="${!fn:containsIgnoreCase(requestScope.order.status, 'rejectHidden') && !fn:containsIgnoreCase(requestScope.order.status, 'completedHidden')}">
                                        <h3 style="color: red">${requestScope.order.status}</h3>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'request')}">
                                        <button class="button" style="width: 270px; margin-bottom: 10px; "><a href="author?action=cancel&orderId=${requestScope.order.id}" style="color: #fff;">Cancel</a></button>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'reject')}">
                                        <button class="button" style="width: 270px; margin-bottom: 10px; "><a href="author?action=confirmRejectHidden&orderId=${requestScope.order.id}" style="color: #fff;">Confirm rejected</a></button>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'deliverCar')}">
                                        <button class="button" style="width: 270px; margin-bottom: 10px; "><a href="author?action=confirmReceivedCar&orderId=${requestScope.order.id}" style="color: #fff;">Confirm car has been received</a></button>
                                    </c:if>
                                    <c:if test="${fn:containsIgnoreCase(requestScope.order.status, 'inprogress')}">
                                        <button class="button" style="width: 270px; margin-bottom: 10px; "><a href="author?action=completedOrder&orderId=${requestScope.order.id}" style="color: #fff;">Give car back</a></button>
                                    </c:if>
                                </div>
                            </c:if>
                        </c:if>
                    </div>

                    <div class="sidebar_wrapper">
                        <div class="single_car_booking_wrapper">
                            <form name="f" method="post" class="wpcf7-form" >
                                <p> 
                                    <label> Full Name <br/>
                                        <input type="text" size="40" class="wpcf7-text" readonly
                                               value="${requestScope.order.renterFullname}" />
                                    </label>
                                </p>
                                <p>
                                    <label> Email Address <br/>
                                        <input type="text" readonly class="wpcf7-text" size="40"
                                               value="${requestScope.order.renterEmail}" />
                                    </label>
                                </p>
                                <p>
                                    <label> Address <br />
                                        <input type="text" readonly class="wpcf7-text" size="40"
                                               value="${requestScope.order.renterAddress}" />
                                    </label>
                                </p>
                                <p>
                                    <label> City
                                        <br />
                                        <input type="text" readonly class="wpcf7-text" size="40"
                                               value="${requestScope.order.renterCity}" />
                                    </label>
                                </p>
                                <p>
                                    <label> Phone Number <br />
                                        <input type="text" readonly size="40" 
                                               style="border-color: #dce0e0;" class="wpcf7-text"
                                               value="${requestScope.order.renterPhone}" />
                                    </label>
                                </p>
                                <p>
                                    <label> Pick Up Address<br />
                                        <input type="text" readonly class="wpcf7-text" size="40"
                                               value="${requestScope.order.pickupAddress}"/>
                                    </label>
                                </p>
                                <p>
                                    <label> Pickup Date<br />
                                        <input type="text" readonly class="wpcf7-date"
                                               value="${requestScope.order.pickupDate}"/>
                                    </label>
                                </p>
                                <p>
                                    <label> Drop Off Address<br />
                                        <input type="text" size="40" class=" wpcf7-text" readonly
                                               value="${requestScope.order.dropoffAddress}"/>
                                    </label>
                                </p>
                                <p>
                                    <label> Drop Off Date<br />
                                        <input type="text" readonly class="wpcf7-date" 
                                               value="${requestScope.order.dropoffDate}"/> 
                                    </label>
                                </p>
                            </form>
                            <br class="clear" />
                        </div> 
                        <br class="clear" />
                    </div>
                </div>
            </div>
        </c:if>
        <%@include file="footer.jsp" %>
    </div>
</body>
</html>