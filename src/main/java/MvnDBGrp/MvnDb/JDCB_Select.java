package MvnDBGrp.MvnDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDCB_Select {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///employees","root","123456"); //Declaring JDBC String (MOST IMPORTANT LINE)
			Statement st = con.createStatement();
			
			String query ="SELECT * FROM emp";
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)); 
			}
			con.close();
			
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
	}

}
