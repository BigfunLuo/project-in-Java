package bus;

import java.util.*;

public class Student extends Member {
	private List<Course> mycourseList;

	private float feesPerSession;
	public Student() {
		super();
		this.feesPerSession=0;
		mycourseList=new ArrayList<Course>();
	}
	public Student(int id,String fn, String ln,int ssn,EnumMemberType type,Date date,float fees,List<Course> list) {
		super(id,fn,ln,ssn,type,date); 
		this.feesPerSession=fees;
		this.mycourseList=list;
	}
	public float getfeesPerSession()
    {
    	return this.feesPerSession;
    }
    public void setfeesPerSession(float fees)
    {
    	this.feesPerSession=fees;
    }
    public List<Course> getList()
    {
    	return this.mycourseList;
    }
    public void setList(List<Course> list)
    {
    	this.mycourseList=list;
    }
    public String toString()
    {
    	return super.toString()+"\t Fees Per Session£º "+this.feesPerSession+"\t "+mycourseList.toString();
    }
   
}
