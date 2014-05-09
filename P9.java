/**
 * Finds a*b*c when a+b+c = 1000 and a^2 + b^2 = c^2.
 * @author derek.steinke
 *
 */

public class P9 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int answer = 1;
		outerLoop: for(int i = 998; i > 1; i--){
			for(int j = 1; j + i < 1000; j++){
				int k = 1000 - i - j;
				if(j*j + k*k == i*i){
					answer = i*j*k;
					break outerLoop;
				}
			}
		}
		System.out.println(answer);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

}
