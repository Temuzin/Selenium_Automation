package testNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class FB_CrossBrowserTesting {
	WebDriver driver;

	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Kushal12342323@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mothi123243");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("Chrome") String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Please enter valid browser Name");
		}

	}

}
