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

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wtt.docker.listener.PropertiesUtility;



public class VerifyLoginTestRobot {
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
		 
		
			/*
			 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 * capabilities.setPlatform(Platform.LINUX);
			 * PropertiesUtility.loadApplicationProperties(); //config = new
			 * ConfigDataProvider(); driver = new RemoteWebDriver(new
			 * URL(PropertiesUtility.properties.getProperty("environment.url")),capabilities
			 * ); System.out.println("driver loaded.................ra worst");
			 * 
			 * System.out.println(driver);
			 * driver.navigate().to(PropertiesUtility.properties.getProperty(
			 * "application.url"));
			 * 
			 * driver.manage().window().maximize();
			 * System.out.println("Application launched successfully"); String tittle =
			 * driver.getTitle(); System.out.println("tittle :" + tittle);
			 * Assert.assertEquals("Token Login", driver.getTitle());
			 * System.out.println("Verified Title Successfully");
			 */

	}

	@Test(priority=2, description = "Handling Allow Pop-ups and Security Pop-ups")
    public void HandlingPopus() throws MalformedURLException, AWTException, InterruptedException 
    {
         //NewAllowplugin.png
           
          Thread.sleep(10000);
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
	
	
	
	@Test(priority=3,description="Empty Credentials")
	public void loginValidations() throws MalformedURLException, AWTException, InterruptedException
	{
		Thread.sleep(5000);

		driver.findElement(By.id("token_signin")).click();

		String alert=driver.switchTo().alert().getText();
		
		assertEquals(alert,"Ifsc or User Id is not valid");
		Thread.sleep(3000);
		if(alert.equalsIgnoreCase("Ifsc or User Id is not valid"))
		{
		//s.click(System.getProperty("user.dir")+"//Images//OkButton_LoginValidationp.png");
			driver.switchTo().alert().accept();
		}
		
		Thread.sleep(5000);

	}
	
	@Test(priority=4,description="Login With Userid")
	public void loginwithUserId() throws MalformedURLException, AWTException, InterruptedException
	{
		
		//s.click(System.getProperty("user.dir")+"//Images//EnterUserIdfield.png");
		
		driver.findElement(By.id("uaiUserId")).sendKeys("QAUSER1");
		//s.type("SUSER1");
		
		Thread.sleep(2000);
		driver.findElement(By.id("token_signin")).click();

		String alert=driver.switchTo().alert().getText();
		
		assertEquals(alert,"Ifsc or User Id is not valid");
		
		if(alert.equalsIgnoreCase("Ifsc or User Id is not valid"))
		{
			//s.click(System.getProperty("user.dir")+"//Images//OkButton_LoginValidationp.png");
			driver.switchTo().alert().accept();
		}
		Thread.sleep(5000);

		driver.findElement(By.id("uaiUserId")).clear();
		
		Thread.sleep(5000);

	}
	
	@Test(priority=5,description="With IFSC Code")
	public void loginwithIfsc() throws MalformedURLException, AWTException, InterruptedException
	{
		
		driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFDK00000SC");
		
		driver.findElement(By.id("token_signin")).click();

		String alert=driver.switchTo().alert().getText();
		
		assertEquals(alert,"Ifsc or User Id is not valid");
		
		if(alert.equalsIgnoreCase("Ifsc or User Id is not valid"))
		{
			//s.click(System.getProperty("user.dir")+"//Images//OkButton_LoginValidationp.png");
			driver.switchTo().alert().accept();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("uaiUserNodeAddrs")).clear();
		
		Thread.sleep(5000);

	}
	
	@Test(priority=6,description="Login with IFSC belongs to different bank")
	public void loginwithDifferentIFSC() throws MalformedURLException, AWTException, InterruptedException
	{
		
		driver.findElement(By.id("uaiUserId")).sendKeys("QAUSER2");
		
		driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFAR0000001");
		
		driver.findElement(By.id("token_signin")).click();

				
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
	       
	     String validation=driver.findElement(By.id("uaiUser.errors")).getText();
	       
	       assertEquals(validation,"Invalid User Id/IFSC/Password");
	       Thread.sleep(8000);
	       
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
	          Thread.sleep(4000);
	}
	
	@Test(priority=7,description="Clearing Login Fields")
	public void clearFeilds()
	{
		
		driver.findElement(By.id("uaiUserId")).clear();
		
		driver.findElement(By.id("uaiUserNodeAddrs")).clear();
		
	}
	
	
	@Test(priority=8,description = "Verify Login")
	public void VerifyLogin() throws InterruptedException, MalformedURLException, AWTException {

			
					
			driver.findElement(By.id("uaiUserId")).sendKeys("QAUSER1");
			 
			driver.findElement(By.id("uaiUserNodeAddrs")).sendKeys("IFDK00000SC");

			driver.findElement(By.id("token_signin")).click();

			System.out.println("Clicked on Sign-in Button successfully");

			Thread.sleep(12000);
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
		        Thread.sleep(8000);
		        
		        robot.keyPress(KeyEvent.VK_ALT);
		        robot.keyPress(KeyEvent.VK_O);
		        
		        robot.keyRelease(KeyEvent.VK_ALT);
		        robot.keyRelease(KeyEvent.VK_O);
			
			
	}
	
	@Test(priority=9)
	public void closeApplication(){
		driver.quit();
		System.out.println("Closed Application on clicking Login");
			
		}

	}

