<%@page import="com.ephesoft.timesheet.core.model.User"%>
<html>
<body>
<h2>UserId

<%=((User)request.getAttribute("user")).getId() %>
</h2>
</body>
</html>
