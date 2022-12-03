package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotCla {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions a=new Actions (driver);
		WebElement txtuer = driver.findElement(By.id("email"));
		txtuer.sendKeys("vicky001@gmai.com");
		
		a.doubleClick(txtuer).click(txtuer).perform();
		a.contextClick(txtuer).perform();
		
		Robot b=new Robot ();
		
		for (int i=0;i<3;i++) {
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
		}
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement txtpa = driver.findElement(By.id("pass"));
		a.contextClick(txtpa).perform();
		
		for (int i=0;i<7;i++) {
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
		
		}
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
