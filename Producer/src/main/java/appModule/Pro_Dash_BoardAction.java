package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Moovicart.Producer.Base;


public class Pro_Dash_BoardAction extends Base{

static WebDriver driver;
	
	public Pro_Dash_BoardAction(WebDriver driver) {
		Pro_Dash_BoardAction.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	public  void syndicate() {
	
	}
	
}
