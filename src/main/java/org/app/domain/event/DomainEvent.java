package org.app.domain.event;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;

public abstract class DomainEvent {

    public DomainEvent(String requestId) {
        this.requestId = requestId;
    }

    public DomainEvent(){

    }

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime eventRequestTime = LocalDateTime.now();

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public LocalDateTime getEventRequestTime() {
        return eventRequestTime;
    }

    public void setEventRequestTime(LocalDateTime eventRequestTime) {
        this.eventRequestTime = eventRequestTime;
    }
}
