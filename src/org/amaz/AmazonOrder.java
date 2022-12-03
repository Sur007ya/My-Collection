package org.amaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonOrder {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("https://www.amazon.in/");
		
		WebElement sea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sea.sendKeys("i phone");
		
		WebElement done = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		done.click();
	
	
	
	
	
	
	
	
	}

}
