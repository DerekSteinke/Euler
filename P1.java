/**
 * Finds the sum of all multiples of 3 or 5 below 1000.
 * @author derek.steinke
 *
 */

public class P1 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int sum = 0;
		for(int i = 3; i < 1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

}
