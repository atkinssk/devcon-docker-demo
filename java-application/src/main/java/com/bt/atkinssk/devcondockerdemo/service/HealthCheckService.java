package com.bt.atkinssk.devcondockerdemo.service;

import com.bt.atkinssk.devcondockerdemo.domain.HealthCheckStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import static com.bt.atkinssk.devcondockerdemo.domain.HealthCheckStatus.HEALTHY;

/**
 * Created by 802998369 on 22/08/2017.
 */
@Service
public class HealthCheckService
{
    private HealthCheckStatus status = HEALTHY;

    public HealthCheckStatus getStatus()
    {
        return status;
    }

    public void setStatus(HealthCheckStatus status)
    {
        this.status = status;
    }
}
