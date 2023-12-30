package finalKeywordConcepts;

public class FinalClass { // if i change public to final then we cannot override the methods in this class
	// and cannot perform inheritance

	// final keyword assigned value cannot be changed once i assign

	final void getFinalMethodValue() {
		// we cannot override this method
	}

	public static void main(String[] args) {
		final int f = 100;
		System.out.println("final value " + f);

	}

}
