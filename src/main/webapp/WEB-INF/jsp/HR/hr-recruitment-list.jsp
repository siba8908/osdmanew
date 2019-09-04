<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>

<!-- CUSTOM JS -->
<!-- DataTables -->


 <script src="../vendors/datatables.net/js/datatables.min.js"></script> 
<script src="../vendors/customizedjs/recruitment.js"></script>
<script src="../vendors/customizedjs/recruitmentListjs.js"></script>
<script src="../vendors/jquery.serilization/jquery.serializejson.min.js"></script>


<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
<div class="cui-layout">
<jsp:include page="../layout/header.jsp"></jsp:include>

<div class="cui-layout-content">
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
    
  </div>
  <span class="font-size-18 d-block">
    <span class="text-muted">Home</span>
    <strong>Human Resource</strong>
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: forms/form-validation -->
<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
        <p id="message"></p>
      <strong>RECRUITMENT LIST</strong>
      
    </span>
  </div>
  

  
  <form name="timesheetform" class="timesheetform">
<div class="col-lg-12">		

<table class="table table-bordered" id="field">							
 <tr>
<td><input type="text" placeholder="Name" id="name" name="[0][name]" class="form-control empName">
 <span id="ename" class=" text-red my-2 pl-2"></span> 
</td>

<td>

<input type="text" placeholder="Email" name="[0][email]" id="email" class="form-control ">

<span id="eemail" class=" text-red my-2 pl-2"></span> 
</td>
<td> <button type="button" name="add" id="add"
 class="btn btn-info"><i class="fa fa-plus"></i> </button></td>
 </tr>
 </table>

 </div>
 <input type="button" name="submit" id="submit"
class="btn btn-success pull-right"  value="Submit" />
 </form>
 </section> 
     
  <section class="card">          
            <div class="box-body"><!-- <section class="content"> -->
	
			
           <table class="table table-hover nowrap" id="userStatusTable">
            <thead>
              <tr style="color:#06F">
              <th></th>
              <th></th>
                <th>Name</th>
                <th>Email</th>
                <th>Edit</th>
                <th>Delete</th>
                </tr>
            </thead>
         
          </table>
          </div>
          </section>
        <!-- /.box-body --> <!-- </div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   --> <!-- /.box --> <!--  </div> -->
								<!-- /.col -->
							</div>
							<!-- /.row --> <!-- </section> --></div> <!-- /.box-body -->

<!-- END: forms/form-validation -->


<!-- -----modal start----- -->

 <div class="modal fade" id="userEditId">
		 <div class="modal-dialog modal-md">
		<div class="modal-content">
				<div class="box box-primary">
					<button type="button" class="close" data-dismiss="modal"
					aria-label="Close"><span aria-hidden="true">&times;</span>
				</button>
			</div>
				<div id=modalbody>
				<!-- <section class="content"> Small boxes (Stat box) -->

					<!-- <div class="row"> -->
						 <!-- <div class="box-body box-profile"> -->
							<!-- <div class="form-group" id="cancelText">
							<label>Remarks</label> <textarea style="resize: none;" class="form-control" rows="3" id="approveReason"></textarea>									
 -->						<div>
						  <!-- <h4 style="font:serif;">Do you want to Edit<span style="color:red;">?</span></h4> -->
						  <input type="hidden" id="user_id">
						  <input type="text" placeholder="Name" id="nameedit" class="form-control netEmp  ">
						  <input type="email" placeholder="Email"  id="emailedit" class="form-control ">
						   </div>
						 </div>
						<div class="modal-footer">
						<button type="submit" class="btn btn-success pull-right" id="btnUpdate">Update</button>
						<button type="button" data-dismiss="modal" class="btn btn-danger pull-left" id="btnclose">close</button>
						</div>
					<!-- </div>  -->
					<!-- </div> -->
					
				<!-- </section> -->
				 </div>

		</div> 
	</div> 
<!-- ------modal end-------- -->

<!-- START: page scripts -->
<script>
  ;(function($) {
    'use strict'
    $(function() {
      $('#form-validation').validate({
        submit: {
          settings: {
            inputContainer: '.form-group',
            errorListClass: 'form-control-error',
            errorClass: 'has-danger',
          },
        },
      })

      $('#form-validation .remove-error').on('click', function() {
        $('#form-validation').removeError()
      })

      $('#form-validation-simple').validate({
        submit: {
          settings: {
            inputContainer: '.form-group',
            errorListClass: 'form-control-error-list',
            errorClass: 'has-danger',
          },
        },
      })

      $('#form-validation-simple .remove-error').on('click', function() {
        $('#form-validation-simple').removeError()
      })

      $('.select2').select2()
      $('.select2-tags').select2({
        tags: true,
        tokenSeparators: [',', ' '],
      })
    })
  })(jQuery)
</script>
<!-- END: page scripts -->


<jsp:include page="../layout/footer.jsp"></jsp:include>

<!-- <div class="cui-layout-footer">
<div class="cui-footer">
  <div class="cui-footer-inner">
    <div class="cui-footer-top">
      <div class="row">
        <div class="col-lg-9 mb-3">
          <div class="mb-3">
            <strong
              ></strong
            >
          </div>
             
      </div>
    </div>
   
            <p>
             
            </p>
          </div>
        </div>
      </div>
    </div> -->
    
    <a
      href="javascript: void(0);"
      class="cui-utils-scroll-top"
      onclick="$('body, html').animate({'scrollTop': 0}, 500)"
      ><i class="icmn-arrow-up"></i
    ></a>
  </div>
</div>

</body>

</html>