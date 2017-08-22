package com.bt.atkinssk.devcondockerdemo.service;

import com.bt.atkinssk.devcondockerdemo.domain.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by 802998369 on 16/08/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldServiceTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServiceTest.class);

    @Autowired
    HelloWorldService helloworldService;

    @Test
    public void shouldCallHelloWorld() throws Exception
    {
        HelloWorld result = helloworldService.helloWorld("steve");

        LOGGER.info("{}", result);

        assertThat(result.getContent(), is("Hello steve"));
    }
}