package test;

import coderbyte.*;

public class Testeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstReverse fr = new FirstReverse();
		System.out.println(fr.firstReverse("Hello World"));
		FirstFactory ff = new FirstFactory();
		System.out.println(ff.firstfactorial(4));
		LongestWord lw = new LongestWord();
		System.out.println(lw.longestWord("fun&!! time"));
		SimpleAdding sa = new SimpleAdding();
		System.out.println("Test 2 excepted 10: Result \t" + sa.simpleAdding(4) + "\nTest 2 execpted 9870: result\t"
				+ sa.simpleAdding(140));
		LetterCapitalize lc = new LetterCapitalize();
		System.out.println(lc.letterCapitalize("hello world"));
		AlphabetSoup as = new AlphabetSoup();
		System.out.println(as.alphabetSoup("coderbyte"));
	}

}
