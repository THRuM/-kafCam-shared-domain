package org.app.domain.event;

public class CannotCompleteRecommendedEvent extends DomainEvent {

    public CannotCompleteRecommendedEvent(String requestId) {
        super(requestId);
    }

    public CannotCompleteRecommendedEvent() {
    }
}
