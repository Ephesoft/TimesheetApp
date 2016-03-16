<%@page import="com.ephesoft.timesheet.core.model.User"%>
<html>
<body>
<h2>UserId

<%=((User)request.getAttribute("user")).getId() %>
<button onclick="onClick()">Click</button>
<div id="demo"></div>
</h2>
</body>
<script type="text/javascript">

function onClick() {
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
		console.log(xhttp.responseText);
		if (xhttp.readyState == 4 && xhttp.status == 200) {
		  document.getElementById("demo").innerHTML = xhttp.responseText;
		}
	  };
	  xhttp.open("POST", "http://localhost:8080/timesheet-web/u/ajax/9", true);
	  xhttp.send();
}
</script>
</html>
