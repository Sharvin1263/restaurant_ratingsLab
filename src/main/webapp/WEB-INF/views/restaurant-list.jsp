<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>restaurant list</title>

<!-- Link the bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
<!-- Or in this case, a variation theme... -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />

</head>
<body>

<div class="container">
		<h1>Restaurant Ratings</h1>
		<table class="table">
			<thead>
				<tr>
				<th>id</th><th>Name</th><th>Rating
				</tr>
			</thead>
			<tbody>
				<c:forEach var="restaurant" items="${restaurants}">
				<tr>
					<td>${restaurant.id}</td> 
					<td>${restaurant.name}</td>
					<td>${restaurant.rating}</td>
					<td><a class="btn btn-danger" href="/upvote?id=${restaurant.id}">Upvote</a></td>
									
				</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
<script>
      
    </script>

</body>
</html>