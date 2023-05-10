package com.github.prgrms.orders.dto;

import com.github.prgrms.orders.domain.Order;
import com.github.prgrms.orders.domain.Review;
import com.github.prgrms.orders.constant.State;

import java.time.LocalDateTime;

public class OrderDto {

    //seq, productId, reviewId, review, state
    //requestMessage, rejectMessage, completedAt
    //rejectedAt, createAt

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

    public OrderDto(Order source){
        copyPro
    }

}
