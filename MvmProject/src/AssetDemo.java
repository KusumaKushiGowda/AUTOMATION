import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AssetDemo 
{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("start-maximized");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is launched");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//String title=driver.findElement(By.xpath("//span[@class='title']")).getText();
		//Assert.assertEquals(title,"PRODUCTS");
		//System.out.println("login success");
		
		boolean check=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		Assert.assertEquals(check,true);
		System.out.println("login success");
		
		

}
}
