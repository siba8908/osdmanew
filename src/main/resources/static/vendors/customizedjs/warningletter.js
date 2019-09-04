/**
 * @priyanka
 */
$(document).ready(function() {
//	 alert("..ppppppppp.......");
	 var empcode;
	
	$("#Preview").click(function(){
		var array = [];
		empcode=$(".employeecode").val();
		 //alert(empcode);
	 $.each($("#all_checked_data input[type='checkbox']:checked"), function(){
		// alert(".ddddddddd........");
		 var obj = {};
		 obj["utilID"] = $(this).val();
		 alert($(this).val());
			array.push(obj);
	 });
	});
	//("#all_checked_data").input[type='checkbox']:checked
	
//	$("#sendmail").click(function(){
//		alert("lllllllll");
//	
//		$(".formdata").toggle();
//	});
//	
	$("#myModal #postmail").click(function(){
		//alert("post");
	});
	
});

function letterPreviewData() 
{
	
	 var $inputs = $('#letterData :input');
	 var values = {};
	    $inputs.each(function() {
	        values[this.name] = $(this).val();
	    });
	    //console.log(values);
	    $(".recipentname").html(values.recipentName+" ");
	    $(".employeecode").html(values.employeecode+" ");
	    $(".dow").html(" "+values.dow);
	    $(".supervisor").html(values.supervisor+" ");
	}
