import java.util.ArrayList;

/**
 * Finds the integer whose square has the form 1_2_3_4_5_6_7_8_9_0, where each
 * "_" is a single digit. Program takes ~15 seconds to complete on an Intel
 * E8400.
 * 
 * @author derek.steinke
 * 
 */

public class P206 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		boolean found = false;
		String numStr = "1234567890";
		Long maxsqr = new Long("1929394959697989900");
		Long minsqr = new Long("1020304050607080900");
		Long max = (long) Math.sqrt(maxsqr); //maximum value to check
		Long min = (long) Math.sqrt(minsqr); //minimum value to check
		//System.out.println(max + " " + min + " " + (max - min));
		Long answer = new Long(0);
		long i = min - 40;

		// Because the number being tested for ends in 0, the number being
		// squared must end in 0. This means the number being tested always ends
		// in 900, which in turn means only every number ending in 30 or 70 has
		// to be squared.

		checkLoop: while (!found) {
			i += 60;
			long iSqr = i * i;
			if (numStr.equals(getStrVal(iSqr))) {
				answer = i;
				found = true;
			}
			i += 40;
			iSqr = i * i;
			if (numStr.equals(getStrVal(iSqr))) {
				answer = i;
				found = true;
			}
			if (i > max)
				break checkLoop;
		}
		System.out.println(answer);
		System.out.println("Done in " + (double) (System.nanoTime() - start)
				/ 1000000000 + " seconds.");

	}

	/**
	 * @param num
	 *            a number to get the converted string value of.
	 * @return a String half the length of num in which each digit is equal to
	 *         the digit at double its index of num.
	 */
	private static String getStrVal(Long num) {
		String numStr = num.toString();
		ArrayList<Character> digitArr = new ArrayList<>();
		String s = "";
		for (int i = 0; i < numStr.length() / 2 + 1; i++) {
			digitArr.add(numStr.charAt(2 * i));
		}
		for (char c : digitArr) {
			s += new StringBuilder().append(c).toString();
		}
		return s;
	}
}
