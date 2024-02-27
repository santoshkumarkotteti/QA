package Axis.QA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech//practice//practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement doubleclick = driver.findElement(By.xpath("//input[@id='double-click']"));

		Actions builder = new Actions(driver);

		Thread.sleep(1000);
		builder.doubleClick(doubleclick).perform();

		Alert alt2 = driver.switchTo().alert();

		alt2.accept();

		builder.contextClick(doubleclick).perform();

	}
}