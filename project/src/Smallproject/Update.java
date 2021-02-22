package Smallproject;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


public class Update
{
	public void update() throws SQLException
	{
		//step 2
		Scanner sc=new Scanner(System.in);
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		//step 3
		String db="jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		
		Connection con=DriverManager.getConnection(db);
		
		
		//step 4
		String q="UPDATE student1 "+
				"SET Marks=80 "+
				"WHERE ID =?";
				
		
		PreparedStatement stat=con.prepareStatement(q);
		
		System.out.println("Enter the id whose marks to be updated");
		int id=sc.nextInt();
		
		stat.setInt(1, id);
		
		
		int x=stat.executeUpdate();
		System.out.println();
		System.out.println("Updated successfully");
		System.out.println();
	}

}



