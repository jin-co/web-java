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
    <!-- custom style -->
    <link rel="stylesheet" href="/css/admin.css">
</head>
<body>
    <!-- 머리말 -->
    <jsp:include page="header.jsp"/>

    <!-- 본문 시작 -->
    <main class="main">
        <div class="container px-4 py-5" id="custom-cards">
            <h2 class="pb-2 border-bottom">프로그래머 관리</h2>
            
            <div class="row row-cols-1 row-cols-lg-2 align-items-stretch g-4 py-5">
              <a href="/register" class="admin-link">
                <div class="col">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg">
                  <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                    <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">프로그래머 등록</h2>
                  </div>
                </div>
              </div></a>
        
              <a href="/search" class="admin-link">
              <div class="col">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg">
                  <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                    <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">프로그래머 조회</h2>
                  </div>
                </div>
              </div></a>
        
              <a href="/update" class="admin-link">
              <div class="col">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg">
                  <div class="d-flex flex-column h-100 p-5 pb-3 text-shadow-1">
                    <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">정보갱신</h2>
                  </div>
                </div>
              </div></a>
              <a href="/delete" class="admin-link">
              <div class="col">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg">
                  <div class="d-flex flex-column h-100 p-5 pb-3 text-shadow-1">
                    <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">프로그래머 삭제</h2>
                  </div>
                </div>
                </div></a>
            </div>
        </div>
    </main>

    <!-- 꼬리 -->
    <jsp:include page="footer.jsp"/>
</body>
</html>