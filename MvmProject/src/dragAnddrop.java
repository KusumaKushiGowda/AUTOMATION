import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://letcode.in/dropable");
		System.out.println("url is launched");
		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trgt=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, trgt).build().perform();
		
	}
}
