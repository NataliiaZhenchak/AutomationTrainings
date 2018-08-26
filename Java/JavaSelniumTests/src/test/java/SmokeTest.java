import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class SmokeTest extends BaseTest {


    WebElement slectedItem = driver.findElement(By.cssSelector(("ul.product_list.grid.row h5 a[href*='id_product=5']")));
    WebElement addToCart = driver.findElement(By.cssSelector(("#add_to_cart")));

    @Test
    public void openPageTest() {

        Assert.assertEquals("Wrong page title",
                "My Store", driver.getTitle());
    }

    @Test
    public void search() {
    MainPage mainPage = new MainPage(driver);
        mainPage.Search();

    }

    @Test
    public void listOfElments() {

        List<WebElement> listOfElements = driver.findElements(By.cssSelector("ul[class='product_list grid row homefeatured tab-pane active'] .ajax_block_product"));
        int numOfElements = listOfElements.size();
        Assert.assertTrue("Incorrect number", numOfElements == 7);

        boolean x = false;
        for (WebElement el : listOfElements
        ) {
            if (el.findElement(By.cssSelector("a.product-name")).getText().toLowerCase().contains("dress")) {
                x = true;
                break;
            }
            Assert.assertTrue(x);
        }
    }

//    @Test
//    public void implicitWait()
//    {
//        searchField.sendKeys("Printed Dress");
//        searchIcon.click();
//        slectedItem.click();
//        addToCart.click();
//        WebElement successContainer = driver.findElement(By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6'] h2"));
//        String text = successContainer.getText();
//
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        String text = wait.until(ExpectedConditions.textToBePresentInElementValue());
//
//        Assert.assertEquals("Not equals", "Product successfully added to your shopping cart", text);
//
//        //driver.close();
//
//    }


}
