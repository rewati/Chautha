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
    <link id="bs-css" href="adminResources/css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="adminResources/css/charisma-app.css" rel="stylesheet">
    <link href='adminResources/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='adminResources/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='adminResources/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='adminResources/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='adminResources/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='adminResources/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='adminResources/css/jquery.noty.css' rel='stylesheet'>
    <link href='adminResources/css/noty_theme_default.css' rel='stylesheet'>
    <link href='adminResources/css/elfinder.min.css' rel='stylesheet'>
    <link href='adminResources/css/elfinder.theme.css' rel='stylesheet'>
    <link href='adminResources/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='adminResources/css/uploadify.css' rel='stylesheet'>
    <link href='adminResources/css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="adminResources/bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]-->
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <!--[endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="adminResources/img/logotab.jpg">

    <script src="adminResources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- library for cookie management -->
    <script src="adminResources/js/jquery.cookie.js"></script>
    <!-- calender plugin -->
    <script src='adminResources/bower_components/moment/min/moment.min.js'></script>
    <script src='adminResources/bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
    <!-- data table plugin -->
    <script src='adminResources/js/jquery.dataTables.min.js'></script>

    <!-- select or dropdown enhancer -->
    <script src="adminResources/bower_components/chosen/chosen.jquery.min.js"></script>
    <!-- plugin for gallery image view -->
    <script src="adminResources/bower_components/colorbox/jquery.colorbox-min.js"></script>
    <!-- notification plugin -->
    <script src="adminResources/js/jquery.noty.js"></script>
    <!-- library for making tables responsive -->
    <script src="adminResources/bower_components/responsive-tables/responsive-tables.js"></script>
    <!-- tour plugin -->
    <script src="adminResources/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
    <!-- star rating plugin -->
    <script src="adminResources/js/jquery.raty.min.js"></script>
    <!-- for iOS style toggle switch -->
    <script src="adminResources/js/jquery.iphone.toggle.js"></script>
    <!-- autogrowing textarea plugin -->
    <script src="adminResources/js/jquery.autogrow-textarea.js"></script>
    <!-- multiple file upload plugin -->
    <script src="adminResources/js/jquery.uploadify-3.1.min.js"></script>
    <!-- history.js for cross-browser state change on ajax -->
    <script src="adminResources/js/jquery.history.js"></script>

    <script src="adminResources/js/charisma.js"></script>
    <script src="adminResources/js/admin.js"></script>



</head>
<body>
<tiles:insertAttribute name="header" />
<div class="ch-container">

    <div class="row">
    <tiles:insertAttribute name="menu" />
    <tiles:insertAttribute name="content" />
    </div>
    <tiles:insertAttribute name="footer" />
</div>



</body>
</html>