package methods;

public class SwapingVariables {

	public static void main(String[] args) {
		// swap with variables
		int a = 10;
		int b = 30;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(" a value " + a);
		System.out.println(" a value " + b);
		// swap without variables
		int c = 10;
		int d = 30;
		System.out.println(" c value " + ((c + d) - c));
		System.out.println(" d value " + ((c + d) - d));
	}
}
