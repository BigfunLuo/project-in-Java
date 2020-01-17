package Bus;

public class Checking extends Account {
    	
    	private  EnumTransactionType transactionType;
		private float extrafees;
    	public float getExtrafees() {
		return this.extrafees;
	}

	public void setExtrafees(float extrafees) {
		this.extrafees = extrafees;
	}

		public Checking() {
    		super();
    	}
    	
		public Checking(int ano,int pw,EnumAccountType type,float balance,Date date,int tno,float fees)
    	{
    		super(ano,pw,type,balance,date,tno);
			this.extrafees=fees;

    	}
   
        public String toString()
        {
        	return super.toString()+"\n"+this.extrafees;//+"\n :"+.toString();
        }
    	
	
}
