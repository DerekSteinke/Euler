/**
 * Finds the number of circular primes that exist below 1 million.
 * 
 * @author derek.steinke
 *
 */

public class P35 {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		int sum = 13;
		for (Integer i = 101; i <= 1000000; i += 2) {
			boolean isCircular = true;
			if (isPrime(i)) {
				String origNum = i.toString();
				String newNumStr = null;
				circularLoop: for (int j = 1; j < origNum.length(); j++) {
					newNumStr = origNum.substring(origNum.length()-j)
							+ origNum.substring(0, origNum.length()-j);
					if (!isPrime(Integer.parseInt(newNumStr))) {
						isCircular = false;
						break circularLoop;
					}
				}
			} else
				isCircular = false;
			if (isCircular) {
				sum += 1;
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/**
	 * 
	 * @param x a number to be checked as prime
	 * @return true if x is prime, false if x is not prime.
	 */
	public static boolean isPrime(int x) {
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0 || x == 1) {
			return false;
		}
		for (int i = 3; i * i <= Math.abs(x); i += 2) {
			if (x % i == 0){
				return false;
			}
		}
		return true;
	}

}
