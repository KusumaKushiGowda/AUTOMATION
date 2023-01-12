import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleAccount 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.navigate().to("https://myaccount.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("kusumasulya@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.findElement(By.xpath("//div[@id='next']")).click();
		driver.findElement(By.linkText("Create an account")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kushi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gowda");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kushigowdaakkadaba");
	    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Kushi@267");
	    driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Kushi@267");
	    driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).click();
	    driver.findElement(By.xpath("//div[@id='accountDetailsNext']")).click();
	    
	    WebElement dropDown1=driver.findElement(By.id("Calling code"));
	    Select obj2=new Select(dropDown1);
		obj2.selectByIndex(1);
		
		
	}

}
