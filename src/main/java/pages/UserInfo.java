package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UserInfo extends BasePage {

    public UserInfo(WebDriver driver, Duration wait) {
        super(driver, wait);
    }

    private By nameInputField = By.name("firstName");
    private By lastnameInputField = By.id("last-name");
    private By zipInputField = By.name("postalCode");
    private By continueBtn = By.id("continue");
    private By exampleLocator = By.id("STEFAN");

    public void enteringUserInfo() {
        type(nameInputField, "Irina");
        type(lastnameInputField, "Golubovic");
        type(zipInputField, "12345");
        click(continueBtn);
    }
}
