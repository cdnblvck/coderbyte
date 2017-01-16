package coderbyte;

/*Challenge
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and 
return the largest word in the string. If there are two or more words that are the same length, 
return the first word from the string with that length. Ignore punctuation and assume sen will not be empty.

Sample Test Cases
Input:"fun&!! time"    Output:"time"
Input:"I love dogs"  Output:"love
*/
public class LongestWord {
	public String longestWord(String sen) {
		String s = sen.replace("/[^a-zA-Z0-9]/g", "");
		String[] tabString = s.split(" ");
		int n = 0;
		for (int i = 0; i < tabString.length; i++) {
			if (n < tabString[i].length()) {
				n = tabString[i].length();
				s = tabString[i];
			}
		}
		return s;
	}
}
