<!DOCTYPE html>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">  <title>
   Sunjray | MTS
  </title>
  <link href="../components/dummy-assets/common/img/favicon.png" rel="shortcut icon">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i" rel="stylesheet">

  VENDORS
  v2.0.2
  <link rel="stylesheet" type="text/css" href="../vendors/bootstrap/dist/css/bootstrap.css">
  <link rel="stylesheet" type="text/css" href="../vendors/perfect-scrollbar/css/perfect-scrollbar.css">
  <link rel="stylesheet" type="text/css" href="../vendors/ladda/dist/ladda-themeless.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/bootstrap-select/dist/css/bootstrap-select.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/select2/dist/css/select2.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/tempus-dominus-bs4/build/css/tempusdominus-bootstrap-4.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/fullcalendar/dist/fullcalendar.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/bootstrap-sweetalert/dist/sweetalert.css">
  <link rel="stylesheet" type="text/css" href="../vendors/summernote/dist/summernote.css">
  <link rel="stylesheet" type="text/css" href="../vendors/owl.carousel/dist/assets/owl.carousel.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/ionrangeslider/css/ion.rangeSlider.css">
  <link rel="stylesheet" type="text/css" href="../../../../../../cdn.datatables.net/v/bs4/dt-1.10.18/fc-3.2.5/r-2.2.2/datatables.min.css" />
  <link rel="stylesheet" type="text/css" href="../vendors/c3/c3.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/chartist/dist/chartist.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/nprogress/nprogress.css">
  <link rel="stylesheet" type="text/css" href="../vendors/jquery-steps/demo/css/jquery.steps.css">
  <link rel="stylesheet" type="text/css" href="../vendors/dropify/dist/css/dropify.min.css">
  <link rel="stylesheet" type="text/css" href="../vendors/font-linearicons/style.css">
  <link rel="stylesheet" type="text/css" href="../vendors/font-icomoon/style.css">
  <link rel="stylesheet" type="text/css" href="../vendors/font-awesome/css/font-awesome.min.css">
  <script src="../vendors/jquery/dist/jquery.min.js"></script>
  <script src="../vendors/popper.js/dist/umd/popper.js"></script>
  <script src="../vendors/jquery-ui/jquery-ui.min.js"></script>
  <script src="../vendors/bootstrap/dist/js/bootstrap.js"></script>
  <script src="../vendors/jquery-mousewheel/jquery.mousewheel.min.js"></script>
  <script src="../vendors/perfect-scrollbar/js/perfect-scrollbar.jquery.js"></script>
  <script src="../vendors/spin.js/spin.js"></script>
  <script src="../vendors/ladda/dist/ladda.min.js"></script>
  <script src="../vendors/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
  <script src="../vendors/select2/dist/js/select2.full.min.js"></script>
  <script src="../vendors/html5-form-validation/dist/jquery.validation.min.js"></script>
  <script src="../vendors/jquery-typeahead/dist/jquery.typeahead.min.js"></script>
  <script src="../vendors/jquery-mask-plugin/dist/jquery.mask.min.js"></script>
  <script src="../vendors/autosize/dist/autosize.min.js"></script>
  <script src="../vendors/bootstrap-show-password/bootstrap-show-password.min.js"></script>
  <script src="../vendors/moment/min/moment.min.js"></script>
  <script src="../vendors/tempus-dominus-bs4/build/js/tempusdominus-bootstrap-4.min.js"></script>
  <script src="../vendors/fullcalendar/dist/fullcalendar.min.js"></script>
  <script src="../vendors/bootstrap-sweetalert/dist/sweetalert.min.js"></script>
  <script src="../vendors/remarkable-bootstrap-notify/dist/bootstrap-notify.min.js"></script>
  <script src="../vendors/summernote/dist/summernote.min.js"></script>
  <script src="../vendors/owl.carousel/dist/owl.carousel.min.js"></script>
  <script src="../vendors/ionrangeslider/js/ion.rangeSlider.min.js"></script>
  <script src="../vendors/nestable/jquery.nestable.js"></script>
  <script type="text/javascript" src="../../../../../../cdn.datatables.net/v/bs4/dt-1.10.18/fc-3.2.5/r-2.2.2/datatables.min.js"></script>
  <script src="../vendors/editable-table/mindmup-editabletable.js"></script>
  <script src="../vendors/d3/d3.min.js"></script>
  <script src="../vendors/c3/c3.min.js"></script>
  <script src="../vendors/chartist/dist/chartist.min.js"></script>
  <script src="../vendors/peity/jquery.peity.min.js"></script>
  <script src="../vendors/chartist-plugin-tooltip/dist/chartist-plugin-tooltip.min.js"></script>
  <script src="../vendors/jquery-countTo/jquery.countTo.js"></script>
  <script src="../vendors/nprogress/nprogress.js"></script>
  <script src="../vendors/jquery-steps/build/jquery.steps.min.js"></script>
  <script src="../vendors/chart.js/dist/Chart.bundle.min.js"></script>
  <script src="../vendors/dropify/dist/js/dropify.min.js"></script>
  <script src="../vendors/d3-dsv/dist/d3-dsv.js"></script>
  <script src="../vendors/d3-time-format/dist/d3-time-format.js"></script>
  <script src="../vendors/techan/dist/techan.min.js"></script>

  CLEAN UI HTML ADMIN TEMPLATE MODULES
  v2.0.2
  <link rel="stylesheet" type="text/css" href="../components/core/common/core.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/core/widgets/widgets.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/vendors/common/vendors.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/settings/common/settings.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/settings/themes/themes.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/menu-left/common/menu-left.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/menu-top/common/menu-top.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/menu-right/common/menu-right.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/top-bar/common/top-bar.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/breadcrumbs/common/breadcrumbs.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/footer/common/footer.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/pages/common/pages.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/ecommerce/common/ecommerce.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/apps/common/apps.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/blog/common/blog.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/youtube/common/youtube.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/github/common/github.cleanui.css">
  <link rel="stylesheet" type="text/css" href="../components/docs/common/docs.cleanui.css">
  <script src="../components/menu-left/common/menu-left.cleanui.js"></script>
  <script src="../components/menu-top/common/menu-top.cleanui.js"></script>
  <script src="../components/menu-right/common/menu-right.cleanui.js"></script>
  <script src="../components/blog/common/blog.cleanui.js"></script>
  <script src="../components/github/common/github.cleanui.js"></script>


  PRELOADER STYLES
  <style>
    .cui-initial-loading {
      position: fixed;
      z-index: 99999;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-position: center center;
      background-repeat: no-repeat;
      background-image: url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iNDFweCIgIGhlaWdodD0iNDFweCIgIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgdmlld0JveD0iMCAwIDEwMCAxMDAiIHByZXNlcnZlQXNwZWN0UmF0aW89InhNaWRZTWlkIiBjbGFzcz0ibGRzLXJvbGxpbmciPiAgICA8Y2lyY2xlIGN4PSI1MCIgY3k9IjUwIiBmaWxsPSJub25lIiBuZy1hdHRyLXN0cm9rZT0ie3tjb25maWcuY29sb3J9fSIgbmctYXR0ci1zdHJva2Utd2lkdGg9Int7Y29uZmlnLndpZHRofX0iIG5nLWF0dHItcj0ie3tjb25maWcucmFkaXVzfX0iIG5nLWF0dHItc3Ryb2tlLWRhc2hhcnJheT0ie3tjb25maWcuZGFzaGFycmF5fX0iIHN0cm9rZT0iIzAxOTBmZSIgc3Ryb2tlLXdpZHRoPSIxMCIgcj0iMzUiIHN0cm9rZS1kYXNoYXJyYXk9IjE2NC45MzM2MTQzMTM0NjQxNSA1Ni45Nzc4NzE0Mzc4MjEzOCIgdHJhbnNmb3JtPSJyb3RhdGUoODQgNTAgNTApIj4gICAgICA8YW5pbWF0ZVRyYW5zZm9ybSBhdHRyaWJ1dGVOYW1lPSJ0cmFuc2Zvcm0iIHR5cGU9InJvdGF0ZSIgY2FsY01vZGU9ImxpbmVhciIgdmFsdWVzPSIwIDUwIDUwOzM2MCA1MCA1MCIga2V5VGltZXM9IjA7MSIgZHVyPSIxcyIgYmVnaW49IjBzIiByZXBlYXRDb3VudD0iaW5kZWZpbml0ZSI+PC9hbmltYXRlVHJhbnNmb3JtPiAgICA8L2NpcmNsZT4gIDwvc3ZnPg==);
      background-color: #f2f4f8;
    }
  </style>
  <script>
    $(document).ready(function () {
      $('.cui-initial-loading').delay(200).fadeOut(400)
    })
  </script>
</head> -->
<body class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
<div class="cui-initial-loading"></div>
<div class="cui-layout cui-layout-has-sider">
<div class="cui-menu-right">
  <div class="cui-menu-right-inner">
    <div class="cui-menu-right-header">
      <span class="fa fa-times pull-right cui-menu-right-action-toggle"><!-- --></span>
      Theme Settings
    </div>
    <div class="cui-menu-right-content">
      <div class="cui-menu-right-descr">
        This module "block-menu-right" gives possibility to construct custom blocks with any
        widgets, ../components and elements inside, like this theme settings
      </div>
      <div class="cui-menu-right-label">
        Theme Style
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="" /> Dark
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-light" /> Light
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-green" /> Green
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-blue" /> Blue
            </label>
          </div>
        </div>
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-red" /> Red
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-theme" value="cui-theme-orange" /> Orange
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Menu Shadow
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="cui-menu-left-shadow" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-shadow" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Borderless Cards
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="cui-config-borderless" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-borderless" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Squared Corners
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="cui-config-squared-corners" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-corners" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Fixed Width
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="cui-config-fixed-width" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-boxed" value="" /> Off
            </label>
          </div>
        </div>
      </div>
      <div class="cui-menu-right-label">
        Colorful Menu
      </div>
      <div class="cui-menu-right-setting cui-menu-right-example-option">
        <div class="btn-group btn-group-justified" data-toggle="buttons">
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="cui-menu-left-colorful" /> On
            </label>
          </div>
          <div class="btn-group">
            <label class="btn btn-default">
              <input type="radio" name="options-colorful" value="" /> Off
            </label>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<nav class="cui-menu-left">
  <div class="cui-menu-left-trigger cui-menu-left-trigger-action"></div>
  <div class="cui-menu-left-handler">
    <div class="cui-menu-left-handler-icon"></div>
  </div>
  <div class="cui-menu-left-inner">
    <div class="cui-menu-left-logo">
      <a href="dashboards-alpha.html">
        <img
          class="cui-menu-left-logo-default"
          src="../components/dummy-assets/common/img/logo-inverse.jpg"
          alt=""
        />
        <img
          class="cui-menu-left-logo-toggled"
          src="../components/dummy-assets/common/img/logo-mobile.png"
          alt=""
        />
      </a>
    </div>
    <div class="cui-menu-left-scroll">
      <ul class="cui-menu-left-list cui-menu-left-list-root">
        <li class="cui-menu-left-item">
          <a href="hr-dashboard.html" class="cui-menu-right-action-toggle">
            <span class="cui-menu-left-icon icmn-cog"></span>
            <span class="cui-menu-left-title">Dashboard</span>
          </a>
        </li>
                
        
        
        
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-dashboard.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Human Recourse</span>
          </a>
        </li>
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>

        <li class="cui-menu-left-item cui-menu-left-submenu">
          <a href="javascript: void(0);">
            <span class="cui-menu-left-icon icmn-file-text"></span>
            <span class="cui-menu-left-title">Recruitment</span>
          </a>
          <ul class="cui-menu-left-list">
            <li class="cui-menu-left-item">
              <a href="hr-recruitment-list.html">

                <span class="cui-menu-left-title">Recruitment List</span>

              </a>
            </li>
            <li class="cui-menu-left-item">
              <a href="hr-recruitment-status.html">

                <span class="cui-menu-left-title">Recruitment Status</span>

              </a>
            </li>
            
            
          </ul>
        </li>
                <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item cui-menu-left-submenu">
          <a href="javascript: void(0);">
            <span class="cui-menu-left-icon icmn-file-text"></span>
            <span class="cui-menu-left-title">Manage Employee</span>
          </a>
          <ul class="cui-menu-left-list">
            <li class="cui-menu-left-item">
              <a href="hr-show-employee-details.html">

                <span class="cui-menu-left-title">Show Employee</span>

              </a>
            </li>
            <li class="cui-menu-left-item">
              <a href="hr-add--Employee.html">

                <span class="cui-menu-left-title">Add Employee</span>

              </a>
            </li>


            <li class="cui-menu-left-item">
              <a href="hr-training-details.html">

                <span class="cui-menu-left-title">Training Details</span>

              </a>
            </li>
            
            
          </ul>
        </li>
        
       <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-appointment letter.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Appointment Letter</span>
          </a>
        </li>
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-warning-letter.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Warning Letter</span>
          </a>
        </li>
         <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-termination-letter.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Termination Letter</span>
          </a>
        </li>
         <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="#">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Experience Certificate</span>
          </a>
        </li>
         <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-holiday-list.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Holiday List</span>
          </a>
        </li>
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-attendance.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Attendance</span>
          </a>
        </li>
                 <li class="cui-menu-left-divider">
          <!-- -->
        </li>
                
        <li class="cui-menu-left-item cui-menu-left-submenu">
          <a href="javascript: void(0);">
            <span class="cui-menu-left-icon icmn-loop"></span>
            <span class="cui-menu-left-title">Leave</span>
          </a>
          <ul class="cui-menu-left-list">
            <li class="cui-menu-left-item">
              <a href="hr-leave-management.html">

                <span class="cui-menu-left-title">Leave Management</span>

              </a>
            </li>
            <li class="cui-menu-left-item">
              <a href="hr-leave-balance-report.html">
 
                <span class="cui-menu-left-title">Leave Balance Report</span>
              </a>
            </li>
           
          </ul>
        </li>
                
        
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>

        <li class="cui-menu-left-item">
          <a href="hr-utilisation-of-resouces.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Utilisation of Recourses</span>
          </a>
        </li>

        
         <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item">
          <a href="hr-payroll.html">
            <span class="cui-menu-left-icon icmn-books"></span>
            <span class="cui-menu-left-title">Payroll</span>
          </a>
        </li>
        
        
        <li class="cui-menu-left-divider">
          <!-- -->
        </li>
        <li class="cui-menu-left-item cui-menu-left-submenu">
          <a href="javascript: void(0);">
            <span class="cui-menu-left-icon icmn-loop"></span>
            <span class="cui-menu-left-title">Summary</span>
          </a>
          <ul class="cui-menu-left-list">
            <li class="cui-menu-left-item">
              <a href="hr-payroll-summary-sheet.html">

                <span class="cui-menu-left-title">Salary Sheet</span>

              </a>
            </li>
            </ul>
        </li>

        
        
      
        <li>
          
        </li>
      </ul>
    </div>
  </div>
</nav>
</nav>
<div class="cui-layout">
<div class="cui-layout-header">
<div class="cui-topbar">
  <!-- left aligned items -->
  <div class="cui-topbar-left">
 
    <div class="cui-topbar-item">
      <div class="cui-topbar-search">
        <i class="icmn-search"> <!-- --></i>
        <input type="text" id="livesearch-input" placeholder="Type to search..." />
      </div>
      <div class="cui-topbar-livesearch">
        <button class="cui-topbar-livesearch-close" type="button">
          <i class="icmn-cross"></i>
        </button>
        <div class="container-fluid">
          <div class="cui-topbar-livesearch-wrapper">
            <div class="cui-topbar-livesearch-logo-container">
              <img
                class="cui-topbar-livesearch-logo"
                src="../components/dummy-assets/common/img/logo.png"
                alt=""
              />
            </div>
            <input
              type="search"
              id="livesearch-input-inner"
              class="cui-topbar-livesearch-input"
              placeholder="Type to search..."
            />
            <ul class="cui-topbar-livesearch-options">
              <li class="cui-topbar-livesearch-option">
                <label class="cui-utils-control cui-utils-control-checkbox"
                  >Search within page
                  <input type="checkbox" checked="checked" />
                  <span class="cui-utils-control-indicator"></span>
                </label>
              </li>
              <li class="cui-topbar-livesearch-option">Press enter to search</li>
            </ul>
            <div class="cui-topbar-livesearch-results">
              <div class="cui-topbar-livesearch-results-title">
                <span>Pages Search Results</span>
              </div>
              <div class="row">
                <div class="col-lg-4">
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/1.jpg')"
                    >
                      #1
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/2.jpg')"
                    >
                      KF
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div
                      class="cui-topbar-livesearch-result-thumb"
                      style="background-image: url('../components/dummy-assets/common/img/photos/3.jpg')"
                    >
                      GF
                    </div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4">
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">01</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">02</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                  <div class="cui-topbar-livesearch-result-content">
                    <div class="cui-topbar-livesearch-result-thumb">03</div>
                    <div class="cui-topbar-livesearch-result">
                      <div class="cui-topbar-livesearch-result-text">
                        Text from input field must be here
                      </div>
                      <div class="cui-topbar-livesearch-result-source">In some partition</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- right aligned items -->
  <div class="cui-topbar-right">
    
    <div class="cui-topbar-item">
      <div class="dropdown">
        <a href="#" class="dropdown-toggle text-nowrap" data-toggle="dropdown" aria-expanded="false">
          <i class="menu-notification-icon icmn-home"></i>
        </a>
        
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown cui-topbar-avatar-dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
          <span class="cui-topbar-avatar">
            <img src="../components/dummy-assets/common/img/avatars/1.jpg" alt="" />
          </span>
        </a>
        
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="cui-topbar-menu-button cui-menu-right-action-toggle">
        <i class="fa fa-bars"> <!-- --></i>
      </div>
    </div>
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
<div class="cui-layout-content">

  <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong>Human Resource</strong>
    
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: tables/datatables -->
<div class="row">
  <div class="col-lg-6">
    <div class="cui-utils-sortable" id="left-col">
      <div class="card" data-order-id="card-3">
        <div class="card-header">
          <div class="pull-right cui-utils-sortable-control">
            <i
              class="icmn-minus mr-2 cui-utils-sortable-collapse"
              data-toggle="tooltip"
              data-placement="left"
              title=""
              data-original-title="Collapse"
            ></i>
            <i
              class="icmn-plus mr-2 cui-utils-sortable-uncollapse"
              data-toggle="tooltip"
              data-placement="left"
              title=""
              data-original-title="Uncollapse"
            ></i>
            <i
              class="icmn-cross cui-utils-sortable__close"
              data-toggle="tooltip"
              data-placement="left"
              title=""
              data-original-title="Remove"
            ></i>
          </div>
          <div class="cui-utils-title"><strong>HR Management</strong></div>
        </div>
        <div class="card-body">
          <div class="row">
            <div class="col-xl-6">
              <div class="cui-user-card px-3 py-5 mb-4">
               
                <a
                   href="javascript: void(0);"
                >
                 <center> <img
                    src="../components/dummy-assets/common/img/avatars/mix.jpg"
                    alt="Alternative text to the image"
                  /></center>
                </a>
                <div class="my-3 text-center">
                  <div class="cui-user-card-user-name font-size-18" style="color:#FFF">Human Resource</div>
                  <div class="cui-user-card-post" style="color:#FFF">Management</div>
                </div>
                
              </div>
            </div>
            <div class="col-xl-6">
              <div class="cui-info-card cui-info-card-white-font bg-default">
                <span class="cui-info-card-digit">
                  <i class="icmn-users"></i>
                </span>
                <div class="cui-info-card-desc">
                <a href="/hr-add-employee">
                
                  <span class="cui-info-card-title" style="color:#FFF">Manage Employee</span>
                   <p style="color:#FFF">Employee Management System</p>
                   </a>
                </div>
              </div>
              <div class="cui-info-card cui-info-card-white-font bg-danger">
                <span class="cui-info-card-digit">
                  <i class="icmn-user"></i>
                </span>
                <div class="cui-info-card-desc">
                
                <a href="/hr-show-employee-details">
                  <span class="cui-info-card-title" style="color:#FFF">Employee Details</span>
                   <p style="color:#FFF">View all details about Employee</p>
                  </a> 
                </div>
              </div>
            </div>
            
          </div>
          <div class="cui-utils-margin-fix">
            <!-- -->
          </div>
        </div>
      </div>
      
      
    </div>
  </div>
  <div class="col-lg-6">
    <div class="cui-utils-sortable" id="right-col">
      
      
      <div class="card" data-order-id="card-1">
        <div class="card-header">
          <div class="pull-right cui-utils-sortable-control">
            <i
              class="icmn-minus mr-2 cui-utils-sortable-collapse"
              data-toggle="tooltip"
              data-placement="left"
              title=""
              data-original-title="Collapse"
            ></i>
            <i
              class="icmn-cross cui-utils-sortable__close"
              data-toggle="tooltip"
              data-placement="left"
              title=""
              data-original-title="Remove"
            ></i>
          </div>
          <div class="cui-utils-title"><strong>HR Key Features</strong></div>

        </div>
        <div class="card-body">
          <div class="row">
            <div class="col-xl-6">
              <div class="cui-info-card cui-info-card-white-font bg-success">
                <span class="cui-info-card-digit">
                  <i class="icmn-star-empty"></i>
                </span>
                <div class="cui-info-card-desc">
                
                 <a href="/hr-appraisal">
                  <span class="cui-info-card-title" style="color:#FFF">Employee Appraisal</span>
                  <p style="color:#FFF">Get your reward</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-xl-6">
              <div class="cui-info-card cui-info-card-white-font bg-primary">
                <span class="cui-info-card-digit">
                  <i class="icmn-credit-card"></i>
                </span>
                <div class="cui-info-card-desc">
                
                 <a href="/hr-payroll-summary-sheet">
                  <span class="cui-info-card-title" style="color:#FFF">Salary Management</span>
                  <p style="color:#FFF">All details about salary</p>
                  </a>
                </div>
              </div>
            </div>
            
          </div>
          <div class="cui-utils-margin-fix">
            <!-- -->
          </div>
        </div>
      </div>
      
      
      
      
    </div>
  </div>
</div>
<!-- END: tables/datatables -->

<!-- START: page scripts -->
<script>
  ;(function($) {
    'use strict'
    $(function() {
      $('#example1').DataTable({
        responsive: true,
      })

      $('#example2').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })

      $('#example3').DataTable({
        autoWidth: true,
        scrollX: true,
        fixedColumns: true,
      })
    })
  })(jQuery)
</script>
<!-- END: page scripts -->

</div>
</div>
<div class="cui-layout-footer">
<div class="cui-footer">
  <div class="cui-footer-inner">
    <div class="cui-footer-top">
      <div class="row">
        <div class="col-lg-9 mb-3">
         
         
        </div>
      </div>
    </div>
    <div class="cui-footer-bottom">
      <div class="row">
        <div class="col-md-4">
          <img src="../components/dummy-assets/common/img/logo.png" width="200" height="auto"> </div>
        <div class="col-md-8">
          <div class="cui-footer-company">
            <img
              class="cui-footer-company-logo"
              src="../components/dummy-assets/common/img/N-m.png" width="90" height="auto"
              title="#"
            />
            <span>
              © 2019 <a href="#" target="_blank">Powered by Nucigent Technology</a>
             
            </span>
          </div>
        </div>
      </div>
    </div>
    <a
      href="javascript: void(0);"
      class="cui-utils-scroll-top"
      onclick="$('body, html').animate({'scrollTop': 0}, 500)"
      ><i class="icmn-arrow-up"></i
    ></a>
  </div>
</div>
</div>
</div>
</div>
</body>

</html>