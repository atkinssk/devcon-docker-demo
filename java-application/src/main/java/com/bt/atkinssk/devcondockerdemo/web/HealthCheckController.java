package com.bt.atkinssk.devcondockerdemo.web;

import com.bt.atkinssk.devcondockerdemo.domain.HealthCheck;
import com.bt.atkinssk.devcondockerdemo.domain.HealthCheckStatus;
import com.bt.atkinssk.devcondockerdemo.service.HealthCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 802998369 on 16/08/2017.
 */
@RestController
public class HealthCheckController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

    @Autowired
    HealthCheckService healthCheckService;

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public HealthCheck healthcheck()
    {
        LOGGER.info("Get current healthcheck status");
        HealthCheck status = healthCheckService.getStatus();
        LOGGER.info("Current healthcheck status {}", status);
        return status;
    }

    @RequestMapping(value = "/healthcheck/{newStatus}", method = RequestMethod.GET)
    public HealthCheck status(@PathVariable("newStatus") HealthCheckStatus newStatus)
    {
        LOGGER.info("Set Healthcheck status to {}", newStatus);
        healthCheckService.setStatus(newStatus);
        HealthCheck status = healthCheckService.getStatus();
        LOGGER.info("Current healthcheck status {}", status);
        return status;
    }


}
