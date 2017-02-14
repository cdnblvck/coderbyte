package coderbyte;
import static org.junit.Assert.*;
/**
 * https://coderbyte.com/results/devlex:Letter%20Capitalize:Java
 * @author _DELEX
 */

public class LetterCapitalize {
	public static void main(String[] args) {
		assertEquals("Hello World", letterCapitalize("hello world"));
	}
	public static String letterCapitalize(String sen) {
		
		String str[] = sen.split(" ");
		StringBuffer sb = new StringBuffer();
		int w = str.length;
		for (int i = 0; i < w; i++) {
			for (int k = 0; k < str[i].length(); k++) {
				char c = str[i].charAt(k);
				if (k == 0)
					c = Character.toUpperCase(str[i].charAt(k));
				sb.append(c);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
