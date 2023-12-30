package functionOverridingConcepts;

public class ClassR extends ClassQ {

	// if i want to enhance the method in my parent class or if i am not satisfied
	// with parent function
	// then i can use the override the function by implementing same method name and
	// same argument and same return type

	public void myMobileColour() {
		System.out.println("Child method: Dark Blue");
	}

	public static void main(String[] args) {
		ClassR r = new ClassR();
		r.myMobileColour(); // method is overriding
	}
}
