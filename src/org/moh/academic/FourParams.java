package org.moh.academic;

/**
Target function and test harness
*/
public class FourParams {

	public static void main(String[] args) {
		FourParams app = new FourParams();
		app.testCases();

	}

	private int count;
	private int errs;

	/** Target function
	 *
	 */
	public int fourParams(boolean bonus, boolean multiply, int first, int second) {
		return first + second;
	}

	/** Test harness call target

		Same parameters as target plus the return type - expected value.
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

	/*** different test cases - more the better to adequately test the target function for all requirements per the question
	*/
	private void testCases() {
		testFourParams(false, false, 1, 1, 2);
		testFourParams(false, false, 1, 12, 13);
		testFourParams(false, true, 1, 1, 2);
		testFourParams(false, true, 5, 3, 15);

		System.out.println("Count " + count + ", Errors :" + errs + ".");
	}

}
