<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>

<c:url var="url" value="/template/admin"></c:url>

<html>
<head>
    <title><dec:title default="Home Page"/></title>
    <%-- css --%>
    <link rel="stylesheet" href="${url}/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${url}/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="${url}/css/ace.min.css" class="ace-main-stylesheet"
          id="main-ace-style"/>
    <script src="${url}/js/ace-extra.min.js"></script>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <%--
        <script type='text/javascript' src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
    --%>
    <script src="${url}/js/jquery.2.1.1.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body class="no-skin">
<%@ include file="/common/admin/header.jsp" %>
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try {
            ace.settings.check('main-container', 'fixed')
        } catch (e) {
        }
    </script>
    <%@ include file="/common/admin/sidebar.jsp" %>
    <dec:body></dec:body>
    <%@ include file="/common/admin/footer.jsp" %>
    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
</div><!-- /.main-container -->

<script src="${url}/js/bootstrap.min.js"></script>
<script src="${url}/js/jquery-ui.custom.min.js"></script>
<script src="${url}/js/jquery.ui.touch-punch.min.js"></script>
<script src="${url}/js/jquery.easypiechart.min.js"></script>
<script src="${url}/js/jquery.sparkline.min.js"></script>
<script src="${url}/js/jquery.flot.min.js"></script>
<script src="${url}/js/jquery.flot.pie.min.js"></script>
<script src="${url}/js/jquery.flot.resize.min.js"></script>
<script src="${url}/js/ace-elements.min.js"></script>
<script src="${url}/js/ace.min.js"></script>
<script src="${url}/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->
<script src="${url}/js/jquery-ui.min.js"></script>
</body>
</html>
