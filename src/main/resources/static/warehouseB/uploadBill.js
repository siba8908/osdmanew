$(document).ready(function() {
	$.ajax({
	      url: "/OSDMA/fetch-site-code",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  var siteCodeOptions="";
	    	  $.each(data, function (index) {
	    		  siteCodeOptions += '<option value="' + this.sitecodeId + '">' + this.siteCode + '</option>';
	          });
	    	  $("#siteCode").append(siteCodeOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	$.ajax({
	      url: "api/fetch-consignment-no",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  var consignmentOptions="";
	    	  $.each(data, function (index) {
	    		  consignmentOptions += '<option value="' + this.consignmentId + '">' + this.consingementNo + '</option>';
	          });
	    	  $("#consignmentNumber").append(consignmentOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
	$.ajax({
	      url: "api/fetch-service-provider",
	      error: function (e) {
	      },
	      success: function (data) {
	    	  var logisticsOptions="";
	    	  $.each(data, function (index) {
	    		  logisticsOptions += '<option value="' + this.providerId + '">' + this.providerName + '</option>';
	          });
	    	  $("#logistics").append(logisticsOptions);
	      },
	      dataType: "json",
	      contentType: 'application/json; charset=utf-8',
	      type: "GET",
	      cache: false,
	      crossDomain: true
	  });
});
function uploadBill(){
	var serviceProviderBill={};
	var serProPersonalDtls={};
	var sitecode={};
	var servProvBillDocs=[];
	var servProvBillDoc={};
	var amConsingementTrackC2p={};
	serProPersonalDtls.providerId=$("#logistics").val();
	serviceProviderBill.serProPersonalDtls=serProPersonalDtls;
	sitecode.sitecodeId=$("#siteCode").val();
	serviceProviderBill.sitecode=sitecode;
	amConsingementTrackC2p.consignmentId=$("#consignmentNumber").val();
	serviceProviderBill.amConsingementTrackC2p=amConsingementTrackC2p;
	serviceProviderBill.billNo=$("#invoiceNumber").val();
	serviceProviderBill.billAmount=$("#billAmount").val();
	serviceProviderBill.paymentDate=$("#invoiceDate").val();
	var base64ImageContent = $('#image_preview').attr('src').replace(/^data:image\/(png|jpg|jpeg);base64,/, "");
    if (base64ImageContent == "components/dummy-assets/common/img/noimage.png")
        base64ImageContent = "";
    servProvBillDoc.billFile=base64ImageContent;
    servProvBillDocs.push(servProvBillDoc);
    serviceProviderBill.servProvBillDocs=servProvBillDocs;
    serviceProviderBill.status="RAISED";
	$.ajax({
        url: "api/save-service-provider-bill",
        data: JSON.stringify(serviceProviderBill),
        error: function (e) {
        	window.location.reload();
        },
        success: function (data) {
        	console.log(data)
        	window.location.reload();
        },
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
        type: "POST",
        cache: false,
        crossDomain: true
    });
}
function imageLoad(current){
    if (current.files && current.files[0]) {

        if (current.files[0].size > 1024000) {
            alert("File Size limit exeeds!!");
            return;
        }
        var reader = new FileReader();
        var parent = current.parentNode.parentNode.parentNode;
        reader.onload = function (e) {
            $('#image_preview', parent).attr('src', e.target.result);
        }

        reader.readAsDataURL(current.files[0]);
    }
}