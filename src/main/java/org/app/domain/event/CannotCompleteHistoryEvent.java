package org.app.domain.event;

public class CannotCompleteHistoryEvent extends DomainEvent {
    private String reason;
    private DomainEvent causeEvent;

    public CannotCompleteHistoryEvent(String reason, String requestId, DomainEvent causeEvent) {
        super(requestId);
        this.reason = reason;
        this.causeEvent = causeEvent;
    }

    public CannotCompleteHistoryEvent() {
    }

    public String getReason() {
        return reason;
    }

    public DomainEvent getCauseEvent() {
        return causeEvent;
    }
}
