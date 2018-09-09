package org.app.domain.event;

public class CompleteRecommendedRequestEvent extends DomainEvent {

    public CompleteRecommendedRequestEvent(String requestId) {
        super(requestId);
    }

    public CompleteRecommendedRequestEvent() {
    }
}
