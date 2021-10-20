import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		ArrayList<Integer> Random = new ArrayList<>();
		
		Random.add(50);
		Random.add(1);
		Random.add(2);
		Random.add(3);
		Random.add(4);
		Random.add(5);
		Random.add(6);
		Random.add(7);
		Random.add(8);
		Random.add(9);
		Random.add(10);
		
		System.out.println(Random);
		
		if(Random.contains(50)) {
			System.out.println("the number is in the list");
		}else {
			System.out.println("the number is NOT in the list");
		}
		
	}

}
