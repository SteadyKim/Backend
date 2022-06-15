<%@ page import="spring.mvc.basic.MemberRepository" %>
<%@ page import="spring.mvc.basic.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
// request, response 사용 가능
 MemberRepository memberRepository = MemberRepository.getInstance();
 System.out.println("save.jsp");
 String name = request.getParameter("name");
 int age = Integer.parseInt(request.getParameter("age"));
 Member member = new Member(name, age);
 System.out.println("member = " + member);
 memberRepository.save(member);
%>
<html>
<head>
 <meta charset="UTF-8">
</head>
<body>
성공
<ul>
 <li>id=<%=member.getId()%></li>
 <li>name=<%=member.getName()%></li>
 <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인으로 돌아가기</a>
</body>
</html>