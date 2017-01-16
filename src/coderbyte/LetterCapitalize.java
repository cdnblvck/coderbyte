package coderbyte;

/**
 * Challenge Using the Java language, have the function LetterCapitalize(str)
 * take the str parameter being passed and capitalize the first letter of each
 * word. Words will be separated by only one space. Sample Test Cases
 * Input:"hello world" Output:"Hello World" Input:"i ran there" Output:"I Ran
 * There"
 */

public class LetterCapitalize {
	public String letterCapitalize(String sen) {
		
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
