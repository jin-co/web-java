<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--  header -->
<jsp:include page="./include/header.jsp" />
<!--  header -->
<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/masonry/">
<script async src="https://cdn.jsdelivr.net/npm/masonry-layout@4.2.2/dist/masonry.pkgd.min.js" integrity="sha384-GNFwBvfVxBkLMJpYMOABq3c+d3KnQxudP/mGPkzpZSTYykLBNsZEnG2D9G/X/+7D" crossorigin="anonymous"></script>
<script type="text/javascript">
    $(document).ready(function() {


        //등록
        $("#btn-addYoutube").click(function() {
            //alert("홨");

            if ($("#youtubeTitle").val() == null || $("#youtubeTitle").val() == "") {
                $("#youtubeTitle").tooltip();

                $("#youtubeTitle").focus();
                return false;
            }
            if ($("#youtubeURL").val() == null || $("#youtubeURL").val() == "") {
                $("#youtubeURL").tooltip();

                $("#youtubeURL").focus();
                return false;
            }


            //submit
            $("#youtube-form").submit();

        }); //$("#btn")




    }); //document


    function showYoutube(title, key) {


        var myModal = new bootstrap.Modal(document.getElementById("playerModal"));
        $("#playerModalLabel").text(title);
        $("#player-content").html("<iframe width='100%' height='515' src='https://www.youtube.com/embed/"+key+"' frameborder='0' allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope;' allowfullscreen></iframe>");

        myModal.show();

    };

    
    function removePlayer() {
    	 $("#player-content").html("");
    };
</script>

</head>

<body>

    <!--  navigation -->
    <jsp:include page="./include/navigation.jsp" />
    <!--  navigation -->



    <main class="container py-5">
        <h1>웃긴 영상</h1>
        <!-- 	추가하기 버튼 -->
        <div style="height:40px;line-height:40px;margin-botton:40px;">&nbsp;</div>
        <div class="row align-items-center">


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
                        <h5 class="modal-title" id="exampleModalLabel">웃긴 동영상</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <h1 class="h1 mb-3 fw-normal">동영상 등록하기</h1>
						 <div class="row align-items-center">
						 	<img src="./images/youtube_add.png" style="width:300px;margin:0 auto;">
						</div>


                        <form id="youtube-form" method="post" action="./addYoutube">
                            <div class="row align-items-center">
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="text" name="title" class="form-control" id="youtubeTitle" title="제목을 입력해주세요" required>
                                        <label for="youtubeTitle">제목</label>
                                    </div>
                                </div>
                            </div>
                            <br>
                            <div class="row align-items-center">
                                <div class="col-12">
                                    <div class="form-floating">
                                        <input type="text" name="url" class="form-control" id="youtubeURL" title="URL을 입력해주세요" required>
                                        <label for="youtubeURL">URL</label>
                                    </div>
                                </div>
                            </div>
                        </form>

                        <div style="margin-top:20px;"></div>

                        <button class="w-100 btn btn-lg btn-secondary" id="btn-addYoutube" type="button">등록하기</button>


                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">닫기</button>
                        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
                    </div>
                </div>
            </div>
        </div><!-- modal -->
        <hr class="my-5">

  <!-- 동영상 Modal -->
            <div class="modal fade " id="playerModal" tabindex="-999" aria-labelledby="playerModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="playerModalLabel">title</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">

                            <div class="row align-items-center">
                                <div class="col-12">
                                    <div class="form-floating">
                                        <div id="player-content"></div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-bs-dismiss="modal" onclick="javascript:removePlayer();">닫기</button>
                        </div>
                    </div>
                </div>
            </div><!-- 동영상 modal 끝 -->

        <div class="row" data-masonry='{"percentPosition": true }'>

            <!-- 동영상 카드  -->
            <c:forEach items="${ytList}" var="list">
                <div class="col-sm-6 col-lg-4 mb-4">

                    <div class="card" onclick="javascript:showYoutube('${list.title}', '${list.key}');">
                        <img src="https://img.youtube.com/vi/${list.key}/mqdefault.jpg" width="100%" height="200px">

                        <div class="card-body">
                            <h5 class="card-title">${list.title}</h5>
                        </div>
                    </div>

                </div>
            </c:forEach>
            <!-- 동영상 카드 끝 -->

          

            <nav aria-label="...">
                <ul class="pagination">
                    <li class="page-item disabled">
                        <span class="page-link">Previous</span>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item active" aria-current="page">
                        <span class="page-link">2</span>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#">Next</a>
                    </li>
                </ul>
            </nav>

        </div>

    </main>

    <!--  main  end-->


    <!--  footer -->
    <jsp:include page="./include/footer.jsp" />
    <!--  footer -->
