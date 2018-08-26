import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessAddedPage extends BasePage {

    private By successText = By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6'] h2");
    private By proceedToCheckoutButton = By.cssSelector(".btn.btn-default.button.button-medium");
    public SuccessAddedPage(WebDriver driver) {
        super(driver);
    }

    public SuccessAddedPage VerifySuccessText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successText));
        String getSuccessText = driver.findElement(successText).getText();
        Assert.assertEquals("Not equals", "Product successfully added to your shopping cart", getSuccessText);
        return this;
    }
    public SummuryPage ProceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
        return new SummuryPage(driver);
    }
}
