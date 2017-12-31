package com.ats.controller.ats;

import com.ats.BaseConfiguration.baseController.BaseController;
import com.ats.helper.CurrentUser;
import com.ats.helper.CustomResponseMessage;
import com.ats.helper.DropdownDTO;
import com.ats.helper.ResponseMessage;
import org.springframework.context.ApplicationContext;
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
public class ContractProposal extends BaseController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "contractProposal";


    }

    @ResponseBody
    @RequestMapping(value = "/getSomething", method = RequestMethod.GET)
    public ResponseMessage getSomething(HttpServletRequest request, HttpServletResponse response, String testData) {
        // return "contractProposal";
        return customResponseMessage.toResponseMessage(applicationContext);


    }

/*    @ResponseBody
    @RequestMapping(value = "/getSomething", method = RequestMethod.GET)
    public String getSomething(HttpServletRequest request, HttpServletResponse response,String testData) {
        return "contractProposal";


    }*/

    @ResponseBody
    @RequestMapping(value = "/getNewLink", method = RequestMethod.GET)
    public ResponseMessage getNewLink(HttpServletRequest request, HttpServletResponse response) {
        customResponseMessage.addMessageCode("this is message");
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseMessage save(HttpServletRequest request, HttpServletResponse response) {
        CurrentUser currentUser = getCurrentUser(request);
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }
}
