/**
 * Finds the largest prime factor of 600851475143
 * 
 * @author derek.steinke
 * 
 */

public class P3 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		Long num = new Long("600851475143");
		long factor = 0;

		// Loop starts at the maximum possible factor and descends until a
		// number is found that is prime and also a factor
		for (Long i = (long) Math.sqrt(num) + 1; i > 0; i -= 2) {
			if (isPrime(i) && num % i == 0) {
				factor = i;
				break;
			}
		}
		System.out.println(factor);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

	public static boolean isPrime(long x) {
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
