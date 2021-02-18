package corejava;

import java.lang.reflect.Array;

public class ArraySample {
	
	public static void main(String[] args) {
		String a = "Hi all, how are you?";
		String[] b = {"12","34","2433243","78987","98"};
//		array[] b = {"12","34","2433243","78987","98"};
		System.out.println(a);
		System.out.println("the size of Array is: "+b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
