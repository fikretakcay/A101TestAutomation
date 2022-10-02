package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    private long timeOutInSeconds=30L;
    final static Logger LOG = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver lDriver){
        this.driver = lDriver;
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    /*public void findScrollElementCenter(By locator) {
        try {
            LOG.debug(locator + " Being drafted...");
            String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                    + "var elementTop = arguments[0].getBoundingClientRect().top;"
                    + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
            ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, locator);
            LOG.debug(locator + " Being drafted...");
        }catch (Exception e){
            LOG.error(locator+"An error occurred while drafting..." );
            Assert.fail(locator + " An error occurred while drafting...");
        }
    }*/
    public void waitUntilElementVisible(By locator){
        try {
            FluentWait<WebDriver> wait = (new WebDriverWait(driver, Duration.ofSeconds(this.timeOutInSeconds))).pollingEvery(Duration.ofSeconds(5L)).withTimeout(Duration.ofSeconds(this.timeOutInSeconds)).ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            LOG.info(locator.toString()+"seen on Screen.");
        }catch(Throwable var3){
            LOG.error("Element:"+locator +"WebElement is not visible !!");
        }
    }



}

