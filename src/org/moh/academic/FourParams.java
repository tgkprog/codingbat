package academic;

/**
Target function and, unit test cases and test helper.
Xy test
*/
public class FourParams {

	public static void main(String[] args) {

		FourParams app = new FourParams();
		app.fourParamsTestCases();

	}

	private int count;
	private int errs;

	/** Target function, this function is the main function to implement. The signature should be same as in your question.
	can use online tool to test it. In your java file can have system out println but for online test might have to comment that out or wont run.
	 * Question is omitted - this is a sample.
	 */
	public int fourParams(boolean bonus, boolean multiply, int first, int second) {
		//TODO Real implementation here, this is sample
		return first + second;
	}

	/** Test helper. This function calls target and checks response - if matches expected.

		Same parameters as target plus the return type - expected value.
		expected value has to be accurately calculated by developer. Type and number of parameters can change depending on your question.
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
	private void fourParamsTestCases() {
		System.out.println("FourParams ");
		testFourParams(false, false, 1, 1, 2);
		testFourParams(false, false, 1, 12, 13);
		testFourParams(false, true, 1, 1, 2);
		testFourParams(false, true, 5, 3, 15);
		testFourParams(true, true, 5, 3, 1);
		System.out.println("FourParams Count " + count + ", Errors :" + errs + ".");
	}

}
