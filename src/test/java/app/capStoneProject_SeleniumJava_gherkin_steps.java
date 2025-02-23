package app;
//package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.SeleniumJava_ABTestingPage;
import pageObjects.SeleniumJava_HomePage;

public class capStoneProject_SeleniumJava_gherkin_steps {

        TestContext testContext;
        SeleniumJava_HomePage seleniumJavaHomePage;
       SeleniumJava_ABTestingPage getabTestingPageSeleniumJava;
        public void HomePageSteps(TestContext context) {
            testContext = context;
          //  seleniumJavaHomePage = testContext.getPageObjectManager().getHomePage();
        }
     public void capStone4Steps(TestContext context) {
        testContext = context;
         getabTestingPageSeleniumJava = testContext.getPageObjectManager().getABTestingPage();
    }
        @Given("^I launch the web url$")
        public void I_launch_the_web_url() {
            seleniumJavaHomePage.navigateTo_HomePage();
            //seleniumJavaHomePage.clkOnSignInlink();
        }

        @When("^I validated the \"([^\"]*)\"$")
        public void I_validated_the(String arg1) throws Throwable {
            getabTestingPageSeleniumJava.validateTitle(arg1);
            // Write code here that turns the phrase above into concrete actions
            //	formDetails.enterFirstName(arg1);
        }

    }
