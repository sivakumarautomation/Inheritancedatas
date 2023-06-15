package single;//package//

public class Car { //class//
	
	public void start() {
		
		System.out.println("Car starts");
		
	}
	
	public void stop() {
		System.out.println("Fuel is empty");
	}
	
	public void refuel() {
		
		System.out.println("Refill Fuel");
		
	}
	
	 public static void main(String[] args) { 
		 Car cr = new Car();
		 cr.start();
		 cr.stop();
		 cr.refuel();
		
	}

}
