<%-- 
    Document   : companyMn
    Created on : Aug 19, 2022, 9:11:49 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container my-3">
    <div class="row">
        <div class="col-3">
            <ul class="nav-links">
                <li>
                    <a class="active" href="">
                        <i class="fa-solid fa-circle-info"></i>
                        <span class="link_name">Thông tin nhà xe</span>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/companyMn/company-route-manager"/>">
                        <i class="fa-solid fa-bars-progress"></i>
                        <span class="link_name">Quản lý tuyến xe</span>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/companyMn/company-trip-manager"/>">
                        <i class="fa-solid fa-bus"></i>
                        <span class="link_name">Quản lý chuyến xe</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-ticket"></i>
                        <span class="link_name">Bán vé</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-business-time"></i>
                        <span class="link_name">Gia hạn gói nhà xe</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-chart-pie"></i>
                        <span class="link_name">Thống kê</span>
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-9">
            <div class="information">
                <div class="qlbx-div">
                    <label class="fw-bold px-3 py-2">Thông tin nhà xe</label>
                </div>
                <div class="basic-info mt-3">
                    <div class="basic-info--wrap">
                        <div class="basic-info-header">
                            <div class="basic-info-header__avatar">
                                <div class="company-avatar">
                                    <img class="mhy-avatar__img" data-src="https://img-os-static.hoyolab.com/communityWeb/upload/e160b5fac097d628f5b2227fd507373b.png" src="https://img-os-static.hoyolab.com/communityWeb/upload/e160b5fac097d628f5b2227fd507373b.png" lazy="loaded"> 
                                </div> <!----> 
                            </div> 
                            <div class="basic-info-header__buttons"><!----> 
                                <div class="qlbx-btn">
                                    <button type="button" class="mhy-button__button">Chỉnh Sửa</button>
                                </div>
                            </div>
                        </div> 
                        <div class="basic-info-center">
                            <div class="company-name">
                                <span>Minh Triều</span>
                            </div>
                            <div class="rate d-flex">
                                <span class="fw-bold pe-2">Đánh giá: </span>
                                <span>5.0 sao</span>
                            </div>
                            <div class="address d-flex">
                                <span class="fw-bold pe-2">Địa chỉ: </span>
                                <span>TP.HCM</span>
                            </div>
                            <div class="email d-flex">
                                <span class="fw-bold pe-2">Email: </span>
                                <span>trieu@gmail.com</span>
                            </div>
                            <div class="phone-number d-flex">
                                <span class="fw-bold pe-2">Số điện thoại: </span>
                                <span>0948513923</span>
                            </div>
                        </div> 
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>