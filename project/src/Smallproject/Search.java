package Smallproject;

	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.*;

	import com.mysql.jdbc.Connection;
	import com.mysql.jdbc.Statement;
	public class Search
	{
	
		public void search() throws SQLException
		{
			Scanner sc=new Scanner(System.in);
			//step 2
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			
			//step 3
			String db="jdbc:mysql://localhost:3306/student_info?user=root&password=root";
			java.sql.Connection con=DriverManager.getConnection(db);
			
			
			//step4
			
			
			
			
			
			System.out.println("please choose search should be on what bases ");
			System.out.println("1.Id\n2.Fname\n3.Mobile number");
			System.out.println();
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			
			
			case 1:
				String q="SELECT Id,Fname,Lname,MobileNumber,Address,Marks,Gender,DOB,Branch,Description from student1 WHERE id=?";
				PreparedStatement stmt=con.prepareStatement(q);
				System.out.println("Enter the id whose data to be found");
			    int id=sc.nextInt();
			
			stmt.setInt(1, id);
			
			
			ResultSet r=stmt.executeQuery();
			System.out.println("Id \t Fname \t\t Lname \t MobileNumber \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			while(r.next())
			{
				System.out.print(r.getInt(1)+"       ");
				System.out.print(r.getString(2)+"       ");
				System.out.print(r.getString(3)+"          ");
				System.out.print(r.getInt(4)+"           ");
				System.out.print(r.getString(5)+"         ");
				System.out.print(r.getInt(6)+"           ");
				System.out.print(r.getString(7)+"        ");
				System.out.print(r.getString(8)+"          ");
				System.out.print(r.getString(9)+"          ");
				System.out.print(r.getString(10)+"         ");
				System.out.println();
				System.out.println();
			
			
			}
			
			break;
			
			case 2:
				String q1="SELECT Id,Fname,Lname,MobileNumber,Address,Marks,Gender,DOB,Branch,Description from student WHERE Fname=?";
				PreparedStatement stmt1=con.prepareStatement(q1);
				System.out.println("Enter the Fname whose data to be found");
				sc.nextLine();
				String fname=sc.nextLine();
		
				
			    stmt1.setString(1,fname);
				
				ResultSet r1=stmt1.executeQuery();
				System.out.println("Id \t Fname \t\t Lname \t MobileNumber \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				while(r1.next())
				{
					System.out.print(r1.getInt(1)+"       ");
					System.out.print(r1.getString(2)+"       ");
					System.out.print(r1.getString(3)+"          ");
					System.out.print(r1.getInt(4)+"           ");
					System.out.print(r1.getString(5)+"         ");
					System.out.print(r1.getInt(6)+"           ");
					System.out.print(r1.getString(7)+"        ");
					System.out.print(r1.getString(8)+"          ");
					System.out.print(r1.getString(9)+"          ");
					System.out.print(r1.getString(10)+"         ");
					System.out.println();
					System.out.println();
				
				
				}
				
				break;
				
			case 3:
				String q2="SELECT Id,Fname,Lname,MobileNumber,Address,Marks,Gender,DOB,Branch,Description from student WHERE MobileNumber=?";

				PreparedStatement stmt2=con.prepareStatement(q2);
				System.out.println("Enter the mobile number whose data to be found");
				int mobile=sc.nextInt();
				
				
				stmt2.setInt(1,mobile);
				
				ResultSet r2=stmt2.executeQuery();
				System.out.println("Id \t Fname \t\t Lname \t MobileNumber \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				while(r2.next())
				{
					System.out.print(r2.getInt(1)+"       ");
					System.out.print(r2.getString(2)+"       ");
					System.out.print(r2.getString(3)+"          ");
					System.out.print(r2.getInt(4)+"           ");
					System.out.print(r2.getString(5)+"         ");
					System.out.print(r2.getInt(6)+"           ");
					System.out.print(r2.getString(7)+"        ");
					System.out.print(r2.getString(8)+"          ");
					System.out.print(r2.getString(9)+"          ");
					System.out.print(r2.getString(10)+"         ");
					System.out.println();
					System.out.println();
				
				
				}
				
				break;
				
				
				default:System.out.println("Invalid choice");
				break;
				
			
				

	}
	}
	}


