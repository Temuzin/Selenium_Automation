package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class FB_Retesting {
	@Test(dataProvider = "abc")
	public void retest(String username, String password) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//clear the data if any existing
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
		
		driver.quit();
	}

	@DataProvider
	public Object[][] abc() {
		return new Object[][] { 
			new Object[] { "Kushal12342323@gmail.com", "mothi123243" }, 
			new Object[] { "suresh@gmail.com", "mothiSDGSDG123243"},
			new Object[] { "BASKAR@gmail.com", "motSDDFGhi123243"},
		};
	}
}
