package listsConcepts;

import java.util.*;

public class HashMapConcepts {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>(); // non synchronized and not thread safe
		// allows null values
		hp.put(9, "Hello");
		hp.put(4, "Hello1");
		hp.put(2, "Hello2");
		hp.put(8, "Hello3");
		hp.put(2, "Hello4");
		// hash map assigns the values in the form of key value pair
		System.out.println(hp.get(2));
		// prints the value mapped to the key
		Set shp = hp.entrySet();
		// Converting hasmap into set using entrySet();
		Iterator it = shp.iterator();
		while (it.hasNext()) {
			// to print values of key value pair
			// casting into map.entry to print values
			Map.Entry mp = (Map.Entry) it.next();
			System.out.print(mp.getKey() + " ");
			System.out.print(mp.getValue());
			System.out.println();
		}
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	}

}
