import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
		String txt=driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
		System.out.println(txt);
		
		

}
}
