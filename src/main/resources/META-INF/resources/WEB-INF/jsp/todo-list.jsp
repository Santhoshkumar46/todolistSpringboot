<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<title>todo list</title>
	</head>
	<body>
		<div class="container">
				<h1>${name} todos are</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>username</th>
						<th>desc</th>
						<th>dueDate</th>	
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var = "todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.username}</td>
							<td>${todo.desc}</td>
							<td>${todo.dueDate}</td>	
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-success">Add ToDo</a>
		</div>
	<script type="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>

</html>