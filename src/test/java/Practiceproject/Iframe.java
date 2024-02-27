package Practiceproject;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {

		
			public static void main(String[] args) throws InterruptedException, IOException {
				 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						driver.get("https://webdriveruniversity.com/IFrame/index.html");
						driver.manage().window().maximize();
						Thread.sleep(500);
						WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
						driver.switchTo().frame(newFrame);
						Thread.sleep(500);
					//driver.findElement(By.xpath("//*[@id='nav-title']")).click();
					driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[3]/a")).click();
					
						//*[@id="nav-title"]
					

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
					Thread.sleep(500);
				driver.navigate().back();
					driver.quit();
					
					
			}				
		
		
	}

