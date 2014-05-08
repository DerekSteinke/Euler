/**
 * Finds the smallest integer which can be evenly divided by each number from
 * 1-20.
 * 
 * @author derek.steinke
 * 
 */

public class P5 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		boolean found = false;
		int x = 190;
		while (!found) {
			found = false;
			for (int i = 20; i > 2; i--) {
				if (x % i != 0) {
					found = false;
					break;
				}
				found = true;
			}
			x += 2;
		}
		System.out.println(x - 2);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

}
