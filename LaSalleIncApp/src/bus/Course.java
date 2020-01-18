package bus;

public class Course {
		private String cno;
		private String cname;
		private EnmuCourseType ctype;
		private int duration;
		public Course() {
			this.cno="";
			this.cname="";
			this.ctype=EnmuCourseType.Undefined;
			this.duration=0;
		}
		
		public Course(String No,String name,EnmuCourseType Type,int dura)
		{
			
		this.cno=No;
		this.cname=name;
		this.duration=dura;
		this.ctype=Type;
		
	}
	
	public String getCno()
    {
    	return this.cno;
    }
    public void setCno(String no)
    {
    	this.cno=no;
    }
	public EnmuCourseType getType()
    {
    	return this.ctype;
    }
    public void setType(EnmuCourseType Type)
    {
    	this.ctype=Type;
    }
	public int getDuration()
    {
    	return this.duration;
    }
    public void setDurtion(int du)
    {
    	this.duration=du;
    }
    public String getCname()
    {
    	return this.cname;
    }
    public void setCname(String cn)
    {
    	this.cname=cn;
    }
    public String toString(){
    	return "Course No:"+this.cno+"\nCourse Name:"+this.cname+"\nCourse Type:"+this.ctype+"\nDuration:"+this.duration+" hr\n";
    }
		
		
		
}
