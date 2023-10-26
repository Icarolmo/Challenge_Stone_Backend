package com.stone.challenge.ecommerce.repository.product;

import com.stone.challenge.ecommerce.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Modifying
    @Query("INSERT INTO Product (title, price, zipcode, seller, thumbnailHd, date) VALUES (:title, :price, :zipcode, :seller, :thumbnailHd, :date)")
    void insertProduct(
            @Param("title") String title,
            @Param("price") int price,
            @Param("zipcode") String zipcode,
            @Param("seller") String seller,
            @Param("thumbnailHd") String thumbnailHd,
            @Param("date") Date date
    );
}
