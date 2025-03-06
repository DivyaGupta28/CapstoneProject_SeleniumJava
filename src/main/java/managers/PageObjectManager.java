package managers;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
	 
	private WebDriver driver;


	private SeleniumJava_MyAccountPage myaccountPageSeleniumJava;

	 public PageObjectManager(WebDriver driver) {
		 this.driver = driver;
	 }


	public SeleniumJava_MyAccountPage getMyAccountPage() {
		return (myaccountPageSeleniumJava == null) ? myaccountPageSeleniumJava = new SeleniumJava_MyAccountPage(driver) : myaccountPageSeleniumJava;
	}



}