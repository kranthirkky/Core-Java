package listsConcepts;

import java.util.ArrayList;

public class ArrayListsConcepts {

	public static void main(String[] args) {
		// ArrayLIst can accept duplicate values and it has dynamic size whereas array
		// has fixed size
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("world");
		System.out.println(a1);
		a1.add(0, "hello");
		System.out.println(a1);
		System.out.println(a1.get(0));
		a1.add("H1");
		a1.add("H1");
		System.out.println(a1);
	}
}
