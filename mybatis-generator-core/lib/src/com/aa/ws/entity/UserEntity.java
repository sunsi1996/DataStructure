package com.aa.ws.entity;

import java.math.BigDecimal;

public class UserEntity {
    private Long id;

    private String sheetid;

    private String processStatus;

    private String tdr;

    private String processStartTime;

    private String productName;

    private BigDecimal productPrice;

    private String purchaseNumber;

    private BigDecimal actualAmount;

    private String payment;

    private String paymentMethod;

    private String orderNumber;

    private String createdTime;

    private String updateTime;

    private String fpStatus;

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSheetid() {
        return sheetid;
    }

    public void setSheetid(String sheetid) {
        this.sheetid = sheetid == null ? null : sheetid.trim();
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
    }

    public String getTdr() {
        return tdr;
    }

    public void setTdr(String tdr) {
        this.tdr = tdr == null ? null : tdr.trim();
    }

    public String getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(String processStartTime) {
        this.processStartTime = processStartTime == null ? null : processStartTime.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber == null ? null : purchaseNumber.trim();
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getFpStatus() {
        return fpStatus;
    }

    public void setFpStatus(String fpStatus) {
        this.fpStatus = fpStatus == null ? null : fpStatus.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}