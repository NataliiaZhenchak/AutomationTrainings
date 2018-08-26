import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage extends BasePage {

    private By termsCheckBox = By.cssSelector("#cgv");
    private By proceedToCheckoutButton = By.cssSelector("[name='processCarrier']");
    public ShippingPage(WebDriver driver) {
        super(driver);
    }
    public ShippingPage AgreeTermsOfService(){
        driver.findElement(termsCheckBox).click();
        return  this;
    }
    public PaymentPage ProceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
        return  new PaymentPage(driver);
    }
}
