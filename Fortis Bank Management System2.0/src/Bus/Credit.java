package Bus;

public class Credit extends Account {
	private int limitation;
	public int getLimitation() {
		return limitation;
	}
	public void setLimitation(int limitation) {
		this.limitation = limitation;
	}
	public Credit() {
		super();
		this.limitation=0;
		//this.transactionType=EnumTransactionType.undefined;
	}
	public Credit(int ano,int pw,EnumAccountType type,float balance,Date date,EnumTransactionType Type,int tno,int limite)
	{
		super(ano,pw,type,balance,date,tno);
		this.limitation=limite;
		//this.transactionType=Type;		
	}

    public String toString()
    {
    	return super.toString()+"\nlimitation:"+this.limitation;//+transaction;
    }
	
}
