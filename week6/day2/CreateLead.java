package week6.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {
	@Parameters ({"url","browser"})
	@BeforeMethod
	public void beforeMethod(String url, String browser) {
		if(browser.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		// TODO Auto-generated method stub

	}

}
