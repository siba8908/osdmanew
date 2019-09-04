/**
 * @priyanka
 * 7/19/2019
 */
$(document).ready(function(){

	var raiseRequest;
	var purpose;
	selectedOptionFunction();

	$('#accounManagerTable tbody').on('click',"#raiseRequest",function(){
		var purposeData=$('#purpose').val();
	if(purposeData=="")
			{
			$('#purposevalidation').html('**The purpose must be filled.')
			$('#purposevalidation').css('color','red');
			return false;
			}
	
	var obj = {};

	
  
	var purposeData1={purpose:purposeData};
		
		
		obj["pmFundRequest"]=purposeData1;
		
		
	
		raiseRequest=($(this).val());
		var billPro={billId:raiseRequest};
			//var billId={servProBill:billPro};
		
		obj["servProBill"]=billPro;
	
		 $.ajax({
			 type:"POST",
			 url:"raiseRequest_ajax",
			 cache:false,
			 dataType:"json",
			 //data:JSON.stringify(billId),
			 data:JSON.stringify(obj),
			 contentType:'application/json',
			 success:function(response){
			
			 
			$("#message").html(response).fadeOut(3000);
			 
			$('#message').css('color','green');
			 window.setTimeout(function(){location.reload()},4000)
			 	
			 },
			error : function(xhr, error) {	
				$("#message").html(response).fadeOut(3000);
				 
				$('#message').css('color','red');
				 window.setTimeout(function(){location.reload()},4000)
        		        		
        	},					
		 });
   
		
	});
});
function selectedOptionFunction()
{
	
	var serviceType;
	 $("#myselect").change(function(){
		
		
		var selectedproviderType=$("#myselect option:selected").val();

		
		serviceType={serviceProviderId:selectedproviderType};
		
		 $.ajax({
			 type:"POST",
			 url:"account_Manager_ajax",
			 cache:false,
			 dataType:"json",
			 data:JSON.stringify(serviceType),
			 contentType:'application/json',
			 success:function(response){
			 	
			 
			 	prepareTable(response);
			 	
			 }
//		 	error : function(xhr, error) {	
//     		alert(error);
//     		        		
//     	},			
		 });
		 
	 });
	
	
	}
	function prepareTable(response)
	{
		$.each(response,function(idx,ele){
			
			var newRowContent = "<tr><td value="+ele.proPersonalDtls.providerId+'>'
				+ele.proPersonalDtls.providerName
				+"</td><td>"
				+ele.servProBill.billNo
				+"</td><td>"
				+ele.servProBill.billDate
				+"</td><td>"
				+ele.siteCode.siteCode
				+"</td><td>"
				+ele.servProBill.billAmount								
				+"</td><td>"
				
				+"<button type='button' id='raiseRequest'   value="+ele.servProBill.billId+">"+"Raise Request"
				+"</button>"
				+"</td></tr>"
				$("#accounManagerTable tbody").append(newRowContent);
			
			
		});
		 
	}
	
	function saveSelectedRowData()
	{
		
		var billId={billId:raiseRequest};
	
		 $.ajax({
			 type:"POST",
			 url:"raiseRequest_ajax",
			 cache:false,
			 dataType:"json",
			 data:JSON.stringify({servProBill:billId}),
			 contentType:'application/json',
			 success:function(response){
			 
			 	
			 }
		 
		 });
	} 
			
			
	
		
	
	
	
	
	





