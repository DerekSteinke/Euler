import java.math.BigInteger;

/**
 * Finds the sum of all numbers below 1 million which are palindromic in both
 * their base 10 and base 2 forms, excluding leading zeros.
 * 
 * @author derek.steinke
 * 
 */

public class P36 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int sum = 0;
		for (Integer i = 1; i < 1000000; i++) {
			BigInteger binaryVal = new BigInteger((Integer.toBinaryString(i)));
			if (isPalindromic(BigInteger.valueOf(i))
					&& isPalindromic(binaryVal)) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

	/**
	 * 
	 * @param x a number to be tested as palindromic
	 * @return true if the x is palindromic, false if it is not.
	 */
	private static boolean isPalindromic(BigInteger x) {
		String numStr = x.toString();
		String reverseNumStr = new StringBuffer(numStr).reverse().toString();
		if (numStr.equals(reverseNumStr)) {
			return true;
		}
		return false;
	}

}
