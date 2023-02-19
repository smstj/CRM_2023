package variousconcept;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest_Junit {
	WebDriver driver;
@Before
	public  void init() {

		//setup system properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mails\\OneDrive\\Desktop\\eclipse\\eclipse\\sep2023_selenium-WS\\crm\\driver\\chromedriver.exe");
		  //web browser object
		driver=new ChromeDriver();

		//delete
		driver.manage().deleteAllCookies();		
		//Go to url()website
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		driver.manage().window().maximize();
	}
     @Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");//insert password
		//sign in
		driver.findElement(By.name("login")).click();
	}
     @After
	public  void teardown() {  
		driver.close();
	}

}
