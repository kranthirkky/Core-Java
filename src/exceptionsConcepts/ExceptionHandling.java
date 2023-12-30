package exceptionsConcepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// One try block can be followed by multiple catch blocks

		int a = 9;
		int b = 1;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Error Message" + e.getMessage());
		} finally {
			System.out.println("Finally Block Executed");
		}
		// finally executed irrespective of pass or fail
		// automation we use driver.close
	}

}
