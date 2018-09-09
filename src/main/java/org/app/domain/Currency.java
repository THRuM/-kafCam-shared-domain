package org.app.domain;

import java.math.BigDecimal;

public class Currency {

    private String requestId;
    private String symbol;
    private BigDecimal bid;
    private BigDecimal ask;
    private BigDecimal price;
    private Long timestamp;

    public Currency(String requestId, String symbol, BigDecimal bid, BigDecimal ask, BigDecimal price, Long timestamp) {
        this.requestId = requestId;
        this.symbol = symbol;
        this.bid = bid;
        this.ask = ask;
        this.price = price;
        this.timestamp = timestamp;
    }

    public Currency() {

    }

    public String getRequestId() {
        return requestId;
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
