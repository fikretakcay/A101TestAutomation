package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

public class BasketPage extends BasePage {
    By addToCart = By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    By viewCartButton = By.xpath("//a[@class='go-to-shop']");
    By confirmCartButton = By.xpath("//a[@class='button green checkout-button block js-checkout-button']");

    final static Logger LOG = Logger.getLogger(BasketPage.class);

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void cartPage() {
        waitUntilElementVisible(addToCart);
        click(addToCart);
    }

    public void viewCart() throws InterruptedException {
        Thread.sleep(2000);
        waitUntilElementVisible(viewCartButton);
        click(viewCartButton);
    }

    public void confirmCart() {
        click(confirmCartButton);

    }


}
