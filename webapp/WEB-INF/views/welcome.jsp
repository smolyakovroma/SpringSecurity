<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Welcome</title>

  <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <c:if test="${pageContext.request.userPrincipal.name!=null}">
    <form id="logoutForm" method="post" action="${contextPath}/logout">
      <input type="hidden" name="${_csrf.parametrName}" value="${_csrf.token}"/>
    </form>
    <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
  </c:if>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="${pageContext}/resources/js/bootstrap.js"></script>

</body>
</html>