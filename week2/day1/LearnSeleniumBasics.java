package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
		driver.findElement(By.xpath("(//ul)[2]/li[4]/a"));
		driver.findElement(By.xpath("(//span[text ()='Table']/parent::a)[2]")).click();
		List<WebElement> elementRows = driver.findElements(By.xpath("(//table)[6]/tbody/tr)"));
		List<WebElement> elementCols = driver.findElements(By.xpath("(//table)[6]/tbody/tr[1]/td"));
		for (int i=1; i <= elementRows.size(); i++) {
			for (int j=1; j<=elementCols.size(); j++) {
				String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr[+i+]/td[+j+]")).getText();
				System.out.println(text + "");
			
				
			}
		}
	}

}
