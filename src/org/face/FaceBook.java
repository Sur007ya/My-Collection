package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement frtname = driver.findElement(By.xpath("//input[@type='text']"));
		frtname.sendKeys("Surya");
		
		WebElement lstname = driver.findElement(By.xpath("(//input[@type='text']) [2]"));
		lstname.sendKeys("S");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3'] "));
		add.sendKeys("yadava street,\nGandharvakottai ");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email'] "));
		mail.sendKeys("suryamech001@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel'] "));
		phone.sendKeys("82488103768");
		
		WebElement btn = driver.findElement(By.xpath("//input[@type='radio'] "));
		btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
