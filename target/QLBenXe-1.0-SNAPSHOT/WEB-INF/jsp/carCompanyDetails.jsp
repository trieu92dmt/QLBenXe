<%-- 
    Document   : carCompanyDetails
    Created on : Aug 24, 2022, 6:18:59 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container my-3">
    <div class="qlbx-div text-center">
        <label class="fw-bold px-3 py-2 fs-3">Nhà Xe ${carcompany.companyName}</label>
    </div>
    <div class="qlbx-div my-3">
        <div class="company-thumbnail">
            <img class="w-100" src="<c:url value="/images/xekhach.jpg"/>" alt="thumbnail"/>
        </div>
        <div class="com-details">
            <label class="company-address d-block">Địa chỉ nhà xe: ${carcompany.address}</label>
            <label class="company-email d-block">Địa chỉ email: ${carcompany.email}</label>
            <label class="company-phoneNumber d-block">Số điện thoại: ${carcompany.phoneNumber}</label>
        </div>
    </div>
    <div class="qlbx-div">
        <label class="fs-4 text-uppercase text-center d-block">Tra cứu vé</label>
        <div class="ticket-search-form">
            <form class="m-4" action="<c:url value="/carCompanyDetails/${carcompany.id}"/>">
                <label>Chọn điểm đến: </label>
                <div class="form-floating mb-3 mt-3">
                    <select id="route-data" class="form-select w-100" name="routeId">
                        <c:forEach items="${routes}" var="r">
                            <option selected value="${r.routeId}">${r.destination}</option>
                        </c:forEach>
                    </select>
                    <label for="destination">Điểm đến</label>
                </div>
                <label>Chọn ngày đi: </label>
                <div class="form-floating mt-3 mb-3">
                    <input type="date" class="form-control" id="departure-date" placeholder="Ngày đi" name="departure-date">
                    <label for="departure-date">Ngày đi</label>
                </div> 
                <input class="btn btn-primary d-block ms-auto p-2" type="submit" value="Tìm kiếm"/>
            </form>
        </div>
    </div>
    <c:if test="${trips!=null}">
        <div id="search-result">
            <div class="qlbx-div my-3">
                <label class="fs-4 text-uppercase text-center d-block">Kết quả tra cứu</label>
            </div>
            <div class="qlbx-div">

                <div class="result-header d-flex ">
                    <div class="w-25 text-center">
                        <label>Giờ khởi hành</label>
                    </div>
                    <div class="w-25 text-center">
                        <label>Thời gian dự kiến</label>
                    </div>
                    <div class="w-25 text-center">
                        <label>Giá vé</label>
                    </div>
                    <div class="w-25 text-center">
                        <label>Hành động</label>
                    </div>
                </div>
                <c:forEach items="${trips}" var="trip">
                    <div class="result-item d-flex align-items-center my-3">
                        <div class="w-25 text-center">
                            <label>${trip.departureTime}</label>
                        </div>
                        <div class="w-25 text-center">
                            <label>${trip.time}</label>
                        </div>
                        <div class="w-25 text-center">
                            <label>${trip.ticketPrice}</label>
                        </div>
                        <div class="w-25 text-center d-flex align-items-center justify-content-center">
                            <i class="fa-solid fa-pen px-2"></i>
                            <i class="fa-solid fa-trash px-2"></i>
                            <div class="qlbx-btn">
                                <button class="ticket-book-btn" type="button" onclick="getTicketBooked(${trip.tripId})">
                                    <input class="trip-id" type="hidden" value="#ticket-list-${trip.tripId}"/>
                                    Đặt vé
                                </button>
                            </div>
                        </div>
                    </div>
                    <div id="ticket-list-${trip.tripId}" class="ticket-chosen">
                        <div class="ticket-list-container d-flex">
                            <div class="w-75">
                                <div class="ticket-list">
                                    <div class="ticket-list-title">
                                        <label>Danh sách vé</label>
                                    </div>
                                    <div class="seat-diagram d-flex">
                                        <div class="downstairs w-50">
                                            <label>Tầng dưới</label>
                                            <div class="downstairs-seats d-flex">
                                                <div class="A d-flex flex-column">
                                                    <c:forEach begin="1" end="5" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'A${i}D', ${trip.ticketPrice})" value="A${i}D"/>
                                                    </c:forEach>
                                                </div>
                                                <div class="B d-flex flex-column">
                                                    <input style="visibility: hidden;" class="btn btn-primary" type="button"/>
                                                    <c:forEach begin="1" end="4" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'B${i}D', ${trip.ticketPrice})" value="B${i}D"/>
                                                    </c:forEach>
                                                </div>
                                                <div class="C d-flex flex-column">
                                                    <c:forEach begin="1" end="5" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'C${i}D', ${trip.ticketPrice})" value="C${i}D"/>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="upstairs w-50">
                                            <label>Tầng trên</label>
                                            <div class="upstairs-seats d-flex">
                                                <div class="A d-flex flex-column">
                                                    <c:forEach begin="1" end="5" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'A${i}T', ${trip.ticketPrice})" value="A${i}T"/>
                                                    </c:forEach>
                                                </div>
                                                <div class="B d-flex flex-column">
                                                    <input style="visibility: hidden;" class="btn btn-primary" type="button"/>
                                                    <c:forEach begin="1" end="4" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'B${i}T', ${trip.ticketPrice})" value="B${i}T"/>
                                                    </c:forEach>
                                                </div>
                                                <div class="C d-flex flex-column">
                                                    <c:forEach begin="1" end="5" var="i">
                                                        <input class="btn btn-primary btn-seat" type="button" onclick="addToCompanyCart(${trip.tripId}, 'C${i}T', ${trip.ticketPrice})" value="C${i}T"/>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="note d-flex">
                                        <div class="booked">
                                            <span>Ghế đã mua: </span>
                                            <input class="btn btn-danger" type="button" value="A0D" disabled/>
                                        </div>
                                        <div class="empty">
                                            <span>Ghế trống: </span>
                                            <input class="btn btn-primary" type="button" value="A0D"/>
                                        </div>
                                        <div class="checked">
                                            <span>Ghế đang chọn </span>
                                            <input class="btn btn-success" type="button" value="A0D"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="w-25 ticket-info">
                                <div class="route-info">
                                    <label class="starting-place">${trip.routeId.startingPlace}</label>
                                    <i class="fa-solid fa-arrow-right"></i>
                                    <label class="destination">${trip.routeId.destination}</label>
                                </div>
                                <div class="trip-info">
                                    <span class="departure-time d-block">Giờ khởi hành: ${trip.departureTime}</span>
                                    <span class="time d-block">Thời gian dự kiến: ${trip.time}</span>
                                    <span class="price d-block">Giá vé: ${trip.ticketPrice} vnd</span>
                                </div>
                                <div class="qlbx-btn">
                                    <button class="update-ticket-btn" type="button">
                                        Thanh Toán
                                    </button>
                                </div>
                            </div>
                        </div>                                    
                    </div>
                </c:forEach>
            </div> 
        </div>
    </c:if>

</div>
<script>
    $('html, body').animate({
        scrollTop: $("#search-result").offset().top
    });
</script>