package corejava;

public class VariableTypes {
	//Global Variables
	static int a = 20;
	static int b = 10;

	public static void add() {
		//Local variables
		//int a = 90;
		int b = 80;
		System.out.println(a + b);
		System.out.println("Add mothod");
	}

	public static void sub() {
		int a = 190;
		//int b = 182;
		int c = a - b;
		System.out.println(c);
		System.out.println("Sub mothod");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		add();
		sub();

	}

}
