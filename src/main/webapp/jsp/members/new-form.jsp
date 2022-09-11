<%--
  Created by IntelliJ IDEA.
  User: leekwanhyeong
  Date: 2022/09/11
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    userName: <input type="text" name="userName"/>
    age: <input type="text" name="age"/>
    sex: <input type="text" name="sex"/>
    <button type="submit">전송</button>
</form>
</body>
</html>
