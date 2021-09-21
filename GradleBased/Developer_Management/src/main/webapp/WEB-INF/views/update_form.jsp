<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
</head>
<body>
    <!-- 머리말-->
    <jsp:include page="header.jsp"/>

    <!-- 본문 시작 -->
	<main class="main">
		<div class="container">

			<div class="py-5 text-center">
				<h2>프로그래머 갱신</h2>
				<hr>
			</div>
			<form action="/update_result" method="POST" class="needs-validation"
				novalidate="">
				<div class="row g-3">
					<div class="col-sm-6">
						<label for="id" class="form-label">Id</label> <input disabled
							name="id" type="text" class="form-control" id="id"
							placeholder="" value="" required="">
						<div class="invalid-feedback">Valid name is required.</div>
					</div>

					<div class="col-sm-6">
						<label for="Name" class="form-label">이름</label> <input name="name"
							type="text" class="form-control" id="Name" placeholder=""
							value="${programmer.name }" required="">
						<div class="invalid-feedback">Valid name is required.</div>
					</div>

					<div class="col-sm-6">
						<label for="email" class="form-label">Email <span
							class="text-muted">(Optional)</span></label> <input name="email"
							type="email" class="form-control" id="email"
							value="${programmer.email }" placeholder="you@example.com">
						<div class="invalid-feedback">Please enter a valid email
							address for shipping updates.</div>
					</div>

					<div class="col-sm-6">
						<label for="email" class="form-label">연락처 <span
							class="text-muted">(Optional)</span></label> <input name="contact"
							type="tel" class="form-control" id="email"
							value="${programmer.contact }" placeholder="000-0000-0000">
						<div class="invalid-feedback">Please enter a valid email
							address for shipping updates.</div>
					</div>

					<div class="col-sm-6">
						<input name="rate" value=1
							type="hidden" class="form-control" id="rate"
							placeholder="you@example.com">
						<div class="invalid-feedback">Please enter a valid email
							address for shipping updates.</div>
					</div>

					<div class="col-9">
						<label for="address" class="form-label">주소</label> <input
							name="address" type="text" class="form-control" id="address"
							value="${programmer.address }" placeholder="1234 Main St" required="">
						<div class="invalid-feedback">Please enter your shipping
							address.</div>
					</div>

					<div class="col-md-3">
						<label for="experience" class="form-label">경력</label> <input
							name="experience" type="text" class="form-control"
							id="experience" value="${programmer.experience }" placeholder="" required="">
						<div class="invalid-feedback">Zip code required.</div>
					</div>

					<div class="col-md-12">
						<label style="margin-bottom: 20px;" for="">주요언어</label>
						<div class="container-fluid">
							
							<c:set var="specificationList" value="${fn:split(programmer.specification, ',') }"></c:set>
							
							
							<div class="row">
								<div class="form-check col">
									<label for="java" class="form-check-label mx-3"><i
										class="fa-2x fab fa-java "></i></label> <input type="checkbox"
										class="form-check-input" id="java" value="java"
										name="specification" 
										<c:if test="${fn:containsIgnoreCase(specificationList, 'java')}"> checked</c:if>>
								</div>

								<div class="form-check col">
									<label for="javascript" class="form-check-label mx-3"><i
										class="fa-2x fab fa-js-square"></i></label> <input type="checkbox"
										class="form-check-input" id="javascript" value="javascript" name="specification"
										<c:if test="${fn:containsIgnoreCase(specificationList, 'javascript')}"> checked</c:if>>
								</div>

								<div class="form-check col">
									<label for="python" class="form-check-label mx-3"><i
										class="fa-2x fab fa-python"></i></label> <input type="checkbox"
										class="form-check-input" id="python" value="python" name="specification"
										<c:if test="${fn:containsIgnoreCase(specificationList, 'python')}"> checked</c:if>>
								</div>

								<div class="form-check col">
									<label for="php" class="form-check-label mx-3"><i
										class="fa-2x fab fa-php"></i></label> <input type="checkbox"
										class="form-check-input" id="php" value="php" name="specification"
										<c:if test="${fn:containsIgnoreCase(specificationList, 'php')}"> checked</c:if>>
								</div>

								<div class="form-check col">
									<label for="c" class="form-check-label mx-3"><i
										class="fab fa-cuttlefish"></i></label> <input type="checkbox"
										class="form-check-input" id="c" value="c" name="specification"
										<c:if test="${fn:containsIgnoreCase(specificationList, 'c')}"> checked</c:if>>
								</div>
							</div>
						</div>

						<div class="invalid-feedback">Zip code required.</div>
					</div>
				</div>

				<hr class="my-4">
				<button class="w-100 btn btn-primary btn-lg" type="submit">등록</button>
			</form>
		</div>
	</main>

	<!-- 꼬리 -->
   	<jsp:include page="footer.jsp"/>
</body>
</html>