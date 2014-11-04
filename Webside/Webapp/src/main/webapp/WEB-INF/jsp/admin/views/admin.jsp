<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>Chautha Admin</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Backend admin for Chautha">
    <meta name="author" content="Rewati Raman">

    <!-- The styles -->
    <link id="bs-css" href="${pageContext.request.contextPath}/adminResources/css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/adminResources/css/charisma-app.css" rel="stylesheet">
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/jquery.noty.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/noty_theme_default.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/elfinder.min.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/elfinder.theme.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/uploadify.css' rel='stylesheet'>
    <link href='${pageContext.request.contextPath}/adminResources/css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/adminResources/bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]-->
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <!--[endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/adminResources/img/logotab.jpg">

    <script src="${pageContext.request.contextPath}/adminResources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- library for cookie management -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.cookie.js"></script>
    <!-- calender plugin -->
    <script src='${pageContext.request.contextPath}/adminResources/bower_components/moment/min/moment.min.js'></script>
    <script src='${pageContext.request.contextPath}/adminResources/bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
    <!-- data table plugin -->
    <script src='${pageContext.request.contextPath}/adminResources/js/jquery.dataTables.min.js'></script>

    <!-- select or dropdown enhancer -->
    <script src="${pageContext.request.contextPath}/adminResources/bower_components/chosen/chosen.jquery.min.js"></script>
    <!-- plugin for gallery image view -->
    <script src="${pageContext.request.contextPath}/adminResources/bower_components/colorbox/jquery.colorbox-min.js"></script>
    <!-- notification plugin -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.noty.js"></script>
    <!-- library for making tables responsive -->
    <script src="${pageContext.request.contextPath}/adminResources/bower_components/responsive-tables/responsive-tables.js"></script>
    <!-- tour plugin -->
    <script src="${pageContext.request.contextPath}/adminResources/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
    <!-- star rating plugin -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.raty.min.js"></script>
    <!-- for iOS style toggle switch -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.iphone.toggle.js"></script>
    <!-- autogrowing textarea plugin -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.autogrow-textarea.js"></script>
    <!-- multiple file upload plugin -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.uploadify-3.1.min.js"></script>
    <!-- history.js for cross-browser state change on ajax -->
    <script src="${pageContext.request.contextPath}/adminResources/js/jquery.history.js"></script>

    <script src="${pageContext.request.contextPath}/adminResources/js/charisma.js"></script>
    <script src="${pageContext.request.contextPath}/adminResources/js/admin.js"></script>



</head>
<body>
<tiles:insertAttribute name="header" />
<div class="ch-container">

    <div class="row">
    <tiles:insertAttribute name="menu" />
    <div id="mybox">
        <tiles:insertAttribute name="content" />
    </div>
    </div>
    <tiles:insertAttribute name="footer" />
</div>



</body>
</html>