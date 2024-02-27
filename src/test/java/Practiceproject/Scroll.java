package Practiceproject;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Scroll {

		 public static void main(String[] args) throws InterruptedException {
		       
		        
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
		          JavascriptExecutor js = (JavascriptExecutor) driver;
		          driver.get("https://webdriveruniversity.com/");
		          driver.manage().window().maximize();
		  
		          Thread.sleep(2000);
		  
		          WebElement scrollingAround = driver.findElement(By.xpath("//h1[contains(text(),'SCROLLING AROUND')]"));
		          scrollingAround.click();
		  
		          ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		          driver.switchTo().window(tabs.get(1));
		  
		          WebElement zone1 = driver.findElement(By.xpath("//div[@id='zone1']"));
		  
		          Actions action1 = new Actions(driver);
		          action1.moveToElement(zone1).build().perform();
		  
		          WebElement zone2 = driver.findElement(By.xpath("//div[@id='zone2']"));
		          WebElement zone3 = driver.findElement(By.xpath("//div[@id='zone3']"));
		  
		          for (int i=0 ; i<=20 ; i++){
		  
		              if(i%2==0){
		                  action1.moveToElement(zone2).build().perform();
		              }
		              else{
		                  action1.moveToElement(zone3).build().perform();
		              }
		          }
		          
		          WebElement zone4 = driver.findElement(By.xpath("//div[@id='zone4']"));
		          js.executeScript("arguments[0].scrollIntoView();", zone4);
		  
		          action1.moveToElement(zone4).build().perform();
		  driver.close();
		      }

		}
	
