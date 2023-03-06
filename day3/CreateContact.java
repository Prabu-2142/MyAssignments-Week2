package week2.day3;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Prabu");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Venkatachalam");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Automation");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Selenium Weekday batch Feb23");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("qwerty123@gmail.com");
		WebElement sele = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select opt = new Select(sele);
		opt.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Clearing Description field");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
