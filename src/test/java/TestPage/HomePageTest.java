package TestPage;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.Basepage;
import ObjectPage.HomePage;

public class HomePageTest {
	
	HomePage hp;
	Basepage bp;
	
	public HomePageTest() {
	
		hp = new HomePage();
		bp = new Basepage();
		
	}

	@Test
	public void verifyWomenTag() {
	
		hp.getWomenTag().click();
	    String Title=hp.getTitlte();
	    System.out.println(Title);
		Assert.assertTrue(bp.elementFound(hp.getWomenTag()), "Failed to display");
	}

		
}
	
