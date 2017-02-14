package coderbyte;

import static org.junit.Assert.assertEquals;

/**
 * https://coderbyte.com/results/devlex:Longest%20Word:Java
 * @author _DELEX
 */

public class LongestWord {
	public static void main(String[] args) {
		String s = "time";
		String str="love";
		assertEquals(s, longestWord("fun&!! time"));
		assertEquals(str, longestWord("I love dogs"));
	}
	public static String longestWord(String sen) { 
	      int i=0;
	      String s= sen.replace("/[^a-zA-Z0-9]/g","");
	      System.out.println(s);
			int plusLong=Integer.MIN_VALUE;
			String [] mots=s.split(" ");
			for(i=0;i<mots.length;i++){
				if(mots[i].length()>plusLong){
					sen=mots[i];
					plusLong=mots[i].length();
				}
			}
	    return sen;
	  }
}
