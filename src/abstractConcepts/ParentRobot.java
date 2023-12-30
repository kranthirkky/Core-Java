package abstractConcepts;

public abstract class ParentRobot {

	public static void main(String[] args) {
	}

	public void design() {
		System.out.println("Design !!!!"); // non abstract method
	}

	public void height() {
		System.out.println(" Height");
	}

	public void weight() {
		System.out.println(" Weight");
	}

	public abstract void innerDesign();
	// an abstract class can have abstract and non - abstract methods
	// A class with body and without implementation is abstract class
	// A class with only abstract methods is called interface
	// abstract can have any access modifiers except private
}
