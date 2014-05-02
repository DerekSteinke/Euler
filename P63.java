import java.math.BigInteger;

/**
 * Finds the number of n-digit positive integer which are also numbers to the
 * nth power
 * 
 * @author derek.steinke
 * 
 */

public class P63 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int count = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 25; j++) {
				if (BigInteger.valueOf(i).pow(j).toString().length() == j) {
					count += 1;
				}
			}
		}
		System.out.println(count);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}
}
