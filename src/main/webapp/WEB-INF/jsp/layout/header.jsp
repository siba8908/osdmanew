<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  



<!-- Mirrored from cleanuitemplate.com/admin/html/preview/versions/menu-left/tables-editable-tables.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Apr 2019 09:16:52 GMT -->



<div class="cui-layout-header">
				<div class="cui-topbar">
				<div class="cui-topbar-left"></div>
					<div class="cui-topbar-right">
					<div class="cui-topbar-item">
						<div class="dropdown cui-topbar-avatar-dropdown">
							<a href="..versions/menu-left/empOfferLetter#"
								class="dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <span class="cui-topbar-avatar">
									<img src="../components/dummy-assets/common/img/avatars/1.jpg"
									alt="">
							</span>
							</a>
							<div class="dropdown-menu dropdown-menu-right" role="menu">
								<!-- <a class="dropdown-item" href="javascript:void(0)"><i
									class="dropdown-icon icmn-user"></i> Profile</a> -->
								<!-- <div class="dropdown-divider"></div> -->
								<!-- <div class="dropdown-header">Home</div> -->
								<!-- <a class="dropdown-item" href="javascript:void(0)"><i
									class="dropdown-icon icmn-circle-right"></i> System Dashboard</a> <a
									class="dropdown-item" href="javascript:void(0)"><i
									class="dropdown-icon icmn-circle-right"></i> User Boards</a> <a
									class="dropdown-item" href="javascript:void(0)"><i
									class="dropdown-icon icmn-circle-right"></i> Issue Navigator <span
									class="badge badge-success font-size-11 ml-2">25 New</span></a> -->
							<!-- 	<div class="dropdown-divider"></div> -->
								<a class="dropdown-item" href="<c:url value='/logout'/>"><i
									class="dropdown-icon icmn-exit"></i> Logout</a>
							</div>
						</div>
					</div>
					<!-- <div class="cui-topbar-item">
							<div class="cui-topbar-menu-button cui-menu-right-action-toggle">
								<i class="fa fa-bars"></i>
							</div>
						</div> -->
				</div>
</div>
				<script>
  ;(function($) {
    'use strict'
    $(function() {
      ///////////////////////////////////////////////////////////
      // livesearch scripts

      var livesearch = $('.cui-topbar-livesearch')
      var close = $('.cui-topbar-livesearch-close')
      var visibleClass = 'cui-topbar-livesearch-visible'
      var input = $('#livesearch-input')
      var inputInner = $('#livesearch-input-inner')

      function setHidden() {
        livesearch.removeClass(visibleClass)
      }
      function handleKeyDown(e) {
        const key = event.keyCode.toString()
        if (key === '27') {
          setHidden()
        }
      }
      input.on('focus', function() {
        livesearch.addClass(visibleClass)
        setTimeout(function() {
          inputInner.focus()
        }, 200)
      })
      close.on('click', setHidden)
      document.addEventListener('keydown', handleKeyDown, false)
    })
  })(jQuery)
</script>
			</div>
    
<!-- END: tables/editable-tables -->

<!-- START: page scripts -->
<!-- <script>
  ;(function($) {
    'use strict'
    $(function() {
      $('#example1').editableTableWidget()

      $('#example2').editableTableWidget()
    })
  })(jQuery)
</script> -->
<!-- END: page scripts -->

<!-- </div>
</div> -->


</body>


