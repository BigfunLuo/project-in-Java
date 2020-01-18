package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import bus.*;

public class LaSalleCompanyTest2 {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Student s1=new Student();
		Date d1=new Date();
		String options,flag;int searchId;
		ArrayList<Student> myStulist=new ArrayList<Student>();
		ArrayList<Course> myCourseList=new ArrayList<Course>();
		ArrayList<Teacher> myTeacherList=new ArrayList<Teacher>();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\n\t Hello");
		do {
			//main menu
			System.out.println("---------Status Select-----------");
			System.out.println("Student #1\nTeacher #2\nEnter your status：");
		int nbr =scan1.nextInt();
		if(nbr==1){
			//provide list of selection
			int tag;
			do {
			System.out.println("---------Main Menu---------");
			System.out.println("Add a new student/teacher to the list  #1\nRemove a student/teacher from the list  #2\n"
					+ "Search a student/teacher from the list  #3\n"/*"Split student and teacher from the member list  #4"*/
					+"Sort all the students by the fees #4\nDisplay all th student in the list #5\nExit this application  #6");
			System.out.println("Enter your sslection:");
			tag =scan1.nextInt();
		  //do {
			switch(tag) {
			case 1:{ //add an object
				s1.setType(EnumMemberType.Student);
				System.out.print("input your Id: ");
				s1.setId(scan1.nextInt());
				System.out.print("input FirstName: ");
				s1.setFn(scan1.next());
				System.out.print("input LastName: ");
				s1.setLn(scan1.next());
				System.out.print("input your SIN : ");
				s1.setSsn(scan1.nextInt());
				System.out.print("input your Fees Per Session : ");
				s1.setfeesPerSession(scan1.nextFloat());
				int day;
				do {
				System.out.print("input your enrolled day(1-31): ");
				day=scan1.nextInt();
				d1.setDay(day);
				}while(day<1||day>31);
				int month;
				do {
				System.out.print("input your enrolled month (1-12): ");
				month=scan1.nextInt();
				d1.setMonth(month);
				}while(month<1||month>12);
				System.out.print("input your enrolled year : ");
				d1.setYear(scan1.nextInt());
				do{
				Course c1=new Course();
				System.out.print("input your Course No: ");
				c1.setCno(scan1.next());
				System.out.print("input your Course Name: ");
				c1.setCname(scan1.next());
				System.out.println("----------Course List----------------");
				System.out.println("Computer Science #1\t\tFashion Design #2\t\tHotel Management #3\nTourism #4\t\tCooking #5\nAccounting #6\t\tBusiness #7");
				System.out.println("Enter your Course Type：");
				int tp =scan1.nextInt();
				switch (tp)
				{	  
					case 1:
					{
						c1.setType(EnmuCourseType.ComputerScience);	
						break;
					}
					case 2:
					{
					
						c1.setType(EnmuCourseType.FashionDesign);			
						break;
					}
					case 3:
					{	
						c1.setType(EnmuCourseType.HotelManagement);			
						break;
					}
					case 4:
					{	
						c1.setType(EnmuCourseType.Tourism);				
						break;
					}
					case 5:
					{
						c1.setType(EnmuCourseType.Cooking);			
						break;
					}
					case 6:
					{
						c1.setType(EnmuCourseType.Accounting);			
						break;
					}
					case 7:
					{
						c1.setType(EnmuCourseType.Business);			
						break;
					}
					default :
						System.out.println("Please enter a number from 1-7 !\n ");
				}	
				System.out.print("input your Course duration : ");
				c1.setDurtion(scan1.nextInt());
				myCourseList.add(c1);
				s1.setList(myCourseList);
				System.out.println("Do you want to add a new course? Y/N");
				flag=scan1.next();
				}while(flag.equals("Y")||flag.equals("y"));
				System.out.println("---------------------------");
				System.out.println("The student Info: ");
				s1.setDate(d1);		
				myStulist.add(s1);
				break;
			}
			case 2://Remove
				System.out.println("Remove a student from the list");
				System.out.print("input your Id: ");
				int newId=scan1.nextInt();
				if(SearchbyId(newId,myStulist)==null)
				{
					System.out.println("Student is not exit!");
				}
				else
				{
					myStulist.remove(SearchbyId(newId,myStulist));
					System.out.println("Student has been deleted already!");
				}		
				break;
			case 3://Search
				int choice;
				//do {
				System.out.println("\nSearch by\nId #1\nfirstname & lastname #2"); 
			      do {
			    	  System.out.println("Enter your choice:"); 
				     choice=scan1.nextInt();
				  if(choice==1) {
					  System.out.println("Enter the Student Id:"); 
					  searchId=scan1.nextInt();
					  if(SearchbyId(searchId,myStulist)==null) {
						  System.out.println("Student not exit!");
						  break;
					  }
					  else {
			        System.out.println(SearchbyId(searchId,myStulist)); 
					  }/*
					  Student SearchStudent=new Student();
					  for(Student aStudent : myStulist){
					  	if(SearchId==aStudent.getId()
					  	{
					  	 	SearchStudent=aStudent;
					  	}
					  }
					  System.out.println(SearchStudent.toString());
					  */
				  }
				  else if(choice==2)  {
					   System.out.println("Enter the firstname:"); 
				        String fname=scan1.next();
				        System.out.println("Enter the lastname:"); 
				        String lname=scan1.next(); 
				        System.out.println(Searchbyfullname(fname,lname,myStulist)); 
				  }
				  else
				  {
					  System.out.println("Please enter a vaild number #1 or #2");
				  }
			      }while(choice!=1||choice!=2);     
				break;
			case 4://Sort
				Collections.sort(myStulist,new Sortbyfee()); 
				  for (int i=0; i<myStulist.size(); i++) 
			      System.out.println("Sort students by fees from high to low:\n"+myStulist.get(i)); 
				break;
			case 5://Display all
				System.out.println(myStulist.toString());
				break;
			case 6:
				System.out.println("Exit from the student!");
				break;
			default :
			}
			}while(tag!=6);
		}
		else if(nbr==2) {
			t1.setType(EnumMemberType.Teacher);
			System.out.print("input your Id: ");
			t1.setId(scan1.nextInt());
			System.out.print("input First Name: ");
			t1.setFn(scan1.next());
			System.out.print("input Last Name: ");
			t1.setLn(scan1.next());
			System.out.print("input your SIN : ");
			t1.setSsn(scan1.nextInt());
			System.out.print("input your Hourly Rate : ");
			t1.sethourlyRate(scan1.nextFloat());
			System.out.print("input your Hour for week : ");
			t1.sethourforweek(scan1.nextInt());
			int day;
			do {
			System.out.print("input your Started day(1-31): ");
			day=scan1.nextInt();
			d1.setDay(day);
			}while(day<1||day>31);
			int month;
			do {
			System.out.print("input your Started month (1-12): ");
			month=scan1.nextInt();
			d1.setMonth(month);
			}while(month<1||month>12);
			System.out.print("input your Started year : ");
			d1.setYear(scan1.nextInt());
			do {
				Course c1=new Course();
			System.out.print("input your Course No: ");
			c1.setCno(scan1.next());
			System.out.print("input your Course Name: ");
			c1.setCname(scan1.next());
			System.out.println("----------Course List----------------");
			System.out.println("Computer Science #1  Fashion Design #2");
			System.out.println("Hotel Management #3  Tourism #4");
			System.out.println("Cooking #5           Accounting #6");
			System.out.println("Business #7");
			System.out.println("Enter your Course Type：");
			int tp =scan1.nextInt();
			switch (tp)
			{	  
				case 1:
				{
					c1.setType(EnmuCourseType.ComputerScience);	
					break;
				}
				case 2:
				{
				
					c1.setType(EnmuCourseType.FashionDesign);			
					break;
				}
				case 3:
				{
					
					c1.setType(EnmuCourseType.HotelManagement);			
					break;
				}
				case 4:
				{
					
					c1.setType(EnmuCourseType.Tourism);				
					break;
				}
				case 5:
				{
					c1.setType(EnmuCourseType.Cooking);			
					break;
				}
				case 6:
				{
					c1.setType(EnmuCourseType.Accounting);			
					break;
				}
				case 7:
				{
					c1.setType(EnmuCourseType.Business);			
					break;
				}
				default :
					System.out.println("Please enter a number from 1-7 !\n ");
			}		
			myCourseList.add(c1);
			t1.setList(myCourseList);
			System.out.println("Do you want to add a new course? Y/N");
			flag=scan1.next();
			}while(flag.equals("N")||flag.equals("n"));
			System.out.println("---------------------------");
			System.out.println("The Teacher Info: ");
			t1.setDate(d1);	
			myTeacherList.add(t1);
			System.out.println(myTeacherList.toString());
			}
		else 
		{
			System.out.println("Please a vaild number #1 or #2 or #3..");
		}
		System.out.println("Do you want to exit this application? Y/N");
		options=scan1.next();
		}while(options.equals("N")||options.equals("n"));
			
		scan1.close();
		System.out.println("Thank you for using our system!");	

	}
	static Student SearchbyId(int id,ArrayList<Student> alist) {
   	 for (Student aStudent : alist) {
            if (aStudent.getId() == id) {
                return aStudent;
            }
        }
        return null; 
    }
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

    static Student Searchbyfullname(String fn,String ln,ArrayList<Student> alist) {
   	 for (Student aStudent : alist) {
            if (aStudent.getFn() == fn&&aStudent.getLn()==ln) {
                return aStudent;
            }
        }
        return null; 
    }
     static class Sortbyfee implements Comparator<Student> 
   	{ 
   	    // Used for sorting in ascending order of 
   	    // fees
   	    public int compare(Student a, Student b) 
   	    { 
   	        return (int) (b.getfeesPerSession()- a.getfeesPerSession()); //从大到小
   	        //return (int) (a.getfeesPerSession()- b.getfeesPerSession()); //从小到大
   	    } 
   	}

}
