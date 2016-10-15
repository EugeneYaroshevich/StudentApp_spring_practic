<%@ page import="studentapp.dto.Mark" %>
<%@ page import="java.util.List" %>
<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>List Mark</title>
</head>
<body bgcolor="#FBF9F9">

<div align="center" style="padding: 5px;">
 
   <jsp:include page="header.jsp"></jsp:include>
   <jsp:include page="menu.jsp"/>
   
   
    <%
List<Mark> marks = (List<Mark>) request.getAttribute("marks");
    %>
        <p></p>
		
        <table border=1 width=500 cellpadding=1 cellspacing=1 bgcolor="#EBF1F4">
		
		<tr>
            <th colspan="6" bgcolor="#BADFF8">List Marks</th>
        </tr>
            <tr>
                <th>Id</th>
                <th>Mark</th>
                <th>Student ID</th>
				<th>Subject ID</th>
                <th colspan=2>Action</th>
            </tr>
			<tr>
            <%
            for (Mark mark : marks) {
            %>
                <th><%=mark.getId()%></td>
                <td align="center"><%=mark.getMark()%></td>
                <td align="center"><%=mark.getStudentId()%></td>
				<td align="center"><%=mark.getSubjectId()%></td>
                <th><a href="StudentServlet?action=editMark&id=<%=mark.getId()%>">Edit</a></th>
                <th><a href="StudentServlet?action=deleteMark&id=<%=mark.getId()%>">Delete</a></th>
            </tr>
            <%
            }
            %>
        </table>
   
</div>    
        
<jsp:include page="footer.jsp"></jsp:include>
		
</body>
</html>