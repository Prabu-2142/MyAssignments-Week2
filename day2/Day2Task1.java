package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//launching the website
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Entering username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//login using class locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//clicking on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Clicking on Leads button
		driver.findElement(By.linkText("Leads"));

		//click on create leads button
		driver.findElement(By.partialLinkText("Create")).click();

		//Enter companyname using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		//Enter firstname using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");

		//Enter lastname using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("DuraiRaj");

		//Enter your email id using id locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("qwerty123@gmail.com");

		//Enter your phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999999999");

		//Click on create lead button using name locator
		driver.findElement(By.name("submitButton")).click();




	}

}
