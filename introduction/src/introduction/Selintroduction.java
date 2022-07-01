package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {

	public static void main(String [] args) {
		System.setProperty("wWbDriver.Chrome.driver", "C:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
