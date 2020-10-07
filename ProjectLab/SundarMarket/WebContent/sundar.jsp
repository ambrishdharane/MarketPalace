
<!DOCTYPE html>
<%@page import="com.app.sundar.SundarShopi"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Details</h1>
	<%
	       SundarShopi shoping=(SundarShopi)request.getAttribute("shoping");
// List<SundarShopi>shopiList=(List<SundarShopi>)request.getAttribute("shopinglist");
              

%>
	<table border="1" style="background-color: aqua;">
		<tr>
			<th>customerName</th>
			<th>Address</th>
			<th>Bill</th>
		</tr>
		<tr>
		<td><%=shoping.getCostomername()%></td>
		<td><%=shoping.getAddress() %></td>
		<td><%=shoping.getBill()%></td>
	   </tr>	
</table>
</body>
</html>