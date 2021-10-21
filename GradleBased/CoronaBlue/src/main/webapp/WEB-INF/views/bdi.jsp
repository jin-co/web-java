<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!--  header -->
<jsp:include page="./include/header.jsp"/>
<!--  header -->

<link href="./css/depressionInventory.css" rel="stylesheet">
<script src="./js/depressionInventory.js"></script>

</head>
<body>

<!--  navigation -->
<jsp:include page="./include/navigation.jsp"/>
<!--  navigation -->
<div class="progress">
  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 75%"></div>
</div>
      
<!--  main  start-->
<div class="container">
<input type="hidden" id="sum_bdi">
<form id="estimation_form">
<table class="tg" >

                                    <thead>
                                        <tr>
                                            <th class="tg-1pky">구분</th>
                                            <!-- <th class="tg-2pky">번호</th> -->
                                            <th class="tg-3pky">문항</th>
                                            <!-- <th class="tg-4pky">점수</th> -->

                                        </tr>
                                    </thead>
                                    <tbody>

<c:forEach items="${diList}" var="list" varStatus="status">
		<c:set var="rowspanId" value="${list.answerNo % 4}" /> 
		<tr id="${list.bdiId}">

	    
		<c:choose>
			<c:when  test='${rowspanId eq "1"}'>
				<td  id="bdi_td_${list.bdiId}" class="tg-0mid" rowspan="4"><input type="text" class="form-control text-center" value="${list.bdiId}"></td>
			</c:when>
		</c:choose>
	
				<!-- <td class="tg-0mid"><input type="text" class="form-control text-center" value="${list.answerNo}"></td> -->
				<td class="tg-0left" style="text-align:left">
						<input type="radio" class="btn-check bdi_selector" name="options_${list.bdiId}" id="option_${list.bdiId}_${list.answerNo}" autocomplete="off" value="${list.point}">
						<label class="btn btn-outline-secondary" for="option_${list.bdiId}_${list.answerNo}">${list.answer}</label>
				</td>
				<!-- <td class="tg-0mid"><input type="text" class="form-control text-center" value="${list.point}"></td> -->
		</tr>

</c:forEach>

</table>
</form>
</div>
 <!--  main  end-->
<div class="progress">
 		<div class="progress-bar progress-bar-striped progress-bar-animated" id="progressbar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%"></div>
</div>
 
 <!-- modal -->
 
 <!-- Modal -->
<div class="modal fade" id="bdiModal" tabindex="-1" aria-labelledby="bdiModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-fullscreen-sm-down modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="bdiModalLabel">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
 
 <!-- modal end -->
<!--  footer -->
<jsp:include page="./include/footer.jsp"/>
<!--  footer -->