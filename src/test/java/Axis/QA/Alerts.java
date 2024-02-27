package Axis.QA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Alerts {

	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			Thread.sleep(500);

		
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();

		Thread.sleep(2000);
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		//CONFORMATION BOX
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();

		Thread.sleep(500);
		
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		//a2.dismiss();
		
		Thread.sleep(1000);
		
		//PROMPT
		
		driver.findElement(By.xpath("//input[@name='prompt']")).click();

		Thread.sleep(1000);
		
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("santosh");
		alt3.accept();
		//a3.dismiss();
		
		Thread.sleep(1000);
		
		driver.quit();

		
	}
}




