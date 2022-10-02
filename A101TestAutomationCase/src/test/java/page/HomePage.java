package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


        By popUpLocator = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        By homePageCheckLocator = By.xpath("//div/h1");
        public HomePage(WebDriver driver) {
                super(driver);
        }
        public void popUpAccept(){
            click(popUpLocator);
        }
    public boolean isOnPopUp() {
            return isDisplayed(homePageCheckLocator);
    }
}
