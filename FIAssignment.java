@FunctionalInterface
interface FI{
    //abstract method
	int cube(int n);

    //default methods
	default int square(int n) {
		return n*n;
	}
	default int add(int n1, int n2) {
		return n1+n2;
	}

    //static methods
	static int sub(int n1, int n2) {
		return n1-n2;
	}
	static int mul(int n1, int n2) {
		return n1*n2;
	}
    static int div(int n1, int n2) {
		return n1/n2;
	}
	
}

public class FIAssignment implements FI{
	
	public int cube(int n) {
		return n*n*n;
	}
	
	public static void main(String[] args) {
		FIAssignment obj = new FIAssignment();
		System.out.println("Cube: " + obj.cube(5));
		System.out.println("Square: " + obj.square(5));
		System.out.println("Addition: " + obj.add(5,5));
		System.out.println("Subtraction: " + FI.sub(5,5));
		System.out.println("Multiplication: " + FI.mul(5,5));
        System.out.println("Division: " + FI.div(5,5));

	}

}

/*
Output:
Cube: 125
Square: 25
Addition: 10
Subtraction: 0
Multiplication: 25
Division: 1
 */