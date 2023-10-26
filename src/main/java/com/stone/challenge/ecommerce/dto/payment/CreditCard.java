package com.stone.challenge.ecommerce.dto.payment;

import org.springframework.lang.NonNull;

public record CreditCard(
        @NonNull
        String card_number,
        @NonNull
        String card_holder_name,
        @NonNull
        int value,
        @NonNull
        int cvv,
        @NonNull
        String exp_date
        ){}
