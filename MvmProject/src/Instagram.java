import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//maximize
	
	
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("kusumasulya@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Kusuma@123");
	
}
}
