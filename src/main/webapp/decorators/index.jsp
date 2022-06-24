<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>

<c:url var="url" value="/template/user"></c:url>

<html>
<head>
    <title><dec:title default="Home Page"/></title>
    <%-- css --%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="${url}/css/index.css" rel="stylesheet">
</head>
<body>
<%-- start header --%>
<%@ include file="/common/user/header.jsp" %>
<%-- end header --%>

<%-- start content--%>
<dec:body></dec:body>
<%-- end content--%>

<%-- start footer --%>
<%@ include file="/common/user/footer.jsp" %>
<%-- end footer --%>

<%-- jquery --%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
        integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<%-- boostrap js --%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
