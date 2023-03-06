package week2.day3;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Demosalesmanager");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@class,'decorative')]"));
		login.click();
		
		WebElement cl = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		cl.click();
		
		WebElement lead = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		lead.click();
		
		WebElement cre = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
		cre.click();
		
		WebElement cname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		cname.sendKeys("TestLeaf");

		WebElement fname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fname.sendKeys("Prabu");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lname.sendKeys("Venkatachalam");
		
		WebElement ph = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']"));
		ph.sendKeys("9999999999");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		email.sendKeys("qwerty123@gmail.com");
		
		WebElement sub = driver.findElement(By.xpath("//input[contains(@class,'Submit')]"));
        sub.click();
        
	    driver.close();

	}

}
