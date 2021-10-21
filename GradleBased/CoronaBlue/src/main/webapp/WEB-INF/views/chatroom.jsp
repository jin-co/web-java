<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--  header -->
<jsp:include page="./include/header.jsp"/>
<!--  header -->
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./css/chatroom.css" rel="stylesheet">
<script src="./js/chatroom.js"></script>

</head>
<body>

<!--  navigation -->
<jsp:include page="./include/navigation.jsp"/>
<!--  navigation -->

      
<!--  main  start-->
    <div class="main-content" id="panel">

        <div class="container-fluid pt-3">
            <div class="row removable mt-4">
           
                <div class="col-12 col-xl-8">
                    <div class="card h-100">
                        <div class="card-header pb-0 p-3">
                            <h6 class="mb-0">Conversations</h6>
                        </div>
                        <!-- 메시지 리스트 	 -->
			 			<div class="card-body p-3">
                            <ul id="chatList"   class="list-group" style="overflow-y: auto; with: auto; height: 600px;">

			 							
                            </ul>
                        </div><!-- 메시지 리스트 	 -->
                        
                        <!-- 메시지 입력창 	 -->
                        <div class="card-body p-3">
								<div class="input-group mb-3">
										  <span class="input-group-text" id="basic-addon1">이름</span>
										  <input  id="chatName"  type="text" class="form-control" placeholder="anonymous name" aria-label="Username" aria-describedby="basic-addon1">
								</div>
								
								<div class="input-group">
										  <span class="input-group-text">내용</span>
										  <textarea id="chatContent" class="form-control" aria-label="내용" aria-describedby="button-addon2" placeholder="message"></textarea>
										  <button class="btn btn-outline-secondary" type="button" id="button-addon2"  onclick="chatSubmit();">전송</button>
								</div>

                        </div><!-- 메시지 입력창 	 -->
                          
                                
                    </div>
                </div>
            </div>
        </div>
		<!--  토스트 메시지 -->
		<div class="alert alert-success" id="successMessage" style="display:none;" >
				<strong>메시지 전송에 성공했습니다.</strong>
		</div>
		<div class="alert alert-danger" id="dangerMessage" style="display:none;" >
				<strong>이름과 내용을 모두 입력해주세요.</strong>
		</div>
		<div class="alert alert-warning" id="warningMessage" style="display:none;" >
				<strong>데이터베이스 입력 중 오류가 발생하였습니다.</strong>
		</div>	 	
		<!--  토스트 메시지 끝-->
		</div> <!-- container bootstrap snippets -->


<!-- <button type="button" class="btn btn-primary pull-right" onclick="realtimeChatListFunction();">추가	</button> -->
 <!--  main  end-->
 
 
<!--  footer -->
<jsp:include page="./include/footer.jsp"/>
<!--  footer -->