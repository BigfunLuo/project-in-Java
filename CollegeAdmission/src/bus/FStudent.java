package bus;

public class FStudent extends Student {
	
	private float feesPerSession;
	public FStudent() {
		super();
		this.feesPerSession=0;

	}
	
	public FStudent(int id,String fn, String ln,String email,float fee,float ffee) {
		super();
		this.feesPerSession=ffee;
		
	}
	public float getfeesPerSession()
    {
    	return this.feesPerSession;
    }
    public void setfeesPerSession(float fees)
    {
    	this.feesPerSession=fees;
    }
    public String toString()
    {
    	return super.toString()+"\n Fees£º "+this.feesPerSession;
    }
    public double calPay() {
    	return this.feesPerSession*this.getFirstfees();
    }

}
