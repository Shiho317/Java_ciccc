package animals.fish;

import animals.Animal;

public class Fish extends Animal{
	
	protected String live;
	protected String gill;

	public Fish() {
		this.live = "undefined";
		this.gill = "yes";
	}
	
	public Fish(String live, String gill) {
		super();
		this.live = live;
		this.gill = gill;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Living: " + this.live);
		System.out.println("hasGill: " + this.gill);
	}

}
