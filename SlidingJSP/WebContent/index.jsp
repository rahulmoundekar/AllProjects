<html>
    <head>
        <title>Using Multiple Forms</title>
    </head>
    <body>
        <h1>Using Multiple Forms</h1>
        <% 
            if(request.getParameter("button") != null) {
        %>
            You clicked 
            <%= request.getParameter("button") %>
        <%
            }
        %>
        <form name="form1" method="get">
            <input type="hidden" name="button" value="button 1">
            <input type="submit" value="Button 1">
        </form>
        <form name="form2" method="get">
            <input type="hidden" name="button" value="button 2">
            <input type="submit" value="Button 2">
        </form>
        <form name="form3" method="get">
            <input type="hidden" name="button" value="button 3">
            <input type="submit" value="Button 3">
        </form>
		<form name="form4" method="get">
            <input type="hidden" name="button" value="button 4">
            <input type="submit" value="Button 4">
        </form>
		<form name="form5" method="get">
            <input type="hidden" name="button" value="button 5">
            <input type="submit" value="Button 5">
        </form>
    </body>
</html>