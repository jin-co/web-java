<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--  header -->
<jsp:include page="./include/header.jsp"/>
<!--  header -->

<script>

function pickedIDX(articleId) {
            //alert("와따");
            location.href = "./healthyDietDetail?idx="+articleId;
    };

</script>

</head>
<body>
    
<!--  navigation -->
<jsp:include page="./include/navigation.jsp"/>
<!--  navigation -->

 
     
<!--  main  start-->
<div class="container">



					<!--  가로 출력 개수 지정  -->
		
    				<!-- 게시글 반복문 시작 	 -->
			      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-4">
			       <c:forEach items="${hdList}" var="List" varStatus="status">

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
                                            
                                        </div><!-- btn-group -->
                             
                                    </div><!-- d-flex -->
                                </div><!-- card-body -->
                            </div><!-- card shadow-sm -->
                        </div><!-- col -->
		
                    
			       </c:forEach>
			      </div><!-- 게시글 반복문 시작 	 -->

</div><!-- main  end-->
        
<!--  footer -->
<jsp:include page="./include/footer.jsp"/>
<!--  footer -->