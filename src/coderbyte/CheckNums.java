package coderbyte;

import static org.junit.Assert.assertEquals;

/**
 * https://coderbyte.com/results/devlex:Check%20Nums:Java
 * @author _DELEX
 */
public class CheckNums {
	public static void main(String[] args) {
		assertEquals(0, checkNums(3, 67));
	}
	public static int checkNums(int num1, int num2) {
		return num1 > num2 ? 1 : num1 == num2 ? -1 : 0;// ok
		/*
		 * int rep=0;if((num1-num2)>0) rep=1; else if((num1-num2)==0) rep=-1;
		 * else rep=0; return rep;
		 */
	}
}
