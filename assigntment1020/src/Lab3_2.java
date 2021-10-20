import java.util.ArrayList;
import java.util.Random;

public class Lab3_2 {

	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<>();
		
		random.add(49);
		random.add(33);
		random.add(25);
		random.add(10);
		random.add(44);
		random.add(26);
		random.add(19);
		random.add(30);
		random.add(18);
		random.add(12);
		random.add(40);
		
		
		
		System.out.println(random);
		
		ArrayList<Integer> another = new ArrayList<Integer>(random);
		System.out.println(another);
		random.remove(0);
		random.add(0, -5);
		System.out.println(random);	
		
	}

}
