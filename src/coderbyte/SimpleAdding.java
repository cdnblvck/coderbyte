package coderbyte;
import static org.junit.Assert.*;
/**
 * https://coderbyte.com/results/devlex:Simple%20Adding:Java
 * @author _DELEX
 */
public class SimpleAdding {
	public static void main(String[] args) {
		assertEquals(78, simpleAdding(12));
		assertEquals(9870, simpleAdding(140));
	}
	public static int simpleAdding(int num) {
		int rep = 0;
		while (num > 0) {
			rep += num;
			num--;
		}
		return rep;
	}
}
