var table = $('#dataTableHoliday').DataTable();

$(document).ready(function () {
	employeeHolidayList();
	
	$('#btnSave').click(function (e) {
	employeeHolidaySave();
	});
	
	var i = 0;
    $('#add').click(function() {
    	alert("enter");
					i++;
					$('#field').append('<tr id="row' + i + '"><td><input type="date"   name="[' + i + '][holiday_date]" id="datepicker-only-init"  class="form-control" /></td> <td><input type="text" id="holidayDay" '+ i +'" name="[' + i + '][holiday_day]"   class="form-control " /></td> <td><input type="text" id="holidayEvent" ' + i +'" name="[' + i + '][holiday_events]"   class="form-control " /></td> <td> <button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
								}); 
    $(document).on('click', '.btn_remove', function() {
		var button_id = $(this).attr("id");
		$('#row' + button_id + '').remove();
	});

function employeeHolidaySave() {
	
	
    	alert("enter");
    	
    var	data=JSON.stringify($('#holidayform').serializeJSON());
    console.log(data);
        //var employeeJSON = JSON.stringify(Employee);
        $.ajax({
            url: '/postholidaylist',
            method: 'POST',
            cache:false,
            data :data,
                   	/*{
            	holiday_date : $("#datepicker-only-init").val(),
        	    holiday_day : $("#holidayDay").val(),
        	    holiday_events : $("#holidayEvent").val(),
            }*/
            dataType:"json",
            contentType: "application/json; charset=utf-8",
            success: function () {
                alert('Saved successfully!');
                holidayList();
            },
            error: function (error) {
                alert(error);
            }
        })
        
    }

/*var File
$("#btnUpload").click(function (event) {
	alert("upload");
    //stop submit the form, we will post it manually.
   // event.preventDefault();

    uploadFile();

});
*/


function uploadFile() {
	alert("1");
	var ExcelToJSON = function() {

	      this.parseExcel = function(file) {
	        var reader = new FileReader();

	        reader.onload = function(e) {
	          var data = e.target.result;
	          var workbook = XLSX.read(data, {
	            type: 'binary'
	          });
	          workbook.SheetNames.forEach(function(sheetName) {
	            // Here is your object
	            var XL_row_object = XLSX.utils.sheet_to_row_object_array(workbook.Sheets[sheetName]);
	            var json_object = JSON.stringify(XL_row_object);
	            console.log(JSON.parse(json_object));
	            jQuery( '#xlx_json' ).val( json_object );
	          })
	        };

	        reader.onerror = function(ex) {
	          console.log(ex);
	        };

	        reader.readAsBinaryString(file);
	      };
	  };

	  function handleFileSelect(evt) {
	    
	    var files = evt.target.files; // FileList object
	    var xl2json = new ExcelToJSON();
	    xl2json.parseExcel(files[0]);
	  }

/*// Get form
	alert(1);
	var fd = new FormData(document.getElementById("holidayform"));
   // fd.append("label", "WEBUPLOAD");
    $.ajax({
      url: '/upload',
      type: "POST",
      data: fd,
      processData: false,  // tell jQuery not to process the data
      contentType: false   // tell jQuery not to set contentType
    })*/
	
//	alert(2);
	
//var form = $('#fileUploadForm')[0];
//var form=$('form')[0];
	//var formData = new FormData($("#holidayform"));
	//var form = document.getElementById('holidayform');
	//var formData = new FormData(form);
//var formData=new FormData(form);

//alert(form);
//var data = new FormData(form);
//var data = new FormData();
//alert(3);
//data.append("CustomField", "This is some extra data, testing");
//data.append("form", "This is some extra data, testing");
//alert(4);
//$("#btnUpload").prop("disabled", true);
/*$.ajax({
    url: '/upload',
    method: 'POST',
    cache:false,
   //data :formdata,
  //  enctype: 'multipart/form-data',
     dataType:"json",
    contentType: "application/json; charset=utf-8",
    success: function (data) {
    	
    	
    	alert("Success");
    	
    }
$.ajax({
    type: "POST",
    enctype: 'multipart/form-data',
    url: "/upload",
    data: formData,
    //http://api.jquery.com/jQuery.ajax/
    //https://developer.mozilla.org/en-US/docs/Web/API/FormData/Using_FormData_Objects
 //   processData: false, //prevent jQuery from automatically transforming the data into a query string
   // contentType: false,
    //cache: false,
   // timeout: 600000,
    success: function (data) {
    	alert("data");
      //  $("#result").text(data);
     //   console.log("SUCCESS : ", data);
     //   $("#btnUpload").prop("disabled", false);

    },
    error: function (e) {
alert("sssss")
       // $("#result").text(e.responseText);
      //  console.log("ERROR : ", e);
       //// $("#btnUpload" +
        	//	"").prop("disabled", false);

    }
});*/

//}
	

/* $('#btnSave').click(function (e) {
        	alert("enter");
        
        var	data=JSON.stringify($('#holidayform').serializeJSON());
        console.log(data);
            //var employeeJSON = JSON.stringify(Employee);
            $.ajax({
                url: '/postholidaylist',
                method: 'POST',
                cache:false,
                data :data,
                       	{
                	holiday_date : $("#datepicker-only-init").val(),
            	    holiday_day : $("#holidayDay").val(),
            	    holiday_events : $("#holidayEvent").val(),
                },
                dataType:"json",
                contentType: "application/json; charset=utf-8",
                success: function () {
                    alert('Saved successfully!');
                    holidayList();
                },
                error: function (error) {
                    alert(error);
                }
            })
            
        });*/
        
        function employeeHolidayList() {
        	alert("in");
        	 table = $('#dataTableHoliday').DataTable({
        	"sAjaxSource" : "/getemployeeholiday",
        		"sAjaxDataProp" : "",
        		"order" : [ [ 0, "asc" ] ],
        		"destroy" : true, 
        		
        		"columns": [
        			/*   
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
        				},*/
        			  {"mData": "holiday_date"},
        		      { "mData": "holiday_day"},
        		      { "mData": "holiday_events"},
        		      
        		      
        		      /*{ "mData": "leaveType"},
        		      { "mData": "noOfDays"},
        		      { "mData": "approvedBy"},*/
        			
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
        }
}); 
 