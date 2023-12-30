package inheritanceConcepts;

public class ChildBike extends ParentBike {

	public static void main(String[] args) {
		ChildBike child = new ChildBike();
		child.audioSystem();
		child.engine();
		child.gear();
		System.out.println(bikeColour);

	}

	public void engine() {
		System.out.println("Engine!!!");
	}

	public void colour() {
		System.out.println(bikeColour);
	}

	// java cannot extends multiple parents(multiple inheritance)
	// multiple inheritances is not allowed in java
	// multiple interfaces is allowed in java
}
