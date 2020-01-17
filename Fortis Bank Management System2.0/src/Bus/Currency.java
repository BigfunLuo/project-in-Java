package Bus;

public class Currency extends Account {
	
	//private  EnumTransactionType transactionType;
	public Currency() {
		super();
		//this.transactionType=EnumTransactionType.undefined;
	}
	public Currency(int ano,int pw,EnumAccountType type,float balance,Date date,EnumTransactionType Type,int tno)
	{
		super(ano,pw,type,balance,date,tno);
		//this.transactionType=Type;		
	}
	
    public String toString()
    {
    	return super.toString();//+transaction;
    }
}
	
