package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTheSystemdate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);// Wed Feb 17 07:36:39 EST 2021

		// ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		
//		Wed Feb 17 07:38:36 EST 2021
//		17Feb2021_073836

	}

}
