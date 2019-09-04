
var table = $('#ledgerAccountTable').DataTable();

$(document).ready(function() {
	
	
	
		//alert("bibhu");
		var serviceType;
		 $("#myselect").change(function(){
			
			
			var selectedproviderType=$("#myselect option:selected").val();

			
			serviceType={serviceProviderId:selectedproviderType};
			 console.log(serviceType);
			 $.ajax({
				 type:"POST",
				 url:"ledger_report_ajax",
				 cache:false,
				 dataType:"json",
				 data:JSON.stringify(serviceType),
				 contentType:'application/json',
				 success:function(data){
				 	console.log(data);
				 
					 ledgerListTable(data);
				 	
				 },
			 	error : function(xhr, error) {	
	     		alert(error);
	     		        		
	     	},			
			 });
			 
		 });
	
	function ledgerListTable(data) { 
		if(table){
			table.destroy();
		}
		table = $('#ledgerAccountTable').DataTable({
			data:data,
			"columns": [
				{"mData": "pro.providerName"},
			    {"mData": "billDate"},
			    {"mData": "billAmount"},
			    {"mData": "paymentDate"},
			    {"mData": "paymentAmount"},
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});

