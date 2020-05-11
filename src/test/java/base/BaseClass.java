package base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static base.WebDriverSingleton.initializeGoogleChrome;

public class BaseClass {


    public static final String BASE_URL = "https://www.tikoki.com/sk";

    @Before


    @After
       public void closeAndQuit() {
        WebDriverSingleton.getWebdriverInstance().close();
        WebDriverSingleton.getWebdriverInstance().quit();
    }
    public WebDriver getDriver() {return WebDriverSingleton.getWebdriverInstance();}
}
