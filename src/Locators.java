import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		go to url
		driver.get("https://www.google.co.in/");
		
//		finding element by locator id... using sendKeys to write in the element
		WebElement m = driver.findElement(By.id("APjFqb"));
		m.sendKeys("automation");
		
//		finding element by locator name... using click to click the element
//		unable to find element because of dropdown
//		driver.findElement(By.name("btnK")).click();
	
//		Click on enter key to search
		m.sendKeys(Keys.ENTER);
		
//		Finding element through CSS selectors
//		1.  Classname -> tagname.classname
//		2.  id -> tagname#id
//		3.  tagname[attribute='value']
//		4.  regular expression->  tagname[attribute*='value'] 
		
//		Finding element through link text(only work with element having anchor a tag)
		driver.findElement(By.linkText("Images")).click();
		
//		finding element through Xpath
//		1.                          //Tagname[@attribute='value'][index]
//		2. parent-child---          //parentTagname/childTagname
//		3. regular expression---    //Tagname[contains(@attribute,'value')]  
		driver.findElement(By.xpath("//img[@id='dimg_46']")).click();
		
	}

}
