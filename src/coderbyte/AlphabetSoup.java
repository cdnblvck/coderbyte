package coderbyte;

import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * https://coderbyte.com/editor/guest:Alphabet%20Soup:Java
 * 
 * @author _DELEX
 */
public class AlphabetSoup {
	public static void main(String[] args) {
		String s = "bcdeeorty";
		assertEquals(s, alphabetSoup("coderbyte"));
	}

	public static String alphabetSoup(String sen) {
		String[] tab;
		String str = "";
		tab = sen.split("");
		Arrays.sort(tab);
		for (int i = 0; i < tab.length; i++) {
			str += "" + tab[i];
			// System.out.print(tab[i]+"\t");
		}
		return str;
	}
}
