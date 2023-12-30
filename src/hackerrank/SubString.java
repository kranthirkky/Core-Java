package hackerrank;

public class SubString {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("helloworld");
		System.out.println(sbf.substring(3, 7).toString());
		char ch;
		for (ch = 'A'; ch <= 'Z'; ++ch) {
			System.out.print(ch + " ");
		}
		String s = "[a-zA-Z]+";

	}
}
