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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- font awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog==" crossorigin="anonymous" />
    <!-- custom style -->
    <link rel="stylesheet" href="/css/main.css">
    <!-- javascript -->
    <script defer src="/js/index.js"></script>
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
					<h1 class="h2">프로그래머 조회</h1>
					<div class="btn-toolbar mb-2 mb-md-0">
						<div class="btn-group me-2">
							<form class="container" action="/search_result" method="POST">
								<div class="row">
									<input name="id" class="form-control col" type="text"
										placeholder="Search by Id" aria-label="Search">
									<button type="submit"
										class="btn btn-sm btn-outline-secondary col">조회</button>
								</div>
							</form>
						</div>
					</div>
				</div>

				<h2>조회결과</h2>
				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<thead>
							<tr>
								<th scope="col">#Id</th>
								<th scope="col">성명</th>
								<th scope="col">주소</th>
								<th scope="col">연락처</th>
								<th scope="col">이메일</th>
								<th scope="col">경력</th>
								<th scope="col">주요언어</th>
								<th scope="col">시급</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="programmer" items="${programmers }">
								<tr>
									<td>${programmer.id }</td>
									<td>${programmer.name }</td>
									<td>${programmer.address }</td>
									<td>${programmer.contact }</td>
									<td>${programmer.email }</td>
									<td>${programmer.experience }년</td>
									<td>${programmer.specification }</td>
									<td>${programmer.rate }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</main>
		</div>
	</div>

	<!-- 꼬리 -->
    <jsp:include page="footer.jsp"/>
</body>
</html>