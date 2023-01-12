import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = driver.findElement(By.linkText("Best Sellers")).getAttribute("href");
		HttpURLConnection conn;
		conn = (HttpURLConnection) (new URL(url)).openConnection();

		conn.connect();
		int code = conn.getResponseCode();

		if (code > 400 || code > 500) {
			System.out.println(code + "the link is broken");

		} else {
			System.out.println(code + "the link is working");
		}

	}
}
