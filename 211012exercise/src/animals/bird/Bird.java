package animals.bird;

import animals.Animal;

public class Bird extends Animal{
	String canFly;
	String hasFeathers;

	public Bird() {
		super();
		this.canFly = "yes";
		this.hasFeathers = "yes";
		
	}
	
	public Bird(String canFly, String hasFeathers) {
		super();
		this.canFly = canFly;
		this.hasFeathers = hasFeathers;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("canFly: " + canFly);
		System.out.println("hasFeathers: " + hasFeathers);
	}

}
