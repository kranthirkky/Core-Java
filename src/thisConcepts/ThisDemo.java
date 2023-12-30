package thisConcepts;

public class ThisDemo {

	int a = 50;

	public void thisMethod() {
		int a = 99; // assume that i have a requirement to assign a diff value to same variable
		System.out.println(a);
		// this keyword refers to the current object - object scope lies in class level
		// not in method level
		System.out.println(this.a);
		// i want to print the var value declared in global level
	}

	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.thisMethod();

	}

}
