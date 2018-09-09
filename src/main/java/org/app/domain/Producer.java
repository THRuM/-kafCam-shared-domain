package org.app.domain;

import java.util.List;

public class Producer {
    private List<String> currenciesList;
    private Long interval;

    public Producer(List<String> currenciesList, Long interval) {
        this.currenciesList = currenciesList;
        this.interval = interval;
    }

    public List<String> getCurrenciesList() {
        return currenciesList;
    }

    public Long getInterval() {
        return interval;
    }
}
