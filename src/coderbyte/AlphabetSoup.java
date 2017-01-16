package coderbyte;

import java.util.Arrays;

/*
 *  Using the Java language, have the function AlphabetSoup(str) take the str string parameter being passed and 
 *  return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
 *  Assume numbers and punctuation symbols will not be included in the string.
Sample Test Cases

Input:"coderbyte" Output:"bcdeeorty"

Input:"hooplah"  Output:"ahhloop"

 */
public class AlphabetSoup {
	public String alphabetSoup(String sen) {
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
