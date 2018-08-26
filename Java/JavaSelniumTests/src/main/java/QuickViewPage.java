import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuickViewPage extends BasePage {


    private By addToCart = By.cssSelector("#add_to_cart>button");
    private By frameElement = By.cssSelector(".fancybox-iframe");
    public QuickViewPage(WebDriver driver) {

        super(driver);

    }

    public SuccessAddedPage VerifySuccessText(){

        return new SuccessAddedPage(driver);
    }


    public SuccessAddedPage AddToCart(){

        driver.switchTo().frame(driver.findElement(frameElement));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        driver.findElement(addToCart).click();
        return new SuccessAddedPage(driver);
    }
}
