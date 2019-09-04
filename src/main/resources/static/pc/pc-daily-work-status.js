var _tableWorkStatus;
$(document).ready(function() {
	$.ajax({
		url : "/fetch-work-status",
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
	if (_tableWorkStatus) {
		_tableWorkStatus.destroy();
		$('#pcDailyWorkStatusTableTable tbody').off('click');
	}
	_tableWorkStatus = $('#pcDailyWorkStatusTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "pmTeamTaskMap.sitecode.siteCode"
		}, {
			"data" : "uploadByUser.name"
		}, {
			"data" : "pmTeamTaskMap.masterTask.taskName"
		}, {
			"data" : "workStatus"
		}, {
            "render": function (data, type, row, meta) {
                return "<img src = 'workImage' height='40px'>";
            }
        },{
			"data" : "remark"
		}, {
			"data" : ""
		}],
		columnDefs: [{
            "targets": -1,
            "data": null,
            "orderable": false,
            "defaultContent": "<button type='button' class='btn btn-success mr-2 mb-2' data-toggle='modal' data-target='#modal' onclick='getRowData(this)'> Add Remark </button>"
        },
        {"className": "dt-center", "targets": "_all"}]
	});
	
}


function getRowData(row) {
	$("#workStatusId").val("");
	var data = _tableWorkStatus.row($(row).parents('tr')).data();
	$("#workStatusId").val(data.workStatusId);
}

function updateRemark() {
	var workStatusId = $("#workStatusId").val();
	var remark = $("#remark").val();
	
	if(workStatusId == null || workStatusId == "" || workStatusId == undefined) {
		return;
	}
	
	if(remark == null || remark == "" || remark == undefined) {
		swal({
			position : 'top',
			type : 'error',
			text : 'Please add remark.',
			showConfirmButton : false,
			timer : 2500
		})
		return;
	}
	
	
	var data = {
			"workStatusId" : workStatusId,
			"remark" : remark
	}
	
	
	$.ajax({
		url : "update-remark-in-daily-work-status",
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
		type : "PUT",
		cache : false,
		crossDomain : true
	});
	
	
}

