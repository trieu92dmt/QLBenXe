<%-- 
    Document   : login
    Created on : Aug 6, 2022, 9:34:06 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid p-0">
    <div class="row">
        <div class="col-6 p-0">
            <img class="w-100" src="<c:url value="/images/rem2.png"/>" alt=""/>
        </div>
        <div class="col-6 p-0 d-flex">
            <div class="login-form w-50 m-auto">
                <form action="">
                    <label class="text-center d-block color-blue fs-4">Đăng nhập</label>
                    <div class="mb-3 mt-3">
                        <label for="username" class="form-label">Tên đăng nhập: </label>
                        <input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" name="username">
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Mật khẩu: </label>
                        <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu" name="pswd">
                    </div>
                    <div class="form-check mb-3">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" name="remember"> Nhớ mật khẩu
                        </label>
                    </div>
                    <button type="submit" class="btn btn-primary d-block mx-auto">Đăng nhập</button>
                </form>
            </div>
        </div>
    </div>

</div>
