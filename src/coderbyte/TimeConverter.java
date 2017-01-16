package coderbyte;
/*
 *  Using the Java language, have the function TimeConvert(num) take the num parameter being passed and 
 *  return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3).
 *   Separate the number of hours and minutes with a colon.
Sample Test Cases
	Input:126   Output:"2:6"
	Input:45  Output:"0:45"
 */
public class TimeConverter {
	  public  String timeConvert(int time) { 
			int rest=time%60;
			time/=60;
			String str="";
			str+=time+":"+rest;
			return str;
		 }
}
