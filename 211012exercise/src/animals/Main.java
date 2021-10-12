package animals;

import animals.bird.Bird;
import animals.fish.Eal;
import animals.fish.Fish;
import animals.reptile.Crocodile;
import animals.reptile.Reptile;


public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal(10, 15, "animal type", "blood type");
		animal.showInfo();

		Reptile reptile = new Reptile(20, 25, "reptile", "reptile blood", "dry skin", "soft-shelled-eggs", "yes");
		reptile.showInfo();

		Crocodile crocodile = new Crocodile(30, 35, "crocodile", "reptile blood", "dry skin", "hard-shelled-eggs",
				"yes");
		crocodile.showInfo();

		Fish fish = new Fish("live in water", "yes");
		fish.showInfo();

		Eal eel = new Eal();
		eel.showInfo();

		Bird bird = new Bird();
		bird.showInfo();

		animals.bird.Crocodile clo = new animals.bird.Crocodile();
		clo.showInfo();

	}

}
