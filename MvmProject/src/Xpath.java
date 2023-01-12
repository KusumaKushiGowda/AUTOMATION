import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//maximize
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("user-name");
	driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("Password");
	driver.findElement(By.xpath("//form/input")).click();

}
}