package com.densoft.springjekins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringJenkinsApplicationTests {

    static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second log statement...");
        assertTrue(true);
    }

}
