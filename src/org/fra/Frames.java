package org.fra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		WebElement txtt = driver.findElement(By.xpath("//b[@id='topic']"));
		txtt.sendKeys("Mani");
		
		
		
		
		
		
		
		
		
	}
}
