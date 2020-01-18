package client;

import java.util.*;
import bus.*;
import bus.Date;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> myStulist=new ArrayList<Student>();
		//buildData(myStulist);
		ArrayList<Member> myMemberList=new ArrayList<Member>();
		ArrayList<Teacher> myTeacherList=new ArrayList<Teacher>();
		ArrayList<Course> myCourseList=new ArrayList<Course>();
		//Employee emp1=new Employee();
    //add
		Date d1=new Date(8,5,1998);	
	    //System.out.println(d1);
		Course c1=new Course("cp102","java",EnmuCourseType.ComputerScience,65);
		myCourseList.add(c1);
		
		Student s1=new Student(7,"lory","luo",123,EnumMemberType.Student,d1,120,myCourseList);
		Student s3=new Student(5,"Mingming","Zhang",893,EnumMemberType.Student,d1,890,myCourseList);
		Student s2=new Student(15,"Mary","brown",187,EnumMemberType.Student,new Date(1,12,2011),250,myCourseList);
		myMemberList.add(s1);	
		myMemberList.add(s2);
		myMemberList.add(s3);
		Teacher t1=new Teacher(4,"vivian","Smith",993,EnumMemberType.Teacher,new Date(1,12,2011),20,37,myCourseList);
		Teacher t2=new Teacher(11,"lily","Zhang",453,EnumMemberType.Teacher,new Date(1,12,2011),45,40,myCourseList);
		myMemberList.add(t1);
		myMemberList.add(t2);
	//split
		for(Member aMember:myMemberList) {
			if(aMember instanceof Student) {
				myStulist.add((Student)aMember);
			}
			else if(aMember instanceof Teacher)
			{
				myTeacherList.add((Teacher)aMember);
			}
		}
		
		//System.out.print(myStulist.toString());
		//System.out.print(myTeacherList.toString());
	//sort
		/*System.out.println("\nSorted by Student fee"); 
		 Collections.sort(myStulist,new Sortbyfee()); 
		  for (int i=0; i<myStulist.size(); i++) 
	      System.out.println(myStulist.get(i)); 
	//search
	        System.out.println("\nSearch by Id='7'"); 
		    int searchId=20;
	        System.out.println(SearchbyId(searchId,myStulist)); 
	        System.out.println("\nSearch by firstname='lory' && lastname='luo'"); 
	        String fname="lory";
	        String lname="luo";
	        System.out.println(Searchbyfullname(fname,lname,myStulist)); 
	//remove
	        if(SearchbyId(searchId,myStulist)==null)
			{
				System.out.println("Student is not exit!");
			}
			else
			{
				myStulist.remove(SearchbyId(searchId,myStulist));
			}*/
	     IdComparator idPredicat=new IdComparator();
		 Collections.sort(myStulist,idPredicat);
		 for(Student ind :myStulist)
		 {
			 System.out.println(ind);
		 }
	}
     static Student SearchbyId(int id,ArrayList<Student> alist) {
    	 for (Student aStudent : alist) {
             if (aStudent.getId() == id) {
                 return aStudent;
             }
         }
         return null; 
     }

     static Student Searchbyfullname(String fn,String ln,ArrayList<Student> alist) {
    	 for (Student aStudent : alist) {
             if (aStudent.getFn() == fn&&aStudent.getLn()==ln) {
                 return aStudent;
             }
         }
         return null; 
     }
     public static class Sortbyfee implements Comparator<Student> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(Student a, Student b) 
	    { 
	        return (int) (b.getfeesPerSession()- a.getfeesPerSession()); //从大到小
	        //return (int) (a.getfeesPerSession()- b.getfeesPerSession()); //从小到大
	    } 
	}

	}
	


