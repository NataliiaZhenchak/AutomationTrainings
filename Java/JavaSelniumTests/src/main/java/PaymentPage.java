import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    private By payByBankWire = By.cssSelector(".bankwire");
    private By confirmOrderButton = By.cssSelector("form .button.btn.btn-default.button-medium");
    private By confirmationMessage = By.cssSelector(".cheque-indent .dark");
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    public PaymentPage SelectPayement(){
        driver.findElement(payByBankWire).click();
        return this;
    }
    public PaymentPage ConfirmOrder(){
        driver.findElement(confirmOrderButton).click();
        return this;
    }
    public  PaymentPage VerifyOrderConfirmation(){
        String confirmationtext = driver.findElement(confirmationMessage).getText();
        Assert.assertEquals("Incorrect message", "Your order on My Store is complete.", confirmationtext);
        return this;
    }
}
