package digit_fifth_powers;

/**
 * Finds the sum of all numbers which the sum of their digits to fifth power
 * equals the number
 * 
 * @author derek.steinke
 * 
 */

public class P30 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int totalSum = 0;
		for (Integer i = 2; i <= 194979; i++) {
			String intStr = i.toString();
			int strLen = intStr.length();
			int sum = 0;
			for (int k = 0; k < strLen; k++) {
				int num = Character.getNumericValue(intStr.charAt(k));
				num = pow(num, 5);
				sum += num;
			}
			if (sum == i) {
				totalSum += sum;
				System.out.println(totalSum + " " + i);
			}
		}
		System.out.println(totalSum);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	public static int pow(Integer x, Integer y) {
		int pow = x;
		for (int i = 2; i <= y; i++) {
			pow *= x;
		}
		return pow;
	}

}
