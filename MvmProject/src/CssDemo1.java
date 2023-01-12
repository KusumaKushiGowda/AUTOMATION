import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo1 
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//maximize
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("abc");
	//driver.findElement(By.cssSelector("input.input_error form_input")).sendKeys("123");//
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123");
	driver.findElement(By.cssSelector("submit-button btn_action[value='Login']")).click();
	


}
}
