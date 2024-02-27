package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokedFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.Gecko.driver",
				"C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");

	}
}
