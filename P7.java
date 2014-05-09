/**
 * Finds the 10001st prime.
 * @author derek.steinke
 *
 */

public class P7 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int prime = 0, count = 1;
		for(int i = 3; count < 10001; i+= 2){
			if(isPrime(i)){
				count++;
				prime = i;
			}
		}
		System.out.println(prime);
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
