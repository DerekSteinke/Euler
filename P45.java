/**
 * Finds the next positive integer after 40755 that is a triangle, pentagon, and
 * hexagon number.
 * 
 * @author derek.steinke
 * 
 */

public class P45 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int i = 144; // starting at the 144th in the series because H143 is 40755
		while (true) {
			// because hexagon numbers are a subset of triangle number, only the
			// pentagon and hexagon numbers need to be compared
			if (isPentagonal(i * (2 * i - 1))) {
				System.out.println(i * (2 * i - 1));
				break;
			}
			i++;
		}
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/**
	 * 
	 * @param i
	 *            a positive integer to be tested as pentagonal
	 * @return true if i is pentagonal, false if it is not.
	 */
	private static boolean isPentagonal(long i) {
		if ((Math.sqrt(1 + 24 * i) + 1.0) / 6.0 % 1 == 0) {
			return true;
		}
		return false;
	}
}
