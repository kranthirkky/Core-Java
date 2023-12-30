package listsConcepts;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetConcepts {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		// it does not accept duplicate values.
		// Random Order
		// Hash Set treeset, Linked HashMap Implements set Interface
		hs.add("100");
		hs.add("74");
		hs.add("333");
		System.out.println(hs);
		hs.remove("100");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		Iterator<String> i = hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		// if .next() starts from 0 index and prints each and every method
		// if we try to print index which is more than its size. it will return
		// NoSuchElement Exception
		// To resolve that we use hasNext method to check whether next index is present
		// or not
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// it will print random order
	}
}
