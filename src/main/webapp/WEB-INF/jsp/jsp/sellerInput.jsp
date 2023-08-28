<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매자 추가</title>
</head>
<body>

	<form method="get" action="/jsp/seller/create">
		<h2>판매자 추가</h2>
		
		<label>닉네임</label> <input type="text" name="nickname"> <br>
		<label>프로필 사진 url</label> <input type="text" name="profileImage"> <br>
		<label>온도</label> <input type="text" name="temperature"> <br>
		
		<button type="submit">추가</button>	
	</form>
	
</body>
</html>