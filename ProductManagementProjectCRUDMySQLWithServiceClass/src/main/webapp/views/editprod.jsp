
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="POST" action="/save">
	<body bgcolor="pink">
		<h1 style="color: black;">Edit User</h1>

		<table>
			<tr>
				<td></td>
				<td><form:hidden path="cid" /></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><form:input path="cname" /></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><form:input path="mobile" /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><form:input path="pname" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="EditSave" /></td>
			</tr>

		</table>
	</body>
</form:form>

<a href="/viewpros">View Ordered Details</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/">Place New Order</a>
&nbsp;&nbsp;&nbsp;&nbsp;
