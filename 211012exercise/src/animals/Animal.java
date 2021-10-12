package animals;

public class Animal {
	
	protected int height;
	protected int weight;
	protected String animalType;
	protected String bloodType;

	public Animal() {
		this.height = 100;
		this.weight = 1000;
		this.animalType = "undefined";
		this.bloodType = "undefined";
		
	}
	
	public Animal(int height, int weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	protected void showInfo() {
		System.out.println(this.getClass().getName());
		System.out.println("height: " + this.height);
		System.out.println("weight: " + this.weight);
		System.out.println("animalType: " + this.animalType);
		System.out.println("bloodType: " + this.bloodType);
	}

}
