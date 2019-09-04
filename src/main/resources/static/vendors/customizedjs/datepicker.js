/**
 * 
 */
$(function() {
	// Initialize Select2 Elements
	$('.select2').select2()

	// Datemask dd/mm/yyyy
	$('#datemask').inputmask('dd/mm/yyyy', {
		'placeholder' : 'dd/mm/yyyy'
	})
	// Datemask2 mm/dd/yyyy
	$('#datemask2').inputmask('mm/dd/yyyy', {
		'placeholder' : 'mm/dd/yyyy'
	})
	// Money Euro
	$('[data-mask]').inputmask()

	// Date range picker
	$('#reservation').daterangepicker()
	// Date range picker with time picker
	$('#reservationtime').daterangepicker({
		timePicker : true,
		timePickerIncrement : 30,
		format : 'MM/DD/YYYY h:mm A'
	})
	// Date range as a button
	$('#daterange-btn')
			.daterangepicker(
					{
						ranges : {
							'Today' : [ moment(), moment() ],
							'Yesterday' : [ moment().subtract(1, 'days'),
									moment().subtract(1, 'days') ],
							'Last 7 Days' : [ moment().subtract(6, 'days'),
									moment() ],
							'Last 30 Days' : [ moment().subtract(29, 'days'),
									moment() ],
							'This Month' : [ moment().startOf('month'),
									moment().endOf('month') ],
							'Last Month' : [
									moment().subtract(1, 'month').startOf(
											'month'),
									moment().subtract(1, 'month')
											.endOf('month') ]
						},
						startDate : moment().subtract(29, 'days'),
						endDate : moment()
					},
					function(start, end) {
						$('#daterange-btn span').html(
								start.format('MMMM D, YYYY') + ' - '
										+ end.format('MMMM D, YYYY'))
					})

	// Date picker
	$('#datepickerfrom').datepicker({
		startDate : truncateDate(new Date()),
		autoclose : true
	})

	$('#datepickerto').datepicker({
		startDate : truncateDate(new Date()),
		autoclose : true
	})
	/*
	 * $('#datepickerrange').datepicker({ startDate: truncateDate(new Date()),
	 * endDate : addDays(new Date(),6), autoclose: true })
	 */
	/*
	 * $('#datepickerrange').datepicker({ daysOfWeekDisabled: [0],
	 * 
	 *  })
	 */
/*
 * $('#datepickerrange').datepicker({ locale: 'pt-br', format: "DD/MM/YYYY",
 * sideBySide: true, daysOfWeekDisabled: [0] });
 * $('#datepickerrange').data("DatePicker").minDate(moment().startOf('week'));
 * $('#datepickerrange').data("DatePicker").maxDate(moment().endOf('week'));
 */
	// Prevent Select past Dates
	
      /* $('.datepickerrange').datepicker({
            locale: 'pt-br',
            format: "DD/MM/YYYY",
            sideBySide: true,
            daysOfWeekDisabled: [0],
            
        });
       
		 * $('.datepickerrange').data("DatePicker").minDate(moment().startOf('week'));
		 * $('.datepickerrange').data("DatePicker").maxDate(moment().endOf('week'));
		 
        
       */
	 function truncateDate(date) {
		return new Date(date.getFullYear(), date.getMonth(), date.getDate());
	}
	 $('#datepickerrange').datepicker({ 
     	startDate: startWeek(new Date()),
    	  	endDate : endWeek(new Date()), 
    	  	autoclose: true ,
    	 daysOfWeekDisabled: [0],
    	  	})
	
    	  	
    	function startWeek(date) 
     {
		return new Date(moment().startOf('week'));
	}  	
    	  	// Show 7 day range in datepicker
	function endWeek(d) {
		var newDate = new Date(moment().endOf('week')); // Copy date
		
		return newDate;
	}
	
})