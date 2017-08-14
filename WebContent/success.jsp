<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 这个页面展示user的基本信息并且跳转到infobypage -->
<h2>欢迎${user.userName}登录</h2>

  <c:forEach items="${role}" var="fun">
		<a href="${role.functionServlet}">${role.functionName}</a>
	</c:forEach>

	
</body>
</html>