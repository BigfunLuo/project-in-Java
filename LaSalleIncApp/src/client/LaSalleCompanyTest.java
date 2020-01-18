package client;

import java.util.ArrayList;
//import java.util.Scanner;

import bus.*;



public class LaSalleCompanyTest{

	public static void main(String[] args) {
		ArrayList<Student> myStulist=new ArrayList<Student>();
		ArrayList<Member> myMemberList=new ArrayList<Member>();
		ArrayList<Teacher> myTeacherList=new ArrayList<Teacher>();
		ArrayList<Course> myCourseList=new ArrayList<Course>();
		
		Date d1=new Date(8,5,1998);
		Date d2=new Date(1,12,2011);
		Course c1=new Course("cp102","java",EnmuCourseType.ComputerScience,65);
		myCourseList.add(c1);
		Course c2=new Course("pc104","C++",EnmuCourseType.ComputerScience,20);
		myCourseList.add(c2);
		Student s1=new Student(7,"lory","luo",123,EnumMemberType.Student,d1,120,myCourseList);
		Teacher t1=new Teacher(4,"vivian","Smith",993,EnumMemberType.Teacher,d2,20,37,myCourseList);
		Teacher t2=new Teacher(11,"lily","Zhang",453,EnumMemberType.Teacher,d1,45,40,myCourseList);
		Student s2=new Student(15,"Mary","brown",187,EnumMemberType.Student,d2,250,myCourseList);
		myMemberList.add(s1);
		myMemberList.add(s2);
		myMemberList.add(t1);
		myMemberList.add(t2);
		
		for(Member aMember : myMemberList) {
			if(aMember instanceof Student) {
				myStulist.add((Student)aMember);
			}
			else if(aMember instanceof Teacher)
			{
				myTeacherList.add((Teacher)aMember);
			}
		}
		System.out.println(myStulist.toString());
		System.out.println(myTeacherList.toString());
		System.exit(0);
	}

}
