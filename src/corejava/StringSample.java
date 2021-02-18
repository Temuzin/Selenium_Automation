package corejava;

public class StringSample {

	public static void main(String[] args) {
		String fn;// Declaration of String
		fn = "Selenium";// Assign the Value to String
		System.out.println(fn);

		String ln = "Automation      ";
		System.out.println(ln);

		System.out.println(fn + " " + ln);

		// Trim(): clear the whitespace
		System.out.println(fn.trim());
		System.out.println(ln.trim());

		System.out.println("print upper case:" + fn.toUpperCase());
		System.out.println("print lower case:" + fn.toLowerCase());

		int a = 123;
		String b = "456";

		System.out.println(a + b);// 123456 '579'
		// Convert String to int
		int c = Integer.parseInt(b);// 456
		System.out.println(a + c);

		// Convert int to String
		String d = Integer.toString(a);
		System.out.println(b + d);

		String e = "Apple";
		String f = "apple";
		String g = "mange";

		if (e.equals(f)) {
			System.out.println("Both the Strings are  matching");
		} else {
			System.out.println("Both the Strings are NOT matching");
		}

		if (e.equalsIgnoreCase(f)) {
			System.out.println("Both the Strings are  matching*******");
		} else {
			System.out.println("Both the Strings are NOT matching**************");
		}
	}

}
