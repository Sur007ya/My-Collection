package org.screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\Selenium D-1\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		TakesScreenshot ad= (TakesScreenshot)driver;
		
		File from = ad.getScreenshotAs(OutputType.FILE);
		Scanner s=new Scanner(System.in);
		String Name = s.next();
		
		File to=new File ("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Screenshot//"+Name+".png");
		
		FileUtils.copyFile(from, to);
		
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
		
	}

}
