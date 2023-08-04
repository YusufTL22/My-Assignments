package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	//driver.get("http://leaftaps.com/opentaps");
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DEMOSALESMANAGER");
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("CRMSFA");
	//driver.get("https://erail.in");
	driver.findElement(By.xpath("//label [@for='username']"));
	driver.findElement(By.xpath("//label[text()='Username']"));
	}

}
