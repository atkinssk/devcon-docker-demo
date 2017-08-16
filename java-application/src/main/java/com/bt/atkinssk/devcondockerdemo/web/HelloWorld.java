package com.bt.atkinssk.devcondockerdemo.web;

/**
 * Created by 802998369 on 16/08/2017.
 */
public class HelloWorld
{
    private final String id;
    private final String content;

    public HelloWorld(String id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public String getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}
