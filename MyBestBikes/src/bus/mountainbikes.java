package bus;

public class mountainbikes extends bike {
    private EnumSuspension Suspension;
    private float height;
	public mountainbikes() {
		super();
	   this.Suspension=EnumSuspension.undefined;
	   this.height=0;
	}

	public mountainbikes(int sno,Enumtype type, String brand, String model, float speed, Enumcolor color, float price,
			Date madedate,EnumSuspension sp,float ht) {
		super(sno, type, brand, model, speed, color, price, madedate);
		this.Suspension=sp;
		this.height=ht;
	}
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public EnumSuspension getSuspension() {
		return Suspension;
	}

	public void setSuspension(EnumSuspension suspension) {
		Suspension = suspension;
	}

	@Override
	public String toString() {
		return "mountainbikes ["+ super.toString()+"Suspension=" + this.Suspension + ", height=" + this.height + "]";
	}
	
	
	
	
}
