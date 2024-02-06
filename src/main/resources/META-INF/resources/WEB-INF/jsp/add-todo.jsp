<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	<title>New todo</title>
	</head>
	<body>
		<div class="container">
			<h1>Enter your todo</h1>
			<pre>${error}</pre>
			<form:form method="post" modelAttribute="todo">
				Description: <form:input type="text" path="desc" required="required" /> 
				Due Date : <form:input type="datetime-local" path="dueDate" required="required" />
				ID : <form:input type="hidden" path="id" required="required" />
				<input type="submit" class ="btn btn-success" >
				<br>
				<form:errors path="desc"/>
			</form:form>
		</div>
	<script type="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script type="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>

</html>