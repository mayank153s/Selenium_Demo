import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
//		maximize current window
		driver.manage().window().maximize();
		
		
//		auto suggestive dropdowns
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("indi");
		Thread.sleep(3000);
		
		
		
//		driver.findElement(By.xpath("//div[@class='pcTkSc']/div[@aria-label='india map']")).click();
		 
//		OR
		
//		using findElements to find multiple options in dropdown and iterating through it
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']")); 
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India Post")) {
				option.click();
				break;
			}
		}
		
	}

}
