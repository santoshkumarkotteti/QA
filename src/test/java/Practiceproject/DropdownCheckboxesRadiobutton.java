package Practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckboxesRadiobutton {

	
		 public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage
		        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		        // Interact with 1st dropdown and select "Python"
		        WebElement dropdownElement1 = driver.findElement(By.id("dropdowm-menu-1"));
		        Select dropdown1 = new Select(dropdownElement1);
		        dropdown1.selectByVisibleText("Python");

		        // Interact with 2nd dropdown and select "Maven"
		        WebElement dropdownElement2 = driver.findElement(By.id("dropdowm-menu-2"));
		        Select dropdown2 = new Select(dropdownElement2);
		        dropdown2.selectByVisibleText("Maven");

		        // Interact with 3rd dropdown and select "JavaScript"
		        WebElement dropdownElement3 = driver.findElement(By.id("dropdowm-menu-3"));
		        Select dropdown3 = new Select(dropdownElement3);
		        dropdown3.selectByVisibleText("JavaScript");
		        
		        
		        
		        // Interact with checkboxes
		        WebElement checkboxElement1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		        WebElement checkboxElement2 = driver.findElement(By.xpath("//input[@value='option-2']"));
		        WebElement checkboxElement3 = driver.findElement(By.xpath("//input[@value='option-3']"));
		        checkboxElement1.click();
		        checkboxElement2.click();
		        checkboxElement3.click();
		        
		        
		        //Interact with radio button and select "Blue"
		        WebElement radioButtonElementBlue = driver.findElement(By.cssSelector("input[value='blue']"));
		        radioButtonElementBlue.click();

		        // Interact with checkbox and select "Cabbage"
		        WebElement checkboxElementCabbage = driver.findElement(By.cssSelector("input[value='cabbage']"));
		        checkboxElementCabbage.click();
		        
		        // Interact with dropdown in the "Selected and Disabled" section and select "Apple"
		        WebElement dropdownElementApple = driver.findElement(By.id("fruit-selects"));
		        Select dropdownApple = new Select(dropdownElementApple);
		        dropdownApple.selectByVisibleText("Apple");





	}
	}
	

