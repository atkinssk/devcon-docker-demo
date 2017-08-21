package com.bt.atkinssk.devcondockerdemo.web;

/**
 * Created by 802998369 on 16/08/2017.
 */
public class HelloWorld
{
    private final String id;
    private final String content;
    private final String hostname;

    public HelloWorld(String id, String content, String hostname)
    {
        this.id = id;
        this.content = content;
        this.hostname = hostname;
    }

    public String getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }

    public String getHostname()
    {
        return hostname;
    }

    @Override
    public String toString()
    {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("content", content)
                .append("hostname", hostname)
                .toString();
    }
}
