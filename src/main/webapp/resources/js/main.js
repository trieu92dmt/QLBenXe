$("i.notification").click(function () {
    $(".notification-list").toggleClass("notification-list--active");
    $(this).toggleClass("notification--active");
})
window.addEventListener('click', function (e) {
    if (!document.getElementById('notification-list').contains(e.target)
            && !document.getElementById('notification').contains(e.target)) {
        $("#notification-list").removeClass("notification-list--active");
        $("#notification").removeClass("notification--active");
    }
});