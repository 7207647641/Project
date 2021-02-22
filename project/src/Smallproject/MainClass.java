package Smallproject;

	
	import java.util.Scanner;
	import java.sql.SQLException;

	public class MainClass 
	{
		public static void main(String[] args) throws SQLException 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("To perform below operations in data base please select any one of the below options");
			System.out.println("1.Add\n2.Delete\n3.Search\n4.Update\n5.Display\n6.Exit");
			System.out.println();
			
			while(true)
			{
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				System.out.println();
				
				switch(choice)
				{
				case 1: new Add().insert();;
				break;
				
				case 2: new Delete().remove();
				break;
				
				case 3: new Search().search();
				break;
				
				case 4:new Update().update();
				break;
				
				case 5:new Display().display();
				break;
				}
				
			}
			
			
		}

	}


