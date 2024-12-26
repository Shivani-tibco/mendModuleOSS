import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {

    private static final Logger logger = LogManager.getLogger(MyClass.class);

    public void myMethod() {
        logger.info("This is an informational message.");
        logger.warn("This is a warning message.");
        // ...
    }
}