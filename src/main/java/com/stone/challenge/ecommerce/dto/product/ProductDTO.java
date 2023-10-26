package com.stone.challenge.ecommerce.dto.product;

import com.stone.challenge.ecommerce.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    String title;
    int price;
    String zipcode;
    String seller;
    String thumbnailHd;
    String date;

    public ProductDTO(Product data){
        this.title = data.getTitle();
        this.price = data.getPrice();
        this.zipcode = data.getZipcode();
        this.seller = data.getSeller();
        this.thumbnailHd = data.getThumbnailHd();
        this.date = data.getDate();
    }

    public ProductDTO(RequestProduct data){
        this.title = data.title();
        this.price = data.price();
        this.zipcode = data.zipcode();
        this.seller = data.seller();
        this.thumbnailHd = data.thumbnailHd();
        this.date = data.date();
    }


}

