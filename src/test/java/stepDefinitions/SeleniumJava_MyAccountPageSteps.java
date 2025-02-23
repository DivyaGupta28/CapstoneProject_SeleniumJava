package stepDefinitions;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.SeleniumJava_MyAccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SeleniumJava_MyAccountPageSteps {
	TestContext testContext;
	SeleniumJava_MyAccountPage myaccountPageSeleniumJava;
	public SeleniumJava_MyAccountPageSteps(TestContext context) {
		 testContext = context;
		 myaccountPageSeleniumJava = testContext.getPageObjectManager().getMyAccountPage();
	}
///*
	@Given("^I launch the herokuapp web url$")
	public void I_launch_the_web_url() {
		myaccountPageSeleniumJava.navigateTo_HomePage();
		//seleniumJavaHomePage.clkOnSignInlink();
	}


	@When("^I validate the \"([^\"]*)\"$")
	public void I_validated_the(String arg1) throws Throwable {
		myaccountPageSeleniumJava.validateTitle(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}
	@When("I click on ABTesting link")
	public void I_click_ABTestinglink() throws Throwable {
		myaccountPageSeleniumJava.abTitle();
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}
	@When("^I validate the page as \"([^\"]*)\"$")
	public void I_validate_the(String arg1) throws Throwable {
		myaccountPageSeleniumJava.validatePage(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}
	@When("I navigate back to home Page$")
	public void I_navigate_back_to_home_page() throws Throwable {
		myaccountPageSeleniumJava.navBackToHome();

	}

	@When("^I selected the \"([^\"]*)\" from the dropdown$")
	public void I_selected_option_from_dropdown(String arg1) throws Throwable {
		myaccountPageSeleniumJava.optionFromDropDown(arg1);
	}

	@When("I validate the option1 selected$")
	public void I_validate_option1_selected() throws Throwable {
		myaccountPageSeleniumJava.valOption();
	}

	@When("I scroll down on web page$")
	public void I_scroll_down_on_web_page() throws Throwable {
		myaccountPageSeleniumJava.scrollDown();
	}

	@When("I validated the text from the frames$")
	public void I_validate_the_text_from_frames() throws Throwable {
		myaccountPageSeleniumJava.frames();
	}

//	*/

	@Then("^user logged in and navigate to my account page$")
	public void user_logged_in_and_navigate_to_my_account_page() {
			if(myaccountPageSeleniumJava.comparePageTitle()) {
				//do nothing
			}
			else {
				myaccountPageSeleniumJava.logoutfromTheApplication();
				testContext.getWebDriverManager().closeDriver();
				throw new Error("Navigation to My Account page unsucessful.");
			}
	}
	
	@When("^user clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String arg1) throws Throwable {
		myaccountPageSeleniumJava.tshirtsTab();
	}

	
	@Then("^user name \"([^\"]*)\" followed by \"([^\"]*)\" displayed in top right corner$")
	public void user_name_followed_by_displayed_in_top_right_corner(String arg1,String arg2) {
		if(myaccountPageSeleniumJava.verifyloggedInUserName(arg1, arg2)) {
			//do nothing
		}
		else {
			myaccountPageSeleniumJava.logoutfromTheApplication();
			testContext.getWebDriverManager().closeDriver();
			throw new Error("User name not displayed as expected."+arg1+" "+arg2);
		}
	}
	
 /*
	@Then("^user can see \"([^\"]*)\" link in My Account Page$")
	public void user_can_see_link_in_My_Account_Page(String arg1) {
		if(myaccountPageSeleniumJava.verifyMywishlistlnkDisplayed(arg1)) {
			// do nothing
		}
		else {
			myaccountPageSeleniumJava.logoutfromTheApplication();
			testContext.getWebDriverManager().closeDriver();
			throw new Error(" My Wishlists link is not displayed in My Account page.");
		}
	}
	@When("^user clicks on my wishlists link$")
	public void user_clicks_on_my_wishlists_link() {
		myaccountPageSeleniumJava.clkMyWishlistslink();
	}
	*/
	
	//verifyMyperinfolnkDisplayed
	
	@Then("^user can see \"([^\"]*)\" link in My Account Page$")
	public void user_can_see_link_in_My_Account_Page(String arg1) {
		if(myaccountPageSeleniumJava.verifyMyperinfolnkDisplayed(arg1)) {
			// do nothing
		}
		else {
			myaccountPageSeleniumJava.logoutfromTheApplication();
			testContext.getWebDriverManager().closeDriver();
			throw new Error(" My Personalinfo link is not displayed in My Account page.");
		}
	}
	@When("^user clicks on My personal information link$")
	public void user_clicks_on_my_persinfo_link() {
		myaccountPageSeleniumJava.clkMypersinfolink();
	}
	
	
	
	
	@Then("^user can confirm that item is added to the wishlist$")
	public void user_can_confirm_that_item_is_added_to_the_wishlist() {
		if(myaccountPageSeleniumJava.VerifyTheQuantityequalsToOne()) {
			//do nothing
		}
		else {
			myaccountPageSeleniumJava.logoutfromTheApplication();
			testContext.getWebDriverManager().closeDriver();
			throw new Error("validation failed");
		}
	}
	@Then("^logout from the application$")
	public void logout_from_the_application() {
		myaccountPageSeleniumJava.logoutfromTheApplication();
		testContext.getWebDriverManager().closeDriver();
	}
}
