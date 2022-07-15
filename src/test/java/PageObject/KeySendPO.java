package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeySendPO {
	private WebDriver driver;
	public KeySendPO (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	@FindBy(xpath="//input[@aria-controls='tablepress-1']")
	private WebElement searchBtn;
	
	public WebElement searchBtn() {
		// TODO Auto-generated method stub
		return searchBtn;
	}
}
