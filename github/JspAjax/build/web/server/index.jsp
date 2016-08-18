
<%@page import="com.leapfrog.jspajax.entity.Student"%>
<%@page import="com.leapfrog.student.dao.impl.StudentDAOImpl"%>
<%@page import="com.leapfrog.student.dao.StudentDAO"%>

<h2> Contact Student</h2>
<table class="table table-striped table-responsive table-hover table-bordered">
    <tr class="bg-info"><th>ID</th>                   
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Address</th>
        <th>Status</th> 
    </tr>    
        <%
        StudentDAO studentDAO = new StudentDAOImpl();
        for (Student s : studentDAO.getAll()) {
        %><tr>
        <td><%=s.getId()%></td>                   
        <td><%=s.getName()%></td> 
        <td> <%=s.getEmail()%></td>                   
        <td><%=s.getPhone()%></td>
        <td><%=s.getAddress()%></td>                   
        <td><%=s.isStatus()%></td>
           
        
    <% }%>
</table>
    
