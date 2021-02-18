package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSample {

	public static void main(String[] args) throws Exception {
		// create Webdriver object
		WebDriver driver;
		// Open chrome browser
		// System.setProperty("Key", "path of driver file");
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type URL
		driver.get("https://www.facebook.com/");

		String mytext = driver.findElement(By.id("reg_pages_msg")).getText();
		System.out.println(mytext);		
		Thread.sleep(5000);
		
		driver.get("https://www.google.com/");
		
		String googleSearchLable = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("Google Search Lable text is: "+ googleSearchLable);
	}

}
