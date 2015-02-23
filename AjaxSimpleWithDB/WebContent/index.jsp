<html>
<head>
<script type="text/javascript">
function loadXMLDoc()
{
var xmlhttp;
var keys=document.dummy.sele.value
var urls="db_fetch.jsp?ok="+keys
alert(keys);
if (window.XMLHttpRequest)
{// code for IE7+, Firefox, Chrome, Opera, Safari
xmlhttp=new XMLHttpRequest();
}
else
{// code for IE6, IE5
xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
}
xmlhttp.onreadystatechange=function()
{
if (xmlhttp.readyState==4)
{
document.dummy.dyn.value=xmlhttp.responseText;
}
}
xmlhttp.open("GET",urls,true);
xmlhttp.send();
}
</script>
</head>
<body>
 
<form name="dummy">
	<select name="sele" onchange="loadXMLDoc()">	
		<option>value</option>
		<option value="101">101</option>
		<option value="102">102</option>
	</select>

 
<INPUT type="text" name="dyn" value=""/> <br>

 </form>
</body>
</html>