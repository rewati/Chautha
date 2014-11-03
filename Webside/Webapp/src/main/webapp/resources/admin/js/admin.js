function pageLayoutList() {
        					var request = $.ajax({
        						url: "/admin/pageLayoutList",
        						type: "GET",
        						dataType: "html"
        					});

        					request.done(function(msg) {
        						$("#mybox").html(msg);
        					});

        					request.fail(function(jqXHR, textStatus) {
        						alert( "Request failed: " + textStatus );
        					});
}