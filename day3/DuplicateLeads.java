package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

	public static void main(String[] args) throws InterruptedException {
		 
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://leaftaps.com/opentaps/control/login"); 
		 driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("(//form[@id='login']/p)[3]")).click();
		 driver.findElement(By.xpath("//div[@id='label']/a")).click();
		 driver.findElement(By.xpath("(//div[@class='frameSectionHeader']//a)[2]")).click();
		 driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("qwerty123@gmail.com");
		 driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 Thread.sleep(2000);
		 String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		 System.out.println("The first Resulting ID of first name is :"+text);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 String title1 = "Duplicate Lead | opentaps CRM";
		 if(title.equals(title1)) {
			 System.out.println("The title is same");
		 }
		 else {
			 System.out.println("The title is different");
		 }
		 
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		 System.out.println("The duplicated lead First name is : "+text2);
		 if(text.equals(text2)) {
			 System.out.println("The name is same");
		 }
		 else {
			 System.out.println("The name is different");
		 }
	}

}
