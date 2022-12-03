package org.screen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownPage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("//a[contains(text(),'New User Register Here')]"));
		clk.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver ;
		
		
		
		WebElement username = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','suryamech')", username);
		
		WebElement pass = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','2345678890')", pass);
		
		WebElement crmpass = driver.findElement(By.xpath("//input[@name='re_password']"));
		js.executeScript("arguments[0].setAttribute('value','2345678890')", crmpass);
		
		WebElement fullname = driver.findElement(By.id("full_name"));
		js.executeScript("arguments[0].setAttribute('value','SURYA S')", fullname);
		
		WebElement mail = driver.findElement(By.name("email_add"));
		mail.sendKeys("suryamech001@gmail.com");
		
		Thread.sleep(15000);
		
		Actions a=new Actions (driver);
		
		WebElement btncl = driver.findElement(By.xpath("//input[@type='checkbox']"));
		a.click(btncl).perform();
		
		WebElement regi = driver.findElement(By.id("Submit"));
		regi.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
