package org.app.domain.event;

public class CompleteHistoryEvent extends DomainEvent {

    public CompleteHistoryEvent(String requestId) {
        super(requestId);
    }

    public CompleteHistoryEvent() {
    }
}
