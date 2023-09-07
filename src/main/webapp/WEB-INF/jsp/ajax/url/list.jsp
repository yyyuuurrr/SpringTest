<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	
	<div class="container text-center">
		<h3>즐겨찾기</h3>
		<table class="table">
			<tr>
				<th>No.</th>
				<th>이름</th>
				<th>주소</th>
				<th></th>
			</tr>
			<c:forEach var="url" items="${urlList }">
			<tr>
				<td>${url.id }</td>
				<td>${url.name }</td>
				<td>${url.url }</td>
				<td><button type="button" data-url-id ="${url.id }" class="delete-btn">삭제</button></td>
			</tr>
			</c:forEach>
			
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
		<script>
			$(document).ready(function() {
				
				$(".delete-btn").on("click", function() {
					
					let id = $(this).data("url-id");
					
					$.ajax({
						type:"get"
						, url:"/ajax/url/delete"
						, data:{"id":id}
						, success:function(data) {
							
							if(data.result == "success"){
								location.reload();
							}else{
								alert("삭제 실패")
							}
							
						}
						, error:function() {
							alert("삭제 에러")
						}
					})

					

				});
				
				
			});
		
		

		
		
		</script>



</body>
</html>