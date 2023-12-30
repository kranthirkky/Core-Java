package inheritancePrograms;

public class MainClass {

	public static void main(String[] args) {
		ClassA c = new ClassB(); // since classB extends classA,
		// here the return type is classA
		// WebDriver driver = new ChromeDriver();
		System.out.println(c.i);

		ClassB b = new ClassB();
		System.out.println(b.i);
		// here return type is classB
	}

}
