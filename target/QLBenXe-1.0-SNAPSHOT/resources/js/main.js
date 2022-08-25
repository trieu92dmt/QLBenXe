$("i.notification").click(function () {
    $(".notification-list").toggleClass("notification-list--active");
    $(this).toggleClass("notification--active");
})
$(".btn-register-company").click(function () {
    $("#package-id").val($(this).next(".package-id").val());
    $("#package-name").text($(this).nextAll(".package-name").val());
    $("#package-expire").text($(this).nextAll(".package-expire").val() + " ngày");
    $("#package-price").text(new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format($(this).nextAll(".package-price").val()));
    $(".company-register").fadeIn();
    $('html, body').animate({
        scrollTop: $(".company-register").offset().top
    });
})
window.addEventListener('click', function (e) {
    if (!document.getElementById('notification-list').contains(e.target)
            && !document.getElementById('notification').contains(e.target)) {
        $("#notification-list").removeClass("notification-list--active");
        $("#notification").removeClass("notification--active");
    }
});

//$("#route-filter").click(function () {
//    var url = new URL('http://localhost:8080/QLBenXe/api/trips');
//    var params = {
//        routeId: $("#route-data").val(),
//        date: $("#trip-date").val()
//    }
//    url.search = new URLSearchParams(params).toString();
//    fetch(url).then(function (res) {
//        console.info(res)
//        return res.json();
//    }).then(function (data) {
//        console.info(data)
//        var html = "";
//        for (var i = 0; i < data.length; i++) {
//            html += `<tr>
//                        <td>${data[i].departureTime}</td>
//                        <td>${data[i].time}</td>
//                        <td>${data[i].ticketPrice}</td>
//                        <td class="d-flex align-items-center justify-content-center">
//                            <i class="fa-solid fa-pen px-2"></i>
//                            <i class="fa-solid fa-trash px-2"></i>
//                            <div class="qlbx-btn">
//                                <button id="ticket-book-btn" type="button" data-bs-toggle="modal" data-bs-target="#updateTicket">
//                                    <input class="trip-id" type="hidden" value="${data[i].tripId}"/>
//                                        Đặt vé
//                                </button>
//                            </div>
//                        </td>
//                    </tr>`
//        }
//        $("#trips").html(html);
//    })
//});
$(".btn-seat").click(function () {
    $(this).toggleClass("btn-primary")
    $(this).toggleClass("btn-success")
})

function addToCompanyCart(tripId, seatNumber, price) {
    fetch("/QLBenXe/cart-api/company-cart", {
        method: 'post',
        body: JSON.stringify({
            "tripId": tripId,
            "seatNumber": seatNumber,
            "price": price
        }),
        headers: {
            "Content-Type": "application/json"
        }
    }).then(function (res) {
        return res.json()
    }).then(function (data) {
        console.log(data)
    })
}

$(".ticket-book-btn").click(function () {
    $($(this).children(".trip-id").val()).fadeToggle('fast');
})


function updateTicket() {
    if (confirm("Cập nhật vé ?") == true) {
        fetch("/QLBenXe/cart-api/update-ticket", {
            method: 'post'
        }).then(function (res) {
            return res.json();
        }).then(function (code) {
            console.log(code);
            location.reload();
        })
    }
}

function getTicketBooked(tripId) {
    var url = new URL('http://localhost:8080/QLBenXe/ticket-api/tickets');
    var params = {
        tripId: tripId
    }
    url.search = new URLSearchParams(params).toString();
    fetch(url).then(function (res) {
        return res.json();
    }).then(function (data) {
        console.log(data);
        var btnSeat = document.querySelectorAll(".btn-seat");
        for (var i = 0; i < btnSeat.length; i++) {
            for (var j = 0; j < data.length; j++) {
                if (btnSeat[i].value === data[j].seatNumber) {
                    btnSeat[i].classList.add("btn-danger");
                    btnSeat[i].disabled = true;
                }
            }
        }
    })
}

function deleteRouteById(routeId) {
    if (confirm("Xóa tuyến xe ?") == true) {
        fetch(`/QLBenXe/route-api/delete-route-by-id/${routeId}`, {
            method: "delete"
        }).then(function (res) {
            return res.json();
        }).then(function (code) {
            console.log(code);
            location.reload();
        })
    }
}

