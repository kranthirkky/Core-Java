package practiseProgramming;

import java.util.ArrayList;

public class PrintUnqiueNumberInArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4 };

		// Empty ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			if (!arrayList.contains(array[i])) {
				arrayList.add(array[i]);
				count++;

				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j]) {
						count++;
					}
				}
			}
			if (count == 1) {
				System.out.println("Unqiue Number is : " + array[i]);
			}
		}

	}

}
