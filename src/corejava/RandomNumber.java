package corejava;

import java.util.Random;

public class RandomNumber {

	public static void abc() {
		Random r = new Random();
		int num = r.nextInt(8);// 0 min 8 max
		System.out.println(num);
		if (num == 0) {
			num = 1;
			System.out.println("User has changed the random number from zero to one");
			System.out.println(num);

		}
	}
	
	public static void getRandonNumberinRange(int min, int max) {
		Random r = new Random();
		int grn = r.nextInt((max-min)+1)+min;
		System.out.println(grn);
	}

	public static void main(String[] args) {
		getRandonNumberinRange(1, 8);
	}

}
