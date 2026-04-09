package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, Duration wait) {
        super(driver, wait);
    }

    private By addToCartBtn = By.name("add-to-cart-sauce-labs-backpack");
    private By shopingCartIcon = By.id("shopping_cart_container");
    private By exampleLocator = By.id("STEFAN");

    public void addToCartAction() {
        click(addToCartBtn);
        click(shopingCartIcon);
    }

}
