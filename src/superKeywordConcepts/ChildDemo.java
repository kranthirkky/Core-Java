package superKeywordConcepts;

public class ChildDemo extends ParentDemo {

	String kranthi = "Child Engineer";

	public void getMethodData() {
		System.out.println(kranthi);
		// to call the original method or variable or constructor in parent class we use
		// super keyword
		System.out.println(super.kranthi); // refers to parent class variable
		// if we comment out same variable in child class, it prints the parent variable
	}

	public void getMethodValue() {
		System.out.println("I am in child method");
		super.getMethodValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ChildDemo return type
		ChildDemo cd = new ChildDemo(); // ---> instance of local class
		cd.getMethodData(); // whenever there is a collision it gives preference to local variable ie child
							// class

		cd.getMethodValue(); // this method overriden by child method
	}

	public ChildDemo() {
		super(); // this should be always in the first line
		System.out.println("I am in child constructor");
	}
}
