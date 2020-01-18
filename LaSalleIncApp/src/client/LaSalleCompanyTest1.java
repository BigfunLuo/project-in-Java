package client;

import java.util.ArrayList;
import java.util.Scanner;

import bus.*;

public class LaSalleCompanyTest1 {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		Teacher t1=new Teacher();
		Student s1=new Student();
		Date d1=new Date();
		String options,flag;
		ArrayList<Student> myStulist=new ArrayList<Student>();
		ArrayList<Employee> myEmplist=new ArrayList<Employee>();
		ArrayList<Course> myCourseList=new ArrayList<Course>();
		ArrayList<Teacher> myTeacherList=new ArrayList<Teacher>();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("\n\t Hello");
		do {
		System.out.println("---------------------------");
		System.out.println("Student #1");
		System.out.println("Employee #2");
		System.out.println("Teacher #3");
		System.out.println("Enter your status£º");
		int nbr =scan1.nextInt();
		if(nbr==1){
		s1.setType(EnumMemberType.Student);
		System.out.print("input your Id: ");
		s1.setId(scan1.nextInt());
		System.out.print("input First Name: ");
		s1.setFn(scan1.next());
		System.out.print("input Last Name: ");
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
		System.out.println("Enter your Course Type£º");
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
		}while(flag.equals("N")||flag.equals("n"));
		System.out.println("---------------------------");
		System.out.println("The student Info: ");
		s1.setDate(d1);		
		myStulist.add(s1);
		System.out.println(myStulist.toString());
		}
		else if(nbr==2) {
		emp1.setType(EnumMemberType.Employee);
		System.out.print("input your Id: ");
		emp1.setId(scan1.nextInt());
		System.out.print("input First Name: ");
		emp1.setFn(scan1.next());
		System.out.print("input Last Name: ");
		emp1.setLn(scan1.next());
		System.out.print("input your SIN : ");
		emp1.setSsn(scan1.nextInt());
		System.out.print("input your Hourly Rate : ");
		emp1.sethourlyRate(scan1.nextFloat());
		System.out.print("input your Hour for week : ");
		emp1.sethourforweek(scan1.nextInt());
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
		System.out.print("input your Started year : ");
		d1.setYear(scan1.nextInt());	
		System.out.println("---------------------------");
		System.out.println("The Employee Info: ");
		emp1.setDate(d1);
		myEmplist.add(emp1);
		System.out.println(myEmplist.toString());
		}
		else if(nbr==3) {
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
			System.out.println("Enter your Course Type£º");
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
	

}
