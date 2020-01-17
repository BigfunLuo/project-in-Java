
package Bus;

public class Date {
 
	private int day;
	private int month;
	private int year;
	public Date() {
		
	}
    public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
    public int getDay()
    {
    	return this.day;
    }
    public void setDay(int da)
    {
    	this.day=da;
    }
    public int getMonth()
    {
    	return this.month;
    }
    public void setMonth(int mo)
    {
    	this.month=mo;
    }
    public int getYear()
    {
    	return this.year;
    }
    public void setYear(int ye)
    {
    	this.year=ye;
    }
    public String toString()
    {
    	return this.day+"/"+this.month+"/"+this.year;
    }
    
}
