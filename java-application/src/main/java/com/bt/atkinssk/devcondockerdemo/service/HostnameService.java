package com.bt.atkinssk.devcondockerdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by 802998369 on 22/08/2017.
 */
@Service
public class HostnameService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckService.class);
    public  String lookupHostname()
    {
        String hostname = null;
        try
        {
            hostname = InetAddress.getLocalHost().getHostName();
        }
        catch (UnknownHostException e)
        {
            LOGGER.error("Unable to determine hostname", e);
        }
        return hostname;
    }

}
