var _tableConsignmentReports;
var row1=null;
$(document).ready(function() {
	$.ajax({
		url : "get-all-details",
		error : function(e) {
		},
		success: function (msg) {
            $.each(msg, function (index, obj) { 
                var row = '<tr><td> ' + obj.productCode + ' </td> <td> ' + obj.productName + ' </td> <td> ' + obj.quantity + ' </td> <td> <button type="button" onclick="myFunction()" data-toggle="modal" data-target="#myModal">Accept</button></td></tr>';
                $("#productListWarehouseB tbody").append(row);
            }); 
        },
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "GET",
		cache : false,
		crossDomain : true
	});
});
function myFunction() {
	$('#productListWarehouseB').find('tr').click( function(){
		  row1 = $(this).find('td:first').text();
		});
	
	}
function savelocation() {
	var location1=document.getElementById("location").value;
	var product={
			productList:null,
			productCode:row1,
			productName:null,
			quantity:null,
			stock:null,
			location:location1,
			remark:null
			
	};
	
	location1=null;
	row=null;
	$('#myModal').modal('hide');
	$.ajax({
		url : "savewarehouseBdetails",
		data: JSON.stringify(product),
		error : function(e) {
		},
		success: function (msg) {
			alert(msg);
            if(msg>0)
            	{
            	alert("success");}
            	},
        
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
	setTimeout("location.reload(true);",15000);
	//document.location.reload(true);
	}

/*$("button").click(function(){
	
	
	alert(1111);
	var TableData;

	TableData = storeTblValues()

	TableData = $.toJSON(TableData);

	 

	function storeTblValues()

	{

	    var TableData = new Array();

	 

	    $('#productListWarehouseB tr').each(function(row, tr){
               
	        TableData[row]={

	            "productList" : $(tr).find('td:eq(0)').text()

	            , "productCode" :$(tr).find('td:eq(1)').text()

	            , "description" : $(tr).find('td:eq(2)').$("textarea").val()

	            , "quantity" : $(tr).find('td:eq(3)').$('input:textbox').val()
	            
	            , "stock"     : $(tr).find('td:eq(4)').$('input:textbox').val()
	            
	            , "location"   : $(tr).find('td:eq(5)').$("textarea").val()
	            
	            , "remark"    : $(tr).find('td:eq(6)').$("textarea").val()

	        }   

	    });

	    TableData.shift();  // first row will be empty - so remove

	    return TableData;

	}
	
	
	
	
	$.ajax({
		url : "warehouse-b/set-all-details",
		data: TableData,
		error : function(e) {
			alert(error);
		},
		success: function (msg) {
            if(msg>0)
            	{
            	alert("success");}
            	},
        
		dataType : "json",
		contentType : 'application/json; charset=utf-8',
		type : "POST",
		cache : false,
		crossDomain : true
	});
	
	
	
	
	
});*/