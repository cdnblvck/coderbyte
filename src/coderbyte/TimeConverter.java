package coderbyte;
import static org.junit.Assert.*;
/**
 * https://coderbyte.com/results/devlex:Time%20Convert:Java
 * @author _DELEX
 */

public class TimeConverter {
	public static void main(String[] args) {
		String s = "2:6";
		String str= "0:45";
		assertEquals(s, timeConvert(126));
		assertEquals(str, timeConvert(45));
	}
	  public  static String timeConvert(int time) { 
			int rest=time%60;
			time/=60;
			String str="";
			str+=time+":"+rest;
			return str;
		 }
}
