package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    public static void initialize() {
        initializeGoogleChrome();
    }

    public static WebDriver getWebdriverInstance() {
        if (driver == null) {
            initialize();
        }
        return driver;
    }

        public static void initializeGoogleChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
