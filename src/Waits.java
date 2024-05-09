import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
//		maximize current window
		driver.manage().window().maximize();
		
//		using IMPICIT WAIT for executing line 39(as it takes to locate the
//		dynamic suggestion)... it is a global declaration(just need to declare once) 
//		every test case wait 5 sec implicitly
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		
		driver.findElement(By.id("fromCity")).sendKeys("Jai");
		
//		using EXPLICIT WAIT for executing line 39... it is declared for targeted test case
//		wait for 5 seconds until element(line 36) is located
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='font12 greyText appendBottom3'])[1]")));
        

		driver.findElement(By.xpath("(//p[@class='font12 greyText appendBottom3'])[1]")).click();
		
		System.out.println("sdfdfsfsdfdf");
	}

}






