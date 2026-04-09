import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginTests extends BaseTest {
    LoginPage loginPage = new LoginPage(driver, Duration.ofSeconds(10));

    @Test
    public void validLoginAction() {
        loginPage.loginAction("standard_user", "sauce");
    }

    @Test
    public void invalidLoginAction() {
        loginPage.loginAction("standarsaa", "saucesad");
    }

    }

