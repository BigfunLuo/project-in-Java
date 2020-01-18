package client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import bus.FileHander;

import bus.Student;

import data.College;
//import data.ConnectionDB;

public class TesterDatabase {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
	
    //Scanner scan=new Scanner(System.in);
	//System.out.println("\n\n.......We are creating the table accounts...........\n");

    //System.out.println("\n\t Table created.........\n");

       //2----- Add a Student
       System.out.println("\n\n......Adding an account  to the table Account.........\n");
       Student newStudent1 = new Student(100,"lory","luo","lory@gmail.com", 120);
       Student newStudent2 = new Student(101,"Mary","brown","lory@gmail.com", 1000);
       Student newStudent3= new Student(102,"Lisa","Chou","lory@gmail.com", 999);
       Student newStudent4 = new Student(103,"Ming","Zhang","lory@gmail.com", 350);
       College.insert(newStudent1);
       College.insert(newStudent2);
       College.insert(newStudent3);
       College.insert(newStudent4);
       ArrayList<Student> listfromdata=new ArrayList<Student>();
       ArrayList<Student> listFromFile=new ArrayList<Student>();
       listfromdata.add(newStudent1);
       listfromdata.add(newStudent2);
       listfromdata.add(newStudent3);
       listfromdata.add(newStudent4);
       FileHander.Writetofile(listfromdata);
       //list
       /*HashMap<Integer, Student> hashMapStudents = College.getList();
       
          for(Student current : hashMapStudents.values()) 
          {
       	        	System.out.println(current);
          }
       
          //---Delete College
      System.out.println("\n\n............ Delete an account ............\n");
    
    //if (Account.remove(newAccount.getId())>0)
     //	msg = "........account  with ID = 100 removed with succes........";
//       else 
//           msg = "...account  not removes with success...";		
      */
    listFromFile =FileHander.Readfromfile(listFromFile);
	System.out.println(listFromFile);

	System.out.println("\n .....Data from File....");

	for(Student record : listFromFile)
	{
		System.out.println(record);			
	}
		



    
   
  System.out.println("\n\t END APPLICATION");	
  System.out.println("Written by Xiufen Luo #1430942");
  System.exit(0);
		
}	
}
