 $(document).ready(function () {
	//alert("왔다");
	//alert($("#sectionId").val());
	if ( $("#sectionId").val() != null) {
		//alert($("#sectionId").val());
		location.href="#"+$("#sectionId").val();
	} else {
		location.href="#page-top";
	}
	//초기 세팅 :: 로그인이 필요한 항목 숨기기
	//$("#after_login").hide();
	//$("#after_login_book").hide();

     function validateEmail(email) {
         var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
         return re.test(email);
     }



     var penclickink = document.getElementById("penclickink");
     var stampselfinking = document.getElementById("stampselfinking");

     $("#btn-wrapper").mouseenter(function () {
         penclickink.play();
     });


      $("#btn-wrapper").click(function () {

         if ($("#mailTitle").val() == null || $("#mailTitle").val() == "") {
             $("#mailTitle").tooltip();
             $("#mailTitle").focus();
             return false;
         }
         
         if ($("#mailName").val() == null || $("#mailName").val() == "") {
             $("#mailName").tooltip();
             $("#mailName").focus();
             return false;
         }
         
         if ($("#mailEmail").val() == null || $("#mailEmail").val() == "") {
             $("#mailEmail").tooltip();
             $("#mailEmail").focus();
             return false;
         }
         
         if ( validateEmail (($("#mailEmail").val()) == false ) ){
			   $("#mailEmail").tooltip();
		             $("#mailEmail").focus();
		             return false;
			}
         
         if ($("#mailContent").val() == null || $("#mailContent").val() == "") {
             $("#mailContent").tooltip();
             $("#mailContent").focus();
             return false;
         }


		$.ajax({
		      type: "post",
		      dataType: "text",
		      data: $("#note_form").serialize(),
		      url: "./Mail",
		      success: function (data) {
		          alert(data);
		           stampselfinking.play();

		      },
		     
		     error: function () {
		         alert("오류가발생했습니다. ");
		          return false;
		     }
		
		 }); // $.ajax({

     }); // $("#btn-signin"").
  
     
     
     
      $("#btn-signin").click(function () {

         if ($("#userId").val() == null || $("#userId").val() == "") {
             $("#userId").tooltip();
             $("#userId").focus();
             return false;
         }
         
         if ($("#userPassword").val() == null || $("#userPassword").val() == "") {
             $("#userPassword").tooltip();
             $("#userPassword").focus();
             return false;
         }

		//편지지 내용을 유지하기 위해 히든으로 값을저장 
		$("#sMailTitle").val($("#mailTitle").val());
		$("#sMailName").val($("#mailName").val());
		$("#sMailEmail").val($("#mailEmail").val());
		$("#sMailContent").val($("#mailContent").val());
		//alert($("#sMailContent").val());
		//alert($("#mailContent").val());
		
		$("#signin_form").submit();
		

     }); // $("#btn-signin"").
     
     
     
     
      $("#btn-distanceCalc").click(function () {


         if ($("#sourceAddr").val() == null || $("#sourceAddr").val() == "") {
             $("#sourceAddr").tooltip();

             $("#sourceAddr").focus();
             return false;
         }
         if ($("#destinationAddr").val() == null || $("#destinationAddr").val() == "") {
             $("#destinationAddr").tooltip();

             $("#destinationAddr").focus();
             return false;
         }
        var sourceAddrEnd = $("#sourceAddr").val().indexOf("(") == -1 ? $("#sourceAddr").val().length : $("#sourceAddr").val().indexOf("(") ;
		var sourceAddr = $("#sourceAddr").val().substr(0, sourceAddrEnd);
		
		var destinationAddrEnd = $("#destinationAddr").val().indexOf("(") == -1 ? $("#destinationAddr").val().lengh : $("#destinationAddr").val().indexOf("(") ;
		var destinationAddr = $("#destinationAddr").val().substr(0, destinationAddrEnd);
		 
		 //alert(sourceAddr);
		 //alert(destinationAddr);
         $.ajax({

             type: "post",
             dataType: "json",
             data: {"sourceAddr" :sourceAddr , "destinationAddr" : destinationAddr },
             url: "./Distance",
             success: function (data) {
                 $("#distanceCalc").val(   String(parseFloat(data).toFixed(2)+" km") );
                 //alert("전송되었습니다. " + data);
             },
             error: function () {
                 alert("오류가발생했습니다. ");
             }

         }); // $.ajax({

     }); //  $(".btn-distanceCalc")


	//회원가입
	$("#btn-signup").click(function() {
		//alert("홨");
		if ( $('#chkNotice').text().indexOf("일치함") == -1) {
			$('#newloatingPassword').val(null);
			$('#newfloatingPasswordConfirm').val(null);
			alert("비밀번호가 일치하지 않습니다!");
			return false;
		}	
		  if ( validateEmail ($("#newfloatingInputEmail").val()) == false ) {
			   	$("#newfloatingInputEmail").tooltip();
		        $("#newfloatingInputEmail").focus();
		        alert("이메일이 형식에 맞지 않습니다!");
		         return false;
			}
         
         if ( $('#invalidCheck3').is(":checked") == false) {
			 $("#invalidCheck3").tooltip();
             $("#invalidCheck3").focus();
			alert("약관에 동의해 주셔야합니다.!");
		   return false;
		}
		
			$("#signup-form").submit();	
		
	}); //$("#btn-signup")
	
	

   	$(function(){
   	    $('#newfloatingPassword').keyup(function(){
   	      $('#chkNotice').html('');
   	    });

   	    $('#newfloatingPasswordConfirm').keyup(function(){

   	        if($('#newfloatingPassword').val() != $('#newfloatingPasswordConfirm').val()){
   	          $('#chkNotice').html('비밀번호 일치하지 않음<br><br>');
   	          $('#chkNotice').attr('color', '#f82a2aa3');
   	        } else{
   	          $('#chkNotice').html('비밀번호 일치함<br><br>');
   	          $('#chkNotice').attr('color', '#199894b3');
   	        }

   	    });
   	});



	//주소록 등록
	$("#btn-addAddress").click(function() {
		//alert("홨");

		 if ($("#addressName").val() == null || $("#addressName").val() == "") {
             $("#addressName").tooltip();

             $("#addressName").focus();
             return false;
         }
         if ($("#addressEmail").val() == null || $("#addressEmail").val() == "") {
             $("#addressEmail").tooltip();

             $("#addressEmail").focus();
             return false;
         }
         
       
         //submit
		$("#addAddress-form").submit();	
		
	}); //$("#btn-addAddress")
	
	
	
	//주소록 삭제
	$("#btn-addressDelete").click(function() {
		//alert("홨");
		
		var valueArr = new Array();  //체크된 주소를 담을 배열
		var list = $("input[name='RowCheck']	"); //  전체 주소록 목록
		
		for (var i=0; i < list.length; i++) {  // 전체 주소 중 체크된 주소만 배열에 저장
			if (list[i].checked) {  //체크 되어 있는지 검사
					var target = $("#addressId").val()+"#"+$("#address_rname_"+i).val()+"#"+$("#address_remail_"+i).val();
					valueArr.push(target); 
					//alert(target);
			}
		}
		
		if (valueArr.length == 0) {
			alert("선택된 주소가 없습니다.");
		} else {
			var chk = confirm("정말 삭제하시겠습니까?	");
			//alert(valueArr[0]);
			$.ajax({
					type:'POST',
					url:'./DeleteAddress',
					traditional:true,
					data: { "valueArr" : valueArr},
					success : function(jdata){
						if(jdata=1) {
							alert("삭제성공");
							location.reload();  // 페이지 새로고침
						} else {
							alert("삭제실패");
						} // if	
						
					} //success

			}); //ajax
			
			
			
		}

	
		
	}); //$("#btn-addressDelete")
	
	
	

 }); // $(document).
 
  function setEmailValues(name, email) {
	  // alert(name);
		$("#mailName").val(name);
		$("#mailEmail").val(email);
		location.href="#page-top";
	};
