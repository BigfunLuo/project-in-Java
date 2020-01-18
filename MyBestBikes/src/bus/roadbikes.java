package bus;

public class roadbikes extends bike {
	private float seatheight;

	public roadbikes() {
		super();
	this.seatheight=0;
	}

	public roadbikes(int sno,Enumtype type, String brand, String model, float speed, Enumcolor color, float price, 
			Date madedate,float sh) {
		super(sno, type, brand, model, speed, color, price, madedate);
			this.seatheight=sh;
	}
	public float getSeatheight() {
		return seatheight;
	}

	public void setSeatheight(float seatheight) {
		this.seatheight = seatheight;
	}
	

	@Override
	public String toString() {
		return "roadbikes ["+super.toString()+"seatheight=" + this.seatheight+"]";
	}

	
}
