
public class Factorial {

	public Factorial () {
		int n =5;
		int result = factorial(n);
		System.out.println("Factorial of " + n + " = " + result);
	}
	
	public int factorial (int i) {
		int result;
		if (i == 1)
			result = 1;
		else
			result = i * factorial(i-1);
		
		return result;
	}
	
	public static void main(String[] args) {
		new Factorial();
		

	}

}
