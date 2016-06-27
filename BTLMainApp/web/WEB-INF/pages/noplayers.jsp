
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.getSession().removeAttribute("id");
    request.getSession().removeAttribute("playerFields");
%>

<html>
<head>
    <title>Players list</title>
</head>

<body style="width: 80%; margin-left: 10%; height: 95%">
<%@include file="header.jsp"%>

<div id = "left_side">
    <div style="width: 100%" class="btn-group-vertical" role="group" aria-label="...">
        <form style="width: inherit">
            <button style="width: inherit"
                    type="button" value="back"
                    class="btn btn-default" onclick='window.location = "/"'>Главная</button>
        </form>
    </div>
</div>

<div id = "main_form">
    <h1>Hmmm... no players.</h1>
</div>

<div id = "right_side">
    <div style="width: 100%" class="btn-group-vertical" role="group" aria-label="...">
        <form style="width: inherit">
            <button style="width: inherit"
                    type="submit" value="edit"
                    class="btn btn-default" formaction="/createplayer"/>Добавить</button>
        </form>
    </div>
</div>

<div id = "bottom">
    Im bottom
</div>

</body>

</html>
