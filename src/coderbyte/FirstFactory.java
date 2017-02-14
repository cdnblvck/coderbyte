package coderbyte;

import static org.junit.Assert.assertEquals;

/**
 * https://coderbyte.com/results/devlex:First%20Factorial:Java
 * @author _DELEX
 */

public class FirstFactory {
	public static void main(String[] args) {
		assertEquals(24, firstFactorial(4));
	}
	public static int firstFactorial(int num) {
		int retour = 1;
		while (num > 1) {
			retour *= num;
			num--;
		}
		return retour;
	}
}
