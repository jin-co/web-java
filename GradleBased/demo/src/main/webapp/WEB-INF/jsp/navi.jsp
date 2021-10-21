<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<body>
    <div class="container html">

        <header>

            <div class="row flex-nowrap justify-content-between align-items-center">
                <div class="col-4 pt-1">
                    <a class="link-secondary" href="#"></a>
                </div>
                <div class="col-4 text-center">
                    <h1>
                        건강해 j. project&nbsp;<a style="font-size: 20px" href="https://simple-magnolia-457.notion.site/j-50a1d7b5f46a4f459875061794a85b6e" target="_blank">(프로젝트 소개)</a>
                    </h1>
                </div>
                <div class="col-4 d-flex justify-content-end align-items-center">

                    <c:choose>
                        <c:when test="${id eq null }">
                            <a class="btn btn-sm btn-info" href="./SignIn?idx=0">로그인</a> <span style="width: 10px"></span> 
                        </c:when>

                        <c:otherwise>
                            <p>${name}(${id}) 님</p> <span style="width: 10px"></span> 
                            <a class="btn btn-sm btn-info" href="./SignOut">로그아웃</a> <span style="width: 10px"></span> 
                        </c:otherwise>
                    </c:choose>

                    
                    <a class="btn btn-sm btn-outline-secondary" href="#">나의메뉴</a> <span style="width: 10px"></span> 
                    <a class="btn btn-sm btn-info" href="./SignUp">회원가입</a> <span style="width: 10px"></span> 
                    <a class="btn btn-sm btn-warning" href="./CheckOut">장바구니</a>


                </div>
            </div>

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                        <a class="navbar-brand" href="#">카테고리</a>
                        <ul class="navbar-nav nav-pills nav-fill me-auto mb-2 mb-lg-0">
                            <li class="nav-item" style="margin-left: 10px"><a class="nav-link active" aria-current="page" style="color: white" href="./">메인화면</a></li>
                            <li class="nav-item" style="margin-left: 10px"><a class="nav-link active" aria-current="page" style="color: white" href="./HealthyDiet">건강식단</a></li>
                            <li class="nav-item" style="margin-left: 10px"><a class="nav-link active " style="color: white" href="./RegularOrder">정기주문</a></li>
                            <li class="nav-item" style="margin-left: 10px"><a class="nav-link active" href="./CookingShow" style="color: white" tabindex="-1">요리자랑</a></li>
                        </ul>
                        <form class="d-flex">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>

        </header>
