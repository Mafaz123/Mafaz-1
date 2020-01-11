package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Basepage{

	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement WomenTag;
	
	
	public WebElement getWomenTag() {
		return WomenTag;
		
	}
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement DressesTag;
	
	public WebElement DressesTag() {
		return DressesTag;
	}
	
	private WebElement DressPageTest;
	
	public WebElement DressPageTest() {
		return DressPageTest;
	
	}
}
	
	

