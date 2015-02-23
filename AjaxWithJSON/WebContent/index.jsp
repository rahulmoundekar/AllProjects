<html>
<head>
<meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
<script type="application/javascript">
function loadJSON()
{
	alert("hi");
   var http_request = new XMLHttpRequest();
   try
   {
      // Opera 8.0+, Firefox, Chrome, Safari
      http_request = new XMLHttpRequest();
   }
   catch (e)
   {
      // Internet Explorer Browsers
      try
	  {
         http_request = new ActiveXObject("Msxml2.XMLHTTP");
      }
      catch (e) 
      {
         try
         {
            http_request = new ActiveXObject("Microsoft.XMLHTTP");
         }
         catch (e)
         {
            // Something went wrong
            alert("Your browser broke!");
            return false;
         }
      }
   }
   http_request.onreadystatechange  = function()
   {
		alert("request");
      if (http_request.readyState == 4 && http_request.status==200)
      {
        // Javascript function JSON.parse to parse JSON data
        var jsonObj = JSON.parse(http_request.responseText);

        // jsonObj variable now contains the data structure and can
        // be accessed as jsonObj.name and jsonObj.country.
        document.getElementById("Name").innerHTML =  jsonObj.name;
        document.getElementById("Country").innerHTML = jsonObj.country;
      }
   }
   http_request.open("GET","data.json", true);
   http_request.send();
}
</script>
</head>
<body>
	<h1>Cricketer Details</h1>
		<table class="src">
			<tr>
				<th>Name</th>
				<th>Country</th>
			</tr>
			<tr>
				<td>
					<div id="Name">Sachin</div>
				</td>
				<td>
					<div id="Country">India</div>
					</td>
			</tr>
</table>

<div class="central">
<button type="button" onclick="loadJSON()">Update Details </button>
</body>
</html>