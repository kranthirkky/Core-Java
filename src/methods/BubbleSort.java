package methods;

public class BubbleSort {

	public static void main(String[] args) {
		int q[] = { 4, 3, 9, 7 };
		int v = 0;
		for (int i = 0; i < q.length; i++) {
			for (int j = i + 1; j < q.length; j++) {
				if (q[i] > q[j]) {
					int temp = q[i];
					q[i] = q[j];
					q[j] = temp;
				}
			}
		}
		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}
	}

}
