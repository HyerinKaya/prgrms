package com.github.prgrms.orders.dto;

import com.github.prgrms.orders.domain.Review;

import java.time.LocalDateTime;

public class ReviewDto {

    private Long seq;

    private Long productId;

    private String Content;

    private LocalDateTime createAt;

    public ReviewDto(Review source) {
        this.seq = source.getSeq();
        this.productId = source.getProductId();
        this.Content = source.getContent();
        this.createAt = source.getCreateAt();
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
