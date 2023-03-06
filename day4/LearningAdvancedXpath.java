package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAdvancedXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("hari.radhakrishnan@qeagle.com");
        
		driver.findElement(By.xpath("//label[@class='label']/following-sibling::input")).sendKeys("Leaf@123");
	}

}
