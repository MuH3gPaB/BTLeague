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

    <div class="jumbotron">
        <h1>Hello, world!</h1>
        <p>...</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
    </div>

</body>
</html>
