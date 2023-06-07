<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="pink">
	<h1>User Details</h1>
	<table border="2" width="100%" cellpadding="2">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer Mobile</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total</th>
			<th>Discount</th>
			<th>Service Charges</th>
			<th>Total Bill</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="pro" items="${products}">
			<tr>
				<td>${pro.cid}</td>
				<td>${pro.cname}</td>
				<td>${pro.mobile}</td>
				<td>${pro.pname}</td>
				<td>${pro.price}</td>
				<td>${pro.quantity}</td>
				<td>${pro.total}</td>
				<td>${pro.discount}</td>
				<td>${pro.servicecharges}</td>
				<td>${pro.totalbill}</td>
				<td><a href="/edit/${pro.cid}">Edit</a></td>
				<td><a href="/delete/${pro.cid}">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
	<br />
</body>

