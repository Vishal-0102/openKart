package webDriver;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrl {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://www.google.com/");
		 * driver.navigate().to("https://www.google.com/");
		 * 
		 * driver.navigate().to("https://www.facebook.com/");
		 * driver.navigate().to("https://www.myntra.com/"); driver.navigate().back();
		 * driver.navigate().refresh(); driver.navigate().forward(); String
		 * title=driver.getTitle(); System.out.println(title);
		 * 
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
		/*
		 * driver.get("https://demo.actitime.com/login.do");
		 * driver.findElement(By.linkText("actiTIME Inc.")).click(); Thread.sleep(2000);
		 * driver.close();
		 */
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("vishal");
	 
		  //driver.quit();
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("vishal");
		System.out.println(userName.getAttribute("value"));
		/*userName.sendKeys(Keys.CONTROL,"a");
		userName.sendKeys(Keys.BACK_SPACE);
		userName.sendKeys(Keys.DELETE);
	}*/
		/*
		 * for(int i=0;i<=5;i++) { userName.sendKeys(Keys.BACK_SPACE);
		 * Thread.sleep(2000); }
		 */
	}
}
		
	


