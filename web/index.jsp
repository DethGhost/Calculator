<%@ page import="org.ua.deth.calculator.Calculation" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web-Calculator</title>
</head>
<body>
<%
    if (request.getParameter("first") != null && request.getParameter("second") != null
            && request.getParameter("operator") != null) {
%>

<%="You try: "%>
<%= "First: " + request.getParameter("first") + " Operator: " + request.getParameter("operator")
        + " Second: " + request.getParameter("second")%>
<br/>
<%= "Answer: "%>
<%=
new Calculation().goCalculate(request.getParameter("first"), request.getParameter("second"), request.getParameter("operator"))
%><%
} else {
%><h1>Check the entry parameters</h1>
<%
    }%>
</body>
</html>
