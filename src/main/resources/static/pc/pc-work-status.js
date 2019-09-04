var _tableWorkStatus;
var table_columns = [];
$(document).ready(function() {
	$.ajax({
		url : "get-work-status",
		error : function(e) {
		},
		success : function(data) {
			console.log(data);
			$.each(data, function(index) {
				this.SlNo = index + 1;
			});
			
			
			$.each( data[0], function( key, value ) {
					var my_item = {};
					my_item.data = key;
					my_item.title = key;
					table_columns.push(my_item);
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
		$('#workStatusTable tbody').off('click');
	}
	_tableWorkStatus = $('#workStatusTable').DataTable({
		data : dataSet,
		columns : table_columns
	});
	
	
	
}

