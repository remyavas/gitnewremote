package gridex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args)
	
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions ac=new Actions(d);
		ac.dragAndDrop(drag, drop).perform();
		
		
	}

}
