var _tableFundRequisition;
$(document).ready(function() {
	$.ajax({
		url : "fetch-fund-request-for-requisition",
		error : function(e) {
		},
		success : function(data) {
			console.log(data);
			$.each(data, function(index) {
				this.serialNo = index + 1;
			});
			setTableData(data);
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
});
function setTableData(dataSet) {
	if (_tableFundRequisition) {
		_tableFundRequisition.destroy();
		$('#pcFundRequisitionTable tbody').off('click');
	}
	_tableFundRequisition = $('#pcFundRequisitionTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "sitecode.siteCode"
		}, {
			"data" : "masterWorkStage.stageName"
		}, {
			"data" : "approvedAmount"
		}, {
            data: "files",
            defaultContent: "<input type='file' name='img[]' class='file' id='fileImage'>"
        },/* {
            data: "files",
            defaultContent: "<img class='image_preview' height='40px' id='image_preview' src='components/dummy-assets/common/img/noimage.png'>"
        },*/ {
			"data" : ""
		}],
		columnDefs: [{
            "targets": -1,
            "data": null,
            "orderable": false,
            "defaultContent": "<button type='button' class='btn btn-info mr-2 mb-2' id='submit'>Submit</button><button type='button' class='btn btn-danger mr-2 mb-2'>Cancel</button>"
        },
        {"className": "dt-center", "targets": "_all"}]
	});
	
	
	$('#pcFundRequisitionTable tbody').on('change', '.file', function (e) {
        e.stopPropagation();
        var currRow = _tableFundRequisition.row($(this).parents('tr'));
        var data = _tableFundRequisition.row($(this).parents('tr')).data();
        
        if (e.currentTarget.files && e.currentTarget.files[0]) {
            if (e.currentTarget.files[0].size > 1024000) {
                alert("File Size limit exeeds!!");
                return;
            }
        }
        var file = e.currentTarget.files[0];
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function (e) {
        	data.bill = e.target.result;
        }
        console.log(data);
    });
	
	$('#pcFundRequisitionTable tbody').on('click', '#submit', function (e) {
        e.stopPropagation();
        var currRow = _tableFundRequisition.row($(this).parents('tr'));
        var data = _tableFundRequisition.row($(this).parents('tr')).data();
        
        console.log(data);
        
        
        $.ajax({
    		url : "save-pm-fund-request",
    		data : JSON.stringify(data),
    		error : function(e) {
    			console.log(e)
    			swal({
    				position : 'top',
    				type : 'error',
    				text : 'Error in submit.',
    				showConfirmButton : false,
    				timer : 2500
    			})
    		},
    		success : function(data) {
    			console.log(data);
    			swal({
    				position : 'top',
    				type : 'success',
    				text : 'Submitted successfully.',
    				showConfirmButton : false,
    				timer : 2500
    			})
    			window.setTimeout(function(){
    				window.location.reload();
    		    }, 2500);
    		},
    		dataType : "json",
    		contentType : 'application/json; charset=utf-8',
    		type : "POST",
    		cache : false,
    		crossDomain : true
    	});
        
        
        
    });
}

