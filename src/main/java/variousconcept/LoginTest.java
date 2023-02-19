package variousconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;

	public static void main(String[] args) {
		init();
		logintest();
		teardown();

	}
	private static void teardown() {
		// TODO Auto-generated method stub
		
	}
	public static void init() {

		//setup system properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mails\\OneDrive\\Desktop\\eclipse\\eclipse\\sep2023_selenium-WS\\crm\\driver\\chromedriver.exe");
		//web browser object
		driver=new ChromeDriver();

		//delete cokkies
		driver.manage().deleteAllCookies();		// TODO Auto-generated method stub
		//String path = "C:\\Users\\mails\\OneDrive\\Desktop\\eclipse\\eclipse\\sep2023_selenium-WS\\crm\\driver\\chromedriver.exe";
		//Go to url()website
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		driver.manage().window().maximize();
	}

	public static void logintest() {
		//identify username(blue color select) and insert
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");//insert password
		//sign in
		driver.findElement(By.name("login")).click();
		
		//public void testlocator() {
		//	driver.findelement(By.cssSelector("input#exp-2")).click;
			
		}
	 //driver.findelement(By.xpath)
	//public static void teardown() { 
	
		driver.close();
}






