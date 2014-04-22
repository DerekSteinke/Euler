import java.math.BigInteger;

/**
 * Finds the number of Lychrel numbers less than 10,000 , assuming none become
 * palindromic in more than 50 iterations.
 * 
 * @author derek.steinke
 * 
 */

public class P55 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			BigInteger newNum = BigInteger.valueOf(i);
			boolean isLychrel = true;
			for (int k = 0; k < 50; k++) {
				newNum = reverseAdd(newNum);
				if (isPalindromic(newNum)) {
					isLychrel = false;
				}
			}
			if (isLychrel) {
				count += 1;
			}
		}
		System.out.println(count);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/**
	 * 
	 * @param x
	 *            a number to be tested as palindromic
	 * @return true if x is palindromic, false if it is not
	 */
	private static boolean isPalindromic(BigInteger x) {
		String numStr = x.toString();
		String reverseNumStr = new StringBuffer(numStr).reverse().toString();
		if (numStr.equals(reverseNumStr)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param x
	 *            a number to perform the reverse-add operation on
	 * @return the sum of x and its reverse
	 */
	public static BigInteger reverseAdd(BigInteger x) {
		String numStr = x.toString();
		String reverseNumStr = new StringBuffer(numStr).reverse().toString();
		BigInteger reverseNum = new BigInteger(reverseNumStr);
		return x.add(reverseNum);
	}

}
