<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<jsp:include page="../layout/links.jsp"></jsp:include>
<body
	class="cui-config-borderless cui-menu-left-toggled cui-menu-colorful cui-menu-left-shadow">
	<div class="cui-initial-loading"></div>
	<div class="cui-layout cui-layout-has-sider">
		<jsp:include page="../layout/pm-leftmenu.jsp"></jsp:include>
		<div class="cui-layout">
			<jsp:include page="../layout/header.jsp"></jsp:include>

			<div class="cui-layout-content">
				<nav class="cui-breadcrumbs cui-breadcrumbs-bg">
					<div class="pull-right"></div>
					<span class="font-size-18 d-block"> <span class="text-muted">Home
							·</span> <strong>Project Manager </strong> <small class="text-muted"></small>
					</span>

				</nav>
				<div class="row">
					<div class="col-lg-12 col-xs-12 col-sm-12">
						<div class="card-deck">
							<div class="card">
								<div class="card-body text-center">
									<div id="map"
										style="width: 100%; height: 1000px; border: solid thin #999;"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- END: forms/selectboxes -->

	<!-- START: page scripts -->

	<!-- END: page scripts -->

	<div class="cui-layout-footer">
		<div class="cui-footer">
			<div class="cui-footer-inner">
				<div class="cui-footer-top">
					<div class="row">
						<div class="col-lg-9 mb-3">
							<div class="mb-3">
								<strong></strong>
							</div>
							<div class="cui-footer-description"></div>
						</div>
						<div class="cui-footer-bottom">
							<div class="row">
								<div class="col-md-4">
									<img src="../components/dummy-assets/common/img/logo.png"
										width="200" height="auto">
								</div>
								<div class="col-md-8">
									<div class="cui-footer-company">
										<img class="cui-footer-company-logo"
											src="../components/dummy-assets/common/img/N-m.png"
											width="90" height="auto" title="#" /> <span> © 2019
											<a href="#" target="_blank">Powered by Nucigent
												Technology</a>

										</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
       // Note: This example requires that you consent to location sharing when
      // prompted by your browser. If you see the error "The Geolocation service
      // failed.", it means you probably did not give permission for the browser to
      // locate you.
      var map, infoWindow;
     
     
      function initMap() {
    	  var image = {
    			    url: 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png',
    			    // This marker is 20 pixels wide by 32 pixels high.
    			    size: new google.maps.Size(20, 32),
    			    // The origin for this image is (0, 0).
    			    origin: new google.maps.Point(0, 0),
    			    // The anchor for this image is the base of the flagpole at (0, 32).
    			    anchor: new google.maps.Point(0, 32)
    			  };
    			  // Shapes define the clickable region of the icon. The type defines an HTML
    			  // <area> element 'poly' which traces out a polygon as a series of X,Y points.
    			  // The final coordinate closes the poly by connecting to the first coordinate.
    			  var shape = {
    			    coords: [1, 1, 1, 20, 18, 20, 18, 1],
    			    type: 'poly'
    			  };   
    	  
    	/*   var coordsDiv = document.getElementById('coords');
          map.controls[google.maps.ControlPosition.TOP_CENTER].push(coordsDiv); */
       /*  map = new google.maps.Map(document.getElementById('map'), {
          center: {lat:20.369559, lng: 85.7593133},
          zoom: 10
        });
        infoWindow = new google.maps.InfoWindow; */
       
        <c:forEach items="${siteCodeLocation}" var="sitecode" >
        var map${sitecode.siteCodeId} = {
        		info: '<strong>${sitecode.siteCode}</strong><br>\Sitecode:${sitecode.siteCode}<br>\Site Name:${sitecode.siteName}',      
        					lat: ${sitecode.latitude}, 
        	        		long: ${sitecode.longitude}    
        	};
        </c:forEach>  

    	var locations = [
    		
    		 <c:forEach items="${siteCodeLocation}" var="sitecode" >
    		 [map${sitecode.siteCodeId}.info, map${sitecode.siteCodeId}.lat, map${sitecode.siteCodeId}.long, 0], 
    		 </c:forEach>  
    		 
          
        ];  

    	var map = new google.maps.Map(document.getElementById('map'), { 
    		zoom: 6,
    		 //center: {lat:20.369559, lng: 85.7593133},
    		center: new google.maps.LatLng(locations[0][1], locations[0][2]),  
    		mapTypeId: google.maps.MapTypeId.ROADMAP
    	});

    	var infowindow = new google.maps.InfoWindow({});

    	var marker, i;

    	for (i = 0; i < locations.length; i++) {
    		marker = new google.maps.Marker({
    			position: new google.maps.LatLng(locations[i][1], locations[i][2]),
    			map: map
    		});

    		google.maps.event.addListener(marker, 'click', (function (marker, i) {
    			return function () {
    				infowindow.setContent(locations[i][0]);
    				infowindow.open(map, marker);
    			}
    		})(marker, i));
    	} 
      } 
    </script>

	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBTpKaj8Rp7GLTkyrbTCOaXn_9v65SE2RM&callback=initMap">
    </script>
</body>
</html>