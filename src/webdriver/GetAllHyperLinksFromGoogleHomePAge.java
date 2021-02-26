package webdriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetAllHyperLinksFromGoogleHomePAge {

	public static void main(String[] args) throws Exception {
		// create Webdriver object
		WebDriver driver;
		// Open chrome browser
		// System.setProperty("Key", "path of driver file");
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Get the hyper links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());// 19
		// Print all the hyperlinks
		for (WebElement abc : allLinks) {
			System.out.println(abc.getText());
		}

		// count of webelement on google home page
		// dropdown
		List<WebElement> dropdowns = driver.findElements(By.xpath("//select"));
		System.out.println("dropdowns count is: " + dropdowns.size());

		// editbox/textbox
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("textbox count is: " + textbox.size());

		// button
		List<WebElement> button = driver.findElements(By.xpath("// input[@type='submit']"));
		System.out.println("button count is: " + button.size());

		// Radiobutton
		List<WebElement> Radiobutton = driver.findElements(By.xpath("// input[@type='radio']"));
		System.out.println("Radiobutton count is: " + Radiobutton.size());

		// checkbox
		List<WebElement> checkbox = driver.findElements(By.xpath("// input[@type='checkbox']"));
		System.out.println("checkbox count is: " + checkbox.size());
		// image
		List<WebElement> image = driver.findElements(By.tagName("image"));
		System.out.println("image count is: " + image.size());

		int totalNumberOfWebelementsOnPage = allLinks.size() + dropdowns.size() + textbox.size() + button.size()
				+ Radiobutton.size() + checkbox.size() + image.size();
		System.out.println("totalNumberOfWebelementsOnPage is" + totalNumberOfWebelementsOnPage);

	}

}
