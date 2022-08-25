<%-- 
    Document   : carcompanydetail
    Created on : Aug 23, 2022, 9:16:25 PM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
            
            <div class="card col-md-4" style="padding: 15px">
                <div class="card-body">
                    <img class="img-fluid card-img-top" src="<c:url value="/images/qiqi.jpg"/>" alt="Card image">

                </div>
                <div class="card-footer">
                    <h5 class="card-title">${carcompany.companyName}</h5>
                    <p>${carcompany.address}</p>
                    <p>${carcompany.email}</p>
                    <p>${carcompany.phoneNumber}</p>
                  
                </div>
            </div>
        
 

</div>