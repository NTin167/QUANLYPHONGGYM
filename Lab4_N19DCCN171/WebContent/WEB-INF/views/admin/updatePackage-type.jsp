<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="./head.jsp"%>
</head>
<body>
	<!-- ======= Header ======= -->
	<%@include file="./header.jsp"%>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->
	<%@include file="./sidebar.jsp"%>
	<!-- End Sidebar-->
	<main id="main" class="main">
		<section class="section">
			<div class="row">
				<div class="col-lg-12">				
					<div class="card">
						<div class="card-body">
			<form method="post" class="form" action="${pageContext.request.contextPath}/admin/package/update/${trainingPackTypeEntity.packTypeID}.htm"
               modelAttribute="updatePKT">
               	
               	
     
               	
				<div class="modal-dialog modal-dialog-centered">
					<div class="modal-content">
						<div class="modal-header bg-primary text-white px-3 py-2">
							<h5 class="modal-title">Sửa loại gói</h5>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body">
							<div class="row g-3" id="form-package">
								<div class="col-md-12">
									<label for="input-package-name" class="form-label">Mã loại
										</label> 
										<input  type="text" class="form-control"
										id="input-package-name" name="packTypeID" value="${trainingPackTypeEntity.packTypeID}"readonly/>
										
								</div>
								
								
       
								<div class="col-md-12">
									<label for="input-package-name" class="form-label">Tên
										loại</label> 
										<input  type="text" class="form-control"
										id="input-package-name" name="packTypeName" value="${trainingPackTypeEntity.packTypeName}" required/>
								</div>
								<div class="col-md-12">
									<label for="input-package-name" class="form-label">Mô
										tả</label>
									
									<textarea class="form-control" aria-label="With textarea"
										rows="5"  name="describe" >
										${trainingPackTypeEntity.describe}
									</textarea>
								</div>
							
								<div class="modal-footer" class="btn btn-primary">
								<button class="btn btn-primary btn-lg btn-block">Xác nhận</button>				
								</div>
							</div>
						</div>
					
					</div>
				</div>
				
				
				<label class="success-message"> ${success_message}</label>
        		<label class="fail-message"> ${fail_message}</label>			
			</form>
		</div>
	   </div>
	  </div>
	 </div>
		
		</section>
	</main>
		<%@include file="./script.jsp"%>
</body>
</html>