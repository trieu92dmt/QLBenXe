<%--
    Document   : header
    Created on : Aug 3, 2022, 6:28:35 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-sm navbar-blue bg-white">
    <div class="container">
        <a style="font-weight: bold;" class="navbar-brand" href="<c:url value="/"/>">
            Bus Station
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/"/>">Trang Chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/package"/>">Đăng Kí Nhà Xe</a>
                </li>
            </ul>
            <div class="navbar-right d-flex align-items-center">
                <div class="search nav-icon me-4">
                    <i class="fa-solid fa-magnifying-glass" data-bs-toggle="modal" data-bs-target="#myModal"></i>
                </div>
                <!-- The Modal -->
                <div class="modal fade" id="myModal">
                    <div class="modal-dialog">
                        <div class="modal-content">

                            <!-- Modal Header -->
                            <div class="modal-header">
                                <h4 class="modal-title">Tìm kiếm</h4>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                            </div>

                            <!-- Modal body -->
                            <div class="modal-body px-4">
                                <div class="search-engine">
                                    <form>
                                        <label>Chọn điểm đến: </label>
                                        <div class="form-floating mb-3 mt-3">
                                            <input type="text" class="form-control" id="destination" placeholder="Điểm đến" name="destination">
                                            <label for="destination">Điểm đến</label>
                                        </div>
                                        <label>Chọn ngày đi: </label>
                                        <div class="form-floating mt-3 mb-3">
                                            <input type="datetime" class="form-control" id="departure-date" placeholder="Ngày đi" name="departure-date">
                                            <label for="departure-date">Ngày đi</label>
                                        </div> 
                                        <label>Chọn nhà xe: </label>
                                        <div class="form-floating mt-3 mb-3">
                                            <input type="text" class="form-control" id="car-company" placeholder="Nhà xe" name="car-company">
                                            <label for="car-company">Nhà xe</label>
                                        </div> 
                                        <input class="btn btn-primary d-block ms-auto p-2" type="submit" value="Tìm kiếm"/>
                                    </form>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="nav-icon me-4">
                    <i id="notification" class="fa-solid fa-bell notification"></i>
                    <div id="notification-list" class="notification-list">
                        <div class="notification-empty">
                            <span class="notification-header">Thông báo</span>
                            <div class="notification-content d-flex flex-column align-items-center p-3">
                                <img src="<c:url value="/images/box.png"/>" alt="alt"/>
                                <span>Đăng nhập để nhận thông báo</span>
                                <a href="#">Đăng nhập</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="navbar-brand m-0">
                    <img src="<c:url value="/images/hutao5.jpg"/>" alt="Avatar Logo" style="width:40px;" class="rounded-pill">
                    <ul class="nav-brand-menu">
                        <c:if test="${currentUser.role.equals('ROLE_COMPANY')}">
                        <li class="p-1">
                                <a class="d-flex" href="<c:url value="/companyMn/company-info"/>">
                                    <i class="fa-solid fa-briefcase"></i>
                                    <span>Quản lý nhà xe</span>
                                </a>
                            </li>
                        </c:if>
                        <c:if test="${currentUser == null}">
                            <li class="p-1">
                                <a class="d-flex" href="<c:url value="/login"/>">
                                    <i class="fa-solid fa-right-to-bracket"></i>
                                    <span>Đăng nhập</span>
                                </a>
                            </li>
                        </c:if>
                        <c:if test="${currentUser != null}">
                            <li class="p-1">
                                <a class="d-flex" href="<c:url value="/user-logout"/>">
                                    <i class="fa-solid fa-right-to-bracket"></i>
                                    <span>Đăng xuất</span>
                                </a>
                            </li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</nav>
