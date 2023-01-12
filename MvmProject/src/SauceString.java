import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceString 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
		driver.findElement(By.id("login-button")).click();
		
		String[] items= {"Bolt T-Shirt","Bike Light","Onesie"};
		for(int i=0;i<items.length;i++)
		{
			driver.findElement(By.xpath("//*[contains(text(),'"+items[i]+"')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button")).click();
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-test='continue-shopping']")).click();
	}
}
