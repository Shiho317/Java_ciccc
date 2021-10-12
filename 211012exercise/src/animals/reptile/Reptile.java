package animals.reptile;

import animals.Animal;

public class Reptile extends Animal {
	
	protected String skinType;
	protected String eggType;
	protected String hasBackbone;

	public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String eggType,
			String hasBackbone) {
		super(height, weight, animalType, bloodType);
		this.skinType = skinType;
		this.eggType = eggType;
		this.hasBackbone = hasBackbone;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("skinType: " + this.skinType);
		System.out.println("eggType: " + this.eggType);
		System.out.println("hasBackbone: " + this.hasBackbone);
	}
}
