<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>		
	
	<h2>즐겨찾기 추가하기</h2>
	<br>
	<label>제목</label> <input type="text" id="nameInput"> <br>
	<label>주소</label> <input type="text" id="urlInput"> 
	<button type="button" id="duplicateBtn">중복확인</button> 
	<div class="small text-danger d-none" id="falseDiv">중복된 url입니다.</div>
	<div class="small text-success d-none"  id="trueDiv">사용가능한 url입니다.</div> <br>
	
	<button type="button" class="btn-success" id="addBtn">추가</button>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			
			// 중복 체크 확인
			var isDuplicateCheck = false;
			
			// 중복상태
			var isDuplicateUrl = true;
			
			$("#urlInput").on("input",function() {
				
				// 중복체크 확인, 중복 상태 변수값을 초기화
				isDuplicateCheck = false;
				isDuplicateUrl = true;
				
				$("#falseDiv").addClass("d-none");
				$("#trueDiv").addClass("d-none");
				
			})
			
			$("#duplicateBtn").on("click", function() {
				
				let url = $("#urlInput").val();
				
				
				if(url == ""){
					alert("주소를 입력하세요");
					return ;
				}
				
												
				
				$.ajax({
					type:"post"
					, url:"/ajax/url/duplicate-url"
					, data:{"url":url}
					, success:function(data){

						isDuplucatCheck = true;
						
						if(data.isDuplicate){
							isDuplicateUrl = true;
							$("#falseDiv").removeClass("d-none");
							$("#trueDiv").addClass("d-none");
						}else {
							isDuplicateUrl = false;
							$("#trueDiv").removeClass("d-none");
							$("#falseDiv").addClass("d-none");
						}
						
					}
					, error:function(){
						alert("에러 발생")
					}
					
				})
				
			});
			
			$("#addBtn").on("click", function() {
				// create api호출
				let name = $("#nameInput").val();
				let url = $("#urlInput").val();
				
				
				if(name == ""){
					alert("사이트 제목을 입력하세요");
					return ;
				}
				
				if(url == ""){
					alert("주소를 입력하세요");
					return ;
				}
				
				// 주소가 https:// 로 시작하지 않으면 alert
				// 주소가 http:// 로 시작하지 않고 https:// 로 시작하지 않으면
				if(!url.startsWith("https://") && !url.startsWith("http://")){
					
					alert("주소 형식을 확인 해주세요")
					return ;
				}
				
				// 중복 확인안된 상탱
				if(!isDuplicateCheck) {
					alert("url 중복확인")
					return ;
				}
				
				
				// 중복된 url 일때
				if(isDuplicateUrl) {
					alert("중복된 url입니다.")
					return ;
				}
				
				
				$.ajax({
					type:"post"
					, url:"/ajax/url/create"
					, data:{"name":name, "url":url}
					, success:function(data){
						
						if(data.result == "success"){
							
							location.href = "/ajax/url/list";
						}else {
							alert("즐겨찾기 추가 실패");
						}
						
					}
					, error: function(){
						
						alert("에러 발생");
					}
				})
				
			});
			
		});
	</script>
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
</body>
</html>