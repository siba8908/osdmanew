
function PrintElem(elem) {
	
		Popup($(elem).html());
	}

function Popup(data) {
	var mywindow = window.open('', 'new div', 'height=500,width=750');
	mywindow.document.write('<html><head><title>Offer Letter</title>');
	mywindow.document.write('<link rel="stylesheet" href="../vendors/bootstrap/dist/css/bootstrap.css" type="text/css" media="print"/>');
	mywindow.document.write('</head><body >');
	mywindow.document.write(data);
	mywindow.document.write('</body></html>');
	setTimeout(function() {
		mywindow.print();
		mywindow.close();s
		return true;
	}, 250);
	}
	function LetterPreview() 
	{
		 var $inputs = $('#letterData :input');
		 var values = {};
		    $inputs.each(function() {
		        values[this.name] = $(this).val();
		    });
		    console.log(values);
		    $(".recipentname").html(values.recipentName);
		    $(".designation").html(values.designation);
		    $(".doj").html(values.doj);
		    
		   // $("#sendername").text(values.recipentName);
		}
	
	
	