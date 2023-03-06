package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999999999");
		driver.findElement(By.linkText("Leads")).click();
		
		String number = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The First Resulting ID is :"+number);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[4]")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(number);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[contains(@class,'x-toolbar')]//div"));
		String text = findElement.getText();
		System.out.println(text);
		
		if(text.equalsIgnoreCase("No Records to Display")) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
	}

}
