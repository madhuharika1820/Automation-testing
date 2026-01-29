package demolog4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo_log4j{

    private static final Logger logger = LogManager.getLogger(demo_log4j.class);

    public static void main(String[] args) {
    	
    	System.out.println("hello madhu");
        logger.info("Hello World!");
        logger.trace("Hello harika");
        logger.debug("debug mode");
        System.out.println("completed");
    }
}

