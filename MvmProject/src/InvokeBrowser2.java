import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class InvokeBrowser2 
{
	public static void main(String[] args) {
		String url="https://www.flipkart.com/";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get(url);
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("currentUrl="+currentUrl);
		
		if(url.equals(currentUrl))
		{
			System.out.println("urls are same");
		}
		else
		{
			System.out.println("url are not same");
		}
		String title= driver.getTitle();
		System.out.println("title="+title);
	

}
}
