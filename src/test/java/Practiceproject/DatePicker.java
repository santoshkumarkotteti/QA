package Practiceproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://webdriveruniversity.com/Datepicker/index.html");

	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	WebElement Date1 = driver.findElement(By.xpath("//div[@id='datepicker']"));
	  Date1.click();
	  
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement Date2 = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
		Date2.click();
		Thread.sleep(1000);

		WebElement Date3 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']"));
		Date3.click();
		Thread.sleep(1000); 
	 driver.quit();
}
}