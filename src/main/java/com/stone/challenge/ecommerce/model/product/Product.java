package com.stone.challenge.ecommerce.model.product;

import com.stone.challenge.ecommerce.dto.product.RequestProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "product")
@Table(name = "star_products", schema = "starstone-ecommerce")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    int id;
    @Column(name = "title")
    String title;
    @Column(name = "price")
    int price;
    @Column(name = "zipcode")
    String zipcode;
    @Column(name = "seller")
    String seller;
    @Column(name = "thumbnail_hd")
    String thumbnailHd;
    @Column(name = "date_prod")
    String date;

    public Product(RequestProduct data){
        this.title = data.title();
        this.price = data.price();
        this.zipcode = data.zipcode();
        this.seller = data.seller();
        this.thumbnailHd = data.thumbnailHd();
        this.date = data.date();
    }
}


/*
  {
    "title": "Blusa do Imperio",
    "price": 7990,
    "zipcode": "78993-000",
    "seller": "João da Silva",
    "thumbnailHd": "https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg",
    "date": "26/11/2015"
  }
 */