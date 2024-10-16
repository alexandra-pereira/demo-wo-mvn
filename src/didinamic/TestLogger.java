package didinamic;

import org.slf4j.LoggerFactory;
import java.util.logging.Logger;

public class TestLogger {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(TestLogger.class);
    public static void main(String[] args) {
        LOGGER.info("Bonjour slf4j");
        LOGGER.info("Implémentation Logback");
    }
}
