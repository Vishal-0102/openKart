package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("jha");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
