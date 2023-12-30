package variableConcepts;

public class VarClass {

	String name; // instance dependent // instance variables
	String address;
	String country;
	static String commonCountry = "India"; // class variables
	static int i = 0;
	int j = 0;

	static { // static block
		int x = 0;
		int y = 1;
	}

	public VarClass(String name, String address, String country) {
		this.name = name;
		this.address = address;
		this.country = country;
		i++;
		j++;
		System.out.println("i static " + i);
		System.out.println("j non static " + j);
		// constructor can print any local variables like static
	}

	public VarClass(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void getName() {
		System.out.println(name);
	}

	public void getAddress() {

		System.out.println(address + " " + commonCountry);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if data have common value then heap space is increased
		VarClass vc = new VarClass("Kranthi Kumar", "Hyd", "india");
		VarClass vc1 = new VarClass("John ", "Banglore", "India");
		VarClass vc2 = new VarClass("Mikkel", "Delhi");
		vc.getAddress();
		vc1.getAddress();
		vc2.getAddress();
		System.out.println(i); // static keywords are independent of objects hence no need of creating
		// methods
	}

}
