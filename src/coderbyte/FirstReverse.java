package coderbyte;

import static org.junit.Assert.assertEquals;

/**
 * https://coderbyte.com/results/devlex:First%20Reverse:Java
 * @author _DELEX
 */
public class FirstReverse {
	
	public static void main(String[] args) {
		String s = "dlroW olleH";
		assertEquals(s, firstReverse("Hello World"));
	}
	public static String firstReverse(String str) {
		StringBuffer sb=new StringBuffer();
		int n=str.length();
		for(int i=n-1;i>=0;i--){
			char c=str.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	public String firstReverse2(String str) {
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
	}
}
