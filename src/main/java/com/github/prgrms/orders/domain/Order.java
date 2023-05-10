package com.github.prgrms.orders.domain;

import com.github.prgrms.orders.constant.State;

import java.time.LocalDateTime;

public class Order {

    private final Long seq;

    private Long userId;

    private Long productId;

    private Long reviewId;

    private Review review;

    private State state;

    private String requestMessage;

    private String rejectMessage;

    private LocalDateTime completedAt;

    private LocalDateTime rejectedAt;

    private LocalDateTime createAt;

    public Order(Long seq, Long userId, Long productId, Long reviewId, Review review, State state, String requestMessage, String rejectMessage, LocalDateTime completedAt, LocalDateTime rejectedAt, LocalDateTime createAt) {
        this.seq = seq;
        this.userId = userId;
        this.productId = productId;
        this.reviewId = reviewId;
        this.review = review;
        this.state = state;
        this.requestMessage = requestMessage;
        this.rejectMessage = rejectMessage;
        this.completedAt = completedAt;
        this.rejectedAt = rejectedAt;
        this.createAt = createAt;
    }
}
