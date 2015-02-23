
<%@ taglib uri="/struts-tags" prefix="s"%>

<script type="text/javascript">

function deleteRecord(val)
{
	alert("r u sure");
	document.fom.action="del.action?fid="+val;
	document.fom.submit();
}

function editr(val)
{
	alert("r u sure");
	document.fom.action="update.action?fid="+val;
	document.fom.submit();
}
</script>


<form name="fom" action="select" method="post">
<center>
	<table border="2" bordercolor="blue">
		<tr>
			
			<th>RollNo</th>
			<th>Name</th>
			<th>Password</th>
			<th>EmailAddr</th>
			<th>Address</th>
			<th>Delete</th>	
			<th>Edit</th>		
		</tr>			
	<s:iterator value="list">
		
		<tr>
				
			<td><s:property value="id"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="password"/></td>
			<td><s:property value="email"/></td>
			<td><s:property value="addr"></s:property></td>
			<td><a href="javascript:deleteRecord(<s:property value="id"/>)">Delete</a></td>
			<td><a href="javascript:editr(<s:property value="id"/>)">Edit</a></td>			
		</tr>	
	</s:iterator>
	
	
	</table>
	<br>
	<s:a href="insertData.jsp">ADD</s:a>
	
	
	</center>
	</form>
	
	
	

 