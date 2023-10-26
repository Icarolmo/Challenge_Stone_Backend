package com.stone.challenge.ecommerce.dto.payment;

import org.springframework.lang.NonNull;

public record RequestPayment(
        @NonNull
        String client_id,
        @NonNull
        String client_name,
        @NonNull
        int total_to_pay,
        @NonNull
        CreditCard credit_card){}
