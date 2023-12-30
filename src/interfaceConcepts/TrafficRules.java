package interfaceConcepts;

public interface TrafficRules {

	// interface have methods/
	int a = 4; // public

	public void greenLight();

	public void redLight();

	public void yellowLight();

	// method does not have body. all methods in interface will be implemented by
	// another class
	// interfaces contains only abstract methods i.e methods which does not have
	// implementation
	// if a class have abstract methods then it called as interface
	// implements used for interface
	// extends used for inheritance
}
