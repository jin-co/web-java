<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<!-- 머리말 -->
	<jsp:include page="header.jsp" />

	<!-- 본문 시작 -->
	<main class="main">
		<div class="container">
			<form action="/" method="POST">
				<h2 class="h3 mb-3 fw-normal">Please sign in</h2>

				<div class="form-floating">
					<input type="email" class="form-control" id="floatingInput"
						name="id" placeholder="name@example.com"> <label
						for="floatingInput">Id</label>
				</div>
				<div class="form-floating">
					<input type="password" class="form-control" id="floatingPassword"
						name="password" placeholder="Password"> <label
						for="floatingPassword">Password</label>
				</div>

				<div class="checkbox mb-3">
					<label> <input type="checkbox" value="remember-me">
						Remember me
					</label>
				</div>
				<button class="w-100 btn btn-lg btn-success" type="submit">Sign
					in</button>
			</form>
		</div>
	</main>
	<!-- 꼬리 -->
	<jsp:include page="footer.jsp" />
</body>
</html>