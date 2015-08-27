$(document).ready(function() {
        					var request = $.ajax({
        						url: "/webservices/admin/users",
        						type: "GET",
        						dataType: "json"
        					});

        					request.done(function(msg) {
        						$("#mybox").html(msg);
        					});

        					request.fail(function(jqXHR, textStatus) {
        						alert( "Request failed: " + textStatus );
        					});
});