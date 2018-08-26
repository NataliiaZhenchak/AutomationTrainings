import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends BasePage {
    private By proceedToCheckoutButton = By.cssSelector("[name='processAddress']");
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public ShippingPage ProceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
        return  new ShippingPage(driver);
    }
}
