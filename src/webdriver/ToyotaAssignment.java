package webdriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToyotaAssignment {
	public static int grn;

	public static void getRandonNumberinRange(int min, int max) {
		Random r = new Random();
		grn = r.nextInt((max - min) + 1) + min;
		System.out.println("grn is " + grn);
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
//		driver = new ChromeDriver();

		System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
		driver = new EdgeDriver();

//		System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
//		driver = new FirefoxDriver();

		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//li[@class='brochure_cars  on_hold-0 hybrid-1']")).click();

		System.out.println(driver.findElement(By.xpath("//label[@for='brochure_newyarishybrid']")).getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Mr")).click();	
		getRandonNumberinRange(1, 8);
		String xpath1 = "//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/ul/li[";
		String xpath2 = "]/a";
		// convert int to String
		String xpath3 = Integer.toString(grn);

		String newXpath = xpath1 + xpath3 + xpath2;

		System.out.println("newXpath is: " + newXpath);
		driver.findElement(By.xpath(newXpath)).click();

	}

}
