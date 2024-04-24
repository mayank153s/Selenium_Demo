import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//manually giving the path for chromedriver (if we don't use this it will automatically detect using selenium manager)
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		 // close the current window
		driver.close();
		
		// close all the associated window
		driver.quit(); 
		
		

	}

}
