import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://letcode.in/dropable");
		System.out.println("url is launched");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		WebElement ele=driver.findElement(By.xpath("//a[@title='Koushik Chatterjee']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		

}
}
