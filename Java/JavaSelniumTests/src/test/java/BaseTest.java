import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    MainPage mainPage;
    @Before
    public void BeforeTest(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com");
        mainPage = new MainPage(driver);
    }
    @After
    public void AfterTest(){
        driver.quit();
    }
}
