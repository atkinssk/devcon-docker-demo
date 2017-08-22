package com.bt.atkinssk.devcondockerdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 802998369 on 16/08/2017.
 */
@RestController
public class ExitController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ExitController.class);

    @RequestMapping(value = "/exit", method = RequestMethod.GET)
    public @ResponseBody String exit()
    {
        LOGGER.info("Controller Exit");
        System.exit(1);
        return "exit";
    }


}
