import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultieSelect 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sh= driver.findElement(By.id("superheros"));
		Select obj4=new Select(sh);
		if(obj4.isMultiple());
		{
			System.out.println("is is multiple selected dropdown");
			obj4.selectByIndex(1);
			obj4.selectByValue("ta");
			obj4.selectByVisibleText("Black Panther");
		}
		

}
}
