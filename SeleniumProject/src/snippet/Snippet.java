package snippet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	
	public static void main (String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32 (1)\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("//http://learn-automation.com/");
	System.out.println(driver.getTitle());
	
}
}
