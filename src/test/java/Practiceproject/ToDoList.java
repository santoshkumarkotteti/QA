package Practiceproject;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
public class ToDoList {
public static void main(String[] args) throws InterruptedException {
	       
	        
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	      
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        Thread.sleep(800);
	        driver.get("https://webdriveruniversity.com");
	        Actions actions = new Actions(driver);
	        Thread.sleep(800);
	        WebElement toDoList = driver.findElement(By.xpath("//h1[contains(text(),'TO DO LIST')]"));
	        toDoList.click();
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        WebElement removePracticeMagic = driver.findElement(By.xpath("//li[contains(text(),' Practice magic')]/span"));
	        Actions action = new Actions(driver);
	        action.moveToElement(removePracticeMagic).click().perform();

	        WebElement removeBuyNewRobes = driver.findElement(By.xpath("//li[contains(text(),' Buy new robes')]/span"));
	        Actions action1 = new Actions(driver);
	        action1.moveToElement(removeBuyNewRobes).click().perform();

	        WebElement removePotionClass = driver.findElement(By.xpath("//li[contains(text(),' Go to potion class')]/span"));
	        Actions action2 = new Actions(driver);
	        action2.moveToElement(removePotionClass).click().perform();

	        WebElement addNewTodo = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
	        addNewTodo.sendKeys("Manipal Training");
	        addNewTodo.sendKeys(Keys.ENTER);
	        addNewTodo.sendKeys("Axis Training");
	        addNewTodo.sendKeys(Keys.ENTER);
}
}