package week2.day3;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("David");
		 driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		 Thread.sleep(2000);
		 String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println("The first Resulting Lead ID is :"+text);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 String text4 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		 System.out.println("The original campany name is : "+text4);
		 String title = driver.getTitle();
		 System.out.println(title);
		 String title1 = "View Lead | opentaps CRM";
		 if(title.equals(title1)) {
			 System.out.println("The title is same");
		 }
		 else {
			 System.out.println("The title is different");
		 }
		
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		 WebElement findElement = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		 findElement.sendKeys("TestLeaf");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("David");
		 driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 String text2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		 System.out.println("The changed company name is: "+text2);
		 
		 if(text4.equals(text2)) {
			 System.out.println("The changed name is same");
		 }
		 else{
			 System.out.println("The changed name is Different");
		 }
		 
		 
		 
		 
	}

}
