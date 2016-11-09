package gridex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {
	
	//opening the link in new tab
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumtutorialpoint.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.className("header-facebook"));
		Actions ac=new Actions(driver);
		ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

}
}
