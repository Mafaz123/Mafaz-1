package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DressPage extends Basepage{
	
	
	@FindBy(xpath="//*[@id=\"layered_id_attribute_group_1\"]")
	private WebElement verifySsize;
	
	public DressPage(){
	 PageFactory.initElements(driver, this);
	}

	public WebElement getSsize() {
		return verifySsize;
	}

}
