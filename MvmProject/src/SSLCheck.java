import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	options.addArguments("start-maximized");
	
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://expired.badssl.com/");
	System.out.println("url is launched");
}
}
