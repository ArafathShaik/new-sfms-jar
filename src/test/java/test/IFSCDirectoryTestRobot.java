package test;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wtt.docker.listener.PropertiesUtility;


public class IFSCDirectoryTestRobot {
	
	 Actions actions;
	 WebDriver driver;
	Robot robot;
	
	@Test(priority=1,description = "Launching SFMS application")
	public void LaunchingApplication() throws IOException, AWTException, InterruptedException {
		
				
		PropertiesUtility.loadApplicationProperties();
//		System.setProperty("webdriver.gecko.driver",ClassLoader.getSystemResourceAsStream("/src/test/resources/application.properties"));
//		System.setProperty("webdriver.gecko.driver","/src/test/resources/geckodriver.exe");
		Robot robot = new Robot();
		// option.addArguments("-headless","window-size=1920x1080");
		// DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setPlatform(Platform.LINUX);
		// cap.merge(option.toCapabilities());
		//WebDriverManager.firefoxdriver().setup();
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		// driver = new ChromeDriver(chromeOptions);
		Thread.sleep(3000);
		driver.manage().window().maximize();

		System.out.println("driver connected.............");
		driver.navigate().to(PropertiesUtility.properties.getProperty("application.url"));
		  System.out.println("Application launched successfully"); 
		  String tittle = driver.getTitle(); 
		  System.out.println("tittle :" + tittle);		
		  Assert.assertEquals("Token Login", driver.getTitle());
		  System.out.println("Tittle Verified Successfully");
	}

	@Test(priority=2, description = "Handling Allow Pop-ups and Security Pop-ups")
    public void HandlingPopus() throws MalformedURLException, AWTException, InterruptedException 
    {
         //NewAllowplugin.png
           
		Thread.sleep(5000);
        
        robot=new Robot();
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//div[@id='redirect_admin']/a")).click();
			
        Thread.sleep(6000);	
        //driver.findElement(By.xpath("//div[@id='redirect_password']/a")).click();
        driver.findElement(By.xpath("//div[@class='text-right']/a[@class='clickhere']")).click();
        
        Thread.sleep(15000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
                           
    }
	
	
	@Test(priority=3,description = "Verify Login")
	public void Login() throws InterruptedException, MalformedURLException, AWTException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='uaiUserId']")).sendKeys(PropertiesUtility.properties.getProperty("RequestCreator"));
		  driver.findElement(By.xpath("//input[@id='uaiUserNodeAddrs']")).sendKeys(PropertiesUtility.properties.getProperty("ERIFSC"));
		    			
		  System.out.println("Entered User id and IFSC Code Successfully");
									
		  Thread.sleep(15000);
		
		  driver.findElement(By.id("token_signin")).click();

		  System.out.println("Clicked on Sign-in Button successfully");
		  
		  Thread.sleep(10000);
		  
		  robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_1);
          robot.keyRelease(KeyEvent.VK_1);
          Thread.sleep(1000);
          
          robot.keyPress(KeyEvent.VK_TAB);
          robot.keyRelease(KeyEvent.VK_TAB);
          Thread.sleep(2000);
			 
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
          Thread.sleep(6000);
          
          robot.keyPress(KeyEvent.VK_ALT);
          robot.keyPress(KeyEvent.VK_O);
          
          robot.keyRelease(KeyEvent.VK_ALT);
          robot.keyRelease(KeyEvent.VK_O);
		  
		//s.click(System.getProperty("user.dir")+"//Images//Browsepfx.png");
		//s.click(System.getProperty("user.dir")+"//Images//pfxfile.png");
		//s.click(System.getProperty("user.dir")+"//Images//pfxfileopen.png");
		//s.click(System.getProperty("user.dir")+"//Images//pfxpasswordfield.png");
	
		 			
		 Thread.sleep(5000);
		
		             
   // System.out.println(driver.getWindowHandle()+" parent window");
		 actions=new Actions(driver);
		  Thread.sleep(8000); 
		
			  String homePage=driver.findElement(By.xpath("//p[contains(text(),'Financial and Non Financial Messages')]")).getText();
			  String homepage1="Financial and Non Financial Messages";
			  assertEquals(homepage1,homePage);
			  
			  System.out.println("User landed on Home page");
			
	}
	
	@Test(priority=4,description="Navigating to IFSC Directory")
	public void navIfscDirectory() throws InterruptedException
	{
			 actions = new Actions(driver);
			 Thread.sleep(5000);
			  
			WebElement message=driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
			actions.moveToElement(message).build().perform();
			
			actions.moveToElement(driver.findElement(By.cssSelector("#othersMenu > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)"))).click().build().perform();
			driver.findElement(By.xpath("//div[@class='mainContent']/p[contains(text(),'IFSC Directory')]")).isDisplayed();
			
	}
	
	@Test(priority=5,description="Search IFSC")
	public void searchIFSC() throws InterruptedException
	{
			Thread.sleep(2000);
			Select searchOnDropdown=new Select(driver.findElement(By.id("searchBox")));
			
			searchOnDropdown.selectByVisibleText("IFSC");
			
			driver.findElement(By.xpath("//input[@id='textBox']")).sendKeys("IFAR0000001");
			
			driver.findElement(By.xpath("//button[@id='searchButton']")).click();
			
			Thread.sleep(3000);
			String tableResult=driver.findElement(By.xpath("//div[@id='ifscDirectoryTableId_info']")).getText();
			
			assertEquals("Showing 1 to 1 of 1 entries", tableResult,"Table has one matching entry");
			
			String IFSCinResult=driver.findElement(By.xpath("//table[@id='ifscDirectoryTableId']/tbody/tr/td")).getText();
			
			assertEquals("IFAR0000001",IFSCinResult,"IFSC displayed in search is Matched with search key");
			
			driver.findElement(By.id("resetSearch")).click();
			
			if(!(driver.findElement(By.xpath("//input[@id='textBox']")).isEnabled()))
			{
				System.out.println("Value Input field is diabled");
			}
			
			driver.findElement(By.xpath("//div[@class='showHideCol']/a[contains(text(),'Address')]")).click();
			
			try {
			driver.findElement(By.xpath("//table[@id='ifscDirectoryTableId']/thead/tr/th/div[contains(text(),'Address')]"));
			}
			catch(Exception e)
			{
				System.out.println("Address field is removed from table");
			}
			
	}
	
	@Test(priority=6,description="logout")
	public void logoutApp() throws InterruptedException, AWTException
	{
		actions = new Actions(driver);

		WebElement userProfile = driver.findElement(By.xpath("//div[@class='display_user']"));

		actions.moveToElement(userProfile).build().perform();
		Thread.sleep(4000);

		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();

		Thread.sleep(15000);

		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
			    			 
	}
	
	
	@Test(priority=7,description="close application")
	public void closeApplication(){

		driver.quit();
		System.out.println("Closed Application on clicking Login");
			
		}

	}
