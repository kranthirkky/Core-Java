package functionOverloadingConcepts;

public class OverloadingPrograms {

	public static void main(String[] args) {
		OverloadingPrograms o = new OverloadingPrograms();
		o.getData(1);
		o.getData(1, 2);
		o.getData();
		o.getData("hello robot");
	}

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + b);
	}

	public void getData() {
		System.out.println("No Arguments");
	}

	public void getData(String a) {
		System.out.println(a);
	}

	// Function Overloading rules
	// Either method arguments should have different count or different return type
	// same method name
}
