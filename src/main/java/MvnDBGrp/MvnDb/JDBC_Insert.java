package MvnDBGrp.MvnDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///employees","root","123456"); //Declaring JDBC String (MOST IMPORTANT LINE)
			Statement st = con.createStatement();
			
			String query ="INSERT INTO emp (empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES (7999,'ZENTENO','HEXA','7369','2021-07-11',20000,0.00,20)";
			
			 st.execute(query);
			 
			 System.out.println("The record inserte successfully");
			
			con.close();
			
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}

	}

}
