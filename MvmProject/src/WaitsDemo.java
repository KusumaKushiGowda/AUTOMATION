import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.id("accept")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		
	}

}
