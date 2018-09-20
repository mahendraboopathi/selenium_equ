package selenium_script_for_chrome_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		//chrome driver download to import chrome from google
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://54.144.210.255:8081/");
		driver.findElementById("inputEmail3").sendKeys("info@roboapp.com");
		driver.findElementById("inputPassword3").sendKeys("Hello");
		driver.findElementByXPath("//*[@id=\"loginForm\"]/div[3]/div/button").click();

	}

}
