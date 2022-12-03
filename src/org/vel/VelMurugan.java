package org.vel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VelMurugan {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement drf = driver.findElement(By.xpath("//div[contains(@class,'col-md-3 )]"));
		String re = drf.getText();
		System.out.println(re);
		
		
		
		
		
		
		
		
		
		
	}

}
