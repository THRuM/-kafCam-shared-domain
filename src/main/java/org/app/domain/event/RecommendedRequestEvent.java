package org.app.domain.event;

import org.app.common.util.EventParams;

import java.math.BigDecimal;
import java.util.Map;

public class RecommendedRequestEvent extends DomainEvent {

    private String currencySymbol;
    private Long timeStamp;
    private BigDecimal currencyQuantity;

    public RecommendedRequestEvent(String requestId, Map<String, Object> params) {
        super(requestId);
        this.currencySymbol = String.valueOf(params.get(EventParams.CURRENCY_SYMBOL));
        this.currencyQuantity = (BigDecimal) params.get(EventParams.CURRENCY_QUANTITY);
        this.timeStamp = Long.valueOf(String.valueOf(params.get(EventParams.TIMESTAMP)));
    }

    //for Kafka
    public RecommendedRequestEvent() {
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
}
