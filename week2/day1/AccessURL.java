package week2.day1;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps");
		WebElement elementWelcomeMessage = driver.findElement(By.id("username"));
		elementWelcomeMessage.sendKeys("YSUUF");
		WebElement elementPassword = driver.findElement(By.id("passwod"));
		elementPassword.sendKeys("faz");
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		
	}
}
