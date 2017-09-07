<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="cn.hbm.domain"%>
<jsp:useBean id ="db" class="bean.GradeBean" scope="page"></jsp:useBean>
<html>
  <head>
  </head>
  
  <body background=abc\k.jpg>
  <%
	String sql1="select * from student;";
	String sql2="select * from course;";
	String sql3="select * from grade;";
	GradeBean g=new GradeBean();
	Connection con=g.setConnection();
	Statement st=con.createStatement();
		%>	
<form method="post"  name=formstudent>		
<h1><center>学生信息表</center></h1>
<center><table border="1" >
<tr>
<td >删除</td>
<td  >sid</td>
<td >name</td>
<td >sex</td>
</tr>
<%  ResultSet r2=g.query(sql1);
	 while(r2.next()){
%>
<tr>

<td><input name ="delete" type="checkbox" value="<%=r2.getString("sid") %>" /></td>
<td><%=r2.getString("sid")%></td>
<td><%=r2.getString("name")%></td>
<td><%=r2.getString("sex")%></td>
</tr>
<%
		}
%>
</table>
<input type="button" value="delete_student"  onclick="formstudent.action='deleteStudent.jsp';formstudent.submit();"/>
<input type="button" value="modify_student"  onclick="formstudent.action='modifyStudent.jsp';formstudent.submit();"/>
<input type=reset value=reset>
<input type="button" value="add_student" onclick="formstudent.action='addStudent.jsp';formstudent.submit();"/>
</center>
</form>

<form method="post"  name=formcourse>
<h1><center>课程信息</center></h1>
<center>
<table border="2">
<tr>
<td align="center">删除</td>
<td align="center">cid</td>
<td align="center">name</td>
</tr>

<%  
		ResultSet r3=g.query(sql2);
	 	while(r3.next()){
%>
<tr>
<td><input name ="delete" type="checkbox" value="<%=r3.getString("cid") %>" /></td>
<td><%=r3.getString("cid")%></td>
<td><%=r3.getString("name")%></td>
</tr>
<%
	}
%>
</table>
<input type="button" value="delete_course"  onclick="formcourse.action='deleteCourse.jsp';formcourse.submit();"/>
<input type="button" value="modify_course"  onclick="formcourse.action='modifyCourse.jsp';formcourse.submit();"/>
<input type=reset value=reset>
<input type="button" value="add_course" type = submit onclick="formcourse.action='addCourse.jsp';formcourse.submit();"/>
</center>
</form>
<form method="post"  name=form1>
<h1><center>学生成绩信息表</center></h1>
<center>
<table border="1">

<tr>
<td align="center">删除</td>
<td align="center">sid</td>
<td align="center">cid</td>
<td align="center">score</td>
</tr>
<%  
		ResultSet r4=g.query(sql3);
	 	while(r4.next()){
%>
<tr>
<td><input name ="delete" type="checkbox" value="<%=r4.getString("sid")+","+r4.getString("cid") %>" /></td>
<td><%=r4.getString("sid")%></td>
<td><%=r4.getString("cid")%></td>
<td><%=r4.getString("score")%></td>
</tr>
<% 		}
%>
</table>
<input type="button" value="delete_grade"  onclick="form1.action='delete.jsp';form1.submit();"/>
<input type="button" value="modify_grade"  onclick="form1.action='modifyGrade.jsp';form1.submit();"/>
<input type=reset value=reset>
<input type="button" value="add_grade" type = submit onclick="form1.action='addGrade.jsp';form1.submit();"/>
</center>
</form>
  </body>
</html>
