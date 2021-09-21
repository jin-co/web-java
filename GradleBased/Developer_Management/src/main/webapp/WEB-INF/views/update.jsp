<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>좋은개발자</title>
<link rel="shortcut icon" href="/favicon/favicon.ico">
<!-- bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<!-- font awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"
	integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog=="
	crossorigin="anonymous" />
<!-- custom style -->
<link rel="stylesheet" href="/css/main.css">
<!-- javascript -->
<script defer src="/js/index.js"></script>
    <!-- custom style -->
    <link rel="stylesheet" href="/css/delete.css">
</head>
<body>
    <!-- 머리말 -->
    <jsp:include page="header.jsp"/>

    <!-- 본문 시작 -->
	<div class="container-fluid">
		<div class="row">
		
			<!-- 사이드 메뉴 -->
			<jsp:include page="programmer_side_menu.jsp"/>

			<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
				<div class="chartjs-size-monitor">
					<div class="chartjs-size-monitor-expand">
						<div class=""></div>
					</div>
					<div class="chartjs-size-monitor-shrink">
						<div class=""></div>
					</div>
				</div>
				<div
					class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
					<h1 class="h2">프로그래머 정보갱신</h1>
				</div>

				<p class="delete-text">수정할 프로그래머의 Id를 입력하세요</p>

				<div class="delete-container">
					<div class="delete-box">
						<form class="container" action="/update_form" method="POST">
							<div class="row">
								<input name="id" class="form-control col" type="text"
									placeholder="Search by Id" aria-label="Search">
								<button type="submit"
									class="btn btn-sm btn-outline-secondary col">갱신</button>
							</div>
						</form>
					</div>
				</div>
			</main>
		</div>
	</div>

	<!-- 꼬리 -->
    <jsp:include page="footer.jsp"/>
</body>
</html>