package com.ond.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vdraj on 7/17/2016.
 */
@RestController
@EnableAutoConfiguration
public class OnDWebHomeController {

    protected final Logger LOGGER = Logger.getLogger(OnDWebHomeController.class);

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String printHello() {
        return "Jai Sri Ram!";
    }

}
