package org.moh.academic;

public class FourParams {

	public static void main(String[] args) {
		FourParams app = new FourParams();
		app.testCases();

	}

	private int count;
	private int errs;

	/** Target function
	 * 
	 * @param bonus
	 * @param multiply
	 * @param first
	 * @param second
	 * @return result
	 */
	public int fourParams(boolean bonus, boolean multiply, int first, int second) {
		return first + second;
	}

	/** harness call target
	 
	 * @param bonus
	 * @param multiply
	 * @param first
	 * @param second
	 * @param expected
	 */
	void testFourParams(boolean bonus, boolean multiply, int first, int second, int expected) {
		int actual = 0;

		try {
			actual = fourParams(bonus, multiply, first, second);
		} catch (Throwable e) {
			e.printStackTrace();// log it
			System.err.println("Error " + e);
		}
		count++;
		if (actual != expected) {
			System.out.println("Actual :" + actual + ", expected :" + expected + ", for bonus :" + bonus + ", multiply :" + multiply
					+ ", first :" + first + ", second :" + second + ".");
			errs++;
		}
	}

	private void testCases() {
		testFourParams(false, false, 1, 1, 2);
		testFourParams(false, false, 1, 12, 13);
		testFourParams(false, true, 1, 1, 2);
		testFourParams(false, true, 5, 3, 15);

		System.out.println("Count " + count + ", Errors :" + errs + ".");
	}

}
