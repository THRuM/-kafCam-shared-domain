package org.app.domain.event;

import org.app.common.util.EventParams;

import java.util.Map;

public class HistoryRequestEvent extends DomainEvent {

    private String currencySymbol;
    private Long timeStamp;


    public HistoryRequestEvent(String requestId, Map<String, Object> params) {
        super(requestId);
        this.currencySymbol = String.valueOf(params.get(EventParams.CURRENCY_SYMBOL));
        this.timeStamp = Long.valueOf(String.valueOf(params.get(EventParams.CURRENCY_TIME)));
    }

    //for kaffka
    public HistoryRequestEvent() {
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public DataNotInCacheEvent toDataNotInCacheEvent() {
        return new DataNotInCacheEvent(getRequestId(), currencySymbol, timeStamp);
    }
}
