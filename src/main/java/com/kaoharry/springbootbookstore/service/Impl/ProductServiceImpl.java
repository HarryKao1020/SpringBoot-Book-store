package com.kaoharry.springbootbookstore.service.Impl;

import com.kaoharry.springbootbookstore.dao.ProductDao;
import com.kaoharry.springbootbookstore.model.Product;
import com.kaoharry.springbootbookstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }
}
