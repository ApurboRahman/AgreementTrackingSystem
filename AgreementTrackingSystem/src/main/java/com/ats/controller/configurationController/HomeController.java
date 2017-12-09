package com.ats.controller.configurationController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/11/2017.
 */

@RequestMapping(value = "")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/getSomething", method = RequestMethod.POST)
    public String contractProposal() {
        return "getSomething";
    }
}
