var table = $('#dataTablestatus').DataTable();
var tablestatus = $('#dataTabledisplaystatus').DataTable();

$(document).ready(function () {
	recruitmentstatus();
	displaystatus();		
	});
    	


function recruitmentstatus() {

	table = $('#dataTablestatus').DataTable({
	"sAjaxSource" : "getuserList",
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
			  
		      { "mData": "name"},
		      
		      { "mData": "email"},
		    
			
	],
			/*columnDefs: [
				{ "visible": false, "targets": 1 },
				
				{
		        	        targets: [5], render: function (a, b, data, d) {
		            
		            return "<button id='btnDelete'  class='btn btn-danger btn-xs dt-delete'>Delete</button>";
		        }},
		        {
		        	targets: [4], render: function (a, b, data, d) {
		        
		            
		            return "<a id='btnEdit' class='btn btn-primary btn-xs '>Edit</a>";
		        }
		    },
		    
		    
		    ],*/
			dom: 'Bfrtip',
			
			buttons: [
	             'excel', 'pdf'
	             
	        ]
	
	
		    /*buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            },
	            {
	                extend: 'pdfHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            }
	        ],
	    dom: 'Bfrtip',
	    buttons: [
            {
                extend: 'excelHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            },
            {
                extend: 'pdfHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            }
        ]
*/	});

}

function displaystatus() {
	/*alert("in");*/
	
	tablestatus = $('#dataTabledisplaystatus').DataTable({
	"sAjaxSource" : "getuserList",
		"sAjaxDataProp" : "",
		"order" : [ [ 0, "asc" ] ],
		"destroy" : true, 
		
		"columns": [
			
			  {"mData": "name"},
		      { "mData": "sentStatus"},
		      { "mData": "receivedStatus"},
		      
		   
			
	],
			
			dom: 'Bfrtip',
			
			buttons: [
	             'excel', 'pdf'
	             
	        ]
	
	
		    /*buttons: [
	            {
	                extend: 'excelHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            },
	            {
	                extend: 'pdfHtml5',
	                title: 'Leave History Report',
	                className : 'dt-right',
	            }
	        ],
	    dom: 'Bfrtip',
	    buttons: [
            {
                extend: 'excelHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            },
            {
                extend: 'pdfHtml5',
                title: 'Leave Report',
                exportOptions: {
                	columns: ':not(:last-child)',
                	}
            }
        ]
*/	});

}

