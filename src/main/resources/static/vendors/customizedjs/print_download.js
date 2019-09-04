function PrintElem(elem) {
	/*var status=validation();
	alert(status);
	if(validation() == true){
		 Popup($(elem).html());
	}*/
	 Popup($(elem).html());
}

function Popup(data) {
	var mywindow = window.open('', 'new div', 'height=500,width=750');
	mywindow.document.write('<html><head><title></title>');
	mywindow.document.write('<link rel="stylesheet" href="../vendors/bootstrap/dist/css/bootstrap.css" type="text/css" media="print"/>');
	mywindow.document.write('</head><body >');
	mywindow.document.write(data);
	mywindow.document.write('</body></html>');
	setTimeout(function() {
		mywindow.print();
		mywindow.close();
		return true;
	}, 250);
	
}