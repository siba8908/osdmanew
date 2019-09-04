<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<jsp:include page="../layout/header.jsp"></jsp:include>

<!-- <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>
      Sunjray | Holiday
  </title>
  <link href="../components/dummy-assets/common/img/favicon.png" rel="shortcut icon">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i" rel="stylesheet">

  ../vendors
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
  <link rel="stylesheet" type="text/css" href="cdn.datatables.net/v/bs4/dt-1.10.18/fc-3.2.5/r-2.2.2/datatables.min.css" />
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
  <script type="text/javascript" src="cdn.datatables.net/v/bs4/dt-1.10.18/fc-3.2.5/r-2.2.2/datatables.min.js"></script>
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
 <script
	src="../vendors/datatables.net/js/jquery.dataTables.js"></script>
	 <script
	src="../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.8.0/jszip.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.8.0/xlsx.js"></script>
	

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
    
    
    .upload-btn-wrapper {
  position: relative;
  overflow: hidden;
  display: inline-block;
}

.btn {
  border: 1px solid grey;
  color: gray;
  background-color: white;
  padding: 10px 20px;
  border-radius: 8px;
  font-size: 16px;
  font-weight: bold;
}

.upload-btn-wrapper input[type=file] {
  font-size: 100px;
  position: absolute;
  left: 0;
  top: 0;
  opacity: 0;
}
	
  </style>
  <script>
    $(document).ready(function () {
      $('.cui-initial-loading').delay(200).fadeOut(400)
    })
  
   
  </script>
</head> -->
<script src="../vendors/datatables.net/js/datatables.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>
<script src="../vendors/customizedjs/holidayList.js"></script>

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
<jsp:include page="../layout/hr-leftmenu.jsp"></jsp:include>
<div class="cui-layout">
<div class="cui-layout-header">
<div class="cui-topbar">
  <!-- left aligned items -->
  <div class="cui-topbar-left">
    <div class="cui-topbar-item">
      <div class="dropdown">
        <a href="#" class="dropdown-toggle text-nowrap" data-toggle="dropdown" aria-expanded="false">
          <i class="icmn-folder-open mr-2"></i>
          <span class="d-none d-xl-inline-block"><strong>Issues History</strong></span>
        </a>
        <div class="dropdown-menu" role="menu">
          <a class="dropdown-item" href="javascript:void(0)">Current search</a>
          <a class="dropdown-item" href="javascript:void(0)">Search for issues</a>
          <div class="dropdown-divider"></div>
          <div class="dropdown-header">Opened</div>
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-checkmark"></i> CLNUI-253 Project implemen...</a
          >
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-checkmark"></i> CLNUI-234 Active history iss...</a
          >
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-clock"></i> CLNUI-424 Ionicons intergrat...</a
          >
          <a class="dropdown-item" href="javascript:void(0)">More...</a>
          <div class="dropdown-divider"></div>
          <div class="dropdown-header">Filters</div>
          <a class="dropdown-item" href="javascript:void(0)">My open issues</a>
          <a class="dropdown-item" href="javascript:void(0)">Reported by me</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="javascript:void(0)">Import issues from CSV</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-cog"></i> Settings</a
          >
        </div>
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown">
        <a href="#" class="dropdown-toggle text-nowrap" data-toggle="dropdown" aria-expanded="false">
          <i class="icmn-database mr-2"></i>
          <span class="d-none d-xl-inline-block"><strong>Project Management</strong></span>
        </a>
        <div class="dropdown-menu" role="menu">
          <div class="dropdown-header">Active</div>
          <a class="dropdown-item" href="javascript:void(0)">Project Management</a>
          <a class="dropdown-item" href="javascript:void(0)">User Inetrface Development</a>
          <a class="dropdown-item" href="javascript:void(0)">Documentation</a>
          <div class="dropdown-header">Inactive</div>
          <a class="dropdown-item" href="javascript:void(0)">Marketing</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-cog"></i> Settings</a
          >
        </div>
      </div>
    </div>
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
    <div class="cui-topbar-item d-none d-md-block">
      
    </div>
    <div class="cui-topbar-item d-none d-lg-block ml-0">
     
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown">
        <a href="#" class="dropdown-toggle text-nowrap" data-toggle="dropdown" aria-expanded="false">
          <i class="menu-notification-icon icmn-home"></i>
        </a>
        <div class="dropdown-menu dropdown-menu-right" role="menu">
          <div class="cui-topbar-activity">
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-star-full"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">now</span>
                  <a href="javascript: void(0);"
                    >Update Status: <span class="badge badge-danger">New</span></a
                  >
                </div>
                <div class="cui-topbar-activity-descr">
                  Failed to get available update data. To ensure the proper functioning of your
                  application, update now.
                </div>
              </div>
            </div>
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-stack"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">24 min ago</span>
                  <a href="javascript: void(0);"
                    >Income: <span class="badge badge-default">$299.00</span></a
                  >
                </div>
                <div class="cui-topbar-activity-descr">
                  Failed to get available update data. To ensure the proper functioning of your
                  application, update now.
                </div>
              </div>
            </div>
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-list"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">30 min ago</span>
                  <a href="javascript: void(0);">Inbox Message</a>
                </div>
                <div class="cui-topbar-activity-descr">
                  From: <a href="javascript: void(0);">David Bowie</a>
                </div>
              </div>
            </div>
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-home"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">now</span>
                  <a href="javascript: void(0);"
                    >Update Status: <span class="badge badge-primary">New</span></a
                  >
                </div>
                <div class="cui-topbar-activity-descr">
                  Failed to get available update data. To ensure the proper functioning of your
                  application, update now.
                </div>
              </div>
            </div>
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-loop"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">24 min ago</span>
                  <a href="javascript: void(0);"
                    >Income: <span class="badge badge-warning">$299.00</span></a
                  >
                </div>
                <div class="cui-topbar-activity-descr">
                  Failed to get available update data. To ensure the proper functioning of your
                  application, update now.
                </div>
              </div>
            </div>
            <div class="cui-topbar-activity-item">
              <i class="cui-topbar-activity-icon icmn-cog"></i>
              <div class="cui-topbar-activity-inner">
                <div class="cui-topbar-activity-title">
                  <span class="pull-right">30 min ago</span>
                  <a href="javascript: void(0);">Inbox Message</a>
                </div>
                <div class="cui-topbar-activity-descr">
                  From: <a href="javascript: void(0);">David Bowie</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="cui-topbar-item">
      <div class="dropdown cui-topbar-avatar-dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
          <span class="cui-topbar-avatar">
            <img src="../components/dummy-assets/common/img/avatars/1.jpg" alt="" />
          </span>
        </a>
        <div class="dropdown-menu dropdown-menu-right" role="menu">
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-user"></i> Profile</a
          >
          <div class="dropdown-divider"></div>
          <div class="dropdown-header">Home</div>
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-circle-right"></i> System Dashboard</a
          >
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-circle-right"></i> User Boards</a
          >
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-circle-right"></i> Issue Navigator
            <span class="badge badge-success font-size-11 ml-2">25 New</span></a
          >
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="javascript:void(0)"
            ><i class="dropdown-icon icmn-exit"></i> Logout</a
          >
        </div>
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
<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
  <div class="pull-right">
    
  </div>
  <span class="font-size-18 d-block">
    <span class="text-muted">Home ·</span>
    <strong> Human Resource </strong>
    <small class="text-muted"></small>
  </span>
</nav>
<div class="cui-utils-content">
<!-- START: ../components/date-picker -->
<section class="card">
  <div class="card-header">
    <span class="cui-utils-title">
      <strong>holiday list</strong>
      <strong style="margin-left:500px">Holiday View</strong>
    </span>
  </div>
  
  <div class="card-body">
    <div class="row">
      <div class="col-lg-6">
        <h5 class="text-black"><strong></strong></h5>
        <p class="text-muted">
         
         
        </p>
        
        <form name="holidayform" id="holidayform">		
         <div class="table-responsive mb-5">
          <table class="table table-hover" id="field">
            <thead>
              <tr style="color:#06C">
                <th style="padding-left:50px">Date</th>
                <th style="padding-left:50px">Day</th>
                <th style="padding-left:50px">Event</th>
               
              </tr>
            </thead>
            <tbody>
              <tr>
                <td> <input
              type="date"
              class="form-control"
              placeholder="Select Date"
              for ="holiday_date"
              id="datepicker-only-init"
              name="[0][holiday_date]"
             
              data-target="#datepicker-only-init"
            /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Day" for="holiday_day" id="holidayDay" name="[0][holiday_day]" /></td>
                <td><input type="text" class="form-control" placeholder="Enter Event" for="holiday_events" id="holidayEvent" name="[0][holiday_events]" /></td>
                
                <td> <button type="button" name="add" id="add" class="btn btn-info"><i class="fa fa-plus"></i> </button></td>
              </tr>
             <!--  <tr>
                <td> <input
              type="text"
              class="form-control"
              placeholder="Select Date"
              for ="holiday_date"
              id="datepicker-only-init1"
              name="[1][holiday_date]"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init1"
            /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Day" for="holiday_day" id="holidayDay" name="[1][holidayDay]"  /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Event" for="holiday_event" id="holidayEvent" name="[1][holiday_event]"/></td>
               
              </tr>
              <tr>
                <td><input
              type="text"
              class="form-control"
              placeholder="Select Date"
              for ="holiday_date"
              id="datepicker-only-init2"
              name="[2][holiday_date]"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init2"
              /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Day" for="holiday_day" id="holidayDay" name="[2][holidayDay]"/></td>
                <td> <input type="text" class="form-control" placeholder="Enter Event" for="holiday_event" id="holidayEvent" name="[2][holiday_event]" /></td>
                
              </tr>
              <tr>
                <td><input
              type="text"
              class="form-control"
              placeholder="Select Date"
              for ="holiday_date"
              id="datepicker-only-init3"
              name="[3][holiday_date]"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init3"
            /></td>
                <td>  <input type="text" class="form-control" placeholder="Enter Day" for="holiday_day" id="holidayDay" name="[3][holidayDay]" /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Event" for="holiday_event" id="holidayEvent" name="[3][holiday_event]" /></td>
              </tr>
              <tr>
                <td><input
              type="text"
              class="form-control"
              placeholder="Select Date"
              for ="holiday_date"
              id="datepicker-only-init4"
              name="[4][holiday_date]"
              data-toggle="datetimepicker"
              data-target="#datepicker-only-init4"
            /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Day" for="holiday_day" id="holidayDay" name="[4][holidayDay]" /></td>
                <td> <input type="text" class="form-control" placeholder="Enter Event" for="holiday_event" id="holidayEvent" name="[4][holiday_event]"/></td>
              </tr>
              <tr>
                
              </tr>
              
            </tfoot> -->
          </table>
        </div>

        <button type="button" id ="btnSave" class="btn btn-primary" style="margin-left:250px;margin-bottom:90px;padding:10px 50px 10px 50px">Save</button>
        
       <!--  <button type="button" id ="btnUpload"  class="btn btn-primary" style="float:right;padding:10px 50px 10px 50px">Upload</button> -->
                
         
          <div class="mb-5">
          
          <div class="form-group">
          
                <input type="file"  class="file" id ="fileUploadForm" name="fileUploadForm" >
                
                <button type="button" id ="btnUpload" class="btn btn-primary" onclick="uploadFile()">Upload Holiday List</button>
              
         </div>
                
              
        </div>
        </form>
        <div class="mb-5">
          <div class="form-group">
           
          </div>
        </div>
      </div>
       
      <div class="col-lg-6">
      
        <h5 class="text-black"><strong></strong></h5>
        <p class="text-muted">
         <table id="dataTableHoliday" class="table table-hover">
            <thead>
              <tr style="color:#06C">
                <th>Date</th>
                <th>Day</th>
                <th >Event</th>
               
              </tr>
            </thead>
            <!--  <tbody>
              <tr>
                <td> 09/01/2014
                </td>
                <td> Monday</td>
                <td>Raja</td>
                
              </tr>
              <tr>
                <td> 09/01/2014</td>
                <td>Tuesday</td>
                <td> Saraswatipuja</td>
               
              </tr>
              <tr>
                <td>09/01/2014</td>
                <td> Tuesday</td>
                <td> Holi</td>
                
              </tr>
              
              
              
              
              
              <tr>
                <td>09/01/2014</td>
                <td>Monday</td>
                <td> Durgapuja</td>
              </tr>
              <tr>
                <td>09/01/2014</td>
                <td>Friday</td>
                <td>Goodfriday</td>
              </tr>
              <tr>
                <td>09/01/2014</td>
                <td>Tuesday</td>
                <td>Rathayatra</td>
              </tr
              ><tr>
                
              </tr>
              
            </tfoot> --> 
            </table>
        </p>
        <div class="mb-5">
          <div class="form-group">
           
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <h5 class="text-black"><strong></strong></h5>
        <p class="text-muted">
         
        </p>
        <div class="mb-5">
          <div class="form-group">
            
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <h5 class="text-black"><strong></strong></h5>
        <p class="text-muted">
         
        </p>
        <div class="mb-5">
          <div class="form-group">
           
          </div>
        </div>
      </div>
      <div class="col-lg-6">
        <h5 class="text-black"><strong></strong></h5>
        <p class="text-muted">
         
        </p>
        <div class="mb-5">
          <div class="form-group">
           
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- END: ../components/date-picker -->

<!-- START: page scripts -->
<script>
  ;(function($) {
    'use strict'
    $(function() {
	$('#datepicker-only-init').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init1').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init2').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
	$('#datepicker-only-init3').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
      })
      $('#datepicker-only-init4').datetimepicker({
        icons: {
          time: 'fa fa-clock-o',
          date: 'fa fa-calendar',
          up: 'fa fa-arrow-up',
          down: 'fa fa-arrow-down',
          previous: 'fa fa-arrow-left',
          next: 'fa fa-arrow-right',
        },
        format: 'LL',
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
          <div class="mb-3">
            <strong
              ></strong>
          </div>
          <div class="cui-footer-description">
            <p>
              
            </p>

            <p>
              
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="cui-footer-bottom">
      <div class="row">
        <div class="col-md-4">
         
        </div>
        <div class="col-md-8">
          <div class="cui-footer-company">
            
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