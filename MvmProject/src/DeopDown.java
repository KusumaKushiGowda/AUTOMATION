import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeopDown 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown1=driver.findElement(By.id("fruits"));
		Select obj1=new Select(dropDown1);
		obj1.selectByIndex(1);
		
		WebElement dropDown2=driver.findElement(By.id("lang"));
		Select obj2=new Select(dropDown2);
		obj2.selectByValue("py");
		
		WebElement dropDown3=driver.findElement(By.id("country"));
		Select obj3=new Select(dropDown3);
		obj3.selectByVisibleText("Brazil");
		
		
}
}
