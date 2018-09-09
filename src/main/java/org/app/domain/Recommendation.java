package org.app.domain;

import java.math.BigDecimal;

public class Recommendation {

    private String requestId;
    private String currencySymbol;
    private Long timeStamp;
    private BigDecimal currencyQuantity;
    private Integer score;
    private String opinion;

    public Recommendation(String requestId, String currencySymbol, Long timeStamp, BigDecimal currencyQuantity, Integer score, String opinion) {
        this.requestId = requestId;
        this.currencySymbol = currencySymbol;
        this.timeStamp = timeStamp;
        this.currencyQuantity = currencyQuantity;
        this.score = score;
        this.opinion = opinion;
    }

    public Recommendation() {
    }

    public String getRequestId() {
        return requestId;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public BigDecimal getCurrencyQuantity() {
        return currencyQuantity;
    }

    public Integer getScore() {
        return score;
    }

    public String getOpinion() {
        return opinion;
    }
}
