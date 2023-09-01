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
	
	<div id="wrap" class="">
		<section class=" bg-success d-flex">
			<div class="rogo bg-warning">
				<div>
					<img width="50" src="data:image/png;base64,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">		
					<p>기상청</p>
				</div>
			</div>
		
			<div class="menu container bg-primary">
			
			</div>
		</section>
	
	</div>
	
	
	
	
	
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
</body>
</html>