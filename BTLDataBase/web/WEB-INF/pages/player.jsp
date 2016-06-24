
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.lang.reflect.Method" %>
<%@ page import="java.util.*" %>

<%
    HashMap<String, String> fields = (HashMap) request.getSession().getAttribute("playerFields");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Player <%=fields.get("Имя")%></title>
</head>

<body style="width: 80%; margin-left: 10%; height: 95%">
<%@include file="header.jsp"%>
<div id = "left_side">
    Im left side
</div>

<div id = "main_form">
    <ul class="list-group">

        <%
            for (Map.Entry entry : fields.entrySet()) {%>
        <li class="list-group-item list-group-item-success"><%=entry.getKey()%> <%=entry.getValue()%></li>
        <%}
        %>
    </ul>
</div>

<div id = "right_side">
    <div style="width: 100%" class="btn-group-vertical" role="group" aria-label="...">
            <form style="width: inherit">
                <button style="width: inherit"
                        type="submit" value="edit"
                        class="btn btn-default" formaction="/editplayer"/>Редактировать</button>
                <button style="width: inherit"
                        type="submit" value="delete"
                        class="btn btn-default" formaction="/deleteplayer"/>Удалить</button>
                <button style="width: inherit"
                        type="button" value="back"
                        class="btn btn-default" onclick='window.location = "/players"'>Назад</button>
            </form>
    </div>
</div>

<div id = "bottom">
    Im bottom
</div>

</body>

</html>
