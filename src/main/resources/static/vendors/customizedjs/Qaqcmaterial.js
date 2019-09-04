
$(document).ready(function () {
	var sel;
	
$('#product').change(function() {
	sel=$("#product option:selected").val();
	//alert(sel);
	
   console.log(sel);
	getComponent(sel);
	
	
	/*alert(1);
     if(this.value == 'Option 1') {
         $('.second-select option').show();
          $('.second-select').prop('selectedIndex',0);
     }
     else if(this.value == 'Option 2') {
         $('.second-select option[value="4"]').hide();
         $('.second-select option[value="3"]').hide();
        $('.second-select').prop('selectedIndex',2);
     }*/
});

/*$('#product_component').change(function() {
	alert(1);
     if(this.value == 'Option 1') {
         $('.third-select option').show();
          $('.third-select').prop('selectedIndex',0);
     }
     else if(this.value == 'Option 2') {
         $('.third-select option[value="4"]').hide();
         $('.third-select option[value="3"]').hide();
        $('.third-select').prop('selectedIndex',2);
     }
});*/
function getComponent(sel) {
	//alert("getcomponent");
	$.ajax({
		type : "GET",
		url : "getComponent",
		 data:{"images": sel}, 
		//data : JSON.stringify(data),
		dataType : "json",
		contentType : 'application/json',
		success : function(response) {
			console.log(response);
			debugger;
			
			 $('#ComponentName').html(' ');
			 $('#Quantity').html(' ');
			 
			   select = $("#test"), options = '', qun='';
			   //select.empty(); 
			   
			   for(var i=0;i<response.length; i++)
			   {
			    options +="<option value='"+response[i].componentId+"'>"+ response[i].componentName +"</option>"; 
			    qun +="<option value='"+response[i].quantity+"'>"+ response[i].quantity +"</option>"; 
			   
			   }
			   $(ComponentName).append(options)
			   $(Quantity).append(qun)
			
			//$("#component_name").html(response.component_name);
			
			//document.getElementById("ComponentName").innerHTML=response.component_name; 
			/* jQuery.each(response, function(index, item) {
			for (var i=0; i<response.d.length;i++) {
				alert(item);
	  		$("#ComponentName").val(
					response[index].component_name);
			
			$("#Quantity").val(
					response[index].quantity);
			});*/
			 
			
			
		},
		error : function(xhr, status, error) {
			debugger;
			alert(xhr);
		}
});
}

/*var i = 0;
$('#add').click(function() {
	alert("enter");
				i++;
				$('#field').append('<tr id="row' + i + '"><td> <select class="form-control " id="ComponentName" name="[0][component_id]" <option>Select ComponentName</option> /></td> <td> <select class="form-control" id="Quantity" name="[0][quantity]"><option>Select Quantity</option> /></td> <td><select class="form-control " id="myselect" name="[0][item_id]"><option>Select ProductCode</option> /></td>  <td> <button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove"><i class="fa fa-minus"></i></button></td></tr>');
							}); 
$(document).on('click', '.btn_remove', function() {
	var button_id = $(this).attr("id");
	$('#row' + button_id + '').remove();
});
*/
$('#btnSave').click(function (e) {
	e.preventDefault();
	materialSave();
	
});    	

function materialSave() {


	//alert("enter");
	
var	data=JSON.stringify($('#materialSave').serializeJSON());
console.log(data);
//   console.log(data);
    //var employeeJSON = JSON.stringify(Employee);
    $.ajax({
        url: 'QAQCMaterialCod_ajax',
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
       /* success: function () {
            alert('Saved successfully!');
  
            
        },*/
        success : function(
        		response) {
        	console.log(response)
        	$('#message')
        			.html(
        					response).fadeOut(3000);
        	
        },
        error : function(response) {
        	$('#message')
        	.html(response).fadeOut(3000);
        }

        });
      
}

//Wait for the DOM to be ready
$(function() {
  // Initialize form validation on the registration form.
  // It has the name attribute "registration"
  $("form[name='materialSave']").validate({
    // Specify validation rules
    rules: {
      // The key name on the left side is the name attribute
      // of an input field. Validation rules are defined
      // on the right side
    	sim_provider: "required",
    	phone_no: "required",
    	imei_no:"required",
      /*email: {
        required: true,
        // Specify that email should be validated
        // by the built-in "email" rule
        email: true
      },
      password: {
        required: true,
        minlength: 5
      }*/
    },
    // Specify validation error messages
    messages: {
    	sim_provider: "Please enter your firstname",
    	phone_no: "Please enter your lastname",
    	imei_no: "Please enter your lastname",
     /* password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 5 characters long"
      },
      email: "Please enter a valid email address"*/
    },
    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
      form.materialSave();
    }
  });
});

});

/*

success : function(
		response) {
	console
			.log(response)
	$('#message')
			.html(
					response).fadeOut(3000);
	
},
error : function(response) {
	$('#message')
	.html(response).fadeOut(3000);
}

},
error: function (error) {
alert(error);
}
});*/