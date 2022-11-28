package com.densoft.springjekins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

    static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Application started...");
    }

    public static void main(String[] args) {
        logger.info("Application executed ...");
        logger.info("Application executed two ...");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
