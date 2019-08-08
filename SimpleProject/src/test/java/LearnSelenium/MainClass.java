package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainClass {

	public static WebDriver driver;
	
	
	
	@Test
	void LaunchBrowser()
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://oca-mel-test:8300/");
		
		System.out.println("test1");
		
	}
	
	@Test
	void Test2()
	{
		System.out.println("test2");
	}
	
	@Test
	void Test3()
	{
		System.out.println("test3");
	}
	
}
