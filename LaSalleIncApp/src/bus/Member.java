package bus;

public class Member {


	private int id;
	private String fn;
	private String ln;
	private int ssn;
	private EnumMemberType type;
	private Date date;
	
	public Member() {
		this.type=EnumMemberType.Undefined;
		this.date=null;
	}
	
	public Member(int Id,String Fn,String Ln,int Ssn,EnumMemberType Type,Date Date)
	{
		
		this.id=Id;
		this.fn=Fn;
		this.ln=Ln;
		this.ssn=Ssn;
		this.date=Date;
		this.type=Type;
		
	}
	
	public Date getDate()
    {
    	return this.date;
    }
    public void setDate(Date da)
    {
    	this.date=da;
    }
	public EnumMemberType getType()
    {
    	return this.type;
    }
    public void setType(EnumMemberType Type)
    {
    	this.type=Type;
    }
	public int getId()
    {
    	return this.id;
    }
    public void setId(int Id)
    {
    	this.id=Id;
    }
    public String getFn()
    {
    	return this.fn;
    }
    public void setFn(String Fn)
    {
    	this.fn=Fn;
    }
    public String getLn()
    {
    	return this.ln;
    }
    public void setLn(String Ln)
    {
    	this.ln=Ln;
    }
    public int getSsn()
    {
    	return this.ssn;
    }
    public void setSsn(int Ssn)
    {
    	this.ssn=Ssn;
    }
   
	 public String toString()
	    {
	    	return "ID:"+this.id+"\t First Name:"+this.fn+"\t Last Name:"+this.ln+"\t SIN:"+this.ssn+"\t Status£º "+this.type+"\t Date£º "+date.toString();
	    }

}
