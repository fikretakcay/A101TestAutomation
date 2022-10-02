package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class CardInformationDetails extends BasePage {

    By phonePay = By.xpath("//div[@class='payment-tab payment-tab-gpay js-payment-tab ']");
    By acceptPreConditions = By.xpath("(//input[@type='checkbox'])[5]");
    By goToPaymentScreenButton = By.xpath("//a[@class='button green js-gpay-payment']");
    By checkPaymentScreenTitle = By.xpath("//span[@class='d-none d-md-inline mr-lg-3 cursor-pointer js-show-popover']");
    final static Logger LOG = Logger.getLogger(String.valueOf(BasePage.class));

    public CardInformationDetails(WebDriver driver) {
        super(driver);
    }
    public void cardInformationPage() throws InterruptedException {
        Thread.sleep(2000);
        click(phonePay);
        waitUntilElementVisible(acceptPreConditions);
        click(acceptPreConditions);
        waitUntilElementVisible(goToPaymentScreenButton);
        click(goToPaymentScreenButton);
    }
    public boolean paymentScreenCheck(){
        return isDisplayed(checkPaymentScreenTitle);

    }
}
