/**
 * Finds the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author derek.steinke
 * 
 */

public class P6 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		long sum = 0, sumSqr = 0, sqrSum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			sqrSum += i * i;
		}
		sumSqr = sum * sum;
		System.out.println(sumSqr - sqrSum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}
}
