package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver, Duration wait) {
        super(driver, wait);
    }

    private By checkoutBtn = By.id("checkout");

    public void checkoutAction() {
        click(checkoutBtn);
    }
}
