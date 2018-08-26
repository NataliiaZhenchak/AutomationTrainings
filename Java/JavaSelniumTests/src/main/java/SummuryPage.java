import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummuryPage extends  BasePage {

    private By addButton = By.cssSelector("[title='Add']");
    private By proceedToCheckoutButton = By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
    public SummuryPage(WebDriver driver) {
        super(driver);
    }
    public SummuryPage AddQty(){
        driver.findElement(addButton).click();
        return  this;
    }
    public AuthentificationPage ProceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
        return new AuthentificationPage(driver);
    }

}
