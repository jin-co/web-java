<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Cupid Arrow</title>

    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>

    <!-- Simple line icons-->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.5.5/css/simple-line-icons.min.css" rel="stylesheet" />

    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />

    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="./lib/css/styles.css" rel="stylesheet" />
    <link href="./lib/css/mystyles.css" rel="stylesheet" />

    <!-- jQuery -->
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <link type="text/css" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/base/jquery-ui.css" rel="stylesheet" />
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

    <script src="./lib/js/myscripts.js"></script>


    <!-- 도로명주소 API -->
    <script src="./lib/js/juso.js"></script>

    <!--  카카오 지도 API  -->
    <link href="./lib/css/kakaomap.css" rel="stylesheet" />


</head>

<body id="page-top">
    <input type="hidden" id="sectionId" value="${userInfo.section }">
    <!-- Navigation-->
    <a class="menu-toggle rounded" href="#"><i class="fas fa-bars"></i></a>
    <nav id="sidebar-wrapper">


        <ul class="sidebar-nav">
            <li class="sidebar-brand"><a href="#page-top">Mail</a></li>
            <c:choose>
                <c:when test="${userInfo.id eq null}">
                    <li class="sidebar-nav-item"><a href="#login">Login</a></li>
                </c:when>
                <c:otherwise>
                    <li class="sidebar-nav-item"><a href="#" onclick="location.href='./Signout'">Logout</a></li>
                </c:otherwise>
            </c:choose>
            <li class="sidebar-nav-item"><a href="#book">Book</a></li>
            <c:choose>
                <c:when test="${userInfo.id eq null}">
                    <li class="sidebar-nav-item"><a href="#join">Join</a></li>
                </c:when>
            </c:choose>
            <li class="sidebar-nav-item"><a href="#seeu">SeeU</a></li>

        </ul>

    </nav>


    <!-- Mail-->
    <section class="masthead d-flex align-items-center">

        <div class="container px-4 px-lg-5 text-center">


            <h2>Send Heart ✿˘◡˘✿</h2>

            <div class="notebody">

                <div class="noteformwrapper">

                    <form id="note_form">

                        <input type="text" class="title" name="mailTitle" id="mailTitle" title="제목을 입력하세요" placeholder="제목" value="${userInfo.sMailTitle}"><br>
                        <input type="text" class="name" name="mailName" id="mailName" title="받는분 이름을 입력하세요" placeholder="받는분 이름" value="${userInfo.sMailName}">
                        <input type="email" class="email" name="mailEmail" id="mailEmail" title="받는분 이메일 주소를 입력하세요" placeholder="받는분 이메일" value="${userInfo.sMailEmail}"><br>
                        <textarea class="content" class="content" name="mailContent" id="mailContent" title="본문에 내용을 작성해주세요" placeholder="마음을 전하세요" value="${userInfo.sMailContent}"><c:choose><c:when test="${userInfo.id ne null}">${userInfo.name } ( ${userInfo.email } )님께서 보내시는 메일입니다.</c:when></c:choose>
${userInfo.sMailContent}</textarea>
                    </form>
                </div>

                <div class="btn-wrapper" id="btn-wrapper">
                    <svg xmlns="http://www.w3.org/2000/svg" width="160" height="160" fill="#d0021b" class="bi bi-heart-fill" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M8 1.314C12.438-3.248 23.534 4.735 8 15-7.534 4.736 3.562-3.248 8 1.314z"></path>
                    </svg>
                    <audio id="penclickink">
                        <source src="./lib/sound/penclickink.mp3">
                        </source>
                    </audio>
                    <audio id="stampselfinking">
                        <source src="./lib/sound/stampselfinking.mp3">
                        </source>
                    </audio>
                </div>

                <div class="notelines"></div>

                <ul class="notelist" id="List">
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                </ul>

            </div>

        </div>
    </section>

    <!-- Login-->
    <section class="content-section bg-primary text-white" id="login">
        <div class="container px-4 px-lg-5 text-center">
            <c:choose>
                <c:when test="${userInfo.id eq null }">
                    <div id="before_login">
                        <form name="signin_form" id="signin_form" method="post" action="./Signin">

                            <input type="hidden" name="sMailTitle" id="sMailTitle">
                            <input type="hidden" name="sMailName" id="sMailName">
                            <input type="hidden" name="sMailEmail" id="sMailEmail">
                            <input type="hidden" name="sMailContent" id="sMailContent">

                            <div class="container">
                                <div class="row">
                                    <div class="col">
                                        <div class="form-floating">
                                            <input type="text" name="id" class="form-control id" id="userId" placeholder="id" value="${id}">
                                            <label for="id" style="color:#000">아이디</label>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="form-floating">
                                            <input type="password" name="password" class="form-control password" id="userPassword" placeholder="password" value="${password}">
                                            <label for="password" style="color:#000">비밀번호</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col">
                                        <div class="checkbox mb-3">
                                            <label>
                                                <input type="checkbox" name="rememberId" <c:choose>
                                                <c:when test="${rememberId eq true }">checked</c:when>
            </c:choose>> Remember me
            </label>
        </div>
        <button class="w-100 btn btn-lg btn-secondary" type="button" id="btn-signin">로그인</button>
        </div>
        </div>

        </div>

        </form>
        </div>
        </c:when>
        <c:otherwise>
            <div id="after_login">
                <h3 class="text-secondary mb-0"> ${userInfo.name} ( ${userInfo.email}) 님</h3>
                <h2 class="mb-5">환영합니다. ^.^</h2>

                <button class="w-100 btn btn-lg btn-secondary" type="button" id="btn-signout" onclick="location.href='./Signout'">로그아웃</button>
            </div>
        </c:otherwise>
        </c:choose>
        </div>


    </section>
    <!-- Book-->
    <section class="content-section" id="book">
        <div class="container px-4 px-lg-5">
            <c:choose>
                <c:when test="${userInfo.id eq null }">
                    <div class="content-section-heading text-center" id="before_login_book">
                        <h2 class="mb-5">Address Book</h2>
                        <h3 class="text-secondary mb-0">로그인시 주소록을 사용하실 수 있어요</h3>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="content-section-heading text-center" id="after_login_book">
                        <h2 class="mb-5">Address Book</h2>
                        <h3 class="text-secondary mb-0">${userInfo.name} (${userInfo.email}) 님</h3>




                        <div class="card-body px-0 pb-2">
                            <div class="table-responsive">
                                <table class="table align-items-center mb-0">
                                    <thead>
                                        <tr>
                                            <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">구분</th>
                                            <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">이름</th>
                                            <th class="text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">이메일</th>
                                            <th class="text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">사용</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <c:forEach items="${addressList}" var="list" varStatus="status">
                                            <tr>
                                                <td>
                                                    <div class="d-flex px-2 py-1">
                                                        <input type="checkbox" name="RowCheck" id="address_${status.index}">
                                                    </div>
                                                </td>
                                                <td>
                                                    <div class="d-flex px-2 py-1">

                                                        <div class="d-flex flex-column justify-content-center">
                                                            <h6 class="mb-0 text-sm">
                                                                <input type="text" value="<c:out value="${list.rname}"></c:out>" id="address_rname_${status.index}" style="border:0px">
                                                            </h6>
                                                        </div>
                                                    </div>
                                                </td>
                                                <td class="align-middle text-center text-sm">
                                                    <span class="text-xs font-weight-bold">
                                                        <input type="text" value="<c:out value="${list.remail}"></c:out>" id="address_remail_${status.index}" style="border:0px">
                                                    </span>
                                                </td>
                                                <td class="align-middle">
                                                    <div class="progress-wrapper w-75 mx-auto">
                                                        <button onclick="setEmailValues('${list.rname}','${list.remail}');">use</button>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>


                                    </tbody>
                                </table>

                            </div>
                            <!-- 	추가하기 버튼 -->
                            <div style="height:40px;line-height:40px;margin-botton:40px;">&nbsp;</div>
                            <div class="row align-items-center">
                                <div class="col">
                                    <button type="button" class="btn btn-danger" id="btn-addressDelete">
                                        삭제하기
                                    </button>
                                </div>
                                <div class="col">

                                </div>
                                <div class="col">
                                    <button type="button" class="btn btn-secondary " data-bs-toggle="modal" data-bs-target="#exampleModal2">
                                        추가하기
                                    </button>
                                </div>
                            </div>


                            <!-- Modal -->
                            <div class="modal fade " id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog modal-lg modal-dialog-centered">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Address Book</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                                <h1 class="h1 mb-3 fw-normal" style="color:#000;">주소록</h1>



                                                
                                                <form id="addAddress-form" method="post" action="./AddAddress">
                                                <div class="row align-items-center">
                                                	<input type="hidden" name="id"	 id="addressId" value="${userInfo.id}">
                                                    <div class="col-4">
                                                        <div class="form-floating">
                                                            <input type="text" name="name" class="form-control" id="addressName" placeholder="Name" required>
                                                            <label for="addressName" style="color:#000;">이름</label>
                                                        </div>
                                                    </div>
                                                    <div class="col-8">
                                                        <div class="form-floating">
                                                            <input type="email" name="email" class="form-control" id="addressEmail" placeholder="name@example.com" required>
                                                            <label for="addressEmail" style="color:#000;">이메일</label>
                                                        </div>
                                                    </div>
                                                    </div>
												</form>
                                                
												<div style="margin-top:20px;"></div>

                                                <button class="w-100 btn btn-lg btn-secondary" id="btn-addAddress" type="button" style="color:#000;">등록하기</button>
                                                <p class="mt-5 mb-3 text-muted">&copy; 2021 semi project</p>



                                            
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-primary" data-bs-dismiss="modal">닫기</button>
                                            <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
                                        </div>
                                    </div>
                                </div>
                            </div><!-- modal -->
                        </div>
                    </div>

        </div>
        </c:otherwise>
        </c:choose>
        </div>

    </section>

<hr>
    <c:choose>
        <c:when test="${userInfo.id eq null }">
            <!-- join-->
            <section class="content-section bg-primary text-white text-center" id="join">
                <div class="container px-4 px-lg-5">
                    <div class="content-section-heading">
                        <h3 class="text-secondary mb-0">주소록 기능을 이용하실 수 있어요 ^.^</h3>
                        <h2 class="mb-5">회원가입</h2>

                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-secondary btn-xl" data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Join Now!
                        </button>

                        <!-- Modal -->
                        <div class="modal fade " id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog modal-lg modal-dialog-centered">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Join Member ^____^</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form id="signup-form" method="post" action="./Signup">
                                            <h1 class="h1 mb-3 fw-normal" style="color:#000;">회원가입</h1>


                                            <div class="form-floating">
                                                <input type="text" name="name" class="form-control" id="newfloatingInputName" placeholder="Name" required>
                                                <label for="newfloatingInputName" style="color:#000;">이름</label>
                                            </div>

                                            <div class="empty-10"></div>

                                            <div class="form-floating">
                                                <input type="email" name="email" class="form-control" id="newfloatingInputEmail" placeholder="name@example.com" required>
                                                <label for="newfloatingInputEmail" style="color:#000;">이메일</label>
                                            </div>
                                            <div class="empty-10"></div>

                                            <div class="form-floating">
                                                <input type="text" name="id" class="form-control" id="newfloatingInputId" placeholder="Id" required>
                                                <label for="newfloatingInputId" style="color:#000;">아이디</label>
                                            </div>
                                            <div class="empty-10"></div>
                                            <div class="form-floating">
                                                <input type="password" name="password" class="form-control" id="newfloatingPassword" placeholder="Password" required>
                                                <label for="newfloatingPassword" style="color:#000;">비밀번호</label>
                                            </div>
                                            <div class="empty-10"></div>
                                            <div class="form-floating">
                                                <input type="password" class="form-control" id="newfloatingPasswordConfirm" placeholder="Password" required>
                                                <label for="newfloatingPasswordConfirm" style="color:#000;">비밀번호 확인</label>
                                            </div>
                                            <font id="chkNotice" size="2"></font>

                                            <div class="checkbox mb-3">
                                                <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required>
                                                <label class="form-check-label" for="invalidCheck3" style="color:#000;">
                                                    Agree to terms and conditions
                                                </label>
                                                <div id="invalidCheck3Feedback" class="invalid-feedback" style="color:#000;">
                                                    가입을 하기 위해서는 이용약관에 동의해주셔야합니다.
                                                </div>
                                            </div>
                                            <button class="w-100 btn btn-lg btn-secondary" id="btn-signup" type="button" style="color:#000;">가입하기</button>
                                            <p class="mt-5 mb-3 text-muted">&copy; 2021 semi project</p>
                                        </form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">닫기</button>
                                        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
                                    </div>
                                </div>
                            </div>
                        </div><!-- modal -->

                    </div>
                    <div class="row gx-4 gx-lg-5">

                    </div>
                </div>
            </section>
        </c:when>
    </c:choose>


    <!-- Footer-->
    <footer class="footer text-center" id="">
        <div class="container px-4 px-lg-5">


            <div class="container">
                <div class="row align-self-center">
                    <div class="col-3 ">
                        <div class="form-floating">
                            <h3 class="mb-5">당신의 주소</h3>
                        </div>
                    </div>
                    <div class="col-7 ">
                        <div class="form-floating">
                            <form name="jusoFormSrc" id="jusoFormSrc" method="post">
                                <input type="text" name="sourceAddr" class="form-control sourceAddr" id="sourceAddr" title="주소를 입력하세요">
                            </form>
                        </div>
                    </div>
                    <div class="col-2 ">
                        <div class="form-floating">
                            <button class="btn btn-primary" onClick="javascript:goPopup();">검색</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="row align-self-center">
                    <div class="col-3 ">
                        <div class="form-floating">
                            <h3 class="mb-5">상대방의 주소</h3>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="form-floating">
                            <form name="jusoFormDest" id="jusoFormDest" method="post">
                                <input type="text" name="destinationAddr" class="form-control destinationAddr" id="destinationAddr" title="주소를 입력하세요">
                            </form>
                        </div>
                    </div>
                    <div class="col-2">
                        <div class="form-floating">
                            <button class="btn btn-primary" onClick="javascript:goPopup2();">검색</button>
                        </div>
                    </div>
                </div>
            </div>


            <div class="container">
                <div class="row">
                    <div class="col align-self-center">

                        <div class="form-floating" style="float:right">
                            <input type="text" name="distanceCalc" class="form-control distanceCalc" id="distanceCalc" placeholder="km">
                            <label for="distanceCalc" style="color:#000">당신과 그(녀)와의 거리</label>
                        </div>

                    </div>
                    <div class="col align-self-center">

                        <div class="form-floating">

                            <button id="btn-distanceCalc" type="button" class="btn btn-secondary btn-xl">계산하기</button>
                        </div>


                    </div>

                </div>
            </div>



        </div>
    </footer>
    <!-- Map-->
    <div class="map_wrap">
        <div id="map" style="width:100%;height:100%;position:relative;overflow:hidden;"></div>
        <div class="hAddr">
            <span class="title">그(녀)의 위치를 지도에서 찾아보세요. 지점을 클릭하면 주소가 나옵니다.</span>
            <span id="centerAddr"></span>
        </div>
        <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=ab8db4dc71897940e7bd85b0c7abec39&libraries=services"></script>
        <script src="./lib/js/kakaomap.js"></script>
    </div>

    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="./lib/js/scripts.js"></script>
</body>

</html>
