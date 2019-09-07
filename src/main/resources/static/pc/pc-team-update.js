var _tableAllTeams;
var _tableTeamMembers;
$(document).ready(function() {
	$.ajax({
		url : "/OSDMA/fetch-teams",
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
	if (_tableAllTeams) {
		_tableAllTeams.destroy();
		$('#pcTeamTable tbody').off('click');
	}
	_tableAllTeams = $('#pcTeamTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "teamName"
		}, {
			"data" : ""
		}],
		columnDefs: [{
            "targets": -1,
            "data": null,
            "orderable": false,
            "defaultContent": "<button type='button' class='btn btn-success mr-2 mb-2' data-toggle='modal' data-target='#teamMembersModal' onclick='getTeamMembers(this)'>View</button>"
        },
        {"className": "dt-center", "targets": "_all"}]
	});
}


var teamData;
function getTeamMembers(e) {
	var data = _tableAllTeams.row($(e).parents('tr')).data();
	console.log(data);
	teamData = {
    		"masterTeam" : {
    			"teamId" : data.teamId
    		}
    }
	getTeamMembersList(teamData);
    
}

function getTeamMembersList(teamData) {
	console.log(teamData);
    $.ajax({
		url : "fetch-team-members",
		data : JSON.stringify(teamData),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				type : 'error',
				title : '',
				text : 'Error in data fetch.',
				showConfirmButton : false,
				timer : 2500
			})
		},
		success : function(data) {
			console.log(data);
			$.each(data, function(index) {
				this.serialNo = index + 1;
				this.employeeName = this.employeePersonalDetails.firstName + ' ' + this.employeePersonalDetails.lastName;
			});
			setTeamMemberTableData(data);
			$("#teamMembersModal").modal();
			
		},
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
}


function setTeamMemberTableData(dataSet) {
	if (_tableTeamMembers) {
		_tableTeamMembers.destroy();
		$('#teamMembersTable tbody').off('click');
	}
	_tableTeamMembers = $('#teamMembersTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serialNo"
		}, {
			"data" : "employeeName"
		}, {
			"data" : "status"
		}, {
			"data" : ""
		}],
		columnDefs: [{
            "targets": -1,
            "data": null,
            "orderable": false,
            "render": function ( data, type, row, meta ) {
            	if(row.status == "ACCEPTED") {
            		return "";
            	} else {
            		return "<button type='button' class='btn btn-success mr-2 mb-2' onclick='getAvailableMembersList(this)' data-toggle='modal' data-target='#projectMemberModal'> Update </button>";
            	}
              }
        },
        {"className": "dt-center", "targets": "_all"}]
	});
	
	
}

var projectMembersOptions;
function getAvailableMembersList(e) {
	$("#assignmentId").val("");
	var data = _tableTeamMembers.row($(e).parents('tr')).data();
	
	console.log(data);
	$("#assignmentId").val(data.assignmentId);
	$("#currentEmployeeId").val(data.employeePersonalDetails.employeeId);
	
	console.log(teamData);
	$.ajax({
	      url: "fetch-members-for-team-update",
	      data : JSON.stringify(teamData),
	      error: function (e) {
	    	  alert("error in employee fetch");
	      },
	      success: function (data) {
	    	  console.log(data);
	    	  $.each(data, function (index) {
	    		  projectMembersOptions += '<option value="' + this.employeePersonalDetails.employeeId + '">' + this.employeePersonalDetails.firstName +' '+this.employeePersonalDetails.lastName + '</option>';
	          });
	    	  $(".employeeList").append(projectMembersOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "POST",
	      cache: false,
	      crossDomain: true
	  });
}


function updateTeamEmployee() {
	var assignmentId = $("#assignmentId").val();
	var selectedEmployeeId = $("#employeeId").val();
	
	if(assignmentId == null || assignmentId == "" || assignmentId == undefined) {
		return;
	}
	
	if(selectedEmployeeId == null || selectedEmployeeId == "" || selectedEmployeeId == undefined) {
		swal({
			position : 'top',
			type : 'error',
			title : '',
			text : 'Please select an employee.',
			showConfirmButton : false,
			timer : 2500
		})
		return;
	}
	
	var updateTeamMember = {
			"assignmentId" : assignmentId,
			"employeePersonalDetails" : {
				"employeeId" : $("#currentEmployeeId").val()
			},
			"masterTeam" : {
    			"teamId" : teamData.masterTeam.teamId
    		},
    		"updateEmployeeDetails" : {
    			"employeeId" : selectedEmployeeId
    		}
	}
	console.log(updateTeamMember);
	
	$.ajax({
		url : "update-team-member",
		data : JSON.stringify(updateTeamMember),
		error : function(e) {
			console.log(e)
			swal({
				position : 'top',
				type : 'error',
				title : '',
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
				title : '',
				text : 'Team updated successfully.',
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
	
}

