<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<aside id="sidebar" class="sidebar">
	<ul class="sidebar-nav" id="sidebar-nav">
		<li class="nav-item"><a class="nav-link collapsed"
			href="index.html"> <i class="bi bi-grid"></i> <span>Trang
					chủ</span>
		</a></li>
		<!-- End Dashboard Nav -->
		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#account" href="account.html"> <i
				class="fa-light fa-file-user"></i><span>Tài Khoản</span>
		</a></li>
		<!-- End Employee Nav -->
		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#employee" href="employee.html"> <i
				class="fa-light fa-user"></i><span>Nhân Viên</span>
		</a></li>
		<!-- End Employee Nav -->

		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#pt" href="persional-trainer.html"> <i
				class="fa-light fa-dumbbell"></i><span>Huấn luyện viên</span>
		</a></li>

		<!-- End PT Nav -->
		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#package" data-bs-toggle="collapse" href="#"> <i
				class="bi bi-bag"></i><span>Gói Tập</span><i
				class="bi bi-chevron-down ms-auto"></i>
		</a>
			<ul id="package" class="nav-content collapse"
				data-bs-parent="#sidebar-nav">
				<li><a href="package-type.html"> <i class="bi bi-circle"></i><span>Loại
							gói tập</span>
				</a></li>
				<li><a href="package.html"> <i class="bi bi-circle"></i><span>Danh
							Sách Gói Tập</span>
				</a></li>
			</ul></li>
		<!-- End Employee Nav -->
		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#class" href="class.html"> <i
				class="fa-light fa-screen-users"></i><span>Lớp</span>
		</a></li>
		<!-- End Employee Nav -->
		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#customer" data-bs-toggle="collapse" href="#"> <i
				class="bi bi-people"></i><span>Khách Hàng</span><i
				class="bi bi-chevron-down ms-auto"></i>
		</a>
			<ul id="customer" class="nav-content collapse"
				data-bs-parent="#sidebar-nav">
				<li><a href="customer.html"> <i class="bi bi-circle"></i><span>Danh
							Sách Khách Hàng</span>
				</a></li>
				<li><a href="contract-registration.html"> <i
						class="bi bi-circle"></i><span>Thông Tin Đăng Ký</span>
				</a></li>
			</ul></li>
		<!-- End Customer Nav -->

		<li class="nav-item"><a class="nav-link collapsed"
			data-bs-target="#pt" href="bill.html"> <i
				class="fa-light fa-ballot"></i><span>Hoá Đơn</span>
		</a></li>

		<li class="nav-item"><a class="nav-link collapsed"
			href="admin-login.html"> <i class="bi bi-box-arrow-left"></i> <span>Đăng
					xuất</span>
		</a></li>
	</ul>
</aside>