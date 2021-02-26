  package testNG;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FB {
	@Test
	public void f() throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Kushal12342323@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mothi123243");

		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Date d = new Date();
		System.out.println(d);// Wed Feb 17 07:36:39 EST 2021
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\newABC" + timeStamp + ".PNG"));
		driver.quit();
	}
}
