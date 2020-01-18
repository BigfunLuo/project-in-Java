package bus;

import java.util.*;

public class Teacher extends Employee {

	private List<Course> mycourseList;

	public Teacher() {
		super();
		mycourseList=new ArrayList<Course>();
	}
	public Teacher(int id,String fn, String ln,int ssn,EnumMemberType type,Date date,float pay,int hr,List<Course> list) {
		super(id, fn,ln,ssn,type,date,pay,hr); 
		this.mycourseList=list;
	}
	public List<Course> getList()
    {
    	return this.mycourseList;
    }
    public void setList(List<Course> list)
    {
    	this.mycourseList=list;
    }
    public String ToString(){
	 return super.toString()+mycourseList.toString();
 }

}
