package com.ats.helper;

import com.ats.approval.ApprovalPopupDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.*;

/**
 * Created by md.rahman on 11/18/2017.
 */
public class CustomResponseMessage {

    private Integer status;
    private Map<String, List<String>> hasMap;

    private ApprovalPopupDTO approvalPopupDTO;
    private Object DTO;

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

    public Object getDTO() {
        return DTO;
    }

    public void setDTO(Object DTO) {
        this.DTO = DTO;
    }


    public void addMessageCode(String messageCode) {
        if (this.hasMap == null)
            this.hasMap = new HashMap<String, List<String>>();

        this.hasMap.put(messageCode, null);
    }

    public void addMessageCode(String messageCode, String... arguments) {
        if (this.hasMap == null)
            this.hasMap = new HashMap<String, List<String>>();
        List<String> args = new ArrayList<String>();
        for (String arg : arguments)
            args.add(arg);
        this.hasMap.put(messageCode, args);
    }

    public void addMessageCode(Map<String, List<String>> messageCodes) {
        if (this.hasMap == null)
            this.hasMap = new HashMap<String, List<String>>();

        this.hasMap.putAll(messageCodes);
    }

    public void removeMessageCode(String messageCode) {
        if (this.hasMap != null && !this.hasMap.isEmpty())
            this.hasMap.remove(messageCode);
    }

    public String getMessageKey() {
        StringBuilder messageKey = new StringBuilder();
        Map<String, List<String>> errorMessageCodes = getHasMap();
        for (Map.Entry<String, List<String>> entry : errorMessageCodes.entrySet()) {
            String key = entry.getKey();
            messageKey.append(key.toString());
        }
        return messageKey.toString();
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

    public void Reset() {
        if (hasMap != null)
            hasMap.clear();
    }

    public boolean isMessageCodeExists(String messageCode) {
        if (this.hasMap == null)
            return false;
        return this.hasMap.containsKey(messageCode);
    }

    public boolean isMessageEmpty() {
        if (this.hasMap == null)
            return true;
        return this.hasMap.isEmpty();
    }

    public void addErrorMessage(String messageCode) {
        this.status = 0;
        if (this.hasMap == null) {
            this.hasMap = new HashMap<String, List<String>>();
        }
    }

    public void addSuccessCode() {
        this.status = 1;
    }

    public void addSuccessMessage(Object dto) {
        this.status = 1;
        this.setDTO(dto);
    }

    public void addSuccessMessage(String messageCode) {
        this.status = 1;
        if (this.hasMap == null) {
            this.hasMap = new HashMap<String, List<String>>();
        }
        this.hasMap.put(messageCode, null);
    }

    public void addSuccessMessage(String messageCode, Object dto) {
        this.status = 1;
        if (this.hasMap == null) {
            this.hasMap = new HashMap<String, List<String>>();
        }
        this.hasMap.put(messageCode, null);
        this.setDTO(dto);
    }

    public void addMessages(BindingResult result) {
        for (ObjectError error : result.getAllErrors()) {
            String messageCode = error.getDefaultMessage();
            if (messageCode == null || messageCode.isEmpty()) {
                messageCode = error.getCode();
            }
            if (messageCode != null || !messageCode.isEmpty()) {
                addErrorMessage(messageCode);
            }
        }


    }
}
