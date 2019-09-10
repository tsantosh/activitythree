import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testcases {
	
	WebDriver driver;


	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/santoshtekulapally/Desktop/chromedriver");
	  
		driver = new ChromeDriver();
		
		
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/a")).click();
		
		}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(5000);
		driver.close();

	}

	@Test
	public void firsttestcase() throws InterruptedException  {
		
		
		WebElement firstheading = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[3]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/h2"));
		
		String actualheading = firstheading.getText();
		
		String symbol = "®";
		
		assertEquals("Subscribe to My McD’s" + symbol ,actualheading);
		
		
	}
	
	@Test
	
	public void secondtestcode() throws InterruptedException
	 {
		WebElement nameBox = driver.findElement(By.id("firstname2"));
		nameBox.sendKeys("Santosh");
		String name = nameBox.getText();
		WebElement email = driver.findElement(By.id("email2"));
		email.sendKeys("santoshonthemove@gmail.com");
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.sendKeys(" M4M ");
		WebElement showButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		showButton.click();
	}
	
	@Test
	
	public void thirdtestcase() throws InterruptedException{
		        
		
		             WebElement nameBox = driver.findElement(By.id("firstname2"));
		
		             nameBox.sendKeys("");
		
		             String name = nameBox.getText();
		
		             WebElement email = driver.findElement(By.id("email2"));
		
		             email.sendKeys("");
		
		
		             WebElement postalCode = driver.findElement(By.id("postalcode2"));
		
		
		             postalCode.sendKeys("   ");
		
		
		             WebElement showButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		
		
		             showButton.click();
		             
		             // Trying to catch with tht use of css selector
		             
//		             WebElement errorheading1 = driver.findElement(By.cssSelector("form#title-form firstname2-error "));
//		     		
//		     		String actualerror = errorheading1.getText();
//		             
		             //new
		             
		          
//		     		assertEquals("This field is required." ,actualerror);
		             
		             
		             // Trying to catch with tht use of Xpath
//		     		
//		     	   WebElement errorheading1 = driver.findElement(By.xpath("//*[@id=\"rc-imageselect\"]/div[2]/div[4]"));
//		     		
//		     	   
//		     		String actualerror = errorheading1.getText();
//		             
//		     		assertEquals("Please select all matching images." ,actualerror);
		     		
		     		//<div class="rc-imageselect-error-select-more" style="" tabindex="0">Please select all matching images.</div>
		
	}


}
