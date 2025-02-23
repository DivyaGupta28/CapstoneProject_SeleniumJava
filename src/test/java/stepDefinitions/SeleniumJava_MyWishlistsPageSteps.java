package stepDefinitions;
import cucumber.TestContext;
import pageObjects.SeleniumJava_MyWishlistsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SeleniumJava_MyAccountPage;
public class SeleniumJava_MyWishlistsPageSteps {
	TestContext testContext;
	SeleniumJava_MyWishlistsPage mywishlistsPageSeleniumJava;
	SeleniumJava_MyAccountPage myacntpage;
	public SeleniumJava_MyWishlistsPageSteps(TestContext context) {
		 testContext = context;
		 mywishlistsPageSeleniumJava = testContext.getPageObjectManager().getMyWishlistsPage();
	}
	
	@Then("^user can see \"([^\"]*)\" list in My Store Page$")
	public void user_can_see_list_in_My_Store_Page(String arg1) {
		if(mywishlistsPageSeleniumJava.verifyTopSellersListDisplayed(arg1)) {
			// do nothing
		}
		else {
			myacntpage.logoutfromTheApplication();
			testContext.getWebDriverManager().closeDriver();
			throw new Error("Top Sellers list is not displayed.");
		}
	}
	@When("^user clicks on first item in TOP SELLERS list$")
	public void user_clicks_on_first_item_in_TOP_SELLERS_list() {
		mywishlistsPageSeleniumJava.clkOnFirstItemInTopSellers();
	}
}
