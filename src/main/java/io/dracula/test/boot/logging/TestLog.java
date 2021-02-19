package io.dracula.test.boot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestLog {

    private static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    @Scheduled(cron = "*/2 * * * * *")
    public void loopPrinting(){
        System.out.println("将要打日志");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

}
