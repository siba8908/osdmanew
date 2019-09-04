
<html lang="en">

<jsp:include page="../layout/links.jsp"></jsp:include>
<script src="../vendors/datatables.net/js/dataTables.min.js"></script> 
<script src="../vendors/customizedjs/utilisation.js/"></script>

<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>

<div class="cui-layout"> 
		<jsp:include page="../layout/header.jsp"></jsp:include>
		
			<div class="cui-layout-content">
  
  <span class="font-size-18 d-block">
    <span class="text-muted">Home </span>
    <strong>Human Resourse</strong>
    
  </span>

<div class="cui-utils-content">
<!-- START: tables/datatables -->
<div class="row">
<div class ="col-md-5">
 
  
  <select class="Status form-control">
  <option>Choose Status</option>
  <option >PRESENT & ENGAGED</option>
  <option>PRESENT & NOTENGAGED</option>
  <option>LEAVE</option>
  </select>
  </div>
  </div>
  <br>
<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
      
                 
      
    </span>
  </div>
 
  <div class="card-body">
  
  
    <div class="row">
      <div class="col-lg-12">
        <h5 Style="color:#009"><strong>Utilisation of Resourses</strong></h5>
        <div class="mb-5">
       
        <div id="message" style="margin-left:20%"></div>
          <table class="table table-hover nowrap" class="attrTable" id="datatable">
            <thead>
              <tr>
                <th>Project Name</th>
                <th>Team</th>
                <th>Resourse Name</th>
                <th>Status</th>
                
              </tr>
            </thead>
            <tbody>
            </tbody>

      </table> 
      
                             <button type="button" class="btn btn-primary pull-right" id="btnSave">Save</button>
          
          

  </div>   
            
          
         
        </div>
      </div>
    </div>
    
       
             
             
               
         </section>       
        </div>
        
      </div>
     <div class="cui-layout-footer">
     		<jsp:include page="../layout/footer.jsp"></jsp:include>
     
    </div>
  </div>
</div>


    
</body>


</html>