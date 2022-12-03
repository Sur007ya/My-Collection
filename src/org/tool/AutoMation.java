package org.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoMation {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement clk = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		clk.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
