package methods;

public class PrintSmallestNumberInArrayMatrix {

	public static void main(String[] args) {
		int c[][] = { { -34, -93, -22 }, { 13, 4, 1 } };
		int result = c[0][0];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (c[i][j] < result) {
					result = c[i][j];
				}
			}
		}
		System.out.println("smallest number " + result);
	}
}