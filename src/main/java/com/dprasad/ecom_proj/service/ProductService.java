package com.dprasad.ecom_proj.service;

import com.dprasad.ecom_proj.model.Product;
import com.dprasad.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
    return repo.findAll();
    }
}
