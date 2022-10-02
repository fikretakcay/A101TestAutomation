package page;

import base.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage extends BasePage {

    private static final String PRODUCT_TITLE = "Doremi Kadın Desenli Dizaltı Çorap Fit15 Denye Siyah";

    //By popUpLocator = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    By clothesAndAccessory = By.xpath("//a[@data-value='1555']");
    By womanUnderwear = By.xpath("//a[@data-value='1565']");
    By sock = By.xpath("//a[@data-value='1567']");
    By findBlackSock = By.xpath("//img[@data-src='https://ayb.akinoncdn.com/products/2020/11/11/54870/d8dbaefe-f64e-45a0-b6d7-e483e4aaf225_size250x250_quality100_cropCenter.jpg']");
    By titleCheckLocator = By.xpath("(//div/span)[12]");
    /*@FindBy(xpath = "//a[@data-value='1555']")
    private WebElement clothesAndAccessory;
    @FindBy(xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a")
    private WebElement socks;
    @FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    private WebElement blackSockCheckBox;
    @FindBy(xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div/div/ul/li[1]/article/div/div[2]/div[2]/a/strong/span")
    private WebElement addToCart;*/

    final static Logger LOG = Logger.getLogger(SearchPage.class);

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public void findProduct()  {

        //click(popUpLocator);
        //Thread.sleep(2500);
        waitUntilElementVisible(clothesAndAccessory);
        click(clothesAndAccessory);
        waitUntilElementVisible(womanUnderwear);
        click(womanUnderwear);
        waitUntilElementVisible(sock);
        click(sock);
        //Thread.sleep(4000);
        waitUntilElementVisible(findBlackSock);
        click(findBlackSock);

    }
    public void isOnFindProduct(){
        if(isDisplayed(titleCheckLocator)){
            LOG.info("Title is correct");
        }else {
            LOG.error("Title is not correct");
        }
        //return isDisplayed(titleCheckLocator);
    }
//    public void productCorrect(){
//        try{
//            String selectedProductTitle = driver.findElement(By.xpath("//h1[@class='product-name js-name']")).getText();
//            if(PRODUCT_TITLE.equals(selectedProductTitle)){
//                LOG.info("Title is true.");
//            }else {
//                Assert.fail();
//                LOG.error("Title is not true!!");
//            }
//        }catch (Exception e){
//            Assert.fail();
//            LOG.error("Product is not true!!");
//        }
//    }
}
