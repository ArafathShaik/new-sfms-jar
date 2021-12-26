package test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
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


public class ERRequestCreationAndVerificationTestRobot2 {

	Actions actions;
	String refnumber;
	WebDriver driver;
	Robot robot;

	@Test(priority = 1, description = "Launching SFMS application")
	public void LaunchingApplication() throws IOException, AWTException, InterruptedException {
		

		//driver = new FirefoxDriver();
		  
		PropertiesUtility.loadApplicationProperties();
//		System.setProperty("webdriver.gecko.driver",ClassLoader.getSystemResourceAsStream("/src/test/resources/application.properties"));
	//	System.setProperty("webdriver.gecko.driver","/src/test/resources/geckodriver.exe");
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
		 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
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

	
	  @Test(priority = 3, description = "Create Enhanced Reconciliation Request")
	  public void createERRequest() throws MalformedURLException, AWTException,
	  InterruptedException {
	  
	   
		  Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='uaiUserId']")).sendKeys(PropertiesUtility.properties.getProperty("RequestCreator"));
			  driver.findElement(By.xpath("//input[@id='uaiUserNodeAddrs']")).sendKeys(PropertiesUtility.properties.getProperty("ERIFSC"));
			    			
			  System.out.println("Entered User id and IFSC Code Successfully");
										
			  Thread.sleep(15000);
			
			  driver.findElement(By.id("token_signin")).click();

			  System.out.println("Clicked on Sign-in Button successfully");
			  
			  Thread.sleep(10000);
			  
			  robot.keyPress(KeyEvent.VK_SHIFT); 
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB); 
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  robot.delay(20);
			  robot.keyPress(KeyEvent.VK_SHIFT); 
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB); 
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  robot.delay(20);
			  robot.keyPress(KeyEvent.VK_SHIFT); 
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  robot.delay(20);
			  robot.keyPress(KeyEvent.VK_SHIFT); 
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB); 
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  robot.delay(20);
			  robot.keyPress(KeyEvent.VK_SHIFT); 
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB); 
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  robot.delay(20);
			  
			  String pfxpath=System.getProperty("user.dir") + "/" + ("src/test/resources/RBIH0000000.pfx");
			  System.out.println(pfxpath);
			  RobotClassDynamicPath rcdp=new RobotClassDynamicPath();
			
			  rcdp.type(pfxpath);
			  	 
			  
			  
			  
			Thread.sleep(15000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			
			robot.keyPress(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F);
			
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			
			robot.keyPress(KeyEvent.VK_L);
			robot.keyRelease(KeyEvent.VK_L);
			
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			
			Thread.sleep(3000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			  
			  //pfx upload action ends
		
			  
			 Thread.sleep(10000);
			 
			 actions=new Actions(driver);
			  Thread.sleep(8000); 
			
				  String homePage=driver.findElement(By.xpath("//p[contains(text(),'Financial and Non Financial Messages')]")).getText();
				  String homepage1="Financial and Non Financial Messages";
				  assertEquals(homepage1,homePage);
				  
				  System.out.println("User landed on Home page");
	  
	  
	  actions = new Actions(driver); Thread.sleep(10000);
	  
	  WebElement message = driver .findElement(By.
	  xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
	  actions.moveToElement(message).build().perform();
	  
	  actions.moveToElement(driver .findElement(By.
	  cssSelector("#othersMenu > li:nth-child(7) > a:nth-child(2) > span:nth-child(1)"
	  ))) .click().build().perform();
	  
	  actions.moveToElement(driver.findElement(By
	  .xpath("//li[@class='active has-sub']/child::ul/li/a/span[contains(text(),'Reconciliation Request')]"
	  ))) .click().build().perform();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@value='singleBank']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='reconIFSC']")).sendKeys("IFBR0000001");
	  
	  Select s1 = new Select(driver.findElement(By.cssSelector("#msgTypeSelect")));
	  s1.selectByVisibleText("RTGS");
	  
	  Calendar calendar = Calendar.getInstance(TimeZone.getDefault()); 
	  // Get Current Day as a number 
	  
	  int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
	  System.out.println("Today Int: " + todayInt + "\n"); 
	  // Integer to String Conversion 
	  String todayStr = Integer.toString(todayInt);
	  System.out.println("Today Str: " + todayStr + "\n");
	  
	  driver.findElement(By.xpath("//input[@id='reconReqFromDate']")).click();
	  
	  // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[contains(text(),'ui-datepicker-today']/a[contains(text(),'"+todayStr+"']"));
	  
	  
	  // selecting current date
	  driver.findElement(By.cssSelector(".ui-state-highlight")).click();
	  
	  // Selecting current time - 1 hour 
	  DateFormat hrs = new SimpleDateFormat("kk");
	  
	  Date d = new Date(System.currentTimeMillis() - 3600 * 1000);
	  
	  String timeanHourago = hrs.format(d);
	  
	  s1 = new Select(driver.findElement(By.id("fromHours")));
	  s1.selectByVisibleText(timeanHourago);
	  
	  // Code to generate a random number between 0(inclusive) to 45(exclusing)
	  Random ran = new Random(); 
	  int num = ran.nextInt(10); 
	  String mins = Integer.toString(num);
	  
	  s1 = new Select(driver.findElement(By.id("fromMins")));
	  s1.selectByVisibleText("0" + mins);
	  
	  driver.findElement(By.xpath("//input[@id='reconReqToDate']")).click();
	  
	  //driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[contains(text(),'ui-datepicker-today']/a[contains(text(),'"+todayStr+"']"));
	  
	  // selecting current date
	  driver.findElement(By.cssSelector("a.ui-state-default")).click();
	  
	  s1 = new Select(driver.findElement(By.id("toHours")));
	  s1.selectByVisibleText(timeanHourago);
	  
	  //Code to generate a random number between 0(inclusive) to 45(exclusing) 
	  num = num + 15; String tomins = Integer.toString(num);
	  
	  s1 = new Select(driver.findElement(By.id("toMins")));
	  s1.selectByVisibleText(tomins);
	  
	  driver.findElement(By.cssSelector("#crtReconReqBtn")).click();
	  
	  assertEquals("Enhanced Reconciliation Request created successfully, kindly authorize the message with another user."
	  , driver.findElement(By.id("toggleSuccess")).getText());
	  
	  // System.out.println(driver.getWindowHandle()+" parent window");
	  
	  Thread.sleep(2000);
	  
	  WebElement message1 = driver .findElement(By.
	  xpath("//li[@class='active has-sub']/a/span[contains(text(),'Others')]"));
	  actions.moveToElement(message1).build().perform();
	  
	  actions.moveToElement(driver .findElement(By.
	  cssSelector("#othersMenu > li:nth-child(7) > a:nth-child(2) > span:nth-child(1)"))) .click().build().perform();
	  
	  actions.moveToElement(driver.findElement(By.xpath("//li[@class='active has-sub']/child::ul/li/a/span[contains(text(),'Reconciliation Request Action Listing')]"))) .click().build().perform();
	  
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
	  
	  //driver.findElement(By.xpath("//table[@id='enhcdRcnReqListingTableId']/tbody/tr[1]")).click();
	  
	  refnumber = driver.findElement(By.xpath("//table[@id='enhcdRcnReqListingTableId']/tbody/tr[1]/td[1]")).getText();
	  
	  System.out.println("******************************************");
	  System.out.println("The Generated Reference Number :"+refnumber);
	  System.out.println("******************************************");
	  
	  }
	  
	  @Test(priority=4,dependsOnMethods = {"createERRequest"},description="Skip Test Verification")
	  public void skipTest()
	  {
		  System.out.println("Skip Test Verification");
	  }
	  
	  @Test(priority=5, description = "Logout Script")
	    public void logOutApp() throws MalformedURLException, InterruptedException {
	    	
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
	  
	 
	
	
	@Test(priority = 6, description = "close the browser")
	public void closeBrowser()
	{
		driver.quit();
	}
}

