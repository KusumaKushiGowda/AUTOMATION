import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCSDemo 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://www.saucedemo.com/");
		WebElement usn=driver.findElement(By.name("user-name"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement login=driver.findElement(By.name("login-button"));
		
		usn.sendKeys("standard_use");
		pwd.sendKeys("secrect_sau");
		login.click();
		
		usn.clear();//method clear
		pwd.clear();
		
		usn.sendKeys("standard_user");
		pwd.sendKeys("secrect_sauce");
		login.click();
	}

}

