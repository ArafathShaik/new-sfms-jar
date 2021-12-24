package test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wtt.docker.listener.PropertiesUtility;


public class UserAdministrationTestRobot {
	
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
	
	@Test(priority=3,description="Verify Login")
	public void Login() throws InterruptedException, AWTException, MalformedURLException
	{
				
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
	
	
	
	@Test(priority=4,description = "Create Login Group ")
	public void createUserGroup() throws InterruptedException, MalformedURLException, AWTException { 
		actions = new Actions(driver);
			  
			WebElement message=driver.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'User Administration')]"));
			actions.moveToElement(message).build().perform();
			
			
			
			actions.moveToElement(driver.findElement(By.cssSelector("li.active:nth-child(3) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(2)"))).build().perform();
			actions.moveToElement(driver.findElement(By.cssSelector("li.active:nth-child(3) > ul:nth-child(3) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)"))).click().build().perform();
			
			if(driver.findElement(By.xpath("//div[@class='mainContent']/p[contains(text(),'Login Groups')]")).isDisplayed())
				System.out.println("User Landed on Login Groups Page");
				
			//Click on Add button to create login group
			driver.findElement(By.xpath("//div[@class='loginGrpAddModify']/a/input[@value='Add']")).click();
			
			//Code to generate 3 digit random number
			int x = ((int)(Math.random() * 1000000)) % 1000;
			
			String grpName="Test"+x;
			System.out.println(grpName);
			//Add the Login group name with generated random number to avoid duplicates
			driver.findElement(By.cssSelector("#loginGrpDescInput")).sendKeys(grpName);
			
			//Generate Random number to create a group with different days
			Random ran=new Random();
			int num=ran.nextInt(6)+1;
			driver.findElement(By.cssSelector("#startTimeHours"+num)).clear();
			driver.findElement(By.cssSelector("#startTimeHours"+num)).sendKeys("10");
			
						
			driver.findElement(By.cssSelector("#startTimeMins"+num)).clear();
			driver.findElement(By.cssSelector("#startTimeMins"+num)).sendKeys("05");
			
			//Click Add button to create the login group
			driver.findElement(By.cssSelector("#addId")).click();
			
			//verification for successful creation of login group
			assertEquals("Login group added/modified successfully",driver.findElement(By.cssSelector("#toggleSuccess")).getText());
						
			//Click on Back to groups button
			driver.findElement(By.cssSelector(".styled-button-anchor")).click();
			
			if(driver.findElement(By.xpath("//tr/td[contains(text(),'"+grpName+"')]")).isDisplayed())
				System.out.println("Created Group displayed on the Grid");
			
			//select the above created group
			driver.findElement(By.xpath("//tr/td[contains(text(),'"+grpName+"')]")).click();
						
			//click on view/modify button 
			driver.findElement(By.cssSelector("#viewMdfyLoginGrpButton")).click();
			
			//Click on Modify button
			driver.findElement(By.cssSelector("#modifyId")).click();
			
			if(!(driver.findElement(By.cssSelector("#loginGrpDescInput")).isEnabled()))
				System.out.println("As expected Grp Name input box is disabled while modifying");
			
									
			driver.findElement(By.cssSelector("#endTimeHours"+num)).clear();
			driver.findElement(By.cssSelector("#endTimeHours"+num)).sendKeys("19");
			
			//save the changes after modification
			driver.findElement(By.cssSelector("#saveId")).click();
			
			//verification for successful modification of login group
			assertEquals("Login group added/modified successfully",driver.findElement(By.cssSelector("#toggleSuccess")).getText());
			
			//Click on Back to groups button
			driver.findElement(By.cssSelector(".styled-button-anchor")).click();
			
			//Click on Add button to verify duplicate name for login group
			driver.findElement(By.xpath("//div[@class='loginGrpAddModify']/a/input[@value='Add']")).click();
			
			//Add the Login group name with generated random number to avoid duplicates
			Thread.sleep(3000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('loginGrpDescInput').value ='"+grpName.toString()+"';");
			
			//Click Add button to create the login group
			driver.findElement(By.cssSelector("#addId")).click();
			
			//verification for duplicate name validation for login group 
			assertEquals("Login group already exists",driver.findElement(By.cssSelector("#loginGrpDto\\.errors")).getText());
			
			driver.findElement(By.cssSelector("#toggleDiv")).click();
			
			//Click on Back to groups button
			driver.findElement(By.cssSelector(".styled-button-anchor")).click();
			
			    	
	}
	
	@Test(priority=5)
	public void logoutApp() throws InterruptedException, AWTException
	{
		actions = new Actions(driver);

		WebElement userProfile = driver.findElement(By.xpath("//div[@class='display_user']"));

		actions.moveToElement(userProfile).build().perform();
		Thread.sleep(4000);

		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();

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
		
	    			 
	}
	
	@Test(priority=6)
	public void closeApplication(){

		driver.quit();
		System.out.println("Closed Application on clicking Login");
			
		}

}
