package methods;

public class ArraysPrograms {

	public static void main(String[] args) {
		int a[][] = { { 2, 4, 7 }, { 4, 5, 9 } };
		System.out.println("size " + a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
