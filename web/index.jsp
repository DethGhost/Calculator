<%@ page import="org.ua.deth.calculator.Calculation" %>
<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 15.06.2016
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web-Calculator</title>
</head>
<body>
<%
    String first = "";
    String second = "";
    String operation = "";

    if (request.getParameter("first") != null && request.getParameter("second") != null
            && request.getParameter("operator") != null) {
        first = request.getParameter("first");
        second = request.getParameter("second");
        operation = request.getParameter("operator");

%>

<%="You try: "%>
<%= "First: "+first+" Operator: "+operation+" Second: "+second%>
<br/>
<%= "Answer: "%>
<%=
new Calculation().goCalculate(first, second, operation)
%><%
} else {
%><h1>Check the entry parameters</h1>
<%
    }%>
</body>
</html>
