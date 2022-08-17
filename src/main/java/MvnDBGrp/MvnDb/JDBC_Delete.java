package MvnDBGrp.MvnDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///employees","root","123456"); //Declaring JDBC String (MOST IMPORTANT LINE)
			Statement st = con.createStatement();
			
			String query ="DELETE FROM emp WHERE empno = 7999";
			
			 st.execute(query);
			 
			 System.out.println("The record deleted successfully");
			
			con.close();
			
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}

	}

}
