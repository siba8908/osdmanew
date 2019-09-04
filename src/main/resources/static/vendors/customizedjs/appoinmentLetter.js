/**
 * 
 */
function letterPreviewData() 
	{
		
		 var $inputs = $('#letterData :input');
		 var values = {};
		    $inputs.each(function() {
		        values[this.name] = $(this).val();
		    });
		    //console.log(values);
		    $(".recipentname").html(values.recipentName+" ");
		    $(".designation").html(values.designation);
		    $(".doj").html(" "+values.doj);
		    $(".salary").html(values.salary+" ");
		  
		}