package stepDefinitions;

import cucumber.TestContext;
import pageObjects.SeleniumJava_SignInPage;
import cucumber.api.java.en.When;

public class SeleniumJava_SignInPageSteps {
	TestContext testContext;
	SeleniumJava_SignInPage signinPageSeleniumJava;
	
	public SeleniumJava_SignInPageSteps(TestContext context) {
		 testContext = context;
		 signinPageSeleniumJava = testContext.getPageObjectManager().getSignInPage();
		 }
	
	@When("^user enter \"([^\"]*)\" and click on create an account button$")
	public void user_enter_and_click_on_create_an_account_button(String arg1) {
		signinPageSeleniumJava.enterEmailAddress(arg1);
		signinPageSeleniumJava.clkOnCreateAccountBtn();
	    
	}
	
	
}
