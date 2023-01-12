import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("accept")).click();
		waitForElement(2);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirm")).click();
		waitForElement(2);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2);
		
		Alert a=driver.switchTo().alert();
		a.sendKeys("kushi");
		a.accept();
		//driver.findElement(By.id("prompt")).click();
		//waitForElement(2);
		//driver.switchTo().alert().sendKeys("kushi");
		//driver.switchTo().alert().accept();

}

	private static void waitForElement(int i) {
		// TODO Auto-generated method stub
		
	}
}
