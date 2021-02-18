package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type URL
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		//Close the current page/window
		//driver.close();
		driver.quit();
	}

}
