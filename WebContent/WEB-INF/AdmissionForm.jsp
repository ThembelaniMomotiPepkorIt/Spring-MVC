<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMsg}</h1>
	<form action="/FirstStringMVCProject/submitAdmissionForm.html" method="post">
		Name
		<p>
			<input type="text" name="studentName"/>
		</p><br/>
		Hobby
		<p>
			<input type="text" name="studentHobby"/>
		</p><br/>
		DOB
		<p>
			<input type="text" name="studentDOB"/>
		</p><br/>
		Cellphone Number
		<p>
			<input type="text" name="studentCellphone"/>
		</p><br/>
		Skills
		<p>
			<select name="studentSkills" multiple>
				<option>Core Java</option>
				<option>Core Spring</option>
				<option>Spring MVC</option>
				<option>PL SQL</option>
				<option>AngularJS</option>
				<option>Ionic Framework</option>
			</select>
		</p><br/>
		<p>
			<input type="submit" value="submit"/>
		</p>
		
		
	
	</form>
</body>
</html>