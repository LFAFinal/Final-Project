
<%@page import="java.util.Date"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.leapfrog.contactmanager.entity.Manager"%>
<%@page import="com.leapfrog.contactmanager.dao.impl.ManagerDAOImpl"%>
<%@page import="com.leapfrog.contactmanager.dao.ManagerDAO"%>
<%
    if (!request.getMethod().equalsIgnoreCase("post")) {
        out.println("<h1>Oh hero,Your father is here.Go to hell.</h1>");
    } else {
        try {
            ManagerDAO managerDAO = new ManagerDAOImpl();
            Manager m = new Manager();
            m.setName(request.getParameter("name"));
            m.setEmail(request.getParameter("email"));
            m.setPhone(request.getParameter("phone"));
            m.setAddress(request.getParameter("address"));
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            m.setDOB(format.parse(request.getParameter("dob")));
            managerDAO.update(m);
            response.sendRedirect("index.jsp?updated");
           out.println(m);
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }


%>