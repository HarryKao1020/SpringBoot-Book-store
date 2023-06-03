package com.kaoharry.springbootbookstore.service;

import com.kaoharry.springbootbookstore.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
