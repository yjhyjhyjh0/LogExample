import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLFMain {
    private static final Logger log = LoggerFactory.getLogger(SLFMain.class);

    public static void main(String[] args) {
        SLFMain slfMain = new SLFMain();
        slfMain.testLogging();
    }

    private void testLogging() {
        log.info("hello slf info");
        log.debug("hello slf debug");
    }
}
