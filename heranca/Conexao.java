package estacio;

import java.sql.*;

public class Conexao {
   static final String DB_URL = "jdbc:mysql://localhost:3306/db_sdc";
   static final String USER = "alessandro";
   static final String PASS = "livre";
   static final String QUERY = "SELECT id, first, last, age FROM Employees";

   public static void main(String[] args) {
//	   try {
//		Class.forName("com.mysql.jdbc.Driver");
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
      try(
		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
	  ) 
      {
          

         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}