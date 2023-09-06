<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
</head>
<body>		
	
	<h2>즐겨찾기 추가하기</h2>

	<label>제목</label> <input type="text" id="nameInput"> <br>
	<label>주소</label> <input type="text" id="urlInput"> <button type="button" id="duplicateBtn">중복확인</button> <br>
	<button type="button" id="addBtn">추가</button>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			
			$("#duplicateBtn").on("click", function() {
				
				let url = $("#urlInput").val();
				
				if(url == ""){
					alert("주소를 입력하세요");
					return ;
				}
				
				$.ajax({
					type="get"
					, url:"/ajax/url/duplicate-url"
					, data:{"url":url}
					, success:function(data){
						
						if(data.isDuplicate){
							alert("중복된 url 입니다.")
						}else {
							alert("사용가능한 url 입니다.")
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
	
	
</body>
</html>