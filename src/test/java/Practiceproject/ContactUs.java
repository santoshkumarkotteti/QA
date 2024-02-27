package Practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		WebElement firstnameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
		WebElement lastnameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
		WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement commentInput = driver.findElement(By.xpath("//textarea[@name='message']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@class='contact_button'][2]"));
		

		firstnameInput.sendKeys("santosh");
		lastnameInput.sendKeys("kotteti");
		emailInput.sendKeys("Santoshkumarkotteti@gmail.com");
		commentInput.sendKeys("This is a comment.");
		submitButton.click();
		Thread.sleep(1000);
	driver.navigate().back();
		WebElement resetButton = driver.findElement(By.xpath("//input[@class='contact_button'][1]"));
		resetButton.click();
		Thread.sleep(1000);
		driver.quit();
	}
}