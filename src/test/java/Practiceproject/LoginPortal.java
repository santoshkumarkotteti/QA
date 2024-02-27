package Practiceproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

		WebElement usernameInput = driver.findElement(By.id("text"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));

		usernameInput.sendKeys("webdriver");
		passwordInput.sendKeys("webdriver123");
		loginButton.click();
		Thread.sleep(2000);
		
		Alert alt =driver.switchTo().alert();
		alt.dismiss();
		
		driver.quit();
	}
}
