<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--  header -->
<jsp:include page="/WEB-INF/views/include/header.jsp"/>
<!--  header -->

<!--  script/css here  start-->
<style>
.mapMarker{
  	padding: 10px;
    line-height: 1.2;
	color:black;
	font-size:0.8em;
	justify-content: center;
	overflow:hidden; 
	text-overflow:ellipsis; 
	white-space:nowrap; 
	word-wrap:break-word; 
	word-break:break-all;
}

</style>
<!--  script/css here  end-->
</head>
<body>
    
<!--  navigation -->
<jsp:include page="/WEB-INF/views/include/navigation.jsp"/>
<!--  navigation -->

      
<!--  main  start-->
<div id="fullpage" class="fullpage-default">

           <div class="section animated-row" data-section="slide01">
                <div class="section-inner">
                    <div class="welcome-box">
                       

						<div id="map" style="width:100%;height:800px"></div>
                       
                    </div>
                </div>
            </div>


<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=ab8db4dc71897940e7bd85b0c7abec39"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(36.450701, 128.570667), // 지도의 중심좌표
        level: 12 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
 
// 마커를 표시할 위치와 내용을 가지고 있는 객체 배열입니다 
var positions = [
   
    	<c:forEach var="list" items="${posList}" varStatus="status">
    	 {
       		content: "<div class='mapMarker' >"+"${list.comments}"+"</div>", 
        	latlng: new kakao.maps.LatLng("${list.posx}","${list.posy}")
    	 },	
        </c:forEach>
   
    {
        content: '<div>근린공원</div>',
        latlng: new kakao.maps.LatLng(33.451393, 126.570738)
    }
];

for (var i = 0; i < positions.length; i ++) {
    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        map: map, // 마커를 표시할 지도
        position: positions[i].latlng // 마커의 위치
    });

    // 마커에 표시할 인포윈도우를 생성합니다 
    var infowindow = new kakao.maps.InfoWindow({
        content: positions[i].content // 인포윈도우에 표시할 내용
    });

    // 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
    // 이벤트 리스너로는 클로저를 만들어 등록합니다 
    // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
}

// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };
}

// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
function makeOutListener(infowindow) {
    return function() {
        infowindow.close();
    };
}

/* 아래와 같이도 할 수 있습니다 */
/*
for (var i = 0; i < positions.length; i ++) {
    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        map: map, // 마커를 표시할 지도
        position: positions[i].latlng // 마커의 위치
    });

    // 마커에 표시할 인포윈도우를 생성합니다 
    var infowindow = new kakao.maps.InfoWindow({
        content: positions[i].content // 인포윈도우에 표시할 내용
    });

    // 마커에 이벤트를 등록하는 함수 만들고 즉시 호출하여 클로저를 만듭니다
    // 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
    (function(marker, infowindow) {
        // 마커에 mouseover 이벤트를 등록하고 마우스 오버 시 인포윈도우를 표시합니다 
        kakao.maps.event.addListener(marker, 'mouseover', function() {
            infowindow.open(map, marker);
        });

        // 마커에 mouseout 이벤트를 등록하고 마우스 아웃 시 인포윈도우를 닫습니다
        kakao.maps.event.addListener(marker, 'mouseout', function() {
            infowindow.close();
        });
    })(marker, infowindow);
}
*/
</script>
    

</div> <!--  main  end-->
        
<!--  footer -->
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>
<!--  footer -->