package corejava;

import java.util.Iterator;

public class LoopStatements {
	// For loop
	// while loop
	// do-while loop
	// Nested For loop
	// Foreach / advanced / Enhanced for Loop
	public static void main(String[] args) {
//		for(initilise the Value; Condition; increment or decremnet ) {			
//		}
		// print 1 to 10 number
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		} // for loop end
		System.out.println("*****************************");
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		} // i=11

		System.out.println("*****************************");
		do {
			System.out.println(i);// 11
			i++;// 12
		} while (i < 11);

	}

}
