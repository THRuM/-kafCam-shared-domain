package org.app.domain.event;

public class ProducerRegisteredEvent extends DomainEvent{
    private String currencies;
    private Long interval;

    public ProducerRegisteredEvent(String currencies, Long interval) {
        super(null);
        this.currencies = currencies;
        this.interval = interval;
    }

    public String getCurrencies() {
        return currencies;
    }

    public Long getInterval() {
        return interval;
    }
}
