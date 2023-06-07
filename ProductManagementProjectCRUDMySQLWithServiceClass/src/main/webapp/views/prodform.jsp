
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<a href="/viewpros">View All Student Marks Details</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<body bgcolor="pink">
	<h1 style="color: black;">Fill Below Form To Print Marks Report</h1>
	<form:form  modelAttribute="pros" action="/save">
		<table>
			<tr>
				<td>Enter Customer Id:</td>
				<td><form:input path="cid" />
					<p></p></td>
			</tr>
			<tr>
				<td>Enter Customer Name:</td>
				<td><form:input path="cname" />
					<p></p></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><form:input path="mobile" />
					<p></p></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><form:input path="pname" />
					<p></p></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="price" />
					<p></p></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><form:input path="quantity" />
					<p></p></td>
			</tr>
			<tr>
				<td></td>


				<td><input type="submit" value="Save"></td>
		</table>
	</form:form>

</body>