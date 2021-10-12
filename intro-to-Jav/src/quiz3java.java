
public class quiz3java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
