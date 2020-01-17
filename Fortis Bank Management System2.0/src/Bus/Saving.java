package Bus;

public class Saving extends Account {
	
	private float annualrate;
	private float annualgain;
	public float getAnnualgain() {
		return annualgain;
	}
	public void setAnnualgain(float annualgain) {
		this.annualgain = annualgain;
	}
	public float getAnnualrate() {
		return annualrate;
	}
	public void setAnnualrate(float annualrate) {
		this.annualrate = annualrate;
	}
	public Saving() {
		super();
		this.annualrate=0;
		this.annualgain=0;
		
	}
	public Saving(int ano,int pw,EnumAccountType type,float balance,Date date,EnumTransactionType Type,int tno,float rate,float gain)
	{
		super(ano,pw,type,balance,date,tno);
		this.annualrate=rate;
		this.annualgain=gain;
				
	}

    public String toString()
    {
    	return super.toString()+"\nAnnual Rate:"+this.annualrate+"\nAnnual Gain:"+this.annualgain;
    }
	
}
