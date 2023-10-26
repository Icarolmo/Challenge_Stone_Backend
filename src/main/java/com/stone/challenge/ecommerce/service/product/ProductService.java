package com.stone.challenge.ecommerce.service.product;

import com.stone.challenge.ecommerce.dto.product.ProductDTO;
import com.stone.challenge.ecommerce.dto.product.RequestProduct;
import com.stone.challenge.ecommerce.model.product.Product;
import com.stone.challenge.ecommerce.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    @Cacheable("products")
    public List<ProductDTO> findAllProducts() {
        try {
            List<ProductDTO> response = new ArrayList<ProductDTO>();
            for (Product productInRepository : repository.findAll()) {
                response.add(new ProductDTO(productInRepository));
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ProductDTO insertProduct(RequestProduct data){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date newDate = dateFormat.parse(data.date());
            repository.insertProduct(data.title(), data.price(), data.zipcode(), data.seller(), data.thumbnailHd(), newDate);
            return new ProductDTO(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
