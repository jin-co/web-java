<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./header.jsp"></jsp:include>


<script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>
<!-- Custom styles for this template
<link href="./lib/css/signin.css" rel="stylesheet">
 -->
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

// 패스워드 일치 체크 
$(document).ready(function() {
	
	
	$("#signup-submit").click(function() {
		//alert("홨");
		if ( $('#chkNotice').text().indexOf("일치함") == -1) {
			$('#floatingPassword').val(null);
			$('#floatingPasswordConfirm').val(null);
			alert("비밀번호가 일치하지 않습니다!");
		   
		} else {
			
			$("#signup-form").submit();	
			
		}   
	});
	
	

   	$(function(){
   	    $('#floatingPassword').keyup(function(){
   	      $('#chkNotice').html('');
   	    });

   	    $('#floatingPasswordConfirm').keyup(function(){

   	        if($('#floatingPassword').val() != $('#floatingPasswordConfirm').val()){
   	          $('#chkNotice').html('비밀번호 일치하지 않음<br><br>');
   	          $('#chkNotice').attr('color', '#f82a2aa3');
   	        } else{
   	          $('#chkNotice').html('비밀번호 일치함<br><br>');
   	          $('#chkNotice').attr('color', '#199894b3');
   	        }

   	    });
   	});
 
}); 

</script>
<jsp:include page="./navi.jsp"></jsp:include>

<main class="form-signin">

    <div class="empty-50"></div>
    <div class="row justify-content-center">

        <div class="col-md-4">


            <form id="signup-form" action="./SignUp" method="post">
                <h1 class="h3 mb-3 fw-normal">회원가입</h1>


                <div class="form-floating">
                    <input type="text" name="name" class="form-control" id="floatingInputName" placeholder="Name" required>
                    <label for="floatingInput">이름</label>
                </div>

                <div class="empty-10"></div>

                <div class="form-floating">
                    <input type="email" name="email" class="form-control" id="floatingInputEmail" placeholder="name@example.com" required>
                    <label for="floatingInput">이메일</label>
                </div>
                <div class="empty-10"></div>

                <div class="form-floating">
                    <input type="text" name="id" class="form-control" id="floatingInputId" placeholder="Id" required>
                    <label for="floatingInput">아이디</label>
                </div>
                <div class="empty-10"></div>
                <div class="form-floating">
                    <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password" required>
                    <label for="floatingPassword">비밀번호</label>
                </div>
                <div class="empty-10"></div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPasswordConfirm" placeholder="Password" required>
                    <label for="floatingPassword">비밀번호 확인</label>
                </div>
				<font id="chkNotice" size="2"></font>

                <div class="checkbox mb-3">
                    <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required>
                    <label class="form-check-label" for="invalidCheck3">
                        Agree to terms and conditions
                    </label>
                    <div id="invalidCheck3Feedback" class="invalid-feedback">
                        가입을 하기 위해서는 이용약관에 동의해주셔야합니다.
                    </div>
                </div>
                <button class="w-100 btn btn-lg btn-primary" id="signup-submit" type="submit">가입하기</button>
                <p class="mt-5 mb-3 text-muted">&copy; 2021 demo project</p>
            </form>

        </div>
    </div>

</main>


<jsp:include page="./footer.jsp"></jsp:include>
