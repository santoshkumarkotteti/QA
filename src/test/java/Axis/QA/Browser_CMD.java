package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_CMD {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// used to get url of webpage
		driver.get("https://automationexercise.com/");

		// use to get title of webpage
		String title = driver.getTitle();
		System.out.println(title);

		// use to get current url
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		// use to get page source i.e html code
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);

		// use to close current browser session
		//driver.close();

	}

}
