/**
 * @priyanka
 */
$(document).ready(function(){

	var selectedconsignmentIdVal;
		var selectedproviderId;

		selectOption();
	$("#Save").click(function(){
		
		assignLogistics();
	});
	
	assignLogistics();

});
function assignLogistics()
{
	
	var a;
	      a={consignmentId: selectedconsignmentIdVal};
	      var b= {providerId : selectedproviderId};
	      
	

	var reqData = {
			
			consingementTrackC2P:a,
			proPersonalDtls:b,
			vechileNo : $("#VechileNo").val(),
			lRNo : $("#LRNo").val(),
			wayBillNo : $("#E-WayBillNo").val(),
			expectedArrival : $("#ExpectedArrival").val(),
			
	}
	
$.ajax({
type:"POST",
url:"assign_logistics_ajax",
cache:false,
dataType:"json",
data:JSON.stringify(reqData),
contentType:'application/json',
success:function(response){
	
	$("#message").html(response).fadeOut("3000");
	$('#message').css('color','green');
	 window.setTimeout(function(){location.reload()},4000)

}
	
});
	}

function selectOption()
{
	
 $("#select").change(function(){
		 
		
		var selected=$("#select option:selected").text();
		
		  selectedconsignmentIdVal=$("#select option:selected").val();
		
		
	 });
	 $("#myselect").change(function(){
		 var selectedproviderName=$("#myselect option:selected").text();
		
		  selectedproviderId=$("#myselect option:selected").val();
		
	 });
	}


