package FunctionLib;

import org.openqa.selenium.WebDriver;

import PageObject.AutomationPO;
import PageObject.KeySendPO;

public class KeySendLib {
private WebDriver driver;
	
	
	public KeySendLib(WebDriver driver) {
		this.driver=driver;
	}
	public void Searching(String keys) {
		KeySendPO a=new  KeySendPO(driver);
		 a.searchBtn().sendKeys(keys);
		
	}
	

}
