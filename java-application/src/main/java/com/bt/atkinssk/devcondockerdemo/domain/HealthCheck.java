package com.bt.atkinssk.devcondockerdemo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by 802998369 on 22/08/2017.
 */
public class HealthCheck
{
    private final HealthCheckStatus status;
    private final String hostname;

    public HealthCheck(HealthCheckStatus status, String hostname)
    {
        this.status = status;
        this.hostname = hostname;
    }

    public HealthCheckStatus getStatus()
    {
        return status;
    }

    public String getHostname()
    {
        return hostname;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("status", status)
                .append("hostname", hostname)
                .toString();
    }
}
