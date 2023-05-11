package com.github.prgrms.orders.domain;

import java.time.LocalDateTime;

public class Review {
    private Long seq;

    private Long productId;

    private String Content;

    private LocalDateTime createAt;

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

    @Override
    public String toString() {
        return "Review{" +
                "seq=" + seq +
                ", productId=" + productId +
                ", Content='" + Content + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
