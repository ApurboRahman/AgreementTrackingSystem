package com.ats.BaseConfiguration.baseController;

import com.ats.helper.CurrentUser;
import com.ats.helper.CustomResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Apurbo on 11/12/2017.
 */
public class BaseController {
    protected CustomResponseMessage customResponseMessage;
    protected ApplicationContext applicationContext;

    public void setCustomResponseMessage(CustomResponseMessage customResponseMessage) {
        this.customResponseMessage = customResponseMessage;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    protected CurrentUser getCurrentUser(HttpServletRequest request) {
        CurrentUser currentUser = (CurrentUser) request.getSession().getAttribute("currentUser");
        return currentUser;
    }

}
