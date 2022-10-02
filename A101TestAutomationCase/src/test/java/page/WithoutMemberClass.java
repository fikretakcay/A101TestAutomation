package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;
import org.apache.log4j.Logger;

public class WithoutMemberClass extends BasePage {

    By continueWithoutMember = By.xpath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']");
    By writeUserMail = By.xpath("//input[@name='user_email']");
    By keepGoingSubmitButton = By.xpath("//button[@class='button block green']");
    final public Logger LOG = Logger.getLogger(WithoutMemberClass.class);

    public WithoutMemberClass(WebDriver driver) {
        super(driver);
    }

    public void withoutMember() throws InterruptedException {
        waitUntilElementVisible(continueWithoutMember);
        click(continueWithoutMember);
        Thread.sleep(2000);

    }

    public String generateUserMail() {
        String SALTCHARS = " abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr + "@gmail.com";
    }

    public void fillGuestEmail() throws InterruptedException {
        waitUntilElementVisible(writeUserMail);
        click(writeUserMail);
        type(writeUserMail, generateUserMail());
        Thread.sleep(1000);

    }

    public void keepGoingToAddressButton() {
        waitUntilElementVisible(keepGoingSubmitButton);
        click(keepGoingSubmitButton);
    }
}
