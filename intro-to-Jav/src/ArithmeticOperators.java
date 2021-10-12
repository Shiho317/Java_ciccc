
public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int i = 2 + 1;
		System.out.println(i);

		String s = "1" + '2';
		System.out.println(s);
		
		int z = 12 + 1;
		z = 12 -1;
		z = 12 * 2;
		z = 12 / 2;
		System.out.println(z);
		
		int mod = 13 % 2;
		System.out.println(mod);
		
		int mod1 = (int)12.5 % 2;
		System.out.println(mod1);
		
		int increment = 10;
		System.out.println("postfix: " + increment++);
		System.out.println("prefix: " + ++increment);
		
		System.out.println(- 23 - 3);
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1 && bool2) {
			System.out.println("condition is true");
		}else {
			System.out.println("condition is false");
		}
		
	   boolean a = true;
	   a = (10 == 5) ? true : false;
	   System.out.println(a);
		
		
		
	}

}
