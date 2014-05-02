/**
 * Finds the sum of all left and right sided trunatable primes greater than 9.
 * @author derek.steinke
 *
 */

public class P37 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int found = 0, sum = 0;
		for (int i = 19; found < 11; i += 2) {
			if (isPrime(i)) {
				if (isTruncatable(Integer.toString(i))) {
					found += 1;
					sum += i;
				}
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/*
	 * Tests if a number is trunatable from the left and right side
	 */
	public static boolean isTruncatable(String num) {
		for (int i = 1; i < num.length(); i++) {
			if (!isPrime(Integer.parseInt(num.substring(0, i)))
					|| !isPrime(Integer.parseInt(num.substring(i)))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int x) {
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0 || x == 1) {
			return false;
		}
		for (int i = 3; i * i <= Math.abs(x); i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
