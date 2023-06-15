package single; //package//

public class BMW extends Car { //class//
	
	public void start() {
		System.out.println("BMW high noise");
	}
	
    public void autoparking() {
    	
    	System.out.println("Automatic parking");
		
	}
    
     public static void main(String[] args) { //Main//
    	 BMW bw = new BMW();
    	 bw.start();
    	 bw.autoparking();
    	 bw.start();
    	 bw.stop();
    	 bw.refuel();
		
	}
}
