<%@ page import="model.Player" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ArrayList<Player> players = (ArrayList<Player>) request.getAttribute("players");
%>

<html>
<head>
    <title>Welcome to BTLeague</title>
</head>

<body style="width: 80%; margin-left: 10%; height: 95%">
    <%@include file="header.jsp"%>

    <div id = "left_side">
        <div style="width: 100%" class="btn-group-vertical" role="group" aria-label="...">
            <form style="width: inherit">
                <button style="width: inherit"
                        type="button" value="back"
                        class="btn btn-default" onclick='window.location = "/players"'>Игроки</button>
            </form>
        </div>
    </div>

    <div id = "main_form">
        I'm main form
    </div>

    <div id = "right_side">
        I'm right side
    </div>

    <div id = "bottom">
        Im bottom
    </div>

</body>
</html>
