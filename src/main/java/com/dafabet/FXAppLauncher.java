package com.dafabet;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FXAppLauncher {
    public static org.slf4j.Logger LOG = LoggerFactory.getLogger(FXAppLauncher.class);

    public static void main(String[] args) {
        LOG.info("--- start ---");
        FXApp.main(args);
        LOG.info("--- end ---");
    }
}
