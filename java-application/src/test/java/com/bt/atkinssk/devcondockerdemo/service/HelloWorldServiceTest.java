package com.bt.atkinssk.devcondockerdemo.service;

import com.bt.atkinssk.devcondockerdemo.domain.HelloWorld;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by 802998369 on 16/08/2017.
 */
public class HelloWorldServiceTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServiceTest.class);

    @Test
    public void shouldCallHelloWorld() throws Exception
    {
        HelloWorld result = new HelloWorldService().helloWorld("steve");

        LOGGER.info("{}", result);

        assertThat(result.getContent(), is("Hello steve"));
    }
}