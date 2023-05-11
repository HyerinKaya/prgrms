package com.github.prgrms.orders.service;

import com.github.prgrms.orders.dao.OrderRepository;
import com.github.prgrms.orders.dao.ReviewRepository;
import com.github.prgrms.orders.dto.ReviewDto;
import com.github.prgrms.products.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final ProductService productservice;
    private final ReviewRepository reviewrepository;
    private final OrderRepository orderrepository;


    public OrderService(ProductService productservice, ReviewRepository reviewRepository, OrderRepository orderRepository) {
        this.productservice = productservice;
        this.reviewrepository = reviewRepository;
        this.orderrepository = orderRepository;
    }

    @Transactional
    public ReviewDto review(Long orderId, String content){


    }
}

