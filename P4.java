/**
 * Finds the largest palindromic number that is a product of two 3-digit
 * integers.
 * 
 * @author derek.steinke
 * 
 */

public class P4 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int max = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int current = i * j;
				if (isPalindromic(current) && current > max) {
					max = current;
				}
			}
		}
		System.out.println(max);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

	private static boolean isPalindromic(Integer x) {
		String numStr = x.toString();
		String reverseNumStr = new StringBuffer(numStr).reverse().toString();
		if (numStr.equals(reverseNumStr)) {
			return true;
		}
		return false;
	}

}
