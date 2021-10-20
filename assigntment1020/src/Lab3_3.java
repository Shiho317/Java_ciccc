import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Lab3_3 {

	public static void main(String[] args) {
				
				List<Car> carList = new ArrayList<>();
				Random random = new Random();

				for (int i = 0; i < 10; i++) {
					Car car = new Car(random.nextInt(80) + 1);
					carList.add(car);
				}

				carList.sort(Comparator.comparing(Car::getYear));
				for (int i = 0; i < carList.size(); i++) {
					System.out.println("car year: " + carList.get(i).year);
				}
	
				
		 
			}	
				
				

}

		

