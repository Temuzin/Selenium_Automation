package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsSample {
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type URL
		driver.get("https://www.google.com/");
		//To maximize the current window
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Get title of the page
		System.out.println(driver.getTitle());

		// get the current URL
		System.out.println(driver.getCurrentUrl());
		
		//get window id
		System.out.println(driver.getWindowHandle());
		
		//System.out.println(driver.getPageSource());
	}

}
