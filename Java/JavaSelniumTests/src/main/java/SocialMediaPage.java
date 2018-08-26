import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SocialMediaPage extends BasePage {
    public SocialMediaPage(WebDriver driver) {
        super(driver);
    }
    public SocialMediaPage CheckPageTitle(String titleText){
        String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle  : handles)
        {
            if(!windowHandle.equals(parentWindow))
            {
                driver.switchTo().window(windowHandle);
            }
        }
        String pageTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains(titleText));
        return  new SocialMediaPage(driver);
    }
}
