/**
 * 
 */
$(document).ready(function() {
	 
	 $("#btnraise").on("click",function(){
    
				 saveBill();
			 });
	 
	 function saveBill()
	 {
		 var bill= [];
		 $('#risebill tr').each(
				 
	               function () {
	                   var row = $(this);
	                  
	                
	                   var values={};
	                   if (row.find('input[type="checkbox"]').is(':checked')) {
	                	  
	                       /*var id = row.find('[name="assignChkBx"]').attr("value");
	                       var spantext = row.find('[name="testing123"]').html();*/
	                	   $(this).find("input").each(function(){
	  						 
							   values[$(this).attr('id')] = $(this).val();
							  
							   
							   
						 });
	                	   bill.push(values);
	                	 	                	   
	                   }
	                

	               });
		 

         console.log(bill);
         
         
         
         
         /****AJAX*******/
     	$.ajax({
			type : "POST",
			url :"save_bill_ajax",
			cache : false,
			dataType : "json",
			data : JSON.stringify(bill),
			contentType : 'application/json',
			success : function(response) {
				
				$("#message").html(response).fadeOut(4000);
				window.setTimeout(function(){location.reload()},4500)
				
			},
			error : function(response) {
				$("#message").html(response).fadeOut(4000);
				window.setTimeout(function(){location.reload()},4500)
			}

		});

        
	 } 
	 
	/* function saveBill() {
		 var bill= [];
		 $("#risebill tbody tr input[type=checkbox]:checked").each(function ()
				 {
			
			 var row = $(this).closest("tr");
			 console.log(row);
			 var values = {};
	
			 $(this).closest("tr").find("td:eq(3)").each(function(){
				 alert("");
			 });
			 row.find("td:eq(3)").each(function(){
				 
				   values[$(this).attr('name')] = $(this).val();
				 alert("oo");
				 
			 });
				  		 $("#risebill input[type=checkbox]:checked").each(function () {
					 var values = {};
					 
					 values[$(this).attr('code')] = $(
								this).val();
					 values[$(this).attr('name')] = $(
								this).val();
					 
					 
					 values["siteCodeId"] = $(
								this).val();
					 var code= $(this).val();
					 var name=$(this).val();
					 alert(name);
					 alert(code);
					 
					 
					 $(this).find("input").each(function(){
						 
						   values[$(this).attr('name')] = $(this).val();
						  
					 });

					 bill.push(values);
					 console.log(bill);
				 });
				 $("#risebill tbody tr").each(function() {
					 var value = {};
					 $(this).find("input").each(function(){
						   value[$(this).attr('name')] = $(this).val();
						   alert(value);
						 });
				 });
			 bill.push(values);
			 console.log(bill);
		 });
	 
	 }*/
});