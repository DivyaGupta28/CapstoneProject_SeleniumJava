package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.TestContext;
import pageObjects.SeleniumJava_HomePage;

//this class will take user to the sign on page.
public class SeleniumJava_HomePageSteps {
	 TestContext testContext;
	 SeleniumJava_HomePage seleniumJavaHomePage;
	 public SeleniumJava_HomePageSteps(TestContext context) {
		 testContext = context;
		// seleniumJavaHomePage = testContext.getPageObjectManager().getHomePage();
	}
	@Given("^user is on Signon page$")
	public void user_is_on_Signon_page() {
		seleniumJavaHomePage.navigateTo_HomePage();
		seleniumJavaHomePage.clkOnSignInlink();
	}

	/*
	@Given("^I launch the cap web url$")
	public void I_launch_the_web_url() {
		seleniumJavaHomePage.navigateTo_HomePage();
		//seleniumJavaHomePage.clkOnSignInlink();
	}


	@Given("^I launch the web url$")
	public void I_launch_the_web_url() {
		seleniumJavaHomePage.navigateTo_HomePage();
		seleniumJavaHomePage.clkOnSignInlink();
	}

	@When("^I validated the  \"([^\"]*)\"$")
	public void user_type_first_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	//	seleniumJavaFormDetails.enterFirstName(arg1);
	}
	@When("^I validat the \"([^\"]*)\"$")
	public void I_validated_the(String arg1) throws Throwable {
		seleniumJavaHomePage.validateTitle(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}

	@When("I click on ABTesting link")
	public void I_click_ABTestinglink() throws Throwable {
		seleniumJavaHomePage.abTitle();
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}


	@When("^I validate the page as \"([^\"]*)\"$")
	public void I_validate_the(String arg1) throws Throwable {
		seleniumJavaHomePage.validatePage(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	seleniumJavaFormDetails.enterFirstName(arg1);
	}

  */

}
