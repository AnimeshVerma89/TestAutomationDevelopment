package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\MyWorkspace\\HybridAutomationFramework\\Drivers\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	}

}
