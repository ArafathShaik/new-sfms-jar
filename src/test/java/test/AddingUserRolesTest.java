package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wtt.docker.listener.PropertiesUtility;

public class AddingUserRolesTest {

	WebDriver driver;
	Actions actions;
	Robot robot;

	@Test(priority = 1)
	public void jitu() {
		File f = new File(System.getProperty("user.dir") + "/" + ("src/test/resources/RBIH0000000.pfx"));
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		Assert.assertEquals("RBIH0000000.pfx", f.getName());
	}

	@Test(priority = 2, description = "Launching SFMS application")
	public void LaunchingApplication() throws IOException, InterruptedException, AWTException {

		PropertiesUtility.loadApplicationProperties(); 
		 
		Robot robot = new Robot(); 
		driver = new FirefoxDriver(); 
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

	@Test(priority = 2, description = "Handling Allow Pop-ups and Security Pop-ups")
	public void HandlingPopus() throws MalformedURLException, AWTException, InterruptedException {
		// NewAllowplugin.png

		Thread.sleep(10000);

		robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);

		driver.findElement(By.xpath("//div[@id='redirect_admin']/a")).click();

		Thread.sleep(6000);
		// driver.findElement(By.xpath("//div[@id='redirect_password']/a")).click();
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

	@Test(priority = 3, description = "Verify Login")
	public void loginApp() throws InterruptedException, AWTException, MalformedURLException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='uaiUserId']"))
				.sendKeys(PropertiesUtility.properties.getProperty("RequestCreator"));
		driver.findElement(By.xpath("//input[@id='uaiUserNodeAddrs']"))
				.sendKeys(PropertiesUtility.properties.getProperty("ERIFSC"));

		System.out.println("Entered User id and IFSC Code Successfully");

		Thread.sleep(15000);

		driver.findElement(By.id("token_signin")).click();

		System.out.println("Clicked on Sign-in Button successfully");

		Thread.sleep(10000);

		// Pfx uploading script

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

		String pfxpath = System.getProperty("user.dir") + "/" + ("src/test/resources/RBIH0000000.pfx");
		System.out.println(pfxpath);
		RobotClassDynamicPath rcdp = new RobotClassDynamicPath();

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

		// pfx upload action ends

		Thread.sleep(10000);

		// System.out.println(driver.getWindowHandle()+" parent window"); 
		actions=new Actions(driver);
		Thread.sleep(8000);

		String homePage = driver.findElement(By.xpath("//p[contains(text(),'Financial and Non Financial Messages')]")).getText();
		String homepage1 = "Financial and Non Financial Messages";
		Assert.assertEquals(homepage1, homePage);

		System.out.println("User landed on Home page");
	}

	@Test(priority = 4, description = "Create Roles Profile ")
	public void createUserGroup() throws InterruptedException, MalformedURLException, AWTException {
		actions = new Actions(driver);

		WebElement message = driver
				.findElement(By.xpath("//li[@class='active has-sub']/a/span[contains(text(),'User Administration')]"));
		actions.moveToElement(message).build().perform();

		actions.moveToElement(driver.findElement(By.cssSelector(
				"li.active:nth-child(3) > ul:nth-child(3) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)")))
				.click().build().perform();

		if (driver.findElement(By.xpath("//p[contains(text(),'Roles')]")).isDisplayed())
			System.out.println("User Landed on Roles Page");

		// Click on Add button to create Roles group
		driver.findElement(By.id("addRoleButton")).click();

		// Code to generate 3 digit random number
		int x = ((int) (Math.random() * 1000000)) % 1000;

		String grpName = "Test" + x;

		System.out.println("*************************************************");
		System.out.println("User Roles Group Created With the Name: " + grpName);
		System.out.println("*************************************************");
		// Add the Login group name with generated random number to avoid duplicates
		driver.findElement(By.cssSelector("#roleDesc")).sendKeys(grpName);

		driver.findElement(By.cssSelector(".displayAllFunctions > li:nth-child(1) > label:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".displayAllFunctions > li:nth-child(2) > label:nth-child(2)")).click();

		// Click Add button to create the Roles group
		driver.findElement(By.cssSelector("#addId")).click();

		// verification for successful creation of login group
		Assert.assertEquals("Role added/modified successfully",
				driver.findElement(By.cssSelector("#toggleSuccess")).getText());

		driver.findElement(By.cssSelector(".styled-button-anchor")).click();

	}

	@Test(priority = 5, description = "Logout Script")
	public void logOut() throws MalformedURLException, InterruptedException {

		actions = new Actions(driver);

		WebElement userProfile = driver.findElement(By.xpath("//div[@class='display_user']"));

		actions.moveToElement(userProfile).build().perform();
		Thread.sleep(4000);

		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();

		Thread.sleep(10000);

	}

	@Test(priority = 6, description = "Closing Application")
	public void closeApplication() throws InterruptedException {

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
		driver.quit();
		System.out.println("Closed Application on clicking Login");

	}
}
