<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/jstlCSS/ajax/style.css" />
</head>
<body>

			<div id="wrap" >
            <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="mt-4">
                    <ul class="nav nav-fill">
                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약안내</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">커뮤니티</a></li>
                    </ul>
                </nav>
            </header>
			<form method="post" action="/ajax/booking/insert">
            <section class="banner">
            	<div class="justify-content-center">
 					<div class="input-gorup form-inline">
 						<label class="input-label">이름 </label> 
 						<input type="text" name="name" class="nameInput">
 					</div>
 					<div class="input-gorup form-inline mt-3">
 						<label class="input-label">예약날짜 </label> 
 						<input type="text" name="date" class="dateInput">
 					</div>
 					<div class="input-gorup form-inline mt-3">
 						<label class="input-label">숙박일수 </label> 
 						<input type="text" name="day" class="dayInput">
 					</div>
 					<div class="input-gorup form-inline mt-3">
 						<label class="input-label">숙박인원 </label> 
 						<input type="text" name="headcount" class="headcountInput">
 					</div>
					<div class="input-gorup form-inline mt-3">
 						<label class="input-label">전화번호 </label> 
 						<input type="text" name="phoneNumber" class="phoneNumberInput">
 					</div>
 					<div class="input-gorup form-inline mt-3">
 						<button type="submit" class="btn-warning bookingBtn">예약하기 </button>
 					</div>
            	</div>
            </section>
            </form>
            <footer class="mt-3 ml-4 pt-4">
                <address class="small text-secondary">
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>
	
		</div>



	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script>
	$(document).ready(function() {
		
		$("#bookingBtn").on("click", function() {
			
			
			
			
			
			
			
		})	
	
		
	});
	
	
	</script>


</body>
</html>