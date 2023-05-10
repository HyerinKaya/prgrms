package com.github.prgrms.products.dao;

import com.github.prgrms.products.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Optional<Product> findById(long id);

    List<Product> findAll();

}