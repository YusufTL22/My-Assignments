package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("dDecorativesubmit"));
		elementLogin.click();
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("CreateLead"));
		elementCreateLead.click();
		WebElement elementSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		elementSourceDD.sendKeys("Welcome");
		Select dd=new Select(elementSourceDD);
		dd.selectByIndex(2);
		dd.selectByVisibleText("Word of Mouth");
		dd.selectByValue("LEAD_EXISTCUST");
		WebElement elementOwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd1 = new Select(elementOwnershipDD);		
		

	}

}
