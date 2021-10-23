package assignment1022;

public class Main {
	
	public static void main(String[] args) {

		bankAccount<String, String> account = new bankAccount<>("dummy", "user001");
		System.out.println("Welcome " + account.getCustomerName());
		System.out.println("Your ID is: " + account.getCustomerId());
		

		account.showMenu();

	}

}
