package assingments_w1_d2;

public class Calculator {
	public double add(double a, double b) {
		return a + b;
	}

	public double subtraction(double a, double b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double Division(double a, double b) {
		return a / b;
	}

	public double modulus(double a, double b) {
		return a % b;
	}
	public static void main(String[] args) {
		Calculator myObj = new Calculator();

		System.out.println(myObj.add(15,25));
		System.out.println(myObj.subtraction(150,25));
		System.out.println(myObj.multiplication(20,25));
		System.out.println(myObj.Division(155.85,25));
		System.out.println(myObj.modulus(25,5));

	}

}
