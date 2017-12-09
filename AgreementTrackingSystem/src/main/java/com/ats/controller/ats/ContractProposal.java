package com.ats.controller.ats;

import com.ats.helper.DropdownDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Apurbo on 11/12/2017.
 */
@RequestMapping(value = "/contractProposal")
public class ContractProposal {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "contractProposal";


    }

    @ResponseBody
    @RequestMapping(value = "/getSomething", method = RequestMethod.GET)
    public String getSomething(HttpServletRequest request, HttpServletResponse response) {
        return "contractProposal";


    }


}
