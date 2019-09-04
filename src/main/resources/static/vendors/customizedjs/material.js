$( document ).ready(function() {
	var selectedconsignmentId;
	 selectCon();

				var i = 0;
                $('#add').click(function() {
								i++;
								$('#field').append('<tr id="row' + i + '"> <td><input type="text" class="form-control" placeholder=""  name=[' + i + '][item_name] id="item_name" class="txt1"/></td><td><input type="text" class="form-control" placeholder="" id="serial_no'+ i +'" name=['+ i +'][serial_no] class="txt1"/></td><td><input type="number" class="form-control" placeholder="" id="quantity'+ i +'" name=['+ i +'][quantity] class="txt1"/></td><input type="hidden" class="form-control" placeholder=""  name=['+ i +'][consinment_id] id="myselect" class="txt1"/><td><div class="col-md-3 offset-md-3"> <button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></div></td></tr>');
											}); 
                					
							$(document).on('click', '.btn_remove', function() {
								var button_id = $(this).attr("id");
								$('#row' + button_id + '').remove();
							});
							
							$('#submit')
							.click(function(e) {
										e.preventDefault();
										 var checkstatus= validation();
										
										if(validation()== true){ 
											var	data=JSON.stringify($('#timesheetform').serializeJSON());
											console.log(data);
$.ajax({
            type: 'POST',
            url: 'addMaterials',
            contentType : 'application/json; charset=utf-8',
            dataType: 'json',
            data:data,
            success: function(response){
                console.log(response)
                $('#success').text(response.message);
            },
            error: function(data){
                console.log(data.responseJSON.message);
            }
        })
										
	 } 			 								
	});
											
							
});						

 
 
 function selectCon(){
		$("#myselect").change(function(){
			  //selectedConsignmentName=$("#myselect option:selected").text();
			 selectedconsignmentId=$("#myselect option:selected").val();
		 });
	}	