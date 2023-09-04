<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기상청</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/jstlCSS/style.css" />
</head>
<body>

	   <div id="wrap">
	   		<section class="d-flex">
	   			<div class="logo bg-primary col-3">
	   				<div class="pt-3 pl-4">
	   					<img width="150" src="https://www.kma.go.kr/kma/resources/images/sub/sig2.png">
	   				</div>
	   				<div class="pt-4">
		   				<ul class="nav flex-column" style='font-size:x-large;'>
		   					<li class="nav-item"><a herf="#" class="nav-link text-white">날씨</a></li>
		   					<li class="nav-item"><a herf="#" class="nav-link text-white">날씨입력</a></li>
		   					<li class="nav-item"><a herf="#" class="nav-link text-white">테마날씨</a></li>
		   					<li class="nav-item"><a herf="#" class="nav-link text-white">관측기후</a></li>
		   				</ul>
	   				</div>
	   			</div>
	   			<div class="contents col-9 pt-3">
   					<h3 class="pl-3">과거 날씨</h3>
	   				<table class="table text-center">
	   					<tr>
	   						<th>날짜</th>
	   						<th>날씨</th>
	   						<th>기온</th>
	   						<th>강수량</th>
	   						<th>미세먼지</th>
	   						<th>풍속</th>
	   					</tr>
	   					<c:forEach var="weatherhistory" items="${weatherhistoryList }">
	   					<tr>
	   						<td><fmt:formatDate value="${weatherhistory.date }" pattern="yyyy년 MM월 dd일"/></td>
	   						<c:choose>
	   							<c:when test="${weatherhistory.weather eq '맑음'}">
	   								<td><img src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"></td>
	   							</c:when>
	   							<c:when test="${weatherhistory.weather eq '구름조금'}">
	   								<td><img src="http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg"></td>
	   							</c:when>
	   							<c:when test="${weatherhistory.weather eq '흐림'}">
	   								<td><img src="http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg"></td>
	   							</c:when>
	   							<c:when test="${weatherhistory.weather eq '비'}">
	   								<td><img src="http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg"></td>
	   							</c:when>
	   							<c:otherwise>
	   								<td>${weatherhistory.weather }</td>
	   							</c:otherwise>
	   						</c:choose>
	   						<td>${weatherhistory.temperatures }°C</td>
	   						<td>${weatherhistory.precipitation }mm</td>
	   						<td>${weatherhistory.microDust }</td>
	   						<td>${weatherhistory.windSpeed }km/h</td>
	   					</tr>
	   					</c:forEach>
	   				</table>
	   			</div>
	   		</section>
		    <footer class="d-flex">
		    	<div class="footer1 col-3">
		    		<img width="180" src="https://www.kma.go.kr/kma/resources/images/sub/sig2.png">
		    	</div>
		    	<div class="footer2 col-9 pt-4 text-secondary small pl-5">
		    		<p>서울 (07062) 서울특별시 동작구 여의대방로16길 61<br>
		    		Copyright@2022 KMA. All Rights RESERVED</p>
		    	</div>
		    </footer>  
       </div>


   	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>