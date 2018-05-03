<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 조회</title>
</head>
<body>

	<form:form commandName="cmd">
		<p>
			<label> from : <form:input path="from" />
			</label><form:errors path="from"/> ~ <label> to : <form:input path="to" /><form:errors path="to"/>
			</label> <input type="submit" value="조회">
		</p>
	</form:form>

	<c:if test="${!empty members }">
		<table>
			<tr>
				<th>아이디</th>
				<th>이메일</th>
				<th>이름</th>
				<th>가입일</th>
			</tr>
			<c:forEach var="mem" items="${members }">
				<tr>
					<td>${mem.id }</td>
					<td><a href="<c:url value="/member/detail/${mem.id }"/>">${mem.email }</a></td>
					
					<td>${mem.name }
				</td>
					<td><fmt:formatDate value="${mem.registerDate }"
							pattern="yyyy-MM-dd" /></td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>