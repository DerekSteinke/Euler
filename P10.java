/**
 * Finds the sum of all prime numbers below 2 million.
 * @author derek.steinke
 *
 */

public class P10 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		long sum = 2;
		for(int i = 3; i < 2000000; i+=2){
			if(isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
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
