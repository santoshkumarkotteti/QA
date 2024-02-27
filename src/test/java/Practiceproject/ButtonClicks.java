package Practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonClicks {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to the webpage
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        // Perform "Click Me!" action for each condition
        for (int i = 1; i <= 3; i++) {
            // Find the "Click Me!" button
            WebElement clickMeButton = driver.findElement(By.id("button" + i));

            // Perform different click operations
            if (i == 1) {
                // Web element click
                clickMeButton.click();
                System.out.println("Performed web element click for button " + i);
            } else if (i == 2) {
                // JavaScript click
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                jsExecutor.executeScript("arguments[0].click();", clickMeButton);
                System.out.println("Performed JavaScript click for button " + i);
            } else if (i == 3) {
                // Action move and click
                Actions actions = new Actions(driver);
                actions.moveToElement(clickMeButton).click().perform();
                System.out.println("Performed action move and click for button " + i);
            }

            // Wait for a short time to observe changes
            Thread.sleep(2000);
        }

        // Close the browser after all actions
        driver.quit();
    }
}