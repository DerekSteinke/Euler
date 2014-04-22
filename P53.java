import java.math.BigInteger;

/**
 * Find the number of combinatorics, where 1 <= n <= 100, whose value is
 * over 1 million
 * 
 * @author derek.steinke
 * 
 */

public class P53 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int count = 0;
		for (int n = 1; n <= 100; n++) {
			for (int r = 1; r <= n; r++) {
				BigInteger combin = combinatoric(n, r);
				if (combin.compareTo(BigInteger.valueOf(1000000)) > 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/**
	 * 
	 * @param n n in the equation nCr = n! / r!(n-r)!
	 * @param r r in the equation nCr = n! / r!(n-r)!
	 * @return the combinatoric in the notation nCr
	 */
	public static BigInteger combinatoric(int n, int r) {
		BigInteger combin = factorial(n).divide(
				factorial(r).multiply(factorial((n - r))));
		return combin;
	}

	/**
	 * 
	 * @return the factorial of integer x, as a BigInteger
	 */
	public static BigInteger factorial(int x) {
		if (x <= 1) {
			return BigInteger.valueOf(1);
		}
		return BigInteger.valueOf(x).multiply(factorial(x - 1));
	}

}
