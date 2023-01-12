import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAccont1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.navigate().to("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("kadabawordnews@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.findElement(By.xpath("//div[@id='next']")).click();
	    driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
	    driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("kadabawordnews@gmail.com");
	    driver.findElement(By.xpath("//div[@id='queryPhoneNext']")).click();
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kushi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gowda");
		driver.findElement(By.xpath("//div[@id='collectNameNext']")).click();

}
}
