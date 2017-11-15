package com.ats.controller.ats;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/12/2017.
 */
@RequestMapping(value = "/")
public class ContractProposal {
    @RequestMapping(value = "/contractProposal", method = RequestMethod.GET)
    public String index() {
        return "contractProposal";
    }
}
