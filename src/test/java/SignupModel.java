import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.BeforeElement;
import org.graphwalker.java.annotation.AfterElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import base.IOSBaseTestClass;
import pages.ErrorPage;
import pages.WelcomePage;
import pages.SignupPage;
import pages.HomePage;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_WelcomePage")
public class SignupModel extends IOSBaseTestClass implements AccountCreationModel {

    private static final Logger logger = LoggerFactory.getLogger(SignupModel.class);

    @BeforeElement
    public void beforeElement() {
        logger.info("══════════════════════════════════════════════════════════════");
        logger.info("Executing: ");
    }

    @AfterElement
    public void afterElement() {
        logger.info("══════════════════════════════════════════════════════════════");
    }

    @Override
    public void v_WelcomePage() {
        logger.info("Verifying Welcome Page");
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.checkOnWelcomePage();
    }

    @Override
    public void v_CreateAccountPage() {
        logger.info("Verifying Create Account Page");
        SignupPage signupPage = new SignupPage(driver);
        signupPage.checkOnSignupPage();
    }

    @Override
    public void v_HomePage() {
        logger.info("Verifying Home Page");
        HomePage homePage = new HomePage(driver);
        homePage.checkOnHomePage();
    }

    @Override
    public void v_ErrorPage() {
        logger.info("Verifying Error Page");
        ErrorPage errorPage = new ErrorPage(driver);
        errorPage.checkOnErrorPage();
    }

    @Override
    public void e_ClickCreateAccount() {
        logger.info("Clicking Create Account button");
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickCreateAccount();
    }

    @Override
    public void e_EnterDetailsAndSubmit() {
        logger.info("Entering details and submitting");
        SignupPage signupPage = new SignupPage(driver);
        signupPage.enterUsername("testuser");
        signupPage.enterEmail("test@example.com");
        signupPage.enterPassword("1234567890");
        signupPage.clickCheckbox();
        signupPage.clickSignupButton();
    }

    @Override
    public void e_HandleError() {
        logger.info("Handling error");
        // ErrorPage errorPage = new ErrorPage(driver);
        // errorPage.clickTryAgain(); // veya başka bir işlem
    }


}