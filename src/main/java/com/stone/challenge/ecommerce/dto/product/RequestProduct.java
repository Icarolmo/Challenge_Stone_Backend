package com.stone.challenge.ecommerce.dto.product;

import org.springframework.lang.NonNull;

public record RequestProduct(
        @NonNull
        String title,
        @NonNull
        int price,
        @NonNull
        String zipcode,
        String seller,
        @NonNull
        String thumbnailHd,
        @NonNull
        String date
){}