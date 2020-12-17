import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverSetup;
import utils.GlobalDefinitions;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverSetup.createDriver(GlobalDefinitions.BROWSER_NAME);
    }
    @AfterMethod
    public void closeDriver (){
    DriverSetup.close(driver);
    }
}
