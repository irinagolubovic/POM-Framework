package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, Duration wait) {
        super(driver, wait);
    }
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By lgnBtn = By.id("login-button");
    private By errorMsg = By.id("errorMsg");

    public void loginAction(String usernameText, String passwordText) {
        type(username, usernameText);
        type(password, passwordText);
        click(lgnBtn);
    }

}
