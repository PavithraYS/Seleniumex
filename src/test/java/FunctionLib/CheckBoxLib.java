package FunctionLib;

import org.openqa.selenium.WebDriver;

import PageObject.AutomationPO;
import PageObject.CheckBoxPO;

public class CheckBoxLib {
private WebDriver driver;
	
	
	public CheckBoxLib(WebDriver driver) {
		this.driver=driver;
	}

	public void userTable()
	{
		 CheckBoxPO b=new  CheckBoxPO(driver);
		 b.userTableBtn().click();
	}
	public void userTable1()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn1().click();
	}
	public void userTable2()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn2().click();
	}
	public void userTable3()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn3().click();
	}
	public void userTable4()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn4().click();
	}
	public void userTable5()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn5().click();
	}
	public void userTable6()
	{
		 CheckBoxPO b=new   CheckBoxPO(driver);
		 b.userTableBtn6().click();
	}

}
