package javaStreamsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterConcepts {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("England");
		ar.add("London");
		ar.add("Japan");
		ar.add("Australia");
		ar.add("Canada");
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).startsWith("K")) {
				count++;
			}
		}
		// System.out.println(count);

		// Alternate way using java streams
		// streams runs all the iterations in parallel unlike sequential order in for
		// loop
		long str = ar.stream().filter(s -> s.startsWith("K")).count();
		// System.out.println(str);

		// alternate way of initializing arraylist

		long str1 = Stream.of("India", "UK", "India", "US").filter(k -> k.startsWith("U")
		// return false;// we can deliberately return false;
		).count();

		// System.out.println(str1);

		// ar.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		// ar.stream().filter(s->s.length()>2).limit(1).forEach(s->System.out.println("Single
		// Result "+s));

		// Stream.of("Abhijeet", "Don", "Alekhya", "Adam",
		// "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// print value which has last letter ends with 'a' to uppercase

		// List<String>names =Arrays.asList("England", "Poland", "Europe", "Germany",
		// "Japan", "China");
		// names.stream().filter(s->s.startsWith("E")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// List<String>names1 =Arrays.asList("Korea", "Singapore", "Antartica", "Iraq",
		// "Dubai", "Bangkok");

		// Merge 2 different lists

		// Stream<String> result = Stream.concat(names1.stream(), names.stream());

		// result.sorted().forEach(s->System.out.println(s));
		// boolean flag = result.anyMatch(s->s.equalsIgnoreCase("Korea"));
		// System.out.println(flag);

		List<String> val = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		// System.out.println(val.get(2));

		List<Integer> val1 = Arrays.asList(1, 4, 1, 4, 5, 9, 5);
		val1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(val1.get(1));
	}

}
