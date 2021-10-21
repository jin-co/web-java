<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./header.jsp"></jsp:include>


<script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>

<script>

	

    $(document).ready(function() {

        $("#CookingShow-submit").click(function() {

            $("#cookingshow_form").submit();

        }); //end of btn-submit 
        
        
        $("#reason-add-btn").click(function() {
        	

    	    var NowColNodes = eval($(".reasons:last").attr('id').replace(
    	        "reasons_", ""));
      	    
    	    if (NowColNodes < 1) {
    	        NowColNodes = 0;
    	    }
    	    alert("reason-add-btn" + NowColNodes);
    	    
    	    var AddColNodes = Number(NowColNodes) + 1;

    	    $('#reasons_wrapper')
    	        .append('<!-- 추천이유 '+AddColNodes+'  -->'
    	        	   +'<div class="form-floating reasons_wrapper" >'
    	               +'<input type="text" name="reasonsVOList['+(AddColNodes-1)+'].reasons" id="reasons_'+AddColNodes+'" class="form-control reasons" placeholder="추천이유를 적어주세요">'
    	               +'<label for="reasons_'+AddColNodes+'"> 추천 이유 '+AddColNodes+'</label>'
    	               +'</div>' );
    	
        }); //end of reason-add-btn
        

    });
</script>
<script src="./lib/editormd/editormd.js"></script>
<script src="./lib/editormd/languages/en.js"></script>
<link rel="stylesheet" href="./lib/editormd/css/editormd.css" />

<script type="text/javascript">
    $(function() {
        var editor = editormd("markdown-editor", {
            width  : "98%",
            height : "500px",
            path: "./lib/editormd/lib/"
        });
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

<main class="form-cookingshow-add-article">

    <div class="empty-50"></div>
    <div class="row justify-content-center">

        <div class="col-md-12">


            <form name="cookingshow_form" id="cookingshow_form" action="./addCookingShowArticle" method="post" enctype="multipart/form-data">
                <h1 class="h3 mb-3 fw-normal">게시글 등록</h1>
                <div class="row">
                    <div class="col-md-4">

                        <div class="form-floating">
                            <input type="text" name="name" value="${name}" class="form-control" id="floatingName" placeholder="이름" readonly>
                            <label for="floatingName">이름 </label>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-floating">
                            <input type="text" name="authorid" value="${id}" class="form-control" id="floatingInput" placeholder="id" readonly>
                            <label for="floatingInput">아이디</label>
                        </div>

                    </div>

                    <div class="col-md-4">

                        <div class="form-floating">
                            <select name="categoryid" class="form-control" id="floatingCategory">
                                <option value="a" selected>당을 낮추는 식단</option>
                                <option value="b">저지방 식단</option>
                                <option value="c">기분이 좋아지는 식단</option>

                            </select>
                            <label for="floatingCategory">카테고리 </label>
                        </div>
                    </div>
                </div>
                <div class="empty-10"></div>

				<div class="row">
                    <div class="col-md-12" id="reasons_wrapper">
	                    <div style="display:inline-block;float:left">
	                    	<h3 class="h3 mb-3 fw-normal">추천 이유 </h3>
	                    </div>
	                    <div style="display:inline-block;float:left;margin-left:10px;">	
	                    	<button class="btn btn-primary" type="button" id="reason-add-btn">더 있어요!!</button>
						</div>
						<div style="clear:both"></div>
						
						<!-- 추천이유 1 -->
						<div class="form-floating reasons_wrapper" >
						 	
							<input type="text" name="reasonsVOList[0].reasons" id="reasons_1" class="form-control reasons" placeholder="추천이유를 적어주세요">
							<label for="reasons_1"> 추천 이유 1</label>
                        </div>
                        
                        <!-- 추천이유 2 -->
                        <div class="form-floating reasons_wrapper">
						 	
							<input type="text" name="reasonsVOList[1].reasons" id="reasons_2" class="form-control reasons"  placeholder="추천이유를 적어주세요">
							<label for="reasons_2"> 추천 이유 2</label>
                        </div>
                        
                        <!-- 추천이유 3 -->
                        <div class="form-floating reasons_wrapper">
						 	
							<input type="text" name="reasonsVOList[2].reasons" id="reasons_3" class="form-control reasons" placeholder="추천이유를 적어주세요">
							<label for="reasons_3"> 추천 이유 3</label>
                        </div>
                        <!-- 추천이유 4 -->
                        <div class="form-floating reasons_wrapper">
						 	
							<input type="text" name="reasonsVOList[3].reasons" id="reasons_4" class="form-control reasons" placeholder="추천이유를 적어주세요">
							<label for="reasons_4"> 추천 이유 4</label>
                        </div>
					</div>
                </div>
				<div class="empty-10"></div>



                <div class="row">
               	 <div class="col-md-12">
                    <div class="form-floating">
                        <input type="text" name="title" class="form-control" id="floatingTitle" placeholder="제목을 입력하세요">
                        <label for="floatingTitle">제목 </label>
                    </div>
                    </div> 
                </div>
                <div class="empty-10"></div>

                <div class="row">
                    <div id="markdown-editor" class="editormd">
                        <textarea style="display:none" name="contents">### 마크다운 에디 사용법

- 마크다운 언어로 좌측창에 내용을 작성하시면, 우측창에 변환되어 표시됩니다.
</textarea>
                    </div>
                </div>
                <div class="empty-10"></div>
				
				
                <div class="row">
                    <div class="col-md-12">
                        <label for="formFileMultiple" class="form-label">이미지 첨부</label>
                        <input type="hidden" name="imageurl">
                        <input class="form-control" multiple="multiple"  name="file" type="file" id="formFileMultiple" multiple>
                    </div>
                </div>
                <div class="empty-10"></div>
                <div class="row" >
                <div class="col-md-5">
                </div>
                    <div class="col-md-2">
                        <button class="w-100 btn btn-lg btn-primary" type="submit" id="CookingShow-submit">등록하기</button>
                        <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
                    </div>
                    <div class="col-md-5">
                    </div>
                </div>
            </form>
        </div>


    </div>

</main>


<jsp:include page="./footer.jsp"></jsp:include>