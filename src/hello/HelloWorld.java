package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.quit();
		
		
	}
	

}
