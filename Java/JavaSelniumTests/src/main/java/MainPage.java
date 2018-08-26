import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends BasePage {

    Actions a;
    private By searchField = By.cssSelector("#search_query_top");
    private By searchIcon = By.cssSelector(".btn.btn-default.button-search");
    private By productImage = By.cssSelector("#homefeatured .product-image-container");
    private By signInButton = By.cssSelector(".login");
    private By facebookIcon = By.cssSelector("#social_block .facebook");
    private String socialMediaIconFormat = "#social_block .%s";
    public MainPage(WebDriver driver) {
        super(driver);
        a = new Actions(driver);

    }

    public MainPage Search(){
        driver.findElement(searchField).sendKeys("sukienka");
        driver.findElement(searchIcon).click();
        return this;
    }

    public QuickViewPage OpenQuickView(){

        a.moveToElement(driver.findElement(productImage)).build().perform();
        driver.findElement(productImage).click();
        return new QuickViewPage(driver);
    }
    public AuthentificationPage ClickSignIn(){
        driver.findElement(signInButton).click();
        return new AuthentificationPage(driver);
    }
    public SocialMediaPage ClickFacebookIcon(){
        driver.findElement(facebookIcon).click();
        return new SocialMediaPage(driver);

    }
    public SocialMediaPage ClickSocialMediaIcon(String socialMediaName){
        String cssSelectorSocialMedia = String.format(socialMediaIconFormat, socialMediaName);
        driver.findElement(By.cssSelector(cssSelectorSocialMedia)).click();
        return new SocialMediaPage(driver);

    }

}
