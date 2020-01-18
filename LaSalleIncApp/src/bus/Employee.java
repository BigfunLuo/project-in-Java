package bus;

	public class Employee extends Member {

		
		private float hourlyRate;
		private int hourforweek;
		
		public Employee() {
			super();
			this.hourlyRate=0;
			this.hourforweek=0;
		}
		public Employee(int id,String fn, String ln,int ssn,EnumMemberType type,Date date,float pay,int hr) {
			super(id, fn,ln,ssn,type,date); 
			this.hourlyRate=pay;
			this.hourforweek=hr;
		}
		public float gethourlyRate()
	    {
	    	return this.hourlyRate;
	    }
	    public void sethourlyRate(float pay)
	    {
	    	this.hourlyRate=pay;
	    }
	    public int gethourforweek()
	    {
	    	return this.hourforweek;
	    }
	    public void sethourforweek(int hr)
	    {
	    	this.hourforweek=hr;
	    }
	    public String toString()
	    {
	    	return super.toString()+"\n Hourly Rate£º "+this.hourlyRate+"\n Hour for week£º "+this.hourforweek;
	    }

}
