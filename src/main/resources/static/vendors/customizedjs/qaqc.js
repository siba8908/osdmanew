$(document).ready(function () {
	
		getitem();
		getComponent();
	
});
	function getitem(){
		var	table = $('#itemtable').DataTable({
	    	"sAjaxSource" : "getitemdtls",
	    	"method" : "GET",
	    		"sAjaxDataProp" : "",
	    		"order" : [ [ 0, "asc" ] ],
	    		"destroy" : true, 
	    		
	    		"columns": [
	    			   
	    			 {
	    					targets : 0,
	    					data : 'Checked',
	    					searchable : false,
	    					orderable : false,
	    					width : '1%',
	    					className : 'dt-center',
	    					render : function(data, type, full, meta) {
	    						if (data) {
	    							return '<input type="checkbox" checked>';
	    						} else {
	    							return '<input type="checkbox">';
	    						}
	    					}
	    				},
	    			  {"mData": "materialId"},
	    		      { "mData": "itemName"},
	    		      { "mData": "quantity"},
	    			
	    	],
	    			columnDefs: [
	    				{ "visible": false, "targets": 1 },
	    				
	    				{
	    		        	        targets: [4], render: function (a, b, data, d) {
	    		            
	    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>Verify</button>";
	    		        }},
	    		    
	    		    ],
	    			dom: 'Bfrtip',
	    			
	    			buttons: [
	    	             'excel', 'pdf'
	    	             
	    	        ]
	    	});
		
		/********************************Show modal***************************/
		
		
		$('#itemtable tbody ').on('click', '#btnEdit', function() {
	    	var data = table.row($(this).parents('tr')).data();
	    	var node = table.row($(this).parents('tr')).node();
	    	if ($(node).find('input').prop('checked')) {
	    		$('#materiald').val(data.materialId);
	    		$('#dashboardUpdateId').modal('show');
	    		$('#btnCancel').on('click',function()
	    		{
	    			
	    		data.canceledReason=$('#cancelReason').val();
	    	});						
	    	}

	    });
		
		/******************End Modal******************************/
		
		 $("#btnSubmit").click(function(){
			    	var data = {productCode: $('#productCode').val(),barcode: $('#barcode').val(),quality: $('#quality').val(),remarks: $('#remarks').val(),material_id: $('#materialId').val()};
			    	$.ajax({
			    		type : "POST",
			    		url : "/qaqc/saveItem_details",
			    		cache : false,
			    		data : JSON.stringify(data),
			    		contentType : 'application/json',
			    		success : function(response) 
			    		{
			    			console.log(response)
			                $("#message").html(response).fadeOut(4000);
			    			window.setTimeout(function(){location.reload()},4000)
			            },
			            error: function(data){
			                //console.log(data.responseJSON.message);
			            	$("#message").html(response).fadeOut(4000);
							 window.setTimeout(function(){location.reload()},4000)
			            					
			    		}

			    	});													


			    });
		
	}
	
	function getComponent(){
		//alert("hhhhh");
		var	table = $('#componenttable').DataTable({
	    	"sAjaxSource" : "getComponentdtls",
	    	"method" : "GET",
	    		"sAjaxDataProp" : "",
	    		"order" : [ [ 0, "asc" ] ],
	    		"destroy" : true, 
	    		
	    		"columns": [
	    			   
	    			 {
	    					targets : 0,
	    					data : 'Checked',
	    					searchable : false,
	    					orderable : false,
	    					width : '1%',
	    					className : 'dt-center',
	    					render : function(data, type, full, meta) {
	    						if (data) {
	    							return '<input type="checkbox" checked>';
	    						} else {
	    							return '<input type="checkbox">';
	    						}
	    					}
	    				},
	    			  {"mData": "materialCodeId"},
	    			  {"mData": "itemId"},
	    		      { "mData": "component.componentName"},
	    		      { "mData": "qaqcItem.productCode"},
	    	],
	    			columnDefs: [
	    				{ "visible": false, "targets": 1 },{ "visible": false, "targets": 2 },
	    				
	    				{
	    		        	        targets: [5], render: function (a, b, data, d) {
	    		            
	    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>Update</button>";
	    		        }},
	    		    
	    		    ],
	    			dom: 'Bfrtip',
	    			
	    			buttons: [
	    	             'excel', 'pdf'
	    	             
	    	        ]
	    	});
		
		$('#componenttable tbody ').on('click', '#btnEdit', function() {
	    	var data = table.row($(this).parents('tr')).data();
	    	var node = table.row($(this).parents('tr')).node();
	    	if ($(node).find('input').prop('checked')) {
	    		$('#materialCodeId').val(data.materialCodeId);
	    		$('#itemId').val(data.itemId);
	    		$('#productcodeedit').val(data.qaqcItem.productCode);
	    		$('#componentUpdate').modal('show');
	    		$('#btnCancel').on('click',function()
	    		{
	    			
	    		data.canceledReason=$('#cancelReason').val();
	    	});						
	    	}

	    });
		
		$("#btnSubmit").click(function(){
			//alert("bbbbbbbb");
	    	var data = {productCode: $('#productcodeedit').val(),item_id :$('#itemId').val()};
	    	$.ajax({
	    		type : "POST",
	    		url : "/qaqc/updateProduct",
	    		cache : false,
	    		/* dataType : "json", */
	    		data : JSON.stringify(data),
	    		contentType : 'application/json',
	    		success : function(response) 
	    		{
	    			getComponent();				
	    		}

	    	});													
	    });
		
	}
	
	
