package pages;
import base.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   WebDriver driver;

    private static final String BASE_URL = "https://www.tikoki.com/sk";

    @FindBy(xpath = "//section[@class='filter']//a[@title='Nové']/span[@class='title']")
    private WebElement categoryNew;

    public HomePage(){
        driver = WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public void openPage(){
          driver.get(BASE_URL);
    }

    public void openCategory(){
        categoryNew.click();
    }
}

