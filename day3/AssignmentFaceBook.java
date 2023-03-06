package week2.day3;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prabu");
		driver.findElement(By.name("firstname")).sendKeys("Prabu");
		driver.findElement(By.name("lastname")).sendKeys("Venkatachalam");
		driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Qwerty123");
		WebElement findElement = driver.findElement(By.xpath(("//select[@id='day']")));
		Select day = new Select(findElement);
		day.selectByIndex(2);
		WebElement fn = driver.findElement(By.xpath(("//select[@id='month']")));
		Select month = new Select(fn);
		month.selectByVisibleText("May");
		WebElement yr = driver.findElement(By.xpath(("//select[@id='year']")));
		Select year = new Select(yr);
		year.selectByValue("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
