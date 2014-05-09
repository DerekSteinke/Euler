/**
 * Finds the largest product of 5 consecutive digits in the given number.
 * @author derek.steinke
 *
 */

public class P8 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		String num = "7316717653...2963450"; // Edited out most of the number. The problem with the full number can be found here:
		int max = 1, current = 1;            // http://projecteuler.net/problem=8
		for(int i = 0; i + 4 < num.length(); i++){
			current = 1;
			for(int j = 0; j < 5; j++){
				current *= Integer.parseInt(num.substring(i+j,i+j+1));
			}
			if(current > max){
				max = current;
			}
		}
		System.out.println(max);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}
}
