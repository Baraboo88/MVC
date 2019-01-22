<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 22.01.2019
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>


The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Free passes: ${customer.freePasses}

<br><br>

Postal Code: ${customer.postalCode}
</body>
</html>
