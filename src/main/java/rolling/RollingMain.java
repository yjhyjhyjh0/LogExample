package rolling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollingMain {
    private static final Logger log = LoggerFactory.getLogger(RollingMain.class);

    public static void main(String[] args) {
        RollingMain rollingMain = new RollingMain();
        rollingMain.testLogging();

    }

    private void testLogging() {
        log.info("hello rolling info");
        log.warn("hello rolling warn");
        log.debug("hello rolling debug");
    }
}
