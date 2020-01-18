package client;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import bus.Course;
import bus.Date;
import bus.Employee;
import bus.EnmuCourseType;
import bus.EnumMemberType;
import bus.Student;
//import bus.Teacher;

public class LaSalleIncAdvanceApp {

	public static void main(String[] args) {
				
							Object[] options = {"Student","Employee","Exit"};
							int response=JOptionPane.showOptionDialog ( null, "Please select :","LaSalle Inc",JOptionPane.YES_OPTION ,JOptionPane.PLAIN_MESSAGE,
							null, options, options[0] );
							Date d1=new Date();
							Course c1=new Course();
							ArrayList<Course> myCourseList=new ArrayList<Course>();
							//ArrayList<Teacher> myTeacherList=new ArrayList<Teacher>();
							if (response == 0)
							{
								Student s1=new Student();
								 s1.setId(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your Id")));
								 s1.setFn(JOptionPane.showInputDialog(	"Enter your First name"));
								 s1.setLn(JOptionPane.showInputDialog(	"Enter your Last name"));
								 s1.setSsn(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your SIN")));
								 s1.setfeesPerSession(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your Fees")));
								d1.setDay(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your enrolled day(1-31)")));

								d1.setMonth(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your enrolled Month(1-12)")));

								d1.setYear(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your enrolled year")));
								c1.setCno(JOptionPane.showInputDialog("Enter your Course No:"));

								c1.setCname(JOptionPane.showInputDialog(
										"Enter your your Course Name:"));
								Object[] op = {"Computer Science","Fashion Design","Hotel Management","Tourism","Cooking","Accounting","Business","Other"};
								int rsp=JOptionPane.showOptionDialog ( null, "Please select your Course Type:","LaSalle Inc",JOptionPane.YES_OPTION ,JOptionPane.PLAIN_MESSAGE,
								null, op, op[0] );
								if(rsp==0)
								{
									c1.setType(EnmuCourseType.ComputerScience);	
								}
								else if(rsp == 1) {
									c1.setType(EnmuCourseType.FashionDesign);
								}
								else if(rsp == 2)
								{
									c1.setType(EnmuCourseType.HotelManagement);
								}
								else if(rsp == 3)
								{
									c1.setType(EnmuCourseType.Tourism);	
								}
								else if(rsp == 4) {
									c1.setType(EnmuCourseType.Cooking);	
								}
								else if(rsp == 5)
								{
									c1.setType(EnmuCourseType.Accounting);
								}
								else if(rsp == 6) {
									c1.setType(EnmuCourseType.Business);
								}
								else {
									JOptionPane.showMessageDialog( null,
											"Loading....", "Message box", 
											JOptionPane.INFORMATION_MESSAGE );
								}
								c1.setDurtion(Integer.parseInt(JOptionPane.showInputDialog(
										"Enter your Course duration(h)")));
								s1.setDate(d1);
								myCourseList.add(c1);
								s1.setList(myCourseList);
								s1.setType(EnumMemberType.Student);
								       JOptionPane.showMessageDialog( null,
								    		   s1.toString(), "Student Info", 
											JOptionPane.INFORMATION_MESSAGE );
							}
							else if(response == 1)
							{
								Employee emp1=new Employee();
								emp1.setId(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your Id")));
								emp1.setFn(JOptionPane.showInputDialog(	"Enter your First name"));
								emp1.setLn(JOptionPane.showInputDialog(	"Enter your Last name"));
								emp1.setSsn(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your SIN")));
								emp1.sethourforweek(Integer.parseInt(JOptionPane.showInputDialog(
											"Enter your Fees")));
								emp1.sethourlyRate(Integer.parseInt(JOptionPane.showInputDialog(
										"Enter your Fees")));
								d1.setDay(Integer.parseInt(JOptionPane.showInputDialog(
										"Enter your started day")));

								d1.setMonth(Integer.parseInt(JOptionPane.showInputDialog(
										"Enter your started Month")));

								d1.setYear(Integer.parseInt(JOptionPane.showInputDialog(
										"Enter your started year")));
								emp1.setDate(d1);
								emp1.setType(EnumMemberType.Student);
								       JOptionPane.showMessageDialog( null,
								    		   emp1.toString(), "Employee Info", 
											JOptionPane.INFORMATION_MESSAGE );
								
							}
							else if(response == 2)
							{
								
							int option = JOptionPane.showConfirmDialog(null, "Do you want to exit this appliaction?",
														"Exit", JOptionPane.YES_NO_OPTION,
														JOptionPane.QUESTION_MESSAGE);
								if(option==JOptionPane.YES_OPTION) {
									System.exit(0);
								}
								else
								{
									JOptionPane.showMessageDialog( null,
											"What do you want do Man£¿£¡£¡", "Message box", 
											JOptionPane.INFORMATION_MESSAGE );
								}
							}
													
						}
					
						
}
