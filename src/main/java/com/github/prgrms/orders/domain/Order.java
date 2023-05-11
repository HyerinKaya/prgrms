package com.github.prgrms.orders.domain;

import com.github.prgrms.orders.constant.State;
import com.github.prgrms.users.domain.User;

import java.time.LocalDateTime;

public class Order {

    private Long seq;

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

    public Order(
            Long seq, Long userId, Long productId,
            Long reviewId, State state, String requestMessage,
            String rejectMessage, LocalDateTime completedAt,
            LocalDateTime rejectedAt, LocalDateTime createAt) {
        this.seq = seq;
        this.userId = userId;
        this.productId = productId;
        this.reviewId = reviewId;
        this.state = state;
        this.requestMessage = requestMessage;
        this.rejectMessage = rejectMessage;
        this.completedAt = completedAt;
        this.rejectedAt = rejectedAt;
        this.createAt = createAt;
    }


    public Long getSeq() {
        return seq;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public String getRejectMessage() {
        return rejectMessage;
    }

    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public LocalDateTime getRejectedAt() {
        return rejectedAt;
    }

    public void setRejectedAt(LocalDateTime rejectedAt) {
        this.rejectedAt = rejectedAt;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "seq=" + seq +
                ", userId=" + userId +
                ", productId=" + productId +
                ", reviewId=" + reviewId +
                ", review=" + review +
                ", state=" + state +
                ", requestMessage='" + requestMessage + '\'' +
                ", rejectMessage='" + rejectMessage + '\'' +
                ", completedAt=" + completedAt +
                ", rejectedAt=" + rejectedAt +
                ", createAt=" + createAt +
                '}';
    }

    static public class Builder{
        private Long seq;
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

        public Builder(Order order){
            this.seq = order.seq;
            this.userId = order.userId;
            this.productId = order.productId;
            this.reviewId = order.reviewId;
            this.review = order.review;
            this.state = order.state;
            this.requestMessage = order.requestMessage;
            this.rejectMessage = order.requestMessage;
            this.completedAt = order.completedAt;
            this.rejectedAt = order.rejectedAt;
            this.createAt = order.createAt;
        }

        public Order build(){
            return new Order(
                    seq,
                    userId,
                    productId,
                    reviewId,
                    state,
                    requestMessage,
                    rejectMessage,
                    completedAt,
                    rejectedAt,
                    createAt
            );
        }
    }
}
