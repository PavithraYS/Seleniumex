package FunctionLib;

import org.openqa.selenium.WebDriver;

import PageObject.AutomationPO;


public class AutomationLib {
	private WebDriver driver;
	
	
	public AutomationLib(WebDriver driver) {
		this.driver=driver;
	}

	
	public void enterPass(String mail) {
		 AutomationPO c=new  AutomationPO(driver);
		 c.passBtn().sendKeys(mail);
		
	}
	public void enterCmp(String mail) {
		 AutomationPO c=new  AutomationPO(driver);
		 c.compBtn().sendKeys(mail);
		
	}
	public void submitButton()
	{
		 AutomationPO b=new  AutomationPO(driver);
		 b.submitBtn().click();
	}
	public void enterGmail(String keys) {
		
			 AutomationPO a=new  AutomationPO(driver);
			 a.gmailBtn().sendKeys(keys);
		}
	//.................................................
		
	
	
	
	

}
