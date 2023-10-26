package com.stone.challenge.ecommerce.controller.product;

import com.stone.challenge.ecommerce.dto.product.RequestProduct;
import com.stone.challenge.ecommerce.service.product.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/starstone")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok().body(service.findAllProducts());
    }

    @Transactional
    @PostMapping("/product")
    public ResponseEntity newProduct(@RequestBody @Validated RequestProduct data ){
        return ResponseEntity.ok().body(service.insertProduct(data));
    }
}
