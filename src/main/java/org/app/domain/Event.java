package org.app.domain;

import java.util.Map;

public class Event {

    private String requestId;
    private String eventClassName;
    private Map<String, Object> params;

    public Event(String requestId, String eventClassName, Map<String, Object> params) {
        this.requestId = requestId;
        this.eventClassName = eventClassName;
        this.params = params;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getEventClassName() {
        return eventClassName;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}
