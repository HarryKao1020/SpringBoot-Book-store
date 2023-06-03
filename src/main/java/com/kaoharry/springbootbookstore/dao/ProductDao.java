package com.kaoharry.springbootbookstore.dao;

import com.kaoharry.springbootbookstore.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
