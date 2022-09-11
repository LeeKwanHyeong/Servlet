<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  //request, response 는 그냥 사용 가능
  MemberRepository memberRepository = MemberRepository.getInstance();

  System.out.println("MemberSaveServlet.service");
  String userName = request.getParameter("userName");
  int age = Integer.parseInt(request.getParameter("age"));

  Member member = new Member(userName, age);
  memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=<%=member.getId()%></li>
  <li>username=<%=member.getUserName()%></li>
  <li>age=<%=member.getAge()%></li>
</ul>
<a href = "/index.html">메인</a>
</body>
</html>
