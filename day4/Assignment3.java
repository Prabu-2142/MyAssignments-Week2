package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='grid formgrid']//input")).sendKeys("Prabu Venkatachalam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ui-corner-all')]/following::input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ui-corner-all')]/following::input")).sendKeys("Coimbatore");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//input[contains(@class,'ui-state-disabled')]"));
		boolean value = findElement.isEnabled();
		if(value) {
			System.out.println("The text box is enabled");
		}
		else {
			System.out.println("The text box is disabled");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[4]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[5]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[5]")).sendKeys("Learn Everyday");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[5]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[6]"));
		Thread.sleep(2000);
		findElement2.sendKeys("qwerty123@gmail.com");
		Thread.sleep(2000);
		findElement2.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='grid formgrid']//textarea"));
		if(findElement3.isSelected()) {
			System.out.println("The control is moved to next element");
		}
		else {
			System.out.println("The control is not moved");
		}
	}

}
