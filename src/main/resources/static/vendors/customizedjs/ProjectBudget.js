
var table = $('#BudgetTable').DataTable();
var tableCost = $('#CostTable').DataTable();


$(document).ready(function() {
	//alert();
		var sitec;
		 $("#SiteCode").change(function(){
			
			var selectedsitecode=$("#SiteCode option:selected").val();

			sitec={siteCodeId:selectedsitecode};
			 console.log(sitec);
			 $.ajax({
				 type:"POST",
				 url:"ProjBudget_ajax",
				 cache:false,
				 dataType:"json",
				 data:JSON.stringify(sitec),
				 contentType:'application/json',
				 success:function(data){
				   var expence=[];
				   expence.push(data.projBud);
				 	console.log(data);
				 	expencesTable(expence);
				 	
				 	 var cost=[];
					 cost.push(data.actCost);
					console.log(cost);
					 costTable(cost);
				 	
				 },
			 	error : function(xhr, error) {	
	     		//alert(error);
	     		        		
	     	},			
			 });
			 
		 });
	
	function expencesTable(expence) { 
		//alert();
		var total;
		  //alert(expence[0].siteCode);
		  var tot=expence[0].siteSurveyBudget+expence[0].civilBudget+expence[0].electricalBudget+expence[0].instalationBudget+expence[0].performanceBudget+expence[0].handovereBudget;
		  //var tott=expence[0].siteSurveyActualCost+expence[0].civilActualCost+expence[0].electricalActualCost+expence[0].instalationActualCost+expence[0].performanceActualCost+expence[0].handovereActualCost;
		  expence[0].total=tot;
		 // expence[0].totalActualCost=tott;
		 console.log(expence);
		
		  if(table){
			table.destroy();
		}
		 table = $('#BudgetTable').DataTable({
			    data:expence,
			    "columns": [
			  	
			    {"data": "sitecode"},
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
	
	function costTable(cost) { 
		alert();

		
		  if(tableCost){
			  tableCost.destroy();
		}
		tableCost = $('#CostTable').DataTable({
			    data:cost,
			    "columns": [
			    	
			    {"data": "sitecode"},
			    {"data": "siteSurveyActualCost"},
			    {"data": "civilActualCost"},
			    {"data": "electricalActualCost"},
			    {"data": "instalationActualCost"},
			    {"data": "performanceActualCost"},
			    {"data": "handovereActualCost"},
			   
			    
			   
			 ],	
			 dom: 'Bfrtip',
				buttons: [
		             'excel', 'pdf'
		             
		        ]
		});
	}
});

