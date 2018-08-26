import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AuthentificationPage extends BasePage{

    private By emailField = By.cssSelector("#email");
    private By passwordField = By.cssSelector("#passwd");
    private By signInButton = By.cssSelector("#SubmitLogin");
    public AuthentificationPage(WebDriver driver) {
        super(driver);
    }

    public AuthentificationPage EnterEmail(){
        driver.findElement(emailField).sendKeys("zzz@z.com");
        return  this;
    }
    public  AuthentificationPage EnetTab(){
        driver.findElement(emailField).sendKeys(Keys.TAB);
        return  this;
    }
    public AuthentificationPage VerifyPasswordFieldIsActive(){
        Assert.assertTrue("Password not active", driver.findElement(passwordField).isEnabled());
        return  this;
    }
    public AddressPage SignIn (){
        driver.findElement(emailField).sendKeys("zzz@z.com");
        driver.findElement(passwordField).sendKeys("zzzzz");
        driver.findElement(signInButton).click();
        return new AddressPage(driver);
    }
}
