package gridex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class trialactions {
	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	WebElement helement=driver.findElement(By.xpath("//a[@title='Electronics']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(helement).perform();
	driver.findElement(By.xpath("//span[text()= 'Lenovo']")).click();		
	}
	}
