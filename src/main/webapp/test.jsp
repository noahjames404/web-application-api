<%-- 
    Document   : test
    Created on : 24/06/2020, 12:52:09 AM
    Author     : JASON
--%>

<%@ page import="java.sql.*" %>

<html>
<head>
<title>JDBC Connection example</title>
</head>

<body>
<h1>JDBC Connection example</h1>

<%
//  String db = request.getParameter("db");
  String db = "web_application_api";
  String user = "root"; 
  try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?serverTimezone=UTC", user, "");
    out.println (db+ "database successfully opened.");
    Statement st = con.createStatement();
    
    String insert = "INSERT INTO message (message) VALUES ('wow')";
    st.executeUpdate(insert);
    
    String get_all = "SELECT * FROM message";
    ResultSet rs = st.executeQuery(get_all);
  }
  catch(SQLException e) {
   
    out.println("SQLException caught: " +e.getMessage());
  }
%>

</body>
</html>

