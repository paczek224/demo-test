import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

@Test
public class BaseTest {


    @BeforeClass
    protected void startingBaseTestClass() {
        logInfoMessage("Starting test class");
    }

    @BeforeMethod
    protected void startingTestMethod(Method method) {
        logInfoMessage("Starting " + method.getName());
    }

    private void logInfoMessage(String logText) {
        Logger logger = Logger.getLogger(this.getClass().getName());
        logger.log(Level.INFO, logText);
    }
}
