package methods;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + 3;
			}
			System.out.println();
		}
		sc.close();
	}
}
