package org.app.domain.event;

//TODO Może inna nazwa?
public class DataNotInCacheEvent extends DomainEvent {
    private String currencySymbol;
    private Long timeStamp;


    public DataNotInCacheEvent(String requestId, String currencySymbol, Long timeStamp) {
        super(requestId);
        this.currencySymbol = currencySymbol;
        this.timeStamp = timeStamp;
    }

    //for kaffka
    public DataNotInCacheEvent() {
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }
}

