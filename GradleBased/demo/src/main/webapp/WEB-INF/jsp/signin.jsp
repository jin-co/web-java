<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./header.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>

<script >

$(document).ready(function() {
	
 		$("#signin-submit").click(function(){
			
			//alert("와따");
			
			$("form").submit();
			
			//alert("됐다");
	      
  
      });  //end of btn-submit 
      
  }); 

 </script> 

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

<jsp:include page="./navi.jsp"></jsp:include>

<main class="form-signin">

<div class="empty-50"></div>
    <div class="row justify-content-center">

        <div class="col-md-4">


            <form name="signin_form" id="signin_form" action="./SignIn" method="post" >
                <h1 class="h3 mb-3 fw-normal">로그인</h1>
				<input type="hidden" name="idx" value="${idx}"> 
                <div class="form-floating">
                    <input type="text" name="id" class="form-control" id="floatingInput" placeholder="id">
                    <label for="floatingInput">아이디</label>
                </div>
                <div class="empty-10"></div>
                <div class="form-floating">
                    <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
                    <label for="floatingPassword">비밀번호</label>
                </div>

                <div class="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="w-100 btn btn-lg btn-primary" type="submit" id="signin-submit">로그인</button>
                <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
            </form>


        </div>
    </div>

</main>


<jsp:include page="./footer.jsp"></jsp:include>
