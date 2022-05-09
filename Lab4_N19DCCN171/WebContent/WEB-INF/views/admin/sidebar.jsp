<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="preloader">
	<div class="lds-ripple">
		<div class="lds-pos"></div>
		<div class="lds-pos"></div>
	</div>
</div>
<header class="topbar v-topbar" data-navbarbg="skin6">
	<nav class="navbar top-navbar navbar-expand-md">
		<div class="navbar-header" data-logobg="skin6">

			<a class="nav-toggler waves-effect waves-light d-block d-md-none"
				href="javascript:void(0)"><i class="ti-menu ti-close"></i></a>
			<div class="navbar-brand">
				<a href="admin/dashboard.htm"> <b class="logo-icon"> 
						<img
						src="<c:url value='./resources/imgs/theme/logo.svg'/>"
						alt="homepage" class="dark-logo" style="width: 120px;
    min-width: 120px;"/> 
				</b> 
				</a>
				
			</div>
			
		</div>
	</nav>
</header>

<aside class="left-sidebar" data-sidebarbg="skin6">
	<!-- Sidebar scroll-->
	<div class="scroll-sidebar" data-sidebarbg="skin6">
		<!-- Sidebar navigation-->
		<nav class="sidebar-nav">
			<ul id="sidebarnav">
				<li class="sidebar-item "><a class="sidebar-link sidebar-link "
					href="admin/dashboard.htm" aria-expanded="false"><i
						data-feather="home" class="feather-icon"></i><span
						class="hide-menu">Trang Chủ</span></a></li>
				<li class="list-divider"></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/product.htm" aria-expanded="false"><i
						class="fab fa-dropbox"></i><span class="hide-menu">Sản Phẩm</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/customer.htm" aria-expanded="false"><i
						class=" icon-people"></i><span class="hide-menu">Khách Hàng</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/order.htm" aria-expanded="false"><i
						data-feather="calendar" class="feather-icon"></i><span
						class="hide-menu">Đơn Đặt</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/sale.htm" aria-expanded="false"><i
						class="icon-tag"></i><span class="hide-menu">Khuyến Mãi</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/brand.htm" aria-expanded="false"><i
						class=" fas fa-handshake"></i><span class="hide-menu">Nhãn
							Hàng</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/news.htm" aria-expanded="false"><i
						class=" icon-book-open"></i><span class="hide-menu">Tin Mới</span></a></li>
				<li class="sidebar-item"><a class="sidebar-link sidebar-link"
					href="admin/login.htm" aria-expanded="false"><i
						class="icon-logout"></i><span class="hide-menu">Đăng Xuất</span></a></li>

				<li class="list-divider"></li>

			</ul>
		</nav>
		<!-- End Sidebar navigation -->
	</div>
	<!-- End Sidebar scroll-->
</aside>