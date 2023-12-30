package contsructorConcepts;

public class ConstructorBasics {

	public static void main(String[] args) {
		// it does not have return type
		// name should be always class name
		ConstructorBasics cb = new ConstructorBasics();
		ConstructorBasics cbp = new ConstructorBasics(3, 9);
		// compiler will call the constructor by default if we dont define it explicitly
	}

	public ConstructorBasics() {
		// default constructor
		System.out.println(" I am in the constructor");
	}

	public void getMethodData() {
		System.out.println(" I am in the method");
	}

	public ConstructorBasics(int a, int b) {
		System.out.println("paramter contsructor" + a + b);
	}
}
