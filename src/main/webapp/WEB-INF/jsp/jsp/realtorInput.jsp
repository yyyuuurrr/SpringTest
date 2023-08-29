<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공인중개사 추가</title>
</head>
<body>

	<h2>공인중개사 추가</h2>

	<form method="post" action="/jsp/realtor/create">
		<div class="container">
			<label>상호명</label> <br>
			<input type="text" name="office"> <br>
			
			<label>전화번호</label> <br>
			<input type="text" name="phoneNumber"> <br>
			
			<label>주소</label> <br>
			<input type="text" name="address"> <br>
			
			<label>등급</label> <br>
			<input type="text" name="grade"> <br>
			
			<button type="submit">추가</button>		
		</div>	
	</form>


</body>
</html>