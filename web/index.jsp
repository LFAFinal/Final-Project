<%
    if (!request.getMethod().equalsIgnoreCase("post")) {
        response.sendRedirect("login.jsp?login First");
    } else {
        response.sendRedirect("dashboard.jsp");
        /*    if(e.getEmail==email && e.getPassword==password){
         response.sendRedirect("dashboard.jsp");
         }
         else{
         response.sendRedirect("login.jsp?");
         } */
    }

%>