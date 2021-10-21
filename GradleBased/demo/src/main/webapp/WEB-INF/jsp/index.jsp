<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
    function pickedIdxHD(articleId) {
        //alert("와따");
        location.href = "./HealthyDietDetail?idx=" + articleId;
    };

    function pickedIdxCS(articleId) {
        //alert("와따");
        location.href = "./CookingShowRecommendation?idx=" + articleId;
    };

</script>

<jsp:include page="./header.jsp"></jsp:include>
<jsp:include page="./navi.jsp"></jsp:include>
<main>
    <div class="container main">
        <div class="row" style="height:50px;"></div><!-- 공백  -->

        <div class="row">
            <!--  첫 화면 메인 홍보  -->
            <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="./lib/images/carousel04.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>First slide label</h5>
                            <p>Some representative placeholder content for the first slide.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="./lib/images/carousel05.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Second slide label</h5>
                            <p>Some representative placeholder content for the second slide.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="./lib/images/carousel06.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Third slide label</h5>
                            <p>Some representative placeholder content for the third slide.</p>
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>



        </div> <!--  첫화면 메인 홍보 끝 -->


        <div class="row" style="height:50px;"></div><!-- 공백  -->


        <div class="row">
            <!--  첫화면 / Featured 추천식단  -->
            <div class="row mb-2">
            
            
                <div class="col-md-6">
                    <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                        <div class="col p-4 d-flex flex-column position-static">
                            <strong class="d-inline-block mb-2 text-primary">건강식단</strong>
                            <h3 class="mb-0">${randomIdxHD.categoryname}</h3>
                            <div class="mb-1 text-muted">
                                <fmt:formatDate value="${randomIdxHD.postdate}" pattern="yyyy.MM.dd" />
                                <c:choose>
                                    <c:when test="${randomIdxHD.modifydate ne null }">
                                        (
                                        <fmt:formatDate value="${randomIdxHD.modifydate}" pattern="yyyy.MM.dd" />)
                                    </c:when>
                                </c:choose>


                            </div>
                            <p class="card-text mb-auto">${randomIdxHD.title} </p>
                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:pickedIdxHD(${randomIdxHD.idx});">
                                자세히 보기
                            </button>

                        </div>
                        <div class="col-auto d-none d-lg-block">
                            <img src="${randomIdxHD.imageurl}" width="300px;" height="250px;"/>
                        </div>
                    </div>
                </div>
                
                
                
                <div class="col-md-6">
                    <div class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                        <div class="col p-4 d-flex flex-column position-static">
                            <strong class="d-inline-block mb-2 text-success">요리자랑</strong>
                            <h3 class="mb-0">${randomIdxCS.authorid} 님 "${randomIdxCS.categoryid}" </h3>
                            <div class="mb-1 text-muted">
                                <fmt:formatDate value="${randomIdxCS.postdate}" pattern="yyyy.MM.dd" />
                                <c:choose>
                                    <c:when test="${randomIdxCS.modifydate ne null }">
                                        (
                                        <fmt:formatDate value="${randomIdxCS.modifydate}" pattern="yyyy.MM.dd" />)
                                    </c:when>
                                </c:choose>
                            </div>
                            <p class="mb-auto">${randomIdxCS.title}</p>
                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:pickedIdxCS(${randomIdxCS.idx});">
                                자세히 보기
                            </button>
                        </div>
                        <div class="col-auto d-none d-lg-block">
                            <img src="${randomIdxCS.imageurl}" width="300px;" height="250px;"/>
                        </div>
                    </div>
                </div>
                
                
                
                
            </div>
        </div>
        <div class="row" style="height:50px;"></div><!-- 공백  -->

        <div class="row">
            <!--  앨범 형태 추천 식단 -->

            <section class="main__sect care hd__inner1100">
                <p class="main__desc hPara fadeInUp">조경석 박사가 추천하는 건강식단 </p>

                <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./HealthyDiet' ">
                    <h3 class="main__h3 hPara fadeInUp">


                        <strong>현대인 필수 건강 식단 </strong>

                    </h3>
                </button>


            </section>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowsugar01.jpg" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />
                                <div class="card-body">
                                    <p class="card-text">피로회복에 좋은 요리</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">당을 낮추는 저당식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowsugar02.jpg" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />

                                <div class="card-body">
                                    <p class="card-text">분을 좋게 해주는 연어와 시금치</p>

                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">당을 낮추는 저당식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowfat01.jpg" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />
                                <div class="card-body">
                                    <p class="card-text">피로를 완화시켜 주는 음식</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">고지혈에 좋은 저지방 식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowfat02.jpg" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />

                                <div class="card-body">
                                    <p class="card-text">몸과 마음의 면역력을 높이는 컬러푸드</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">고지혈에 좋은 저지방 식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/rda_lowpressure02.png" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />

                                <div class="card-body">
                                    <p class="card-text">기분이 상쾌해지는 요리</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">혈압을 낮추는 차분해 식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/rda_lowpressure01.png" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail'" />

                                <div class="card-body">
                                    <p class="card-text">자연으로 치유한다, 힐링푸드 </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">혈압을 낮추는 차분해 식단 </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="javascript:location.href='./HealthyDietDetail'">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div> <!-- 앨범 형태 추천  식단	   -->

        <div class="row" style="height:50px;"></div><!-- 공백  -->

        <div class="row">
            <!--  앨범 형태 정기구독 식단 -->

            <section class="main__sect care hd__inner1100">
                <p class="main__desc hPara fadeInUp">꾸준한 관리, 더이상 어렵지 않아요</p>
                <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./RegularOrder' ">
                    <h3 class="main__h3 hPara fadeInUp">


                        <strong>건강식단 정기구독 </strong>

                    </h3>
                </button>



            </section>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/9B0D9CC2ACA049E28CAF3A3D0E51FD1B.jpg" width="100%" height="225" />
                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/DCCCD87D2FB8493F8D8C8C1E207E8343.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>

                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/12B8C913A08B47099B27708A280C17A6.jpg" width="100%" height="225" />
                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/000E1133A11A4DDCB66AE8CE4D35C739.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/9B0D9CC2ACA049E28CAF3A3D0E51FD1B.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="https://image.greating.co.kr/DP/banner/202103/000E1133A11A4DDCB66AE8CE4D35C739.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CheckOut' ">장바구니</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">자세히 보기</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div> <!-- 앨범 형태 정기구독 식단	   -->

        <div class="row" style="height:50px;"></div><!-- 공백  -->

        <div class="row">
            <!--  앨범 형태 요리 자랑 식단 -->

            <section class="main__sect care hd__inner1100">
                <p class="main__desc hPara fadeInUp">이 요리, 인기 짱!</p>
                <button type="button" class="btn btn-sm btn-success" onclick="javascript:location.href='./CookingShow' ">
                    <h3 class="main__h3 hPara fadeInUp">


                        <strong>회원 요리 - 인기순위 </strong>

                    </h3>
                </button>
            </section>

            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowsugar03.jpg" width="100%" height="225" />
                                <div class="card-body">
                                    <p class="card-text">김지영 님 "당을 낮추는 식단" </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">1,000,000</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowfat03.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">김지영 님 "저자방 식단".</p>

                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">900,000</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowpressure03.jpg" width="100%" height="225" />
                                <div class="card-body">
                                    <p class="card-text">조현영 님 "차분해 식단"</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">100,000</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowpressure02.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">조현영 님 "차분해 식단"</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">10,000</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowfat01.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">조경석 님 "저지방 식단" </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">100</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img src="./lib/images/lowfat02.jpg" width="100%" height="225" />

                                <div class="card-body">
                                    <p class="card-text">조경석 님 "저지방 식단" </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-suit-heart" viewBox="0 0 16 16">
                                                    <path d="m8 6.236-.894-1.789c-.222-.443-.607-1.08-1.152-1.595C5.418 2.345 4.776 2 4 2 2.324 2 1 3.326 1 4.92c0 1.211.554 2.066 1.868 3.37.337.334.721.695 1.146 1.093C5.122 10.423 6.5 11.717 8 13.447c1.5-1.73 2.878-3.024 3.986-4.064.425-.398.81-.76 1.146-1.093C14.446 6.986 15 6.131 15 4.92 15 3.326 13.676 2 12 2c-.777 0-1.418.345-1.954.852-.545.515-.93 1.152-1.152 1.595L8 6.236zm.392 8.292a.513.513 0 0 1-.784 0c-1.601-1.902-3.05-3.262-4.243-4.381C1.3 8.208 0 6.989 0 4.92 0 2.755 1.79 1 4 1c1.6 0 2.719 1.05 3.404 2.008.26.365.458.716.596.992a7.55 7.55 0 0 1 .596-.992C9.281 2.049 10.4 1 12 1c2.21 0 4 1.755 4 3.92 0 2.069-1.3 3.288-3.365 5.227-1.193 1.12-2.642 2.48-4.243 4.38z"></path>
                                                </svg>
                                                좋아요
                                            </button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">10</button>
                                        </div>
                                        <small class="text-muted">9 mins</small>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div> <!-- 앨범 형태 요리 자랑 식단	   -->
    </div>
</main>

<jsp:include page="./footer.jsp"></jsp:include>
