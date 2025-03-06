package runners;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/capStoneProject_SeleniumJava",
        glue= {"stepDefinitions"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
 )
 
 
public class TestRunner {
// @AfterClass
// public static void writeExtentReport() {
// Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
// }

}