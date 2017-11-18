package com.ats.helper;

import com.ats.approval.ApprovalPopupDTO;
import org.springframework.context.ApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by md.rahman on 11/18/2017.
 */
public class CustomResponseMessage {

    private Integer status;
    private Map<String, List<String>> hasMap;

    private ApprovalPopupDTO approvalPopupDTO;
    private Objects DTO;

    private String cmdFlag;
    private String screenId;
    private String userId;
    private Date systemOpenDate;
    private String requestId;
    private String value;

    public String getCmdFlag() {
        return cmdFlag;
    }

    public void setCmdFlag(String cmdFlag) {
        this.cmdFlag = cmdFlag;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getSystemOpenDate() {
        return systemOpenDate;
    }

    public void setSystemOpenDate(Date systemOpenDate) {
        this.systemOpenDate = systemOpenDate;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getStatus() {
        if (status == null) {
            status = -1;
        }
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ApprovalPopupDTO getApprovalPopupDTO() {
        return approvalPopupDTO;
    }

    public void setApprovalPopupDTO(ApprovalPopupDTO approvalPopupDTO) {
        this.approvalPopupDTO = approvalPopupDTO;
    }

    public Map<String, List<String>> getHasMap() {
        return hasMap;
    }

    public void setHasMap(Map<String, List<String>> hasMap) {
        this.hasMap = hasMap;
    }

    public Objects getDTO() {
        return DTO;
    }

    public void setDTO(Objects DTO) {
        this.DTO = DTO;
    }

    public ResponseMessage toResponseMessage(ApplicationContext context) {
        ResponseMessage responseMessage = new ResponseMessage();
        if (this.DTO != null) {
            responseMessage.setDTO(getDTO());
        }
        responseMessage.setStatus(this.getStatus());
        responseMessage.setCmdFlag(this.getCmdFlag());
        responseMessage.setScreenId(this.getScreenId());
        responseMessage.setUserId(this.getUserId());
        responseMessage.setSystemOpenDate(this.getSystemOpenDate());
        responseMessage.setValue(this.getValue());

        StringBuilder message = new StringBuilder();
        Map<String, List<String>> errorMsgCOdes = getHasMap();
        if (errorMsgCOdes != null) {

        }
        return responseMessage;
    }
}
