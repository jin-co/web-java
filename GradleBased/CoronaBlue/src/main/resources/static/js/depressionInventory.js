/**
 * 
 */
 
 
  $(document).ready(function() {
   		//alert("와따 ");
	        // 직접경비 금액 변경시 합계 자동 변경 
	        var elem_id

	        $("#estimation_form input[type=radio]").change(function() {

	            elem_id = $(this).attr("id");
	            if (elem_id.indexOf("option") != -1) {
		            var sum_value = 0;	
		            var cnt=0;
		            

		            $(".bdi_selector").each(function (i, e) {
		            	//alert("와따 ");
		            	//$("#selectBox option:selected").val();
		            	if ($(e).is(':checked')) {
							var cycle_num = isNaN(parseInt($(e).val())) ? 0 : parseInt($(e).val());
		                  		sum_value+=cycle_num;
		                  		cnt = cnt+1;
	                  		} 

		             });
		            //alert("와따" + sum_value);
		          
		            
		            $("#sum_bdi").val(sum_value);
		            if (cnt == ($("#estimation_form input[type=radio]").length/4) ) {
						showBdiResult(sum_value);
						}
					var progress = cnt/($("#estimation_form input[type=radio]").length/4)*100 ;
					$("#progressbar").width(progress+"%");
						
	            };

	            
	        });
   	 });     
   	 
    function showBdiResult(sum) {
	var result;
	if (sum >=0 && sum <= 9) {
		result = "우울하지 않은 상태"
	} else if (sum >=10 && sum <= 15) {
		result = "가벼운 우울 상태"
	} else if (sum >=16 && sum <= 23) {
	 	result = "중한 우울 상태"
	} else if (sum >=24 && sum <= 63) {
		result = "심한 우울 상태"
	}
	//alert(result);
	 var modal_title_success = "Beck Depression Inventory (BDI) "
     var modal_body_success = "점수의 범위<br>0~9점 : 우울하지 않은 상태<br>10~15점 : 가벼운 우울 상태<br>16~23점 : 중한 우울 상태<br>24~63점 : 심한 우울 상태<br><br>당신은 현재 " +result+"("+sum+")" + " 입니다."
	 $(".modal-title").html( modal_title_success );	
	 $(".modal-body").html( modal_body_success );
	var myModal = new bootstrap.Modal(document.getElementById("bdiModal"));
	myModal.show();
}