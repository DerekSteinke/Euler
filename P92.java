	/**
	 * A number chain is created by continuously adding the square of the digits
	 * in a number to form a new number until it has been seen before. Finds the
	 * total of number of starting numbers below 10 million that arrive at 89.
	 * 
	 * @author derek.steinke
	 *
	 */

public class P92 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int count = 0;
		for (Integer i = 2; i < 10000000; i++) {
			Integer currentNum = i;
			while (currentNum != 1 && currentNum != 89) {
				String num = currentNum.toString();
				Integer nextInSeries = 0;
				for (int j = 0; j < num.length(); j++) {
					int digit = Integer.parseInt(Character.toString(num
							.charAt(j)));
					nextInSeries += digit * digit;
				}
				currentNum = nextInSeries;
			}
			if (currentNum == 89) {
				count += 1;
			}
		}
		System.out.println(count);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");
	}

}
