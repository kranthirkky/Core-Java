package abstractConcepts;

public class ChildFunctions extends ParentRobot {

	public static void main(String[] args) {

		ChildFunctions ch = new ChildFunctions();
		// child can access parent methods by using inheritance using extends keyword
		ch.design();
		ch.innerDesign();
		ch.height();
		ch.weight();

		// if a class is marked as an abstract we cannot instantiate the object
		// ParentRobot p = new ParentRobot();
	}

	@Override
	public void innerDesign() {
		System.out.println("Inner Design and Functions!!!!");

	}

}
