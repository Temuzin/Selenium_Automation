package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Click on Create New Account link
		driver.findElement(By.linkText("Create New Account")).click();
		//wait statement
		Thread.sleep(5000);
		//dropdown code
		Select monthDOB = new Select(driver.findElement(By.name("birthday_month")));
		monthDOB.selectByVisibleText("Jun");
		
		Select birthday_day = new Select(driver.findElement(By.name("birthday_day")));
		birthday_day.selectByVisibleText("25");
		
		Select birthday_year = new Select(driver.findElement(By.name("birthday_year")));
		birthday_year.selectByVisibleText("1986");
		
	}
}
