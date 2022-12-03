package org.screen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Open {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		System.setProperty("webdriver.edge.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("suryamech");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','2345678890')", pass);

		WebElement clk = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", clk);

		WebElement loc = driver.findElement(By.name("location"));
		Select d = new Select(loc);
		d.selectByIndex(7);

		WebElement hotel = driver.findElement(By.name("hotels"));
		Select a = new Select(hotel);
		a.selectByValue("Hotel Sunshine");

		WebElement type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select b = new Select(type);
		b.selectByVisibleText("Super Deluxe");

		WebElement room = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select c = new Select(room);
		c.selectByIndex(1);

		JavascriptExecutor ds = (JavascriptExecutor) driver;

		WebElement in = driver.findElement(By.name("datepick_in"));
		ds.executeScript("arguments[0].setAttribute('value','25/07/2022')", in);

		WebElement out = driver.findElement(By.id("datepick_out"));
		ds.executeScript("arguments[0].setAttribute('value','25/08/2022')", out);

		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select e = new Select(adult);
		e.selectByIndex(1);

		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select g = new Select(child);
		g.selectByIndex(1);

		Actions x = new Actions(driver);

		WebElement clic = driver.findElement(By.xpath("//input[@id='Submit']"));
		x.click(clic).perform();

		WebElement btnclk = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		x.click(btnclk).perform();

		WebElement cntn = driver.findElement(By.xpath("//input[@type='submit']"));
		x.click(cntn).perform();
		
		WebElement firtname = driver.findElement(By.xpath("//input[contains(@name,'first_name')]"));
		firtname.sendKeys("Vicky");
		
		WebElement latname = driver.findElement(By.xpath("//input[contains(@id,'last_name')]"));
		ds.executeScript("arguments[0].setAttribute('value','S')", latname);
		
		WebElement add = driver.findElement(By.xpath("//textarea[contains(@class,'txtarea')]"));
		add.sendKeys("Green Technology,\n Tambaram,\n chennai-6000028");
		
		WebElement pin = driver.findElement(By.id("cc_num"));
		ds.executeScript("arguments[0].setAttribute('value','9876543217896599')", pin);
		
		Robot r=new Robot ();
		
		WebElement pintype = driver.findElement(By.xpath("//select[contains(@id,'cc_type')]"));
		x.click(pintype).perform();
		
		for (int i=0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@id,'cc_exp_month')]"));
		x.click(month).perform();
		
		for (int i=0;i<7;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement year = driver.findElement(By.xpath("//select[contains(@id,'cc_exp_year')]"));
		x.click(year).perform();
		
		for (int i=0;i<10;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("777");
		
		WebElement book = driver.findElement(By.xpath("//input[contains(@id,'book_now')]"));
		x.click(book).perform();
		
		Thread.sleep(10000);
		
		TakesScreenshot n= (TakesScreenshot)driver;
		
		File from = n.getScreenshotAs(OutputType.FILE);
		
		File to=new File ("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium D-1\\Screenshot//facebook.png");
		
		FileUtils.copyFile(from, to);
		
		System.out.println("COMPLETED");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
