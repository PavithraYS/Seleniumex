package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPO {
	private WebDriver driver;
	public AutomationPO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	@FindBy(xpath="//input[@id='userId']")
	private WebElement gmailBtn;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passBtn;
	@FindBy(xpath="//input[@name='company']")
	private WebElement compBtn;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	//........................................
	
	
	//'''''''''''''''''''''''
	
	
	public WebElement gmailBtn()
	{
		return gmailBtn;
	}
	public WebElement  passBtn()
	{
		return passBtn;
	}
	public WebElement  compBtn()
	{
		return compBtn;
	}
	public WebElement  submitBtn()
	{
		return submitBtn;
	}
	//........................
	
	//............................
	
	
	

}
