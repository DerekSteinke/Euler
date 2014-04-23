import java.util.ArrayList;

/**
 * Finds the first odd composite number that cannot be written as the sum of a
 * prime and twice a square.
 * 
 * @author derek.steinke
 * 
 */

public class P46 {

	static ArrayList<Integer> primes = new ArrayList<>();

	public static void main(String[] args) {
		long start = System.nanoTime();
		primes.add(2);
		boolean found = false;
		int odd = 3;
		while (!found) {
			if (isPrime(odd)) {
				primes.add(odd);
			} else if (!isPrime(odd) && !isGoldbachs(odd)) {
				found = true;
			}
			odd += 2;
		}
		System.out.println(odd - 2);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

	/**
	 * 
	 * Check's if x follows Goldbach's other conjecture, that every odd
	 * composite number can be written as the sum of a prime and twice a square.
	 * Returns true if it does follow the rule, false if it does not.
	 */
	public static boolean isGoldbachs(int x) {
		for (int i = 1; i * i * 2 < x; i++) {
			if (primes.contains(x - i * i * 2)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param x
	 *            an integer to be checked as a prime
	 * @return true if x is prime, false if x is not prime
	 */
	public static boolean isPrime(int x) {
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0 || x == 1) {
			return false;
		}
		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * getPrimes() is not used because finding the primes while iterating through
	 * all of the odd numbers keep the number of primes that have to be found
	 * minimal.
	 */
	/**
	 * 
	 * @param max
	 *            the maximum number to be tested as prime
	 * @return an ArrayList of all primes under max
	 */
	public static ArrayList<Integer> getPrimes(int max) {
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		for (int i = 3; i < max; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

}
