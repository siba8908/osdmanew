var _tableSiteLocationReports;
$(document).ready(function() {
	$.ajax({
		url : "/fetch-site-code",
		error : function(e) {
		},
		success : function(data) {
			$.each(data, function(index) {
				this.serial = index + 1;
				if(this.siteLocation.length==0){
					this.latitude="<input type='text' name='latitude' class='form-control latitude'>";
					this.longitude="<input type='text' name='longitude' class='form-control longitude'>";
					this.action="<button class='btn btn-sm btn-primary ml-10 btn-save'>Save</button>";
				}else{
					this.latitude="<input type='text' name='latitude' class='form-control latitude' value='"+this.siteLocation[0].lattitude+"'>";
					this.longitude="<input type='text' name='longitude' class='form-control longitude' value='"+this.siteLocation[0].longitude+"'>";
					this.action="<button class='btn btn-sm btn-primary ml-10 btn-edit'>Update</button>";
				}
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
	if (_tableSiteLocationReports) {
		_tableSiteLocationReports.destroy();
		$('#siteLocationReportTable tbody').off('click');
	}
	_tableSiteLocationReports = $('#siteLocationReportTable').DataTable({
		data : dataSet,
		columns : [ {
			"data" : "serial"
		}, {
			"data" : "siteCode"
		}, {
			"data" : "siteName"
		}, {
			"data" : "longitude"
		}, {
			"data" : "latitude"
		}, {
			"data" : "action"
		} ]
	});
	

	$('#siteLocationReportTable tbody').on('click', '.btn-save', function (e) {
        e.stopPropagation();
        var currentRowData = _tableSiteLocationReports.row($(this).parents('tr')).data();
        var siteLocation={};
        var sitecode={};
        sitecode.sitecodeId=currentRowData.sitecodeId;
        siteLocation.sitecode=sitecode;
        siteLocation.lattitude=$(this).parents('tr').find('.latitude').val();
        siteLocation.longitude=$(this).parents('tr').find('.longitude').val();
        updateSiteLocation(siteLocation);
    });
	
	$('#siteLocationReportTable tbody').on('click', '.btn-edit', function (e) {
        e.stopPropagation();
        var currentRowData = _tableSiteLocationReports.row($(this).parents('tr')).data();
        var siteLocation={};
        var sitecode={};
        siteLocation.siteLocationId=currentRowData.siteLocation[0].siteLocationId;
        sitecode.sitecodeId=currentRowData.siteLocation[0].sitecode.sitecodeId;
        siteLocation.sitecode=sitecode;
        siteLocation.lattitude=$(this).parents('tr').find('.latitude').val();
        siteLocation.longitude=$(this).parents('tr').find('.longitude').val();
        updateSiteLocation(siteLocation);
    });

}
function updateSiteLocation(siteLocation){
	 $.ajax({
	        url: "save-site-location",
	        data: JSON.stringify(siteLocation),
	        error: function (e) {
	        	window.location.reload();
	        },
	        success: function (data) {
	        },
	        dataType: "json",
	        contentType: 'application/json; charset=utf-8',
	        type: "POST",
	        cache: false,
	        crossDomain: true
	    });
}
