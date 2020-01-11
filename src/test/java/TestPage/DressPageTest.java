package TestPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.Basepage;
import ObjectPage.DressPage;
import ObjectPage.HomePage;

public class DressPageTest {

		HomePage hp;
	
		Basepage bp;
		DressPage dp;
		public DressPageTest() {
			hp= new HomePage();
			bp= new Basepage();
			dp= new DressPage();
		}

@Test
public void verifySsize() {
	hp.getWomenTag().click();
	Assert.assertTrue(bp.elementFound(dp.getSsize()));
}
			

public void numberofsize(){


		}
	

