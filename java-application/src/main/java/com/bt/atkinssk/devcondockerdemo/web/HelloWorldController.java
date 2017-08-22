package com.bt.atkinssk.devcondockerdemo.web;

import com.bt.atkinssk.devcondockerdemo.domain.HelloWorld;
import com.bt.atkinssk.devcondockerdemo.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 802998369 on 16/08/2017.
 */
@Controller
public class HelloWorldController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model)
    {
        LOGGER.info("Controller Index");
        return "index";
    }

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public @ResponseBody
    HelloWorld helloWorld(@RequestParam(value="name", required=false, defaultValue="Stranger") String name)
    {
        LOGGER.info("Controller helloworld");
        return helloWorldService.helloWorld(name);
    }

}
