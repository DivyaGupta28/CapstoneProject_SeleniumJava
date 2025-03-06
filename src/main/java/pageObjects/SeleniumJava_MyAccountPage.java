package pageObjects;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertEquals;


public class SeleniumJava_MyAccountPage {
	WebDriver driver;
	public SeleniumJava_MyAccountPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[@href=\"/abtest\"]")
	private static WebElement abTestLink;

	@FindBy(xpath = "//a[@href=\"/dropdown\"]")
	public static WebElement dropdownLink;

	@FindBy(xpath = "//select[@id=\"dropdown\"]")
	public static WebElement selDropdown;

	@FindBy(xpath = "//h3[contains(text(),\"Dropdown List\")]")
	public static WebElement dropDown;

	@FindBy(xpath = "//option[@value=\"1\"]")
	public static WebElement option1;

	@FindBy(xpath = "//a[@href=\"/frames\"]")
	public static WebElement framesLink;

	@FindBy(xpath = "//a[@href=\"/nested_frames\"]")
	public static WebElement nestedFrames;

	@FindBy(xpath = "//a[@href=\"/iframe\"]")
	public static WebElement iframe;

	@FindBy(xpath = "//option[@selected=\"selected\"]")
	public static WebElement opt1Selected;
	
	//The below method compares the page title and returns true/false
	public boolean comparePageTitle() {
		String pgTitleDisplayed = driver.getTitle();
		if(pgTitleDisplayed.contains("My account - My Store")) {
			System.out.println("user logged in successfully and the title of the page is: "+pgTitleDisplayed);
			return true;
		}
		else {
			System.out.println("user not logged in successfully and the title of the page is: "+pgTitleDisplayed);
			return false;
		}
	}


	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}


	public void validateTitle(String arg1) {

		System.out.println("text:" + arg1);
		String titleExp = "Welcome to the-internet";
		try {
			//String titleExp = driver.findElement(By.xpath("//h1[@class= \"heading\" and contains(text()= '"+titleName+"']")).getText();
			String titleAct = driver.findElement(By.xpath("//h1[contains(text(),\"Welcome\")]")).getText();
			System.out.println("Title name:" + titleAct);
			//Assert.assertTrue(titleExp.equals(titleAct));
			assertEquals(titleAct,titleExp, "Title not matched");
		} catch (Exception e) {
			System.out.println("Title not matched: Pass");
		}
	}


	public void abTitle() {
		try {
			abTestLink.click();
			Thread.sleep(5000);
			System.out.println("AB Test link clicked");
		} catch (Exception e) {
			System.out.println("AB Test link not clicked");
		}
	}


	public void validatePage(String arg1) throws InterruptedException {

		System.out.println("text:" + arg1);
		String titlePageExp = arg1;
		String titlePageAct = "";

		try {
			titlePageAct = driver.findElement(By.xpath("//h3[contains(text(),\"A/B Test\")]")).getText();
			System.out.println("Title Page:" + titlePageAct);
			//Assert.assertTrue(titlePageExp.equals(titlePageAct));
			assertEquals(titlePageAct,titlePageExp,"Title Page not matched");

		} catch (Exception e) {
			//Assert.assertTrue(titlePageExp.equals(titlePageAct));
			System.out.println("Title Page not matched: Pass");
		}

	}


	public void navBackToHome() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(5000);
	}


	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void optionFromDropDown(String arg1) throws InterruptedException {

		try {
			dropdownLink.click();
			Thread.sleep(5000);
			System.out.println("Dropdown link clicked");
		} catch (Exception e) {
			System.out.println("Dropdown link not clicked");
		}

		selDropdown.click();
		Thread.sleep(5000);
		option1.click();
		Thread.sleep(5000);
		option1.click();
		Thread.sleep(5000);
		selDropdown.click();

	}

	public void valOption() throws InterruptedException {
		dropDown.click();
		Thread.sleep(5000);

	}

	public void frames() throws InterruptedException {

		try {
			framesLink.click();
			Thread.sleep(5000);
			System.out.println("Frames link clicked");
		} catch (Exception e) {
			System.out.println("Frames link not clicked");
		}
	}

	public void closeTheBrowser() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);
		System.out.println("Browser closed");
	}
	
}
