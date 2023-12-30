package methods;

public class StringMethods {

	public static void main(String[] args) {
		// immutable strings
		String a = "hello"; // string literal
		String b = "hello"; // string b reference variable points to the original value in a
		// if contents are same only one memory object is created for the above string
		// declarations
		String c = new String("hello");
		String d = new String("hello"); // string c, d creates new objects in memory location even if the values are
										// same
		// strings are immutable or cannot be altered
		a.concat("hello world"); // original string cannot be altered
		System.out.println(a);
		String s = a.concat(" hello world concat"); // it can be altered when it stores in new string but original a
													// value does not change
		System.out.println(s);

		// mutable strings : StringBuffer and StringBuilder .
		// StringBuffer is thread safe. It is synchronized.
		// In parallel threads execution the string buffer can be executed parallel once
		// the existing thread is finished
		StringBuffer sb = new StringBuffer("Hey ");
		sb.append(" String Buffer");
		System.out.println(sb);
		sb.insert(3, "sssss");
		System.out.println(sb);
		sb.replace(6, 7, "yyyyy");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

		// StringBuilder is not thread safe
		StringBuilder sbuild = new StringBuilder();

	}
}
