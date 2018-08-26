import org.junit.Test;

public class Test1 extends BaseTest {
    @Test

    public void AddProductToCart() throws InterruptedException {

        mainPage.OpenQuickView().AddToCart().VerifySuccessText();

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void VerifyActiveField() throws InterruptedException {

        mainPage.ClickSignIn().EnterEmail().EnetTab().VerifyPasswordFieldIsActive();

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void SocialMediaFacebook() throws InterruptedException {

        mainPage.ClickSocialMediaIcon("facebook").CheckPageTitle("facebook");

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void SocialMediaTwitter() throws InterruptedException {

        mainPage.ClickSocialMediaIcon("twitter").CheckPageTitle("twitter");

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void SocialMediaYouTube() throws InterruptedException {

        mainPage.ClickSocialMediaIcon("youtube").CheckPageTitle("youtube");

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void SocialMediaGoogle() throws InterruptedException {

        mainPage.ClickSocialMediaIcon("google-plus").CheckPageTitle("google");

        Thread.sleep(3000); //only for own test purposes

    }
    @Test

    public void BuyProduct() throws InterruptedException {

        mainPage
                .OpenQuickView()
                .AddToCart()
                .VerifySuccessText()
                .ProceedToCheckout()
                .AddQty()
                .ProceedToCheckout()
                .SignIn()
                .ProceedToCheckout()
                .AgreeTermsOfService()
                .ProceedToCheckout()
                .SelectPayement()
                .ConfirmOrder()
                .VerifyOrderConfirmation();

        Thread.sleep(3000);//only for own test purposes

    }

}
