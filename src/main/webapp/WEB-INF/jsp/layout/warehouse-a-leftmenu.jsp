<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
		    src="../components/dummy-assets/common/img/logo-p.png"
		    alt=""
		 />
		<img
			class="cui-menu-left-logo-toggled"
		    src="../components/dummy-assets/common/img/logo-pmt.png"
		    alt=""
		 />
			</a>
		</div>
		<div class="cui-menu-left-scroll">
			<ul class="cui-menu-left-list cui-menu-left-list-root">
				<li class="cui-menu-left-item"><a
					href="sm-warehouse-a-dashboard"
					class="cui-menu-right-action-toggle"> <span
						class="cui-menu-left-icon icmn-cog"></span> <span
						class="cui-menu-left-title">Dashboard</span>
				</a></li>
				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a
					href="sm-warehouse-a-material-list"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Material List</span>
				</a></li>
				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a href="sm-warehouse-a-upload-bill"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Upload Bill</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a
					href="sm-warehouse-a-stocks"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Stocks</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item"><a
					href="sm-warehouse-a-defective-material"> <span
						class="cui-menu-left-icon icmn-books"></span> <span
						class="cui-menu-left-title">Defective Material</span>
				</a></li>

				<li class="cui-menu-left-divider">
					<!-- -->
				</li>
				<li class="cui-menu-left-item cui-menu-left-submenu"><a
					href="#reportSubmenu" data-toggle="collapse" aria-expanded="false"
					class="dropdown-toggle"><span
						class="cui-menu-left-icon icmn-file-text"></span><span
						class="cui-menu-left-title"> Reports </span> </a>
					<ul class="collapse list-unstyled" id="reportSubmenu">
						<li class="cui-menu-left-item"><a
							href="warehouse-a-materials-report"><span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Material List</span></a></li>
						<li class="cui-menu-left-item"><a
							href="warehouse-a-stock-in-report"><span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Stock In</span></a></li>
						<li class="cui-menu-left-item"><a
							href="warehouse-a-stock-out-report"><span
								class="cui-menu-left-icon icmn-books"></span> <span
								class="cui-menu-left-title">Stock Out</span></a></li>
					</ul></li>
				<li class="cui-menu-left-divider"></li>
			</ul>
		</div>
	</div>
</nav>