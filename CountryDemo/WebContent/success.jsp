<%@taglib uri="/struts-tags" prefix="c" %>

<html>
<head>
<script>
function fun1(id)
{
var id;
alert("hello");

var req;

if(window.XMLHttpRequest)
{
	alert("call... 2");
	req=new XMLHttpRequest();
}
	
	var url="a.action?coun="+id.value;
	alert(url);
	req.open("GET",url,true);	
	req.send();
	alert("hello2");
   debugger;
	req.onreadystatechange=function()

	{
     debugger; 
           if(req.readyState==4 && req.status==200)
           {
debugger;
           alert(req.responseText);
           document.getElementById("sss").innerHTML=req.responseText;
			}
    }
}

</script>

<script>
function fun2(id)
{
var id;
alert("hello");

var req;

if(window.XMLHttpRequest)
{
	alert("call... 2");
	req=new XMLHttpRequest();
}
	
	var url="b.action?stat="+id.value;
	alert(url);
	req.open("GET",url,true);	
	req.send();
	alert("hello2");
   debugger;
	req.onreadystatechange=function()

	{
     debugger; 
           if(req.readyState==4 && req.status==200)
           {
debugger;
           alert(req.responseText);
           document.getElementById("ccc").innerHTML=req.responseText;
			}
    }
}

</script>
</head>

<c:select list="list" listKey="countryid" listValue="countryname" name="con" headerValue="--Select Country--" headerKey="0" label="select Country" onchange="fun1(this)"></c:select>
<c:select list="list2" listKey="stateid" listValue="statename" name="sta" headerValue="--Select State--" headerKey="0" label="select State" id="sss" onchange="fun2(this)"></c:select>
<c:select list="list1" listKey="cityid" listValue="cityname" name="cit" headerValue="--Select City--" headerKey="0" label="select City" id="ccc"></c:select>
</html>