package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        

		
		
		ChromeDriver driver = new ChromeDriver();
		//Load the URl"
		driver.get("http://Facebook.com");
		
		//Enter Email id
		driver.findElementById("email").sendKeys("poykamaltemp@gmail.com");
		//Enter Password
		driver.findElementById("pass").sendKeys("Testing123#");
		//Click Login button
		driver.findElementByLinkText("Log In").click();
		
		//Navigate backwards
		driver.navigate().back();
		//wait for 5 seconds
		Thread.sleep(5000);
		
		//Close the Browser
		driver.close();
		
		
		

	}

}
