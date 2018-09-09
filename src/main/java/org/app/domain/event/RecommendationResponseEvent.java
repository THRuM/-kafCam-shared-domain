package org.app.domain.event;

import org.app.common.util.EventParams;

import java.util.Map;

public class RecommendationResponseEvent extends DomainEvent {
    private Integer score;
    private String opinion;

    public RecommendationResponseEvent(String requestId, Map<String, Object> params) {
        super(requestId);
        this.score = Integer.valueOf(String.valueOf(params.get(EventParams.CURRENCY_SCORE)));
        this.opinion = String.valueOf(params.get(EventParams.CURRENCY_OPINION));
    }

    //for Kafka
    public RecommendationResponseEvent() {
    }

    public Integer getScore() {
        return score;
    }

    public String getOpinion() {
        return opinion;
    }
}
