<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./header.jsp" ></jsp:include>

    <!-- Bootstrap core CSS -->
<link href="./lib/bootstrap-5.0.2-dist/css/bootstrap.css" rel="stylesheet"> 

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
<jsp:include page="./navi.jsp" ></jsp:include>


<main>

  <section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">정기식단 주문</h1>
        <p class="lead text-muted">이제 편리하게 한번에 주문하세요</p>
        <p>
          <a href="#" class="btn btn-primary my-2">식단 정기 주문</a>
          <a href="#" class="btn btn-secondary my-2">반찬/국 정기 주문</a>
         
        </p>
      </div>
    </div>
  </section>

  
<div class="row" style="height:50px;"></div><!-- 공백  -->
	  
	  <div class="row"> <!--  앨범 형태 정기구독 식단 -->
	  
	  <section class="main__sect care hd__inner1100">
                    <p class="main__desc hPara fadeInUp">꾸준한 관리, 더이상 어렵지 않아요</p>
                    <h3 class="main__h3 hPara fadeInUp">
                        <a href="/planMeals/planMeals">
                            <strong>건강식단 정기구독</strong>
                        </a>
                    </h3>
                    
		        </section>
	  
	    <div class="album py-5 bg-light">
			    <div class="container">
			
			      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
			        <div class="col">
			          <div class="card shadow-sm">
						<img src="https://image.greating.co.kr/DP/banner/202103/9B0D9CC2ACA049E28CAF3A3D0E51FD1B.jpg" width="100%" height="225"/>
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
									<img src="https://image.greating.co.kr/DP/banner/202103/DCCCD87D2FB8493F8D8C8C1E207E8343.jpg" width="100%" height="225"/>
			
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
			<img src="https://image.greating.co.kr/DP/banner/202103/12B8C913A08B47099B27708A280C17A6.jpg" width="100%" height="225"/>
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
									<img src="https://image.greating.co.kr/DP/banner/202103/000E1133A11A4DDCB66AE8CE4D35C739.jpg" width="100%" height="225"/>
			
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
									<img src="https://image.greating.co.kr/DP/banner/202103/9B0D9CC2ACA049E28CAF3A3D0E51FD1B.jpg" width="100%" height="225"/>
			
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
									<img src="https://image.greating.co.kr/DP/banner/202103/000E1133A11A4DDCB66AE8CE4D35C739.jpg" width="100%" height="225"/>
			
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
</main>


<script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>

<jsp:include page="./footer.jsp" ></jsp:include>

