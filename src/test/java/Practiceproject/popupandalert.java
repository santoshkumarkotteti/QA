package Practiceproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupandalert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.manage().window().maximize();

        // Function to handle alerts
        handleAlert(driver, "//span[@id='button1']", true); // Accept alert
        handleAlert(driver, "//span[@id='button2']", false); // Dismiss alert
        handleAlert(driver, "//span[@id='button3']", false); // Dismiss alert
        handleAlert(driver, "//span[@id='button4']", false); // Dismiss alert

        // Close the browser
        driver.quit();
    }

    private static void handleAlert(WebDriver driver, String buttonXpath, boolean accept) throws InterruptedException {
        WebElement button = driver.findElement(By.xpath(buttonXpath));
        button.click();
        Alert alert = driver.switchTo().alert();

        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }

        // Wait for a short time to observe changes
        Thread.sleep(100);
    }
}