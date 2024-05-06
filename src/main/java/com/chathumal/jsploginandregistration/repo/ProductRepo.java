package com.chathumal.jsploginandregistration.repo;

import com.chathumal.jsploginandregistration.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
