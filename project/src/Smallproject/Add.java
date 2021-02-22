package Smallproject;
import java.sql.*;
import java.util.Scanner;
public class Add
{
	public void insert() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		Driver d=new com.mysql.jdbc.Driver();
		
		// step 2
		DriverManager.registerDriver(d);
		
		
		//step 3
		String db="jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		Connection con=DriverManager.getConnection(db);
		
		
		//step 4
		String q="INSERT into student1 values(?,?,?,?,?,?,?,?,?,?)"; //dynamic query
		
		
		PreparedStatement stat=con.prepareStatement(q);
		
		
		System.out.println("Enter the number of records to be added");
		int number=sc.nextInt();
		System.out.println();
		int j=1;
		
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter the record "+j+"\t details");
		
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		stat.setInt(1,id);
		
		System.out.println("Enter the fname");
		sc.nextLine();
		String fname=sc.nextLine();
		//System.out.println(fname);
		
		stat.setString(2,fname);
		
		
		System.out.println("Enter the lname");
		String lname=sc.nextLine();
		
		stat.setString(3, lname);
		
		
		System.out.println("Enter the mobile number");
		int mobile=sc.nextInt();
		
		stat.setInt(4, mobile);
		
		System.out.println("Enter the address");
		sc.nextLine();
		String address=sc.nextLine();
		
		stat.setString(5, address);
		
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		
		stat.setInt(6, marks);
		
		System.out.println("Enter the gender");
		sc.nextLine();
		String gender=sc.nextLine();
	
		
		stat.setString(7, gender);
		
		System.out.println("Enter the dob");
		String dob=sc.nextLine();
		
		stat.setString(8, dob);
		
		
		System.out.println("Enter the branch");
		String branch=sc.nextLine();
		
		stat.setString(9, branch);
		
		System.out.println("Enter the description");
		String desc=sc.nextLine();
		
		stat.setString(10, desc);
		
		
		stat.executeUpdate();
		System.out.println("Successfully updated");
		System.out.println();
		

}
	}
}

	
