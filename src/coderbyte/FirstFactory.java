package coderbyte;
/*Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and 
 * return the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 
 * and the input will always be an integer. 
 * Sample Test Cases
Input:4 Output:24
Input:8 Output:40320
 * */

public class FirstFactory {
	public int firstFactorial(int num) {
		int retour = 1;
		while (num > 1) {
			retour *= num;
			num--;
		}
		return retour;
	}

	public  int firstfactorial(int n) {
		int num = 1;
		if (n < 0)
			throw new RuntimeException("Underflow");
		else if (n > 20)
			throw new RuntimeException("Overflow");
		else if (n == 0)
			return 1;
		else {
			for (int i = 1; i <= n; i++) {
				num *= i;
			}
		}
		return num;
	}
}
