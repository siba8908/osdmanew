
$(document).ready(function () {
	
    {
    	updateTrackTable();
    	viewconsigTable();
    }

    /*************Update consinment Details**************/

    function updateTrackTable() {	
    var	table = $('#updateTrackTable').DataTable({
    	"sAjaxSource" : "gettrackdtls",
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
    			  {"mData": "consignment_id"},
    		      { "mData": "consingement_no"},
    		      { "mData": "airwaybill_no"},
    		      { "mData": "status"},
    		      { "mData": "exp_arrival_date"},
    		      { "mData": "act_arrival_date"},
    		      { "mData": "updated_on"},		      
    			
    	],
    			columnDefs: [
    				{ "visible": false, "targets": 1 },
    				{
    		            targets: [8], render: function (a, b, data, d) {
    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>Update</button>";
    		        }},
    		    ],
    			dom: 'Bfrtip',
    			
    			buttons: [
    	             'excel', 'pdf'
    	             
    	        ]
    	});

    ///Edit Track material

    $('#updateTrackTable tbody ').on('click', '#btnEdit', function() {

    	var data = table.row($(this).parents('tr')).data();
    	//var data = table.row(this).data();
    	var node = table.row($(this).parents('tr')).node();
    	//var selectStatus = $('#statusedit').node("option:selected").val(data.status);
    	if ($(node).find('input').prop('checked')) {
    		$('#consignment_id').val(data.consignment_id);
    		$('#consignmentNoedit').val(data.consingement_no);
    		$('#arwaybilledit').val(data.airwaybill_no);
    		var selectStatus = data.status;
    		//alert(selectStatus);
    		var sel = document.getElementById('statusedit');
    		  var opts = statusedit.options;
    		  for (var opt, j = 0; opt = opts[j]; j++) {
    		    if (opt.value == selectStatus) {
    		      sel.selectedIndex = j;
    		      break;
    		    }
    		  }
    		$("#statusedit option[value=selectStatus]").prop('selected', true);
    		$('#expectedDateedit').val(data.exp_arrival_date);
    		$('#actualDateedit').val(data.act_arrival_date);
    		$('#updateonedit').val(data.updated_on);
    		$('#trackEditId').modal('show');
    		
    		$('#btnCancel').on('click',function()
    		{
    			
    		data.canceledReason=$('#cancelReason').val();
    		$.ajax({
    			type : "POST",
    			url : "/employeeLeaveCancel_ajax",
    			cache : false,
    			/* dataType : "json", */
    			data : JSON.stringify(data),
    			contentType : 'application/json',
    			success : function(response) 
    			{

    				leaveStatusTable();				
    			}
    		});
    		
    	});						
    	}

    });
    ///Update track material

    $("#btnUpdate").click(function(){
    	var data = {consingement_no: $('#consignmentNoedit').val(),airwaybill_no: $('#consignmentNoedit').val(),status: $('#statusedit').val(),exp_arrival_date: $('#expectedDateedit').val(),act_arrival_date: $('#actualDateedit').val(),updated_on: $('#updateonedit').val(),consignment_id :$('#consignment_id').val()};
    	$.ajax({
    		type : "POST",
    		url : "updateTrack",
    		cache : false,
    		/* dataType : "json", */
    		data : JSON.stringify(data),
    		contentType : 'application/json',
    		success : function(response) 
    		{
    			updateTrackTable();					
    		}

    	});													
    });


    }
    /****************************Start********View consignment details*************************/

    function viewconsigTable() {	
    	var	table = $('#viewconsigTable').DataTable({
    	"sAjaxSource" : "viewconsignmentdetails",
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
    			  {"mData": "consignment_id"},
    		      { "mData": "consingement_no"},

    	],
    			columnDefs: [
    				{ "visible": false, "targets": 1 },
    				
    				{
    		        	        targets: [3], render: function (a, b, data, d) {
    		            
    		            return "<button id='btnEdit' class='btn btn-primary btn-xs '>View Details</button>";
    		        }},
    		    
    		    ],
    			dom: 'Bfrtip',
    			
    			buttons: [
    	             'excel', 'pdf'
    	             
    	        ]
    	});
    ///show consignment details in modal

    $('#viewconsigTable tbody ').on('click', '#btnEdit', function() {

    	var data = table.row($(this).parents('tr')).data();
    	//var data = table.row(this).data();
    	var node = table.row($(this).parents('tr')).node();
    	//var selectStatus = $('#statusedit').node("option:selected").val(data.status);
    	if ($(node).find('input').prop('checked')) {
    		$('#consignment_id').val(data.consignment_id);
    		$('#consignmentNoedit').val(data.consingement_no);
    		$('#arwaybilledit').val(data.airwaybill_no);
    		$('#statusedit').val(data.status);
    		$('#expectedDateedit').val(data.exp_arrival_date);
    		$('#actualDateedit').val(data.act_arrival_date);
    		$('#updateonedit').val(data.updated_on);
    		$('#viewconsignmentId').modal('show');
    		
    		$('#btnCancel').on('click',function()
    		{
    			
    		data.canceledReason=$('#cancelReason').val();
    		$.ajax({
    			type : "POST",
    			url : "/employeeLeaveCancel_ajax",
    			cache : false,
    			/* dataType : "json", */
    			data : JSON.stringify(data),
    			contentType : 'application/json',
    			success : function(response) 
    			{

    				leaveStatusTable();				
    			}
    		});	
    		
    		});
    	}

    });
    }

});