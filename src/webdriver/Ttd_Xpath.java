package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ttd_Xpath {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Calender seletion
		driver.findElement(By.id("regdob")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// choose Dec month
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("December");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year.selectByVisibleText("2020");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.linkText("24")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// driver.findElement(By.name("gender")).click();
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();

		Select Country = new Select(driver.findElement(By.name("countryS")));
		Country.selectByVisibleText("Haiti");
		
		if (driver.findElement(By.xpath("//*[contains(@name,'state')]")).getTagName().equals("select")) {
			Select State = new Select(driver.findElement(By.xpath("//*[contains(@name,'state')]")));
			State.selectByVisibleText("Goa");
			System.out.println("if condition has executed");
		} else {
			driver.findElement(By.xpath("//*[contains(@name,'state')]")).sendKeys("AnyStateName");
			System.out.println("else condition has executed");
		}		
		

	}

}
