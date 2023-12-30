package methods;

public class MethodUsage {

	public void myMethod() {
		System.out.println("Method called Successfully!!!");
	}

	public static void main(String[] args) {
		MethodUsage m = new MethodUsage();
		m.myMethod();
		m.myMethod2();
	}

	public void myMethod2() {
	}
}
