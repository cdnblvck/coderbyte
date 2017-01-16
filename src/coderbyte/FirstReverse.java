package coderbyte;
/*Challenge
Using the Java language, have the function FirstReverse(str) take the str parameter being passed and
return the string in reversed order. For example: if the input string is "Hello World and Coders" 
then your program should return the string sredoC dna dlroW olleH.
Sample Test Cases
Input:"coderbyte"
Output:"etybredoc"
Input:"I Love Code"
Output:"edoC evoL I"
*/
public class FirstReverse {
	public String firstReverse(String str) {
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
