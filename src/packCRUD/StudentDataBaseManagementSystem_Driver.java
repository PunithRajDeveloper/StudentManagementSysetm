package packCRUD;

import java.util.Scanner;

public class StudentDataBaseManagementSystem_Driver {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	StudentDataBaseManagementSystem sdbms=new StudentDataBaseManagementSystem();
	int choice;
	do {
	System.out.println("=====wellcome to student database management system======");
	System.out.println("press  1 for adding student details to database");
	System.out.println("press  2 for update student details in database");
	System.out.println("press  3 for deleting student details from database");
	System.out.println("press  4 for retriving student details from database by id");
	System.out.println("press  5 for complete details ");
	System.out.println("press 6 for exit");
	System.out.println("============================================================");
	System.out.println("please enter your choice");
	 choice=scan.nextInt();
	
	switch(choice) {
	case 1:
	{
		System.out.println("enter student student id :");
		int id=scan.nextInt();
		System.out.println("enter name of the student : ");
		String name=scan.next();
		System.out.println("enter the student address : ");
		String address=scan.next();
		System.out.println("enter student phon number : ");
		long num=scan.nextLong();
		System.out.println("enter the email : ");
		String email=scan.next();
		System.out.println("enter the password");
		String password=scan.next();
		sdbms.saveStudentData(id, name, address, num, email, password);
	}
	
	break;
	
	case 2:
	{
		System.out.println("enter student student id :");
		int id=scan.nextInt();
		System.out.println("enter name of the student : ");
		String name=scan.next();
		sdbms.upDateStudentData(id, name);
	}
	
	break;
	
	case 3:
	{
		System.out.println("enter student student id :");
		int id=scan.nextInt();
		sdbms.deleteStudentData(id);
	}
	break;
	case 4:
	{
		System.out.println("enter student student id :");
		int id=scan.nextInt();
		sdbms.readStudentData(id);
	}
	break;
	case 5:{
		sdbms.getCompletStudentData();
	}
	break;
	case 6:
	{
		System.out.println("==========thank you for using our application==========");
	}
	break;
	
	default:
		System.out.println("invalid choice");
	
	}
	
	
	}while(true);
}
}
