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
            <% request.setAttribute("mess", "Sign in to admin account");%>
            <% request.setAttribute("href", "login.jsp");%>
            <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
        </c:if>
        <c:if test="${sessionScope.user != null}">
            <c:if test="${requestScope.order == null}">
                <% request.setAttribute("error", "Not found infomation <br> about the order!");%>
                <% request.setAttribute("mess", "Go to home");%>
                <% request.setAttribute("href", "home.jsp");%>
                <% request.getRequestDispatcher("error.jsp").forward(request, response);%>
            </c:if>     
        </c:if>
        <div id="wrapper" class="hasbg transparent">
            <%@include file="nav.jsp" %>
            <c:if test="${requestScope.order != null}">
                <% Order or = (Order) request.getAttribute("order");%>
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
                            <br class="clear" />
                            <div>
                                <c:set var="description" value="${fn:split(requestScope.order.car.description, '/')}" />
                                <h4>Overview</h4>
                                <p>${description[0]}</p>
                                <h4>Engine, Transmission, and Performance</h4>
                                <p>${description[1]}</p>
                            </div>
                        </div>
                        <div class="sidebar_wrapper">
                            <div class="single_car_booking_wrapper">
                                <form name="f" method="post" class="wpcf7-form">
                                    <p> 
                                        <label> Full Name <br/>
                                            <input type="text" id="rFullname" name="rFullname"
                                                   placeholder="Charles Calhoun"
                                                   value="${requestScope.order.renterFullname}" 
                                                   size="40" class="wpcf7-text" required/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Email Address <br/>
                                            <input type="email" required class="wpcf7-text"
                                                   name="rEmail" value="${requestScope.order.renterEmail}" 
                                                   size="40" placeholder="sample@yourcompany.com" 
                                                   id="rEmail"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Address <br />
                                            <input type="text" required class="wpcf7-text" size="40" 
                                                   name="rAddress" value="${requestScope.order.renterAddress}" 
                                                   placeholder="34 Mainfield Road" id="rAddress"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> City
                                            <br />
                                            <input type="text" required class="wpcf7-text"
                                                   name="rCity" value="${requestScope.order.renterCity}" 
                                                   size="40" placeholder="Washington" id="rCity"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Phone Number <br />
                                            <input type="number" name="rPhone" required
                                                   value="${requestScope.order.renterPhone}" size="40" 
                                                   class="wpcf7-text" placeholder="0123456789" 
                                                   style="border-color: #dce0e0;" id="rPhone" />
                                        </label>
                                    </p>
                                    <p>
                                        <label> Pick Up Address<br />
                                            <input type="text" required class="wpcf7-text"
                                                   name="pickupAddress" size="40"
                                                   placeholder="Heatrow Airport" 
                                                   id="pickupAddress" value="${requestScope.order.pickupAddress}"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Pickup Date<br />
                                            <input type="date" id="fromDate" required
                                                   name="pickupDate"  value="${requestScope.order.pickupDate}"
                                                   class="wpcf7-date" onchange="getTotal(${requestScope.order.car.price})"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Drop Off Address<br />
                                            <input type="text" required size="40"
                                                   name="dropoffAddress" class=" wpcf7-text"
                                                   placeholder="Heatrow Airport" 
                                                   id="dropoffAddress" value="${requestScope.order.dropoffAddress}"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Drop Off Date<br />
                                            <input type="date" id ="toDate" value="${requestScope.order.dropoffDate}"
                                                   name="dropoffDate" required
                                                   class=" wpcf7-date" onchange="getTotal(${requestScope.order.car.price})"/>
                                        </label>
                                    </p>
                                    <p>
                                        <label> Total<br />
                                            <input id ="total" name="total" type="text" required value="${requestScope.order.amount}"/>
                                        </label>
                                    </p> 
                                    <p>
                                        <label>Status<br/>
                                            <select name="status">
                                                <option value="Request"  <%= or.getStatus().equalsIgnoreCase("Request") ? "selected" : ""%> >Request</option>
                                                <option value="Accept" <%= or.getStatus().equalsIgnoreCase("Accept") ? "selected" : ""%>>Accept</option>
                                                <option value="Reject" <%= or.getStatus().equalsIgnoreCase("Reject") ? "selected" : ""%>>Reject</option>
                                                <option value="RejectHidden" <%= or.getStatus().equalsIgnoreCase("RejectHidden") ? "selected" : ""%>>RejectHidden</option>
                                                <option value="DeliverCar" <%= or.getStatus().equalsIgnoreCase("DeliverCar") ? "selected" : ""%>>DeliverCar</option>
                                                <option value="Cancel" <%= or.getStatus().equalsIgnoreCase("Cancel") ? "selected" : ""%>>Cancel</option>
                                                <option value="Inprogress" <%= or.getStatus().equalsIgnoreCase("Inprogress") ? "selected" : ""%>>Inprogress</option>
                                                <option value="Completed" <%= or.getStatus().equalsIgnoreCase("Completed") ? "selected" : ""%>>Completed</option>
                                                <option value="CompletedHidden" <%= or.getStatus().equalsIgnoreCase("CompletedHidden") ? "selected" : ""%>>CompletedHidden</option>
                                            </select>
                                        </label>
                                    </p>
                                    <c:if test="${sessionScope.user != null && sessionScope.user.type == 3}">
                                        <input type="submit" onclick="validForm('save', ${requestScope.order.id})" value="Save"/>
                                    </c:if>
                                    <script>
                                        function validForm(action, id) {
                                            var fromDate = new Date(document.getElementById("fromDate").value);
                                            var toDate = new Date(document.getElementById("toDate").value);
                                            var currentDate = new Date();
                                            if (fromDate === currentDate) {
                                                window.alert('The pick up date must be greater than the current date');
                                            } else if (fromDate > toDate) {
                                                window.alert('The pick up date must be greater than the drop off date');
                                            } else {
                                                console.log(action);
                                                document.f.action = "orderForAdmin?action=" + action + "&orderId=" + id + "";
                                                document.f.submit();
                                            }
                                        }
                                        function getTotal(price) {
                                            var fromDate = new Date(document.getElementById("fromDate").value) !== '' ? new Date(document.getElementById("fromDate").value) : null;
                                            var toDate = document.getElementById("toDate").value !== '' ? new Date(document.getElementById("toDate").value) : null;
                                            if (toDate && fromDate) {
                                                document.getElementById("total").value = (toDate - fromDate) / 86400000 * price;
                                            }
                                        }
                                    </script>
                                </form>
                                <c:if test="${sessionScope.user.type == 3}">
                                    <div class="post_button_wrapper">
                                        <button class="button" style="width: 226.7px;"><a href="orderForAdmin?action=delete&orderId=${requestScope.order.id}" style="color: #fff;">Delete</a></button>
                                    </div>
                                </c:if>
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