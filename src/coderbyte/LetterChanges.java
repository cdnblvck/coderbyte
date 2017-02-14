package coderbyte;

import static org.junit.Assert.assertEquals;

/**
 * https://coderbyte.com/results/devlex:Letter%20Changes:JavaScript
 * @author _DELEX
 */
public class LetterChanges {
	public static void main(String[] args) {
		String s = "Ifmmp*3";
		String str="gvO Ujnft!";
		assertEquals(s, letterChanges("hello*3"));
		assertEquals(str, letterChanges("fun times!"));
	}
	public static String letterChanges(String str) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String incrementAlphabet = "bcdEfghIjklmnOpqrstUvwxyzA";
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = alphabet.indexOf(c);
			if (index != -1) {
				ret += "" + incrementAlphabet.charAt(index);
			} else {
				ret += "" + str.charAt(i);
			}
		}
		return ret;
	}
}
