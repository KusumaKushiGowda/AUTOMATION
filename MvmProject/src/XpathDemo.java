import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://www.saucedemo.com/");
		WebElement usn=driver.findElement(By.xpath("//*[@id='user-name']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button' and @value='Login']"));
		
		usn.sendKeys("standard_User");
		System.out.println("I enter the user name");
		
		pwd.sendKeys("secret_sauc");
		System.out.println("I enter the password");
		
		login.click();
		System.out.println("I click the login button");
		
		
		//error message
		WebElement err=driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
		String errMsg=err.getText();
		System.out.println("The error msg is"+errMsg);
		
		//click the close button
		driver.findElement(By.xpath("//div[@class='error-message-container error']/h3/button")).click();
		System.out.println("I clicked on the close button");
		
		usn.clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		
		pwd.click();
		pwd.clear();
		System.out.println("username and password field cleared");
		
		usn.sendKeys("standard_user");
		System.out.println("I enter the username");
		
		pwd.sendKeys("secret_sauce");
		System.out.println("I enetr the password");
		
		login.click();
		System.out.println("I click the login Button");

}
}
