package MvnDBGrp.MvnDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class JDBC_Update {

	public static void main(String[] args) {
		
		String emp = new String();
		String empno = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("What's the emp id to update:  ");
		empno = in.nextLine();
		System.out.println("What's the new emp name: ");
		emp = in.nextLine();
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///employees","root","123456"); //Declaring JDBC String (MOST IMPORTANT LINE)
			Statement st = con.createStatement();
			
			String query ="UPDATE emp SET ename = '"+emp+"' WHERE empno ="+empno;
			
			st.execute(query);
			 
			System.out.println("The record updated successfully");
			
			con.close();
			
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
	}

}
