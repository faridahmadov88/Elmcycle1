package section7_5;

public class Car {
	
	private String make;
	private String model;
	private int maxSpeed;
	private int currentSpeed;
	//time = distance/speed
	
	
	//this is getters
	public String getMake() {
		this.make=make;
		return make;
	}
	public String getModel() {
		this.model=model;
		return model;
	}
	public int getmaxSpeed() {
		this.maxSpeed=maxSpeed;
		return maxSpeed;
	}
	public int currentSpeed() {
		this.currentSpeed=currentSpeed;
		return currentSpeed;
	}
	//this is setters
	public void setMake(String  make) {
		this.make=make;
	}
	public void setModel(String  model) {
		this.model=model;
	}
	public void setmaxSpeed(int  maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public void setcurrentSpeed(int  currentSpeed) {
		this.currentSpeed=currentSpeed;
	}
	//end of setters
	
	
	public Car(String make,String model, int maxSpeed, int currentSpeed) {
		this.make=make;
		this.model=model;
		this.maxSpeed=maxSpeed;
		this.currentSpeed=currentSpeed;
		
		
	}
	
	
	public  int calculateTravelTime (int distance) {
		
		int time = distance / currentSpeed;
	
		return distance;
		
		
	}
	void infoAboutCar() {
		

		
		
	}

}
