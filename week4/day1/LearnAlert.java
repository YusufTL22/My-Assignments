package week4.day1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main (String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	File source = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snaps/Img001.png");
	driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
	driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
	driver.findElement(By.xpath("//span[text()='Show']/ancestor::button[1]")).click();
	Alert alert = driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.accept();
}
}
