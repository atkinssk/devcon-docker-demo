package com.bt.atkinssk.devcondockerdemo.service;

import com.bt.atkinssk.devcondockerdemo.domain.HealthCheck;
import com.bt.atkinssk.devcondockerdemo.domain.HealthCheckStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static com.bt.atkinssk.devcondockerdemo.domain.HealthCheckStatus.HEALTHY;

/**
 * Created by 802998369 on 22/08/2017.
 */
@Service
public class HealthCheckService
{
    private static final Logger            LOGGER = LoggerFactory.getLogger(HealthCheckService.class);

    @Autowired
    private HostnameService hostnameService ;

    private HealthCheckStatus status = HEALTHY;

    public HealthCheck getStatus()
    {
        return new HealthCheck(status, hostnameService.lookupHostname());
    }

    public void setStatus(HealthCheckStatus status)
    {
        this.status = status;
    }
}
