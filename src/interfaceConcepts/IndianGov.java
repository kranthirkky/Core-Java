package interfaceConcepts;

public class IndianGov implements TrafficRules, RulesAndReg { // a class can implements multiple interfaces

	public static void main(String[] args) {
		// To run and access methods implemented in interface
		TrafficRules n = new IndianGov(); // n object is specific to class and interface
		n.greenLight();
		n.redLight();
		n.yellowLight();
		int tr = n.a;
		System.out.println(tr);

		IndianGov ind = new IndianGov(); // object calls the methods with in the class
		ind.walk();

		RulesAndReg rules = new IndianGov();
		rules.trafficTime();
		rules.timeCalculation();
	}

	public void walk() {
		System.out.println("Walk!!!");
	}

	@Override
	public void greenLight() {
		System.out.println("Green Light");

	}

	@Override
	public void redLight() {
		System.out.println("Red Light");

	}

	@Override
	public void yellowLight() {
		System.out.println("Yellow Light");

	}

	@Override
	public void trafficTime() {
		System.out.println("Traffic Time");

	}

	@Override
	public void timeCalculation() {
		System.out.println("Time Calculations");
	}
}
