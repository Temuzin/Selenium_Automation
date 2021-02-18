package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
//		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type URL
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Click on continue button
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);

		// Alert will open, move to Alert then click on OK button will use Accept().
		// To get the Alert text use Gettext()
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		// Click on Regiter link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(5000);

		// Confirmation Alert"
		// To click on Cancel button on Confirma Laert , use Dismiss();
		// To get the Alert text use Gettext(0
		String confirmationalertText = driver.switchTo().alert().getText();
		System.out.println(confirmationalertText);
		//Cancle
		//driver.switchTo().alert().dismiss();
		//Ok
		driver.switchTo().alert().accept();
	}

}
