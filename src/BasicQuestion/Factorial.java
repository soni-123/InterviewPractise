package BasicQuestion;

public class Factorial {

	int facto=1;
	public static void main(String[] args) {
		int num=5;
		 
		int fact=findFactorial(num);
			System.out.println("The Factorial of the entered no is: "+fact);
		}
	
	
	static int findFactorial(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num*findFactorial(num-1);
		}
	
	}
	
}
