package coderbyte;
/*
 *  Using the Java language, have the function CheckNums(num1,num2) take both parameters being passed and 
 *  return the string true if num2 is greater than num1, otherwise return the string false. If the parameter values 
 *  are equal to each other then return the string -1.
Sample Test Cases
	Input:3 & num2 = 122  Output:"true"
	Input:67 & num2 = 67 Output:"-1"

 */
public class CheckNums {
	public int checkNums(int num1, int num2) {
		return num1 > num2 ? 1 : num1 == num2 ? -1 : 0;// ok
		/*
		 * int rep=0;if((num1-num2)>0) rep=1; else if((num1-num2)==0) rep=-1;
		 * else rep=0; return rep;
		 */
	}
}
