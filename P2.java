/**
 * Finds the sum of all even numbered Fibonacci numbers below 4 million.
 * @author derek.steinke
 *
 */

public class P2 {
	
	public static void main(String[] args){
		long start = System.nanoTime();
		int sum = 2;
		int p = 1;
		int p2 = 2;
		
		//fibNum() is not used for the sake of performance
		while(p < 4000000 && p2 < 4000000){
			p = p+p2;
			if(p%2 == 0 && p < 4000000){
				sum += p;
			}
			p2 = p+p2;
			if(p2%2 == 0 && p2 < 4000000){
				sum += p2;
			}
		}
		System.out.println(sum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}
	
	/**
	 * Finds the Fibonacci number at term number n
	 * 
	 * @param n a positive integer, the term number to be found in the Fibonacci sequence
	 * @return the nth Fibonacci number
	 */
	public static int fibNum(int n){
		int fib = 1;
		int fib2 = 1;
		for(int i = 0; i <= (n-2)/2; i++){
			fib += fib2;
			fib2 += fib;
		}
		if(n%2 == 0){
			return fib2 - fib;
		}
		return fib;
	}

}
