package bus;

public class bike {
		private int sno;
		private Enumtype type;
		private String brand;
		private String model;
		private float speed;
		private Enumcolor color;
		private float price;
		private Date madedate;
		public bike() {
			this.sno = 0;
			this.brand = "";
			this.model = "";
			this.speed = 0;
			this.color = Enumcolor.undefined;
			this.price = 0;
			this.madedate = null;
			this.type=Enumtype.undeined;
			
		}
		
		public bike(int sno, Enumtype tp,String brand, String model, float speed, Enumcolor color, float price, Date madedate) {
			this.sno = sno;
			this.brand = brand;
			this.model = model;
			this.speed = speed;
			this.color = color;
			this.price = price;
			this.madedate = madedate;
			this.type=tp;
		}

		public Enumtype getType() {
			return type;
		}

		public void setType(Enumtype type) {
			this.type = type;
		}

		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public float getSpeed() {
			return speed;
		}
		public void setSpeed(float speed) {
			this.speed = speed;
		}
		public Enumcolor getColor() {
			return color;
		}
		public void setColor(Enumcolor color) {
			this.color = color;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Date getMadedate() {
			return madedate;
		}
		public void setMadedate(Date madedate) {
			this.madedate = madedate;
		}

		@Override
		public String toString() {
			return "bike [sno=" + sno + ", type=" + type + ", brand=" + brand + ", model=" + model + ", speed=" + speed
					+ ", color=" + color + ", price=" + price + ", madedate=" + madedate + "]";
		}
		
		
}
