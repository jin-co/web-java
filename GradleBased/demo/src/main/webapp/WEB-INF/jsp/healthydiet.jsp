<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
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

<script>

function pickedIDX(articleId) {
            //alert("와따");
            location.href = "./HealthyDietDetail?idx="+articleId;
    };

</script>
    
<jsp:include page="./navi.jsp" ></jsp:include>

<!--  가로 출력 개수 지정  -->
<c:set var="i" value="0" />
<c:set var="j" value="3" />

<main>
<div class="container">

  <section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">현대인 필수 건강 식단</h1>
        <p class="lead text-muted">조경석 박사가 추천하는 건강식단</p>
        <p>
         <a href="#" class="btn btn-primary my-2">모든 건강 식단</a> 
          <a href="#" class="btn btn-secondary my-2">당을 낮추는 저당식단</a>
          <a href="#" class="btn btn-secondary my-2">고지혈에 좋은 저지방 식단</a>
          <a href="#" class="btn btn-secondary my-2">혈압을 낮추는 차분해 식단</a>
        </p>
      </div>
    </div>
  </section>

  
<div class="row" style="height:50px;"></div><!-- 공백  -->
	  
	  <div class="row"> <!--  앨범 형태 추천 식단 -->
	  
	  <section class="main__sect care hd__inner1100">
                    <p class="main__desc hPara fadeInUp">조경석 박사가 추천하는 건강식단 </p>
                    <h3 class="main__h3 hPara fadeInUp">
                            <strong>당을 낮추는 건강식단 </strong>
                    </h3>
                    
		        </section>
	  
	    <div class="album py-5 bg-light">
			    <div class="container">
				
				<!-- 게시글 반복문 시작 	 -->
			      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
			      
			      <c:forEach items="${hdList}" var="List" varStatus="status">

                        <c:if test="${i%j == 0 }">

                            <br>

                        </c:if>
			      <div class="col">
                            <div class="card shadow-sm">
                                <img src="${List.imageurl}" width="100%" height="225" onclick="javascript:location.href='./HealthyDietDetail?idx=${List.idx}'" />
                                <div class="card-body">

                                    <p class="card-text" onclick="javascript:location.href='./HealthyDietDetail?idx=${List.idx}'">${List.title}  </p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">${List.categoryname}</button>

                                            <button type="button" class="btn btn-sm btn-outline-secondary"   onclick="javascript:pickedIDX(${List.idx});" >
                                                		자세히 보기
                                            </button>
                                            
                                        </div>
                                        <!-- <small class="text-muted">
                                            <fmt:formatDate value="${List.postdate}" pattern="yyyy.MM.dd" />
                                            <c:choose>
                                                <c:when test="${List.modifydate ne null }">
                                                    (
                                                    <fmt:formatDate value="${List.modifydate}" pattern="yyyy.MM.dd" />)
                                                </c:when>
                                            </c:choose>


                                        </small>
                                         -->
                                    </div>
                                </div>
                            </div>
                        </div>


                        <c:if test="${i%j == j-1 }">

                            <br>

                        </c:if>

                        <c:set var="i" value="${i+1 }" />

                    </c:forEach>
			      </div>
			      <!--  게시글 반복문 끝 	 -->
			      
			      	
			    </div>
			  </div>
	  </div> <!-- 앨범 형태 추천  식단	   -->
	  </div>
</main>


<script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>

<jsp:include page="./footer.jsp" ></jsp:include>

