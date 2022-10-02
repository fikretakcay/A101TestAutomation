package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

public class AddressPage extends BasePage {
    By newAddress = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
    By addressTitle = By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']");
    By userName = By.xpath("//input[@name='first_name']");
    By userSurname = By.xpath("//input[@name='last_name']");
    By phoneNumber = By.xpath("//input[@name='phone_number']");
    By chooseCity = By.xpath("//option[@value='40']");
    By chooseArea = By.xpath("//option[@value='450']");
    By chooseSpecialArea = By.xpath("//option[@value='35444']");
    By fullAddress = By.xpath("//textarea[@class='js-address-textarea']");
    //By postCode = By.xpath("//input[@class='js-post-code']");
    By saveButton = By.xpath("//button[@class='button green js-set-country js-prevent-emoji']");
    By goToPaymentScreen = By.xpath("//button[@class='button block green js-proceed-button']");

    final static Logger LOG = Logger.getLogger(String.valueOf(BasePage.class));
    public AddressPage(WebDriver driver) {
        super(driver);
    }
    public void infoNewAddress() throws InterruptedException {
        Thread.sleep(2500);
        waitUntilElementVisible(newAddress);
        click(newAddress);
        waitUntilElementVisible(addressTitle);
        click(addressTitle);
        type(addressTitle,"Ev Adresi");
        type(userName,"Fikret");
        type(userSurname,"Akçay");
        waitUntilElementVisible(phoneNumber);
        click(phoneNumber);
        type(phoneNumber,"5349296315");
        click(chooseCity);
        waitUntilElementVisible(chooseArea);
        click(chooseArea);
        waitUntilElementVisible(chooseSpecialArea);
        click(chooseSpecialArea);
        waitUntilElementVisible(fullAddress);
        type(fullAddress,"Yeni Camlıca Mahallesi Şafak Sokak No:37/3 ");
        waitUntilElementVisible(saveButton);
        click(saveButton);
        Thread.sleep(2500);
        waitUntilElementVisible(goToPaymentScreen);
        click(goToPaymentScreen);

    }


}
