package Smallproject;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Delete
{
	public void remove() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		//step 2
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		//step 3
		String db="jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		java.sql.Connection con=DriverManager.getConnection(db);
		
		
		//step 4
		String q="DELETE from student1 WHERE Id=?";
		
		PreparedStatement stmt=con.prepareStatement(q);
		
		
		System.out.println("Enter the id whose record to be deleted form the data base");
		int id=sc.nextInt();
		
		stmt.setInt(1, id);
		
		
		int x=stmt.executeUpdate();
		System.out.println();
		System.out.println("Deleted successfully");
		System.out.println();
}
}
