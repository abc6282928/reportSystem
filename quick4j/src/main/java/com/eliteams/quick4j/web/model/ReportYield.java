package com.eliteams.quick4j.web.model;

import java.util.Date;

public class ReportYield {
    private Long id;

    private String messageId;

    private String operation;

    private Integer operationFinishNo;

    private Integer confirmCount;

    private String productOrderId;

    private String processDescribe;

    private Integer currentYield;

    private Integer currentWaste;

    private Date manufactureDate;

    private String classes;

    private Date accountDate;

    private String messageType;

    private String message;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Integer getOperationFinishNo() {
        return operationFinishNo;
    }

    public void setOperationFinishNo(Integer operationFinishNo) {
        this.operationFinishNo = operationFinishNo;
    }

    public Integer getConfirmCount() {
        return confirmCount;
    }

    public void setConfirmCount(Integer confirmCount) {
        this.confirmCount = confirmCount;
    }

    public String getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(String productOrderId) {
        this.productOrderId = productOrderId == null ? null : productOrderId.trim();
    }

    public String getProcessDescribe() {
        return processDescribe;
    }

    public void setProcessDescribe(String processDescribe) {
        this.processDescribe = processDescribe == null ? null : processDescribe.trim();
    }

    public Integer getCurrentYield() {
        return currentYield;
    }

    public void setCurrentYield(Integer currentYield) {
        this.currentYield = currentYield;
    }

    public Integer getCurrentWaste() {
        return currentWaste;
    }

    public void setCurrentWaste(Integer currentWaste) {
        this.currentWaste = currentWaste;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}