package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Locate the browser
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        

	
	
	ChromeDriver driver = new ChromeDriver();
	//Load the URl"
	driver.get("http://leaftaps.com/opentaps/control/main");
	//WebElement demo =driver.findElementById("username");
	//demo.sendKeys("demosalesmanager");
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	//Click on the Login
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	//click on Creative Lead
	driver.findElementByLinkText("Create Lead").click();
	//Click on Company Name
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC Ltd");
	//Click on FirstName
	driver.findElementById("createLeadForm_firstName").sendKeys("Layla");
	//Click on LastName
	driver.findElementById("createLeadForm_lastName").sendKeys("Thomas");
	
	//Click on Create Lead Button
	driver.findElementByClassName("smallSubmit").click();
	
	//Verify Lead hasbeen created
	Thread.sleep(5000);
	
	//Close the Browser
	driver.close();
	
	
	
	
	
	
	
	


	}

}
