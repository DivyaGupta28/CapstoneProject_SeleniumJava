package managers;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
	 
	private WebDriver driver;

//	private HomePage homePage;
	private SeleniumJava_SignInPage signinPageSeleniumJava;
	private SeleniumJava_FormDetails seleniumJavaFormDetails;
	private SeleniumJava_MyAccountPage myaccountPageSeleniumJava;
	private SeleniumJava_MyWishlistsPage mywishlistsPageSeleniumJava;
	private SeleniumJava_SpecificItemPage specificitemPageSeleniumJava;

	private SeleniumJava_ABTestingPage seleniumJavaAbTestingPage;

	 
	 public PageObjectManager(WebDriver driver) {
		 this.driver = driver;
	 }
	 /*
	public HomePage getHomePage(){
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	*/
	public SeleniumJava_SignInPage getSignInPage() {
		return (signinPageSeleniumJava == null) ? signinPageSeleniumJava = new SeleniumJava_SignInPage(driver) : signinPageSeleniumJava;
	}
	public SeleniumJava_FormDetails getFormDetails() {
		return (seleniumJavaFormDetails == null) ? seleniumJavaFormDetails = new SeleniumJava_FormDetails(driver) : seleniumJavaFormDetails;
	}
	public SeleniumJava_MyAccountPage getMyAccountPage() {
		return (myaccountPageSeleniumJava == null) ? myaccountPageSeleniumJava = new SeleniumJava_MyAccountPage(driver) : myaccountPageSeleniumJava;
	}
	public SeleniumJava_MyWishlistsPage getMyWishlistsPage(){
		 return (mywishlistsPageSeleniumJava == null) ? mywishlistsPageSeleniumJava = new SeleniumJava_MyWishlistsPage(driver) : mywishlistsPageSeleniumJava;
    }	 
	public SeleniumJava_SpecificItemPage getSpecificItemPage() {
		 return (specificitemPageSeleniumJava == null) ? specificitemPageSeleniumJava = new SeleniumJava_SpecificItemPage(driver) : specificitemPageSeleniumJava;
	}

	public SeleniumJava_ABTestingPage getABTestingPage() {

		return (seleniumJavaAbTestingPage == null) ? seleniumJavaAbTestingPage = new SeleniumJava_ABTestingPage(driver) : seleniumJavaAbTestingPage;
	}


}