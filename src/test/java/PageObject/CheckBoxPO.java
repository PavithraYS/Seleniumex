package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPO {
	private WebDriver driver;
	public CheckBoxPO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	@FindBy(xpath="//input[@id='ohrmList_chkSelectAll']")
	private WebElement userTableBtn;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_25']")
	private WebElement userTableBtn1;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_16']")
	private WebElement userTableBtn2;
	
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_21']")
	private WebElement userTableBtn3;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_2']")
	private WebElement userTableBtn4;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_14']")
	private WebElement userTableBtn5;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_15']")
	private WebElement userTableBtn6;
	
	public WebElement  userTableBtn()
	{
		return userTableBtn;
	}
	public WebElement  userTableBtn1()
	{
		return userTableBtn1;
	}
	public WebElement  userTableBtn2()
	{
		return userTableBtn2;
	}
	public WebElement  userTableBtn3()
	{
		return userTableBtn3;
	}
	public WebElement  userTableBtn4()
	{
		return userTableBtn4;
	}
	public WebElement  userTableBtn5()
	{
		return userTableBtn5;
	}
	public WebElement  userTableBtn6()
	{
		return userTableBtn6;
	}

}
