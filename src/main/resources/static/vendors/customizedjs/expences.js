var table = $('#expenceTable').DataTable();

$(document).ready(function() {
	var sitec;
	$("#sitecode").change(function(){
		var selectedsitecode=$("#sitecode option:selected").val();
		sitec={siteCodeId:selectedsitecode};
		console.log(sitec);
		$.ajax({
				 type:"POST",
				 url:"expences_report_ajax",
				 cache:false,
				 dataType:"json",
				 data:JSON.stringify(sitec),
				 contentType:'application/json',
				 success:function(data){
					 var expence=[];
					 expence.push(data);
				 	 console.log(expence);
				 	 expencesTable(expence);
				 },
			 	 error : function(xhr, error) {	
			 		alert(error);
			 	 },			
		});
	});
	
	function expencesTable(expence) { 
		var tot=expence[0].siteSurveyBudget+expence[0].civilBudget+expence[0].electricalBudget+expence[0].instalationBudget+expence[0].performanceBudget+expence[0].handovereBudget;
		expence[0].total=tot;
		console.log(expence);
		if(table){
			table.destroy();
		}
		table = $('#expenceTable').DataTable({
			data:expence,
			"columns": [
				{"data": "siteCode"},
			    {"data": "siteSurveyBudget"},
			    {"data": "civilBudget"},
			    {"data": "electricalBudget"},
			    {"data": "instalationBudget"},
			    {"data": "performanceBudget"},
			    {"data": "handovereBudget"},
			    {"data":  "total"},
			],	
			dom: 'Bfrtip',
			buttons: [
				'excel', 'pdf'
		    ]
		});
	}
});

