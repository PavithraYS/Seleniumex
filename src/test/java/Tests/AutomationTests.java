package Tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FunctionLib.AutomationLib;
import FunctionLib.CheckBoxLib;
import FunctionLib.KeySendLib;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AutomationTests {
	private WebDriver driver;
	//private WebDriveManager webDrvMgr;
	String propFile="src/test/java/resources/base.properties";

	String uri=Util.DataProvider.readTestData(propFile,"url");
	String gmail=Util.DataProvider.readTestData(propFile,"gmail");
	String pass=Util.DataProvider.readTestData(propFile,"pass");
	String cmp=Util.DataProvider.readTestData(propFile,"cmp");

	
@BeforeClass
	public void testCases() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.setProperty("webdriver.chrome.driver","/com.automationProject/src/test/resources/chromedriver.exe");
		//webDrvMgr =new WebDriveManager();
		//driver = webDrvMgr.launchBrowser("chrome");
		
		//driver.get("https://selectorshub.com/xpath-practice-page/?email=A%40A.com&Password=p");
		driver.get(uri);
}
		@Test
		public void TestCase1() throws InterruptedException  {
		AutomationLib lib= new AutomationLib(driver);
		lib.enterGmail(gmail);
		
		lib.enterPass(pass);
		
		lib.enterCmp(cmp);
		
		lib.submitButton();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement CheckBoxLib=webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ohrmList_chkSelectAll']")));
		
		}
		@Test
		public void TestCase2() throws InterruptedException  {
		CheckBoxLib lib=new CheckBoxLib(driver);
		
		lib.userTable();
		lib.userTable1();
		lib.userTable2();
		lib.userTable3();
		lib.userTable4();
		lib.userTable5();
		lib.userTable6();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement KeySendLib=webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-controls='tablepress-1']")));
		
		
		}
		
		@Test
		public void TestCase3() throws InterruptedException  {
		KeySendLib lib=new KeySendLib(driver);
		
		lib.Searching("window");
		
		
		
		}
		
		@AfterClass
		public void TearDown() {
			driver.quit();
		}

		
	
}
