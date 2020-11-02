<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp" />
</head>
<body id="body-login">
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left" >
			<img id="background" src='<c:url value="/resources/image/backgrounddangnhap.png"/>' />
				<div id ="header-top-left" class="header-login">
					<span id="text-logo">Welcome</span><br/>
					<span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng Minishop !</span>
				</div>
				<div id ="header-bottom-left">
					<p><img alt="icon_oval" src='<c:url value="/resources/image/icon_oval.png"/>' /><span>Luôn cập nhật xu hướng thời trang mới nhất</span></p>
					<p><img alt="icon_oval" src='<c:url value="/resources/image/icon_oval.png"/>' /><span>Giảm hơn 50% tất cả các mặt hàng cho khách vip</span></p>
					<p><img alt="icon_oval" src='<c:url value="/resources/image/icon_oval.png"/>' /><span>Tận tình tư vẫn để tạo nên phong cách của bạn</span></p>
				</div>
			</div>
			<div id="container-login-right">
				<div id="header-top-right"class="header-login">
					<span class="actived">Đăng Nhập</span> / <span>Đăng Kí</span>
				</div>
				<div id="container-center-login-right">
					<form action="">
						<input class="material-textinput input-icon-email" placeholder="Email" type="text"/><br/>
						<input class="material-textinput input-icon-password" placeholder="Mật Khẩu" type="text"/><br/>
						<input class="material-primary-button"type="submit"value="ĐĂNG NHẬP"/>
					</form>
				</div>
				<div id="container-social-login">
					<img alt="icon_facebook" src='<c:url value="/resources/image/icon_facebook.png"/>' />
					<img alt="icon_google" src='<c:url value="/resources/image/icon_google.png"/>' />
				</div>
			</div>
		</div>
	</div>
</body>
</html>