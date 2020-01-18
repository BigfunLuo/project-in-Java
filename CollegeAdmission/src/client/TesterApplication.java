package client;

import java.sql.SQLException;
import java.util.Scanner;

import bus.FStudent;
import bus.Student;
import data.ConnectionDB;
import data.FStudentDB;

public class TesterApplication {
	public static void main(String[] args) throws SQLException {
		 Scanner scan=new Scanner(System.in);
	        //connect to the SQL
	        //Connection myConnection= ToConnectDB.getConnectSQLDB();
		 int stud_id;String fn,ln,mail; float fee,fps;
	        System.out.println("Connecting the SQL....");
	        //Main menu
	        int choice;
	        do {
	            System.out.println("#1 Display all the student we had\n#2 Add a new student\n#3 Delete a student by id\n" +
	                    "#5 Exit this application ");
	            System.out.println("Enter your choice:");
	            choice=scan.nextInt();
	            switch (choice) {
	                case 1:  //display
	                    System.out.println("Student list:");
	                    FStudentDB.Display();
	                    break;

	                //add
	                case 2:
	                    System.out.println("Please input new student...");
	                    System.out.println("input new student id:");
	                    stud_id = scan.nextInt();
	                    scan.nextLine();
	                    System.out.println("input new student firstname:");
	                    fn= scan.nextLine();
	                    System.out.println("input new student lastname:");
	                    ln= scan.nextLine();
	                    System.out.println("input new student email:");
	                    mail= scan.nextLine();
	                    System.out.println("input new student first fee:");
	                    fee= scan.nextFloat();
	                    System.out.println("input new student fee per session:");
	                    fps= scan.nextFloat();
	                    FStudent s1=new FStudent(stud_id,fn,ln,mail,fee,fps);
	                    FStudentDB.insert(s1);
	                    break;
	                //myConnection.commit();
	                //delete
	                case 3:
	                    System.out.println("Input a student Id to be deleted:");
	                    stud_id = scan.nextInt();
	                    FStudentDB.Remove(stud_id);
	                    System.out.println("A student is removed");
	                    break;
	                case 4:
	                    System.out.println("Input a student Id to be Search:");
	                    stud_id = scan.nextInt();
	                    FStudentDB.Search(stud_id);
	                    break;
	            }
	        }while (choice!=5);
	        scan.close();
	        ConnectionDB.getConnectSQLDB().commit();
	        ConnectionDB.getConnectSQLDB().close();
	        System.out.println("end of Application...");
	        System.out.println("Written by Xiufen Luo #1430942");
	        System.exit(0);
	    }
		
	}
	

