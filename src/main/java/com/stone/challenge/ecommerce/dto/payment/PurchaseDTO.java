package com.stone.challenge.ecommerce.dto.payment;

import com.stone.challenge.ecommerce.model.payment.Purchase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDTO implements Serializable {

    String client_id;
    String purchase_id;
    int value;
    String date;
    String card_number;

    public PurchaseDTO(RequestPayment data){
        this.client_id = data.client_id();
        this.purchase_id = "none";
        this.value = data.total_to_pay();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = dtf.format(LocalDateTime.now());
        this.card_number = data.credit_card().card_number();
    }

    public PurchaseDTO(Purchase data){
        this.client_id = data.getClient_id();
        this.purchase_id = data.getPurchase_id();
        this.value = data.getValue();
        this.date = data.getDate();
        this.card_number = data.getCard_number();
    }
}
