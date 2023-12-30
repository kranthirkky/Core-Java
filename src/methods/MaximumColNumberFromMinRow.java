package methods;

public class MaximumColNumberFromMinRow {

	public static void main(String[] args) {
		int c[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };
		int result = c[0][0];
		int smallestNumberRow = 0;
		int smallestNumberCol = 0;
		int maxValue = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (c[i][j] < result) {
					result = c[i][j];
					smallestNumberRow = i;
					smallestNumberCol = j;
				}
			}
		}
		System.out.println("smallest number row " + smallestNumberRow);
		System.out.println("smallest number col " + smallestNumberCol);
		System.out.println("smallest number " + result);
		maxValue = result;
		for (int k = 0; k < 3; k++) {
			if (c[k][smallestNumberCol] > maxValue) {
				maxValue = c[k][smallestNumberCol];
			}
		}
		System.out.println("maxxx value " + maxValue);
	}

}
