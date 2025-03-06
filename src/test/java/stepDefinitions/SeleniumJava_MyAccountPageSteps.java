package stepDefinitions;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.SeleniumJava_MyAccountPage;
import cucumber.api.java.en.When;


public class SeleniumJava_MyAccountPageSteps {
	TestContext testContext;
	SeleniumJava_MyAccountPage myaccountPageSeleniumJava;
	public SeleniumJava_MyAccountPageSteps(TestContext context) {
		 testContext = context;
		 myaccountPageSeleniumJava = testContext.getPageObjectManager().getMyAccountPage();
	}

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

	@And("I close the browser")
	public void i_Close_The_Browser() throws InterruptedException {
		myaccountPageSeleniumJava.closeTheBrowser();
	}

}
