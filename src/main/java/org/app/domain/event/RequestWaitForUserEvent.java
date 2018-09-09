package org.app.domain.event;

public class RequestWaitForUserEvent extends DomainEvent {
    private String processInstanceId;

    public RequestWaitForUserEvent(String requestId, String processInstanceId) {
        super(requestId);
        this.processInstanceId = processInstanceId;
    }

    public RequestWaitForUserEvent() {
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }
}
