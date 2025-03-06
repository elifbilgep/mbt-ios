
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.BeforeElement;
import org.graphwalker.java.annotation.AfterElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_WelcomePage")
public class SimplifiedSignupModel implements AccountCreationModel {

    private static final Logger logger = LoggerFactory.getLogger(SimplifiedSignupModel.class);

    @BeforeElement
    public void beforeElement() {
        logger.info("Starting element");
    }

    @AfterElement
    public void afterElement() {
        logger.info("Completed element");
    }

    @Override
    public void v_WelcomePage() {
        logger.info("At Welcome Page");
    }

    @Override
    public void v_CreateAccountPage() {
        logger.info("At Create Account Page");
    }

    @Override
    public void v_HomePage() {
        logger.info("At Home Page");
    }

    @Override
    public void v_ErrorPage() {
        logger.info("At Error Page");
    }

    @Override
    public void e_ClickCreateAccount() {
        logger.info("Clicking Create Account");
    }

    @Override
    public void e_EnterDetailsAndSubmit() {
        logger.info("Entering details and submitting");
    }

    @Override
    public void e_HandleError() {
        logger.info("Handling error");
    }
}