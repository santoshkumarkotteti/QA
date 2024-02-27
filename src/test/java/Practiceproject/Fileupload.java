package Practiceproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://webdriveruniversity.com/File-Upload/index.html");
	driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\LENOVO\\Pictures\\Screenshots.png");
	
	WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
	submit.click();
	Alert alt1 = driver.switchTo().alert();
	alt1.dismiss();
}
}