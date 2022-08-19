$("i.notification").click(function () {
    $(".notification-list").toggleClass("notification-list--active");
    $(this).toggleClass("notification--active");
})
$(".btn-register-company").click(function(){
    $("#package-id").val($(this).next(".package-id").val());
    $("#package-name").text($(this).nextAll(".package-name").val());
    $("#package-expire").text($(this).nextAll(".package-expire").val() + " ngày");
    $("#package-price").text(new Intl.NumberFormat('vi-VN', { style: 'currency', currency: 'VND' }).format($(this).nextAll(".package-price").val()));
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
