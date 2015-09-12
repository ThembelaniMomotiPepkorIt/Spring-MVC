<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
</head>
<body>
	<h1>${headerMsg}</h1>
	
	<font:errors path="student."/>
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
			<input type="text" name="address.street"/>
		</p><br/>
		<p>
			<input type="text" name="address.city"/>
		</p><br/>
		<p>
			<input type="text" name="address.country"/>
		</p><br/>
		<p>
			<input type="text" name="address.code"/>
		</p><br/>
		
		<p>
			<input type="submit" value="submit"/>
		</p>
		
		
	
	</form>
</body>
</html>