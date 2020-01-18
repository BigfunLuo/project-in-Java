package bus;

import java.io.Serializable;

public class Person implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 6548104933238223951L;
	private int id;
	private String fn;


	public Person() {
	
	}
	
	public Person(int Id,String Fn)
	{
		
		this.id=Id;
		this.fn=Fn;
		
	
		
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
  

   
	 public String toString()
	    {
	    	return "ID:"+this.id+"\t First Name:"+this.fn;
	    			}

}
