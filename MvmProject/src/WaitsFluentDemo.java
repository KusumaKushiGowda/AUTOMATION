import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitsFluentDemo 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		System.out.println("url is launched");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		      driver.findElement(By.xpath("//div[@id='start']/button")).click();
		      WebElement txt=driver.findElement(By.xpath("//*[@id='finish']/h4"));

				WebElement ele=wait.until(new Function<WebDriver,WebElement>()
						{
					public WebElement apply(WebDriver driver)
					{
						if(txt.isDisplayed())
						{
							return txt;
						}
						else
						{
							return null;
						}
					}
						});
				System.out.println(ele.getText());
	}
}