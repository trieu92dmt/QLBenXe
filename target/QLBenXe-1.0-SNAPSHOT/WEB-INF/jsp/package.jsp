<%-- 
    Document   : package
    Created on : Aug 15, 2022, 9:56:58 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container mt-3">
    <ul class="d-flex justify-content-lg-between p-0">
        <c:forEach items="${packages}" var="p">
            <div class="card" style="width:400px">
                <img class="card-img-top" src="<c:url value="/images/hutao5.jpg"/>" alt="Card image">
                <div class="card-body">
                    <h4 class="card-title">${p.packageName}</h4>
                    <fmt:setLocale value = "vn_VN"/>
                    <p class="card-text">Price: <fmt:formatNumber type="number" pattern="000,000" value="${p.price}"/> VNĐ</p>
                    <a href="#" class="btn btn-primary">Đăng ký</a>
                </div>
            </div>
        </c:forEach>
    </ul>
</div>
