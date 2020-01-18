package bus;

public class PStudent extends Student{
	private float feesPerCredit;
	
	public PStudent() {
		super();
		this.feesPerCredit=0;

	}

	public PStudent(int id,String fn,String ln,String email,float fees,float ffee) {
		super();
		this.feesPerCredit=fees;

	}
	public float getfeesPerCredit()
    {
    	return this.feesPerCredit;
    }
    public void setfeesPerSession(float fees)
    {
    	this.feesPerCredit=fees;
    }
    public String toString()
    {
    	return super.toString()+"\nFees£º "+this.feesPerCredit;
    }
   
    public double calPay() {
    	return this.feesPerCredit*this.getFirstfees();
    }
}
