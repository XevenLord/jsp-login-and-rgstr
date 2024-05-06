package com.chathumal.jsploginandregistration.service.impl;

import com.chathumal.jsploginandregistration.entity.Product;
import com.chathumal.jsploginandregistration.repo.ProductRepo;
import com.chathumal.jsploginandregistration.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
