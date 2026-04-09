
import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserInfo;

import java.time.Duration;
import java.util.Objects;

public class AppTests  extends BaseTest{
    LoginPage loginPage = new LoginPage(driver, Duration.ofSeconds(10));
    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    CartPage cartPage = new CartPage(driver, Duration.ofSeconds(10));
    UserInfo userInfo = new UserInfo(driver, Duration.ofSeconds(10));

    @Test
    public void setActions() {
//        loginPage.loginAction();
        homePage.addToCartAction();
        cartPage.checkoutAction();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
        Assert.assertTrue(currentUrl.contains("checkout-step-one.html"));
    }

    @Test
    public void buyFLow() {
//        loginPage.loginAction();
        homePage.addToCartAction();
        cartPage.checkoutAction();
        userInfo.enteringUserInfo();
    }



}
