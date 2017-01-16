package coderbyte;

/**
 * Using the Java language, have the function LetterChanges(str) take the str
 * parameter being passed and modify it using the following algorithm. Replace
 * every letter in the string with the letter following it in the alphabet (ie.
 * c becomes d, z becomes a). Then capitalize every vowel in this new string (a,
 * e, i, o, u) and finally return this modified string. Sample Test Cases
 * Input:"hello*3" Output:"Ifmmp*3" Input:"fun times!" Output:"gvO Ujnft!"
 *
 */
public class LetterChanges {
/*
	public static String letterchanges(String n) {
		int l = n.length();
		int i = 0;
		int p[] = new int[l];
		for (i = 0; i < l; i++) {
			p[i] = (int) n.charAt(i);
		}
		String str = "";
		char c = ' ';
		String voyelle = "aouiey";
		for (i = 0; i < l; i++) {
			c = (char) p[i];
			c += 1;
			str += "" + c;
		}
		return str;
	}*/

	public String letterChanges(String str) {
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
