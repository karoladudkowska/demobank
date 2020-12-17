package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.object.BasePage;

import java.util.concurrent.TimeUnit;

public class DriverSetup {
    private static WebDriver webDriver;

    public static WebDriver createDriver(String browser) {
        switch (browser) {
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriverVERSION1.exe");
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
        }
        BasePage.log("Uruchomino przegladarkę " + browser);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().pageLoadTimeout(GlobalDefinitions.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(GlobalDefinitions.IMPLICITLY_WAIT, TimeUnit.SECONDS);



            return webDriver;
        }

        public static void close(WebDriver webDriver) {
        BasePage.log("Closing browser...");
        webDriver.quit();
        webDriver = null;
    }
}






