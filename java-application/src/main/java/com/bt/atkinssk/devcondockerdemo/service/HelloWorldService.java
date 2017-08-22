package com.bt.atkinssk.devcondockerdemo.service;

import com.bt.atkinssk.devcondockerdemo.domain.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * Created by 802998369 on 16/08/2017.
 */
@Service
public class HelloWorldService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldService.class);

    public HelloWorld helloWorld(String name)
    {
        LOGGER.info ("Service helloWorld {}", name);
        try
        {
            return new HelloWorld(UUID.randomUUID().toString(),
                                  "Hello " + name,
                                  InetAddress.getLocalHost().getHostName());
        }
        catch (UnknownHostException e)
        {
            LOGGER.error("Unable to determine hostname", e);
        }
        return new HelloWorld(UUID.randomUUID().toString(), "Hello " + name, null);
    }
}
