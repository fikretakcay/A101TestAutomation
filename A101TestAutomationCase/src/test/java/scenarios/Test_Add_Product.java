package scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Order;

import page.*;

import org.apache.log4j.Logger;

public class Test_Add_Product extends BaseTest {

    final static Logger LOG = Logger.getLogger(Test_Add_Product.class);



    HomePage homePage;
    SearchPage searchPage;
    BasketPage basketPage;
    WithoutMemberClass withoutMemberClass;
    AddressPage addressPage;
    CardInformationDetails cardInformationDetails;

    @Test
    @Order(1)
    public void popUpClickCheck(){
        homePage = new HomePage(driver);
        homePage.popUpAccept();
        LOG.info("Pop up is accepted");
        Assertions.assertTrue(homePage.isOnPopUp(),"Pop up is accepted.");
        System.out.println("Çerezler kabul edildi.");

    }
    @Test
    @Order(2)
    public void findProduct(){
        searchPage = new SearchPage(driver);
        searchPage.findProduct();
        LOG.info("Product is found");
        System.out.println("ürün bulundu.");

    }
    @Test
    @Order(3)
    public void isOnFindProduct(){
        searchPage.isOnFindProduct();
        LOG.info("Product kind is true!");
        System.out.println("Çorap türü Siyah olduğu doğrulandı.");
    }
    @Test
    @Order(4)
    public void cartPage(){
        basketPage = new BasketPage(driver);
        basketPage.cartPage();
        System.out.println("ürün sepete eklendi.");
    }
    @Test
    @Order(5)
    public void viewCart() throws InterruptedException {
        basketPage.viewCart();
        LOG.info("Basket screen is show.");
        System.out.println("Sepet ekranına yönledirildi.");

    }
    @Test
    @Order(6)
    public void confirmCart(){
        basketPage.confirmCart();
        LOG.info("Basket is confirm.");
        System.out.println("Sepet doğrulandı.");
    }

    @Test
    @Order(7)
    public void withoutMember() throws InterruptedException {
        withoutMemberClass = new WithoutMemberClass(driver);
        withoutMemberClass.withoutMember();
        LOG.info("Uye olmadan devam ediliyor...");
        System.out.println("üye olmadan devam ediliyor...");
    }
    @Test
    @Order(8)
    public void fillGuestMail() throws InterruptedException {
        withoutMemberClass.fillGuestEmail();
        withoutMemberClass.keepGoingToAddressButton();
        LOG.info(withoutMemberClass.generateUserMail());
        System.out.println("E-mail girildi.");
    }
    @Test
    @Order(9)
    public void infoAddress() throws InterruptedException {
        addressPage = new AddressPage(driver);
        addressPage.infoNewAddress();
        LOG.info("Adresler tanımlandı.");
        System.out.println("Adres girildi.");
    }
    @Test
    @Order(10)
    public void cardInformationPage() throws InterruptedException {
        cardInformationDetails = new CardInformationDetails(driver);
        cardInformationDetails.cardInformationPage();
        LOG.info("Kart bilgileri girildi.");
        System.out.println("Ödeme sayfasına yönlendirildi.");
    }
    @Test
    @Order(11)
    public void checkPaymentScreen(){
        cardInformationDetails.paymentScreenCheck();
        LOG.info("Ödeme sayfası görüntülendi");
        System.out.println("Ödeme sayfası kontrol edildi.");
    }
}
